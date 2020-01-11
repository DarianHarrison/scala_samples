import java.io._

object FormatStrings {
   def main(args: Array[String]): Unit = {
      var floatVar = 12.456
      var intVar = 2000
      var stringVar = "Hello, Scala"
      var stringVar2 = " !"
      
      var fs = printf("The value of the float variable is " + "%f, while the value of the integer " + "variable is %d, and the string" + "is %s %s", floatVar, intVar, stringVar, stringVar2);
      
      println(fs)
   }
}