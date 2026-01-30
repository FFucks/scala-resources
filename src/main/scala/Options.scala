


object Options {
    val a: Option[Int] = Some(10)
    val b: Option[Int] = None

    def divide(a: Int, b: Int): Option[Int] =
        if (b == 0) None else Some(a / b)

    divide(10, 2)
    divide(10, 0)

    val result = divide(10, 0).getOrElse(0)
    println(result)

    val doubled = divide(10, 2).map(_ * 2)
    println(doubled)

    divide(10, 0).map(_ * 2)

    def half(x: Int): Option[Int] =
        if (x % 2 == 0) Some(x / 2) else None

    val result2 =
        divide(20, 2)
            .flatMap(half)

    println(result) // Some(5)

    val users = Map(
        1 -> "John",
        2 -> "Maria"
    )

    val user: Option[String] = users.get(1)

    user match {
        case Some(name) => println(name)
        case None => println("Usuário não encontrado")
    }
}
