package FIRST

object t4utQ3 {
  
    def main(args: Array[String]): Unit = {
    print("Enter deposit amount: ")
    val depositAmount = scala.io.StdIn.readDouble()

    print(f"Actual amount of interest : ${calculateInterest(depositAmount)}%.2f")
  }

  def calculateInterest(depositAmount : Double) : Double = {
    
    depositAmount match{
      
      case depamount if depamount <= 20000 => depamount*0.02
      case depamount if depamount <= 200000 => depamount*0.04
      case depamount if depamount <= 2000000 => depamount*0.035
      case depamount => depamount*0.065
    }
  }
}
  