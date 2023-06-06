package ru.orewaee.krayon

const val ESCAPE = "\u001b"
const val RESET = "$ESCAPE[0m"

object Krayon {
    fun code(color: Color, type: Type) =
        "$ESCAPE[${color.code + type.difference}m"

    fun code(rgb: RGB, type: Type): String {
        val (r, g, b) = rgb

        return "$ESCAPE[${38 + type.difference};2;$r;$g;${b}m"
    }

    fun code(hex: String, type: Type): String {
        val r = hex.slice(0..1).toInt(16)
        val g = hex.slice(2..3).toInt(16)
        val b = hex.slice(4..5).toInt(16)

        return code(RGB(r, g, b), type)
    }

    fun color(string: String, color: Color, type: Type) = code(color, type) + "$string$RESET"
    fun rgb(string: String, rgb: RGB, type: Type) = code(rgb, type) + "$string$RESET"
    fun hex(string: String, hex: String, type: Type) = code(hex, type) + "$string$RESET"
}

fun String.color(color: Color, type: Type) = Krayon.color(this, color, type)
fun String.rgb(rgb: RGB, type: Type) = Krayon.rgb(this, rgb, type)
fun String.hex(hex: String, type: Type) = Krayon.hex(this, hex, type)
