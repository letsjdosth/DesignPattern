package part1_law_of_Demeter;

public class Paperboy {
	int payment=10000;
	try {
		int paidAmount=customer.getPayment(payment);
	} catch (NotEnoughMoneyException ex) {
		//������ ����� ������ �´�.
	}

}
