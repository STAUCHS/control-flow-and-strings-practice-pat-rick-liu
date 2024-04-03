class C2EveryNth extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    String strWord;    
    String strNewWord;
    int intNthChar;
    int intLength;
    
    // Get word from user
    strWord = readLine("Enter a word: ");
    intNthChar = readInt("Enter an integer: ");

    // Initialize varaibles
    intLength = strWord.length();
    strNewWord = "";

    for (int i = 0; i <= intLength; i += intNthChar) {
      strNewWord += strWord.charAt(i);
    }

    System.out.println(strNewWord);

  }
}
