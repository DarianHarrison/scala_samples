import java.io._, Array._


object Arrays {
   def main(args: Array[String]): Unit = {
      var myList = Array(1.9, 2.9, 3.4, 3.5)
      
      // Print all the array elements
      for ( x <- myList ) {
         println( x )
      }

      // Summing all elements
      var total = 0.0;
      
      for ( i <- 0 to (myList.length - 1)) {
         total += myList(i);
      }
      println("Total is " + total);

      // Finding the largest element
      var max = myList(0);
      
      for ( i <- 1 to (myList.length - 1) ) {
         if (myList(i) > max) max = myList(i);
      }
      
      println("Max is " + max);
      println("///////////////////");
      //concatenate Arrays
      var myList1 = Array(1.9, 2.9, 3.4, 3.5)
      var myList2 = Array(8.9, 7.9, 0.4, 1.5)

      var myList3 =  concat( myList1, myList2)
      
      // Print all the array elements
      for ( x <- myList3 ) {
         println( x )
      }

      println("///////////////////");
      //create array with range
      var myList4 = range(10, 20, 2)
      var myList5 = range(10,20)

      // Print all the array elements
      for ( x <- myList4) {
         print( " " + x )
      }
      
      println()
      for ( x <- myList5 ) {
         print( " " + x )
      }      
   }
}