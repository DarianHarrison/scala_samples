//Currying transforms a function that takes multiple parameters into a chain of functions, each taking a single parameter.

//def strcat(s1: String)(s2: String) = s1 + s2
object CurryingFunctions {
   def main(args: Array[String]) : Unit = {
      val str1:String = "Hello, "
      val str2:String = "Scala"
      val str3:String = "!"
      
      println( "str1 + str2 + str3  = " +  strcat(str1)(str2,str3) )
   }

   def strcat(s1: String)(s2: String,s3: String) = {
      s1 + s2 + s3
   }
}
