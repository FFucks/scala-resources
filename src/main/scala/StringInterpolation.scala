object StringInterpolation {

    val days = 365

    def yearMessage: String = s"One year have $days"

    def piMessage: String = {
        val pi = 3.14159
        f"PI value is: $pi%.2f"
    }

    @main def runStringInterpolation(): Unit = {
        println(StringInterpolation.yearMessage)
        println(StringInterpolation.piMessage)
    }
}