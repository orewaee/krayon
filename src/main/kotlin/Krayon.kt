const val ESCAPE = "\u001b"
const val RESET = "$ESCAPE[0m"

object Krayon {
    fun code(color: Color, type: Type) =
        "$ESCAPE[${color.code + type.difference}m"

    fun code(rgb: RGB, type: Type): String {
        val (r, g, b) = rgb

        return "$ESCAPE[${38 + type.difference};2;$r;$g;${b}m"
    }

    fun color(string: String, color: Color, type: Type) = code(color, type) + "$string$RESET"
    fun rgb(string: String, rgb: RGB, type: Type) = code(rgb, type) + "$string$RESET"
}

fun String.color(color: Color, type: Type) = Krayon.color(this, color, type)
fun String.rgb(rgb: RGB, type: Type) = Krayon.rgb(this, rgb, type)

