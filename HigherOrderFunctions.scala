import java.util.Date

//These are functions that take other functions as parameters, or whose result is a function.
//apply() function takes another function f and a value v and applies function f to v.
object HigherOrderFunctions {
   def main(args: Array[String]) : Unit = {
      println( apply( layout, 10) )
   }

   def apply(f: Int => String, v: Int) = f(v)

   def layout[A](x: A) = "[" + x.toString() + "]"
}
