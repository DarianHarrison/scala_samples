import java.io._

//An iterator is not a collection, but rather a way to access the elements of a collection one by one.
object Iterators {
   def main(args: Array[String]):Unit= {
      val ita = Iterator(20,40,2,50,69, 90)
      val itb = Iterator(20,40,2,50,69, 90)
      
      println("Value of ita.size : " + ita.size )
      println("Value of itb.length : " + itb.length )
   }
}