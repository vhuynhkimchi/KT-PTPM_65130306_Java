package behavioral.chain_of_responsibility.cb4;

public abstract class PrizzeChecker {
  protected PrizzeChecker nextPrizzeChecker;
  public PrizzeChecker setNextChecker(PrizzeChecker nextPrizzeChecker) {
    this.nextPrizzeChecker = nextPrizzeChecker;
    return this;
  }
  public abstract void checkPrizze(String ticketNumber);
}
