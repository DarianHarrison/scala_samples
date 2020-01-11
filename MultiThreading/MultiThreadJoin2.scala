//1 prints six times with an interval of 400 milliseconds. And then, Demo1 and Demo2 print simultaneously

class Demo extends Thread{
	override def run():Unit={
		for(i<-0 to 5){
			println("1")
			Thread.sleep(400)
		}
	}
}

class Demo1 extends Thread{
	override def run():Unit={
		println("Demo1")
		Thread.sleep(400)
	}
}

class Demo2 extends Thread{
	override def run():Unit={
		println("Demo2")
		Thread.sleep(400)
	}
}

// Creating object 
object MultiThreadJoin2 { 
    // Main method 
    def main(args: Array[String]):Unit={
		var d=new Demo(); var d1=new Demo1(); var d2=new Demo2()
		d.start(); d.join(); d1.start(); d2.start()
    } 
} 