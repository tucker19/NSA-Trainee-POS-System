
public class Register {
	public double cash_total;
	
	public Register(double starting_cash) {
		cash_total = starting_cash;
	}
	
	public double getCashTotal() {
		return cash_total;
	}
	
	public void Withdraw(double value) {
		cash_total  = cash_total - value;
	}
	
	public void Deposit(double value) {
		cash_total  = cash_total + value;
	}
}
