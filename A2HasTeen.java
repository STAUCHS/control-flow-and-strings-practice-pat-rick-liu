class A2HasTeen extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    int intAge;
    int intAge1;
    int intAge2;

    intAge = readInt("int one: ");
    intAge1 = readInt("int two ");
    intAge2 = readInt("int three ");

    if(intAge >= 13 && intAge <= 19 || intAge1 >= 13 && intAge1 <= 19 || intAge2 >= 13 && intAge2 <= 19){
      System.out.println(true);
    }
    else{
      System.out.println(false);
    }
  }
}
