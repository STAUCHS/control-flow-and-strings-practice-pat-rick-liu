class B4IsPrime extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    int intInput;
    int intN = 0;
    intInput = readInt("Input int: ");

    for(int intDivisor = 1; intDivisor <= intInput; intDivisor++){
        if (intInput % intDivisor == 0) {
          intN += 1;
        }
    }
    if (intN == 2) {
      System.out.println("The integer is prime");
    }else{
      System.out.println("The integer is composite");
    }
  }
}
