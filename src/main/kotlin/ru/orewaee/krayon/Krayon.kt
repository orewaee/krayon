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
}

