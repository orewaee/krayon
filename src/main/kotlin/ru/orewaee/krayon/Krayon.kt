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

    fun hex(
        hex: String,
        type: Type = Type.FOREGROUND
    ): String {
        val pattern = Regex("#[0-9A-Fa-f]{6}")

        if (!(hex matches pattern)) return RESET

        return rgb(
            hex.slice(1..2).toInt(16),
            hex.slice(3..4).toInt(16),
            hex.slice(5..6).toInt(16),
            type
        )
    }

    fun format(
        vararg format: Format
    ) = format.joinToString("") { generate("${it.code}") }
}
