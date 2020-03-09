package Entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	private Date dueDate;
	private Double amount;
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Installment(Date dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return dateFormat.format(this.dueDate) + " - " + this.amount;
	}
	
}
