class A3Within10 extends ConsoleProgram {

  /**
   * Description
   * 
   * @author:
   */

  public void run() {
    int intIn;
    int intIn1;

    intIn = readInt("int one: ");
    intIn1 = readInt("int two ");
    double dbl1 = Math.abs(intIn - 10);
    double dbl2 = Math.abs(intIn1 - 10);

    if (dbl1 > dbl2) {
      System.out.println(intIn1);
    } else if (dbl1 == dbl2) {
      System.out.println("0");
    } else {
      System.out.println(intIn);
    }
  }
}
