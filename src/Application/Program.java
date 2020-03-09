package Application;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entity.Installment;
import Service.InstallmentService;
import Service.PaymentService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		InstallmentService service = new InstallmentService();
		
		Date date = Installment.dateFormat.parse(sc.next());
		Double contractValue = sc.nextDouble();
		int numberOfInstallments = sc.nextInt();
		
		List<Installment> installments = service.installments(date, contractValue, numberOfInstallments, new PaymentService());
		
		for(Installment installment : installments) {
			System.out.println(installment.toString());
		}
		
		sc.close();
	}

}
