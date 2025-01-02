package adapter;

import adapter.thirdParty.icicbank.ICICBank;

public class ICICBankAdapter implements BankAPI {

    private ICICBank icicBank = new ICICBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        icicBank.makePayment(from,to,amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long getBalance(String accountNumber) {
        return 0;
    }
}
