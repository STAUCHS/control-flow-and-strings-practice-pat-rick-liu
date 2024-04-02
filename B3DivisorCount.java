class B3DivisorCount extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    int intInput;
    intInput = readInt("Input int: ");

    for(int intDivisor = 1; intDivisor <= intInput; intDivisor++){
        if (intInput % intDivisor == 0) {
          System.out.println(intDivisor);
        }
    }
  }
}
  

