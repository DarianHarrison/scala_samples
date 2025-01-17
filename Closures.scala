//Closures are functions, whose return value depends on the value of one or more variables declared outside this function.

object Closures {
   def main(args: Array[String]) : Unit = {
      println( "multiplier(1) value = " +  multiplier(1) )
      println( "multiplier(2) value = " +  multiplier(7) )
   }
   var factor = 3
   val multiplier = (i:Int) => i * factor
}