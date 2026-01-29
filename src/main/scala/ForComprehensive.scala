object ForComprehensive {

    def multiply(): List[Int] = {
        val numbersList = List(1, 2, 3, 4)

        val doubledNumbers = {
            for (n <- numbersList) yield n * 2
        }

        doubledNumbers
    }

    def pairs(): List[Int] = {
        val numbers = List(1, 2, 3, 4, 5, 6)

        val pairs = for {
            n <- numbers
            if n % 2 == 0
        } yield n

        pairs
    }

    val noComprehensive =
        for (n <- List(1, 2, 3)) {
            n * 2
        }

    val comprehensive =
        for (n <- List(1, 2, 3))
            yield n * 2

    // First For turns the second For into a comprehension
    /*
    for (x <- list) println(x)
    list.foreach(x => println(x))*/


    /*@main def runMultiply(): Unit =
        println(multiply())*/

    @main def runPairs(): Unit =
        println(pairs())
}
