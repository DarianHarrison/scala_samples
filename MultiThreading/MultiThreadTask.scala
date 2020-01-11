//In this example, we create multiple Scala threads and use them to run multiple tasks. This lets us implement multitasking in Scala.
class Demo extends Thread{
    override def run():Unit={
        for(i<-1 to 4){
            println(i)
            Thread.sleep(400)
            }
        }
        
        def task():Unit={
        for(i<-5 to 8){
            println(i)
            Thread.sleep(200)
        }
    }
}

// Creating object 
object MultiThreadTask { 
    // Main method 
    def main(args: Array[String]):Unit={ 
    	var d1=new Demo()
    	d1.start(); d1.task()
    } 
} 