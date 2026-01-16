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


    /*@main def runMultiply(): Unit =
        println(multiply())*/

    @main def runPairs(): Unit =
        println(pairs())
}
