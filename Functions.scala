import java.util.Date

object Functions {
   def main(args: Array[String]): Unit = {
      println( "Returned Value : " + addInt(5,7) );
   }
   
   def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
}


object Demo {
   def main(args: Array[String]): Unit {
      val date = new Date
      log(date, "message1" )
      
      Thread.sleep(1000)
      log(date, "message2" )
      
      Thread.sleep(1000)
      log(date, "message3" )
   }

   def log(date: Date, message: String)  = {
      println(date + "----" + message)
   }
}