package ru.orewaee.krayon

const val ESCAPE = "\u001b"
const val RESET = "$ESCAPE[0m"

object Krayon {
    private fun generate(body: String) = "$ESCAPE[${body}m"

    /** Generates a color code from a standard set */
    fun color(
        color: Color,
        type: Type = Type.FOREGROUND
    ) = generate("${color.code + type.difference}")

    /** Generates an RGB color code */
    fun rgb(
        red: Int, green: Int, blue: Int,
        type: Type = Type.FOREGROUND
    ) = generate("${38 + type.difference};2;$red;$green;$blue")

    fun format(
        vararg format: Format
    ) = format.joinToString("") { generate("${it.code}") }
}

fun String.color(
    color: Color,
    type: Type = Type.FOREGROUND
) = Krayon.color(color, type) + "$this$RESET"

fun String.rgb(
    red: Int, green: Int, blue: Int,
    type: Type = Type.FOREGROUND
) = Krayon.rgb(red, green, blue, type) + "$this$RESET"

fun String.format(
    vararg format: Format
) = Krayon.format(*format) + "$this$RESET"
