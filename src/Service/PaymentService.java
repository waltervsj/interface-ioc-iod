package Service;

public class PaymentService implements IPayment {
	private static final double INTERST_RATE = 0.01;
	private static final double FEE_PERCENTAGE = 0.02;
	
	@Override
	public double getPaymentFee() {
		return INTERST_RATE;
	}
	
	@Override 
	public double getGlobalFee() {
		return FEE_PERCENTAGE;
	}
}
