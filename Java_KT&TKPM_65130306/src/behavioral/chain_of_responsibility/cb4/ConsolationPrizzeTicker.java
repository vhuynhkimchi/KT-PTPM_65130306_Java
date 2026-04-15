package behavioral.chain_of_responsibility.cb4;

public class ConsolationPrizzeTicker extends  PrizzeChecker{
  private String specialPrizzeNumber;

  public ConsolationPrizzeTicker(String specialPrizzeNumber) {
    this.specialPrizzeNumber = specialPrizzeNumber;
  }

  @Override
  public void checkPrizze(String ticketNumber) {
    String lastSpecialPrizzeNumber = specialPrizzeNumber.
            substring(1);
    if(ticketNumber.equals(specialPrizzeNumber) && ticketNumber.equals(lastSpecialPrizzeNumber)){
      System.out.println("CHUC MUNG VE SO!" + ticketNumber + " DA TRUNG GIAI KHUYEN KHICH ");
    }
    else if(nextPrizzeChecker != null){
      nextPrizzeChecker.checkPrizze(ticketNumber);
    }
  }
}
