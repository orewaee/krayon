# krayon
A small library written in Kotlin to help you with console colors.

[![](https://jitpack.io/v/orewaee/krayon.svg)](https://jitpack.io/#orewaee/krayon)

## Installation
The library uses the JitPack repository. By clicking on the [link](https://jitpack.io/#orewaee/krayon/1.0.2), you can choose the most convenient installation option.

## Examples
```kotlin
// Direct color indication

println("Standard color".color(Color.GREEN))
println("Black on white background".color(Color.BLACK).color(Color.WHITE, Type.BG))

println("RGB supported".rgb(RGB(157, 78, 221)))

println("Hex is here too".hex("FFAC33"))
```

```kotlin
// String formatting

println(BOLD + "Bold")
println(ITALIC + "Italic")
println(UNDERLINE + "Underline")
```

```kotlin
// Get an ASCII color code as a string

val color = Krayon.code(Color.GREEN)
val hex = Krayon.code("FFAC33")
val rgb = Krayon.code(RGB(157, 78, 221))
```
