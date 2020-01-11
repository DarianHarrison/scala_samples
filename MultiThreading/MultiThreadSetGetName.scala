//The methods setName() and getName() let us set and get names of threads.
class Demo extends Thread{
	override def run():Unit={
		for(i<-1 to 7){
			println(this.getName()+" - "+i)
			Thread.sleep(400)
		}
	}
}

// Creating object 
object MultiThreadSetGet { 
    // Main method 
    def main(args: Array[String]):Unit={ 
		var d1=new Demo(); var d2=new Demo(); var d3=new Demo()
		d1.setName("One"); d2.setName("Two"); d3.setName("Three")
		d1.start(); d2.start(); d3.start()
    } 
}