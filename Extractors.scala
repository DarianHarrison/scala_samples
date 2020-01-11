/*The unapply method is what turns Test class into an extractor and it reverses the construction process of apply. Where apply takes two strings and forms an email address string out of them, unapply takes an email address and returns potentially two strings: the user and the domain of the address.*/

object Extractors {
   def main(args: Array[String]):Unit={
      println ("Apply method : " + apply("Zara", "gmail.com"));
      println ("Unapply method : " + unapply("Zara@gmail.com"));
      println ("Unapply method : " + unapply("Zara Ali"));
   }

   // The injection method (optional)
   def apply(user: String, domain: String) = {
      user +"@"+ domain
   }

   // The extraction method (mandatory)
   def unapply(str: String): Option[(String, String)] = {
      val parts = str split "@"
      
      if (parts.length == 2){
         Some(parts(0), parts(1)) 
      } else {
         None
      }
   }
}