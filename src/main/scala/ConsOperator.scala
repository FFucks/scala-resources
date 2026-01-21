//Adds elements to the front of the list returning a new list ::
//Adds elements to the end of the list returning a new list :+

object ConsOperator extends App {

    val list1 = 1 :: 2 :: 3 :: Nil
    println(s"list1 = $list1")

    val list2 = List(2, 3, 4)
    val list3 = 1 :: list2
    println(s"list3 = $list3")

    val original = List(1, 2, 3, 4)
    var reversed = List.empty[Int]

    for (e <- original) {
        reversed = e :: reversed
    }
    println(s"reversed = $reversed")

    val slowAppend = list1 :+ 4
    val fastPrepend = 0 :: list1

    println(s"slowAppend = $slowAppend")
    println(s"fastPrepend = $fastPrepend")
}
