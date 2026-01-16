import javax.annotation.processing.Messager

object ArbitraryParameters {


    /*@main def run(number: Int*): Unit =
        println(s"The sum is ${number.sum}")*/

    //The main method does not accept multiple parameter lists
    @main def run(): Unit =
        println(multipleParameters("The sum", 1, 2, 3, 4, 5))

    //Arbitrary parameters needs to be the last parameter
    def multipleParameters(message: String, numbers: Int*): String = {
        s"${message} is ${numbers.sum}"
    }

}
