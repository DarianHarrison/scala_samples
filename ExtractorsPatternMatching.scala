//Note you need to scalac compile first then run

object ExtractorsPatternMatching {
   def main(args: Array[String]): Unit= {
      val x = ExtractorsPatternMatching(5)
      println(x)

      x match {
         case ExtractorsPatternMatching(num) => println(s"$x is bigger two times than $num")
         
         //unapply is invoked
         case _ => println("i cannot calculate")
      }
   }
   def apply(x: Int) = x*2
   def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None
}