

object TypeParameter extends App {

    //Does not compile it needs to be defined as a generic method
    //All generic methods need to be declared with square brackets
    /*def revertList(list: List[A]): List[A] = {
        var result = List.empty[A]
        result
    }*/

    def identity[A](value: A): A = value

    println(identity(10))
    println(identity("Scala"))
    println(identity(true))

    def revertList[A](list: List[A]): List[A] = {
        var result = List.empty[A]

        for (element <- list) {
            result = element :: result
        }
        result
    }

    println(revertList(List(1, 2, 3)))
    println(revertList(List("x", "y", "z")))

    def optionToList[A](opt: Option[A]): List[A] = opt match {
        case Some(value) => List(value)
        case None => Nil
    }

    println(optionToList(Some(10)))
    println(optionToList(None))
}
