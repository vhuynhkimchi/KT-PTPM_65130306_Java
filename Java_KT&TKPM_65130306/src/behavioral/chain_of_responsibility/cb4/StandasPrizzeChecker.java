package behavioral.chain_of_responsibility.cb4;

public class StandasPrizzeChecker  extends PrizzeChecker{
  private String priceName;
  private String[] winingNumber;

  public StandasPrizzeChecker(String priceName, String[] winingNumber) {
    this.priceName = priceName;
    this.winingNumber = winingNumber;
  }

  @Override
  public void checkPrizze(String ticketNumber) {
    boolean isWon = false;
    for(String winingNumbers : winingNumber){
      if(ticketNumber.equals(winingNumbers)){
        isWon = true;
        break;
      }
    }
    if(isWon){
      System.out.println("CHUC MUNG VE SO!" + ticketNumber + " DA TRUNG "+ priceName);
    }
    else if(nextPrizzeChecker != null){
      nextPrizzeChecker.checkPrizze(ticketNumber);
    }
    else{
      System.out.println("To ve so [" + ticketNumber + "] chi sai vai so thoi. Chuc ban may man lan sau");
    }
  }
}
