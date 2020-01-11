import java.io._

//key value mutable or immutable objects 
object Options {
   def main(args: Array[String]):Unit= {
      val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
      
      println("show(capitals.get( \"Japan\")) : " + show(capitals.get( "Japan")) )
      println("show(capitals.get( \"India\")) : " + show(capitals.get( "India")) )

	
      val a:Option[Int] = Some(5)
      val b:Option[Int] = None 
      
      println("a.getOrElse(0): " + a.getOrElse(0) )
      println("b.getOrElse(10): " + b.getOrElse(10) )


	//another Example of isEmpty      
      val c:Option[Int] = Some(5)
      val d:Option[Int] = None 
      
      println("c.isEmpty: " + c.isEmpty )
      println("d.isEmpty: " + d.isEmpty )      
   }
   
   def show(x: Option[String]) = x match {
      case Some(s) => s
      case None => "Not found"
   }
}