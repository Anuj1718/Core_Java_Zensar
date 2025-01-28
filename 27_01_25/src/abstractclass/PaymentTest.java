package abstractclass;

public class PaymentTest {
public static void main(String[] args) {
	
   Payments netBanking = new NetBanking();
   Payments creditCard = new CreditCard();
   Payments gPay = new GPay();

   netBanking.displayDetail();
   creditCard.displayDetail();
   gPay.displayDetail();
}
}
