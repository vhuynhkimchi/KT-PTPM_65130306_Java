package behavioral.chain_of_responsibility.cb4;

public class Main {
  public static void main(String[] args) {
    String spec = " 123456";
    PrizzeChecker special = new StandasPrizzeChecker("Giai dac biet", new String[]{spec});
    PrizzeChecker con = new ConsolationPrizzeTicker(spec);
    PrizzeChecker first = new StandasPrizzeChecker("Giai nhat", new String[]{"3456"});
    PrizzeChecker second = new StandasPrizzeChecker("Giai nhi", new String[]{"456"});
    special.setNextChecker(con).setNextChecker(first).setNextChecker(second);
    System.out.println("HE THONG VE SO");
    special.checkPrizze("123456");
    special.checkPrizze("923456");
    special.checkPrizze("993456");
    special.checkPrizze("111111");
  }
}
