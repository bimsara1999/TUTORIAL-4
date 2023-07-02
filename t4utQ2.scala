package FIRST

object t4utQ2 {
  
    def main(args:Array[String]){
      
          
          println("Enter The Number:")
          val input = scala.io.StdIn.readInt()
          
          
          input match{ //key word use for pattern matching
            
            
            case x if x<=0 =>  println("Negative/Zero input")
            case x if x%2==0 => println("Even Number Is Given")
            case _  => println("Odd Number Is Given")
          }
    }
}