import java.util.Date

//Named arguments allow you to pass arguments to a function in a different order.

object FunctionsWithNamedArguments {
   def main(args: Array[String]) {
      printInt(b = 5, a = 7);
   }
   
   def printInt( a:Int, b:Int ) = {
      println("Value of a : " + a );
      println("Value of b : " + b );
   }}
