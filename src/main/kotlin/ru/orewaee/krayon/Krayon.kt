package ru.orewaee.krayon

private fun generate(body: String) = "$ESCAPE[${body}m"

object Krayon {
    fun color(color: Color, type: Type = Type.FOREGROUND) =
        generate("${color.code + type.difference}")

    fun rgb(red: Int, green: Int, blue: Int, type: Type = Type.FOREGROUND) =
        generate("${38 + type.difference};2;$red;$green;$blue")

    fun hex(hex: String, type: Type = Type.FOREGROUND): String {
        val pattern = Regex("#[0-9A-Fa-f]{6}")

        if (!hex.matches(pattern)) return RESET

        val red = hex.slice(1..2).toInt(16)
        val green = hex.slice(3..4).toInt(16)
        val blue = hex.slice(5..6).toInt(16)

        return rgb(red, green, blue, type)
    }

    fun format(vararg format: Format) =
        format.joinToString("") { generate("${it.code}") }
}
