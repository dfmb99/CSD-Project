package data;

public class Transaction {
	
	private String sender;
	private String receiver;
	private double amount;
	
	public Transaction(String sender, String receiver, double amount) {
		this.sender = sender;
		this.receiver = receiver;
		this.amount = amount;
	}
	
	public String getReceiver() {
		return this.receiver;
	}
	
	public String getSender() {
		return this.sender;
	}

	public double getAmount() {
		return this.amount;
	}

}
