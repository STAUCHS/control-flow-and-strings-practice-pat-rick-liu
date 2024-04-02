class A1FreezingHot extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    int intTemp;
    int intTemp1;

    intTemp = readInt("int one: ");
    intTemp1 = readInt("int two ");

    if(intTemp > 100 || intTemp < 0 && intTemp1 > 100 || intTemp1 < 0){
      System.out.println(true);
    }
    else{
      System.out.println(false);
    }

  }
}
