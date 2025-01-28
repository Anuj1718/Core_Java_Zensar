package abstractclass;

abstract class Payments {

 abstract void displayDetail();
}


class NetBanking extends Payments {

 @Override
 void displayDetail() {
     System.out.println("Thank you for choosing NetBanking. Payment done successfully!");
 }
}

class CreditCard extends Payments {

 @Override
 void displayDetail() {
     System.out.println("Thank you for choosing Credit Card. Payment done successfully!");
 }
}

class GPay extends Payments {

 @Override
 void displayDetail() {
     System.out.println("Thank you for choosing GPay. Payment done successfully!");
 }
}


