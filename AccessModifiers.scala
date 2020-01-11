class AccessModifiers {
   class Inner {
      def f(): Unit = { println("f") }
      
      class InnerMost {
         f() // OK
      }
   }
   (new Inner).f() // OK because now f() is public
}


//Private Members: A private member is visible only inside the class or object that contains the member definition.
//A protected member: is only accessible from subclasses of the class in which the member is defined.
//Public Members: it is not required to specify Public keyword for Public members. 

/*class Outer {
   class Inner {
      def f() { println("f") }
      
      class InnerMost {
         f() // OK
      }
   }
   (new Inner).f() // OK because now f() is public
}*/

/*class AccessModifiers {
   class Inner {
      private def f(): Unit = { println("f") }
      
      class InnerMost {
         f() // OK
      }
   }
   (new Inner).f() // Error: f is not accessible
}*/
