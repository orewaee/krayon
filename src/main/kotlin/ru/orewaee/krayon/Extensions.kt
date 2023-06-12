package ru.orewaee.krayon

fun String.color(color: Color, type: Type = Type.FOREGROUND) =
    Krayon.color(color, type) + "$this$RESET"

fun String.rgb(red: Int, green: Int, blue: Int, type: Type = Type.FOREGROUND) =
    Krayon.rgb(red, green, blue, type) + "$this$RESET"

fun String.hex(hex: String, type: Type = Type.FOREGROUND) =
    Krayon.hex(hex, type) + "$this$RESET"

fun String.format(vararg format: Format) =
    Krayon.format(*format) + "$this$RESET"

val String.bold get() = "${Format.BOLD}$this$RESET"
val String.dim get() = "${Format.DIM}$this$RESET"
val String.italic get() = "${Format.ITALIC}$this$RESET"
val String.underline get() = "${Format.UNDERLINE}$this$RESET"
val String.slowBlink get() = "${Format.SLOW_BLINK}$this$RESET"
val String.rapidBlink get() = "${Format.RAPID_BLINK}$this$RESET"
val String.reverse get() = "${Format.REVERSE}$this$RESET"
val String.hide get() = "${Format.HIDE}$this$RESET"
val String.strike get() = "${Format.STRIKE}$this$RESET"

val String.black get() = "${Color.BLACK}$this$RESET"
val String.red get() = "${Color.RED}$this$RESET"
val String.green get() = "${Color.GREEN}$this$RESET"
val String.yellow get() = "${Color.YELLOW}$this$RESET"
val String.blue get() = "${Color.BLUE}$this$RESET"
val String.magenta get() = "${Color.MAGENTA}$this$RESET"
val String.cyan get() = "${Color.CYAN}$this$RESET"
val String.white get() = "${Color.WHITE}$this$RESET"

val String.brightBlack get() = "${Color.BRIGHT_BLACK}$this$RESET"
val String.brightRed get() = "${Color.BRIGHT_RED}$this$RESET"
val String.brightGreen get() = "${Color.BRIGHT_GREEN}$this$RESET"
val String.brightYellow get() = "${Color.BRIGHT_YELLOW}$this$RESET"
val String.brightBlue get() = "${Color.BRIGHT_BLUE}$this$RESET"
val String.brightMagenta get() = "${Color.BRIGHT_MAGENTA}$this$RESET"
val String.brightCyan get() = "${Color.BRIGHT_CYAN}$this$RESET"
val String.brightWhite get() = "${Color.BRIGHT_WHITE}$this$RESET"
