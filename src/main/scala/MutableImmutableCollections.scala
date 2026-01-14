/*
Scala collections systematically distinguish between mutable and immutable collections.
A mutable collection can be updated, reduced or extended in place.
This means you can change, add, or remove elements of a collection as a side effect.
Immutable collections, by contrast, never change.
You still have operations that simulate additions, removals, or updates, but those operations will in each case return
a new collection and leave the old collection unchanged.
*/

//By default, Scala always picks immutable collections.

//Link for the official documentation about immutable collections: https://docs.scala-lang.org/overviews/collections-2.13/overview.html

import scala.collection.mutable.ListBuffer
//import scala.collection.mutable.Map

object MutableImmutableCollections extends App {

    //List immutable example
    val listNumbers = List(1, 2, 3)
    val newListNumbers = listNumbers :+ 4

    println(listNumbers)
    println(newListNumbers)


    //Map immutable example
    val users = Map(1 -> "Fabio", 2 -> "Renato")
    val updatedUsers = users + (3 -> "Bernardo")

    println(users)
    println(updatedUsers)

    //ListBuffer mutable example
    val listBufferNumbers = ListBuffer(1, 2, 3)

    listBufferNumbers += 4
    listBufferNumbers += 5

    println(listBufferNumbers)

    //You can mix both mutable and immutable collections
    //It is called “Mutable internally, immutable externally
    def buildList(): List[Int] = {
        val buffer = ListBuffer[Int]()

        buffer += 1
        buffer += 2
        buffer += 3

        buffer.toList
    }
    println(buildList())


}
