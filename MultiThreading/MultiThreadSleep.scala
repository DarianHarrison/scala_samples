//We can use this method to put a Scala thread to sleep for a number of milliseconds
class Demo extends Thread{
	override def run():Unit={
		for(i<-1 to 7){
			println(i)
			Thread.sleep(400)
		}
	}
}

// Creating object 
object MultiThreadSleep { 
    // Main method 
    def main(args: Array[String]):Unit={ 
    	var d1=new Demo()
    	var d2=new Demo()
    	d1.start();
    	d2.start()
    } 
} 