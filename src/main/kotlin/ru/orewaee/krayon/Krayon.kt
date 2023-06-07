package ru.orewaee.krayon

const val ESCAPE = "\u001b"
const val RESET = "$ESCAPE[0m"
const val BOLD = "$ESCAPE[1m"
const val DIM = "$ESCAPE[2m"
const val ITALIC = "$ESCAPE[3m"
const val UNDERLINE = "$ESCAPE[4m"
const val SLOW_BLINK = "$ESCAPE[5m"
const val RAPID_BLINK = "$ESCAPE[6m"
const val REVERSE = "$ESCAPE[7m"
const val HIDE = "$ESCAPE[8m"

object Krayon {
    fun code(
        color: Color,
        type: Type = Type.FG
    ) = "$ESCAPE[${color.code + type.difference}m"

    fun code(
        rgb: RGB,
        type: Type = Type.FG
    ): String {
        val (r, g, b) = rgb

        return "$ESCAPE[${38 + type.difference};2;$r;$g;${b}m"
    }

    fun code(
        hex: String,
        type: Type = Type.FG
    ): String {
        val r = hex.slice(0..1).toInt(16)
        val g = hex.slice(2..3).toInt(16)
        val b = hex.slice(4..5).toInt(16)

        val rgb = RGB(r, g, b)

        return code(rgb, type)
    }

    fun color(
        string: String,
        color: Color,
        type: Type = Type.FG
    ) = code(color, type) + "$string$RESET"

    fun rgb(
        string: String,
        rgb: RGB,
        type: Type = Type.FG
    ) = code(rgb, type) + "$string$RESET"

    fun hex(
        string: String,
        hex: String,
        type: Type = Type.FG
    ) = code(hex, type) + "$string$RESET"
}

fun String.color(color: Color, type: Type = Type.FG) = Krayon.color(this, color, type)
fun String.rgb(rgb: RGB, type: Type = Type.FG) = Krayon.rgb(this, rgb, type)
fun String.hex(hex: String, type: Type = Type.FG) = Krayon.hex(this, hex, type)
