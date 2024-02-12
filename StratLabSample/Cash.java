package StratLabSample;

public class Cash implements PaymentType{
    public String calculatePayment() {
        String output = new String();
        output += "Cash is your payment type!\n" +
                "No incentives!";
        return output;
    }
}
