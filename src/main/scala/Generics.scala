



object Generics extends App {

    def sumInt(a: Int, b: Int): Int = a + b
    def sumDouble(a: Double, b: Double): Double = a + b

    def sumGenneric[T: Numeric](a: T, b: T): T = {
        val numeric = implicitly[Numeric[T]]
        numeric.plus(a, b)
    }

    //Does not work because compiler need to know that T is Numeric
    /*def sumGenneric(a: T, b: T): T = {
        val numeric = implicitly[Numeric[T]]
        numeric.plus(a, b)
    }*/
}
