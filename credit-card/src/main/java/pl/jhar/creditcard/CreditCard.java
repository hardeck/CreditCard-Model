package pl.jhard.creditcard;



public class CreditCard {
    private double limit;
    public double getBallance() {
         return limit;
    }   
    public void assignLimit(double money) {
        this.limit=money;
    }
}