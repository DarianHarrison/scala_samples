import java.io._

object StringInterpolation {
   def main(args: Array[String]): Unit = {
      val name = "James"
      val height = 1.9d

      //The literal ‘s’ allows the usage of variable directly in processing a string, when you prepend ‘s’ to it.
      println(s"Hello,\n$name")
      println(s"1 + 1 = ${1 + 1}")

      //The literal ‘f’ interpolator allows to create a formatted String
      println(f"$name%s is $height%2.2f meters tall") //Here $name%s to print (String variable) James and $height%2.2f to print (floating point value) 1.90.

      //The ‘raw’ interpolator is similar to ‘s’ interpolator except that it performs no escaping of literals within a string.
      println(raw"Result = \n a \n b")

   }
}