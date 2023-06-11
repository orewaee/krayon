package ru.orewaee.krayon

fun String.color(
    color: Color,
    type: Type = Type.FOREGROUND
) = Krayon.color(color, type) + "$this$RESET"

fun String.rgb(
    red: Int, green: Int, blue: Int,
    type: Type = Type.FOREGROUND
) = Krayon.rgb(red, green, blue, type) + "$this$RESET"

fun String.hex(
    hex: String,
    type: Type = Type.FOREGROUND
) = Krayon.hex(hex, type) + "$this$RESET"

fun String.format(
    vararg format: Format
) = Krayon.format(*format) + "$this$RESET"
