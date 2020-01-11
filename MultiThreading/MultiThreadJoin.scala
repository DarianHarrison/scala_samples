//It waits for a thread to die before it can start more.
class Demo extends Thread{
	override def run():Unit={
		for(i<-1 to 7){
			println(i)
			Thread.sleep(400)
		}
	}
}

// Creating object 
object MultiThreadJoin { 
    // Main method 
    def main(args: Array[String]):Unit={ 
		var d1=new Demo(); var d2=new Demo(); var d3=new Demo()
		d1.start(); d1.join(); d2.start(); d3.start()
    } 
} 