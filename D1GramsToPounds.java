class D1GramsToPounds extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    int intGrams;
    double dblPounds;

    // Output table header
    System.out.printf("%6s %10s %n", "Grams", "Pounds");
    System.out.println("--------------------");

    // Create table with conversions
    for (intGrams = 100; intGrams <= 1000; intGrams += 100) {
      dblPounds = intGrams * 0.00220462;
      System.out.printf("%6d %10.4f %n", intGrams, dblPounds);
    }
  }
}
