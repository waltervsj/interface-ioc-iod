package Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import Entity.Installment;

public class InstallmentService {
	public List<Installment> installments(Date date, Double contractValue, int numberOfInstallments, IPayment payment) {
		List<Installment> listInstallment =  new ArrayList<>();
		double paymentFee = payment.getPaymentFee();
		
		for (int i = 1; i < numberOfInstallments + 1; i++) {
			double amount = (contractValue / numberOfInstallments) * ((paymentFee * i) + 1);
			amount *= payment.getGlobalFee();
			
			Date newDate = calcNewDate(date, i);
			
			listInstallment.add(new Installment(newDate, amount));
		}
		
		return listInstallment;
	}
	
	private Date calcNewDate(Date date, int plusMonth) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, plusMonth);
		return calendar.getTime();
	}
}
