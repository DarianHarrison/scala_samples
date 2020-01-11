// read and write files
import java.io._
import scala.io.Source

object FilesIO {
   def main(args: Array[String]):Unit= {

   	  //write files
      val writer = new PrintWriter(new File("test.txt" ))

      writer.write("Hello Scala")
      writer.close()

      //read files
      println("Following is the content read:" )

      Source.fromFile("test.txt" ).foreach { 
         print 
      }
   }
}