package ru.orewaee.krayon

enum class Format(val code: Int) {
    BOLD(1),
    DIM(2),
    ITALIC(3),
    UNDERLINE(4),
    SLOW_BLINK(5),
    RAPID_BLINK(6),
    REVERSE(7),
    HIDE(8),
    STRIKE(9);

    override fun toString() = "$ESCAPE[${code}m"
}
