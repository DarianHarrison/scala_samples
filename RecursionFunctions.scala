import java.util.Date

//This is almost like a list comprehension plus an  opeartion on own result
object RecursionFunctions {
   def main(args: Array[String]): Unit = {
      for (i <- 1 to 10)
         println( "Factorial of " + i + ": = " + factorial(i) )
   }
   
   def factorial(n: BigInt): BigInt = {  
      if (n <= 1)
         1  
      else    
      n * factorial(n - 1)
   }
}
