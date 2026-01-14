

object ArbitraryParameters {

    enum Color:
        case Red, Green, Blue

    @main def run(xs: Int*): Unit =
        println(s"The sum is ${xs.sum}")

    /*@main def run(xs: Int*): Unit =
        println(s"Received ${xs.length} parameters: ${xs.mkString(", ")}")*/

    /*@main def run(xs: Int*): Unit =
        println(s"The sum is ${xs.sum}")*/
}
