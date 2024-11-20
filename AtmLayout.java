package pack;

public class AtmLayout{
	private double balance;
	private double depositeAmount;
	private double withdrawAmount;

	public AtmLayout(){
		super();

	}

	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getDepositeAmount(){
		return depositeAmount;
	}
	public void setDepositeAmount(double depositeAmount){
		this.depositeAmount=depositeAmount;
	}
	public double getWithdrawAmount(){
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount){
		this.withdrawAmount=withdrawAmount;
	}
	@Override
	public String toString(){
		return "Atm [banace=" + balance + ", depositeAmount=" + depositeAmount + ", withdrawAmount=" + withdrawAmount + "]";
	}
}