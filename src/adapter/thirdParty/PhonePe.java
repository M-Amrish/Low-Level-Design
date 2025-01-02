package adapter.thirdParty;

public class PhonePe {

    //Ideally we should use Dependency Injection here.
  private static   BankAPI bankAPI = new ICICBankAdapter();

    public static void main(String[] args) {
        bankAPI.sendMoney("1245","98652",20000);
    }
}