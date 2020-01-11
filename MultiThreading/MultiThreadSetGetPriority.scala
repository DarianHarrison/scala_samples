//This example tells us that the maximum priority is 10 and the minimum is 1.
class Demo extends Thread{
	override def run():Unit={
		for(i<-1 to 7){
			println(this.getName())
			println(this.getPriority())
			Thread.sleep(400)
		}
	}
}

// Creating object 
object MultiThreadSetGetPriority { 
    // Main method 
    def main(args: Array[String]):Unit={ 
		var d1=new Demo(); var d2=new Demo()
		d1.setName("One"); d2.setName("Two")

		d1.setPriority(Thread.MIN_PRIORITY); d2.setPriority(Thread.MAX_PRIORITY)
		d1.start(); d2.start()
    } 
}