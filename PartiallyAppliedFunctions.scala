import java.util.Date

//We want to invoke the method multiple times, with the same value for date but different values for message
//To do so, we first bind a value to the date parameter and leave the second parameter unbound by putting an underscore at its place.
//The result is a partially applied function that we've stored in a variable.
object PartiallyAppliedFunctions {
   def main(args: Array[String]) : Unit = {
      val date = new Date
      val logWithDateBound = log(date, _ : String)

      logWithDateBound("message1" )
      Thread.sleep(1000)
      
      logWithDateBound("message2" )
      Thread.sleep(1000)
      
      logWithDateBound("message3" )
   }

   def log(date: Date, message: String) = {
      println(date + "----" + message)
   }
}
