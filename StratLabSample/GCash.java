package StratLabSample;

public class GCash implements PaymentType{
    public String calculatePayment() {
        String output = new String();
        output += "GCash is your payment type!\n" +
                "You earned 10 energy points!";
        return output;
    }
}
