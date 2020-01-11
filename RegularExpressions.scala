import scala.util.matching.Regex

object RegularExpressions {
   def main(args: Array[String]):Unit= {

   	  //firstExample
      val pattern = "Scala".r
      val str = "Scala is Scalable and cool"
      println(pattern findFirstIn str)

      //secondExample
      val pattern2 = new Regex("(S|s)cala")
      val str2 = "Scala is scalable and cool"
      println((pattern2 findAllIn str2).mkString(","))

      //thirdExample, replace
      // replaceFirstIn( ) to replace the first match or replaceAllIn( ) to replace all occurrences
      val pattern3 = "(S|s)cala".r
      val str3 = "Scala is scalable and cool"
      
      println(pattern3 replaceFirstIn(str3, "Java"))


      //fourth Example, misc
      val pattern4 = new Regex("abl[ae]\\d+")
      val str4 = "ablaw is able1 and cool"
      
      println((pattern4 findAllIn str4).mkString(","))      
   }
}