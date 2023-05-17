package ec.edu.ups.tdd.payment;

/**
 * @author andresarizaga
 */
public interface PaymentGateway {

    public PaymentResponse requestPayment(PaymentRequest paymentRequest);
}
