package part1_law_of_Demeter;

public class Customer {
	private Wallet wallet;
	
	public Wallet getWallet() {
		return wallet;
	}
	public int getPayment(int payment) {
		if (wallet==null) throw new NotEnoughMoneyException();
		if (wallet.getTotalMoney()>=payment) {
			wallet.substractMoney(payment);
			return payment;
		}
		throw new NotEnoughMoneyException();
	}
}
