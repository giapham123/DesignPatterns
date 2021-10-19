package Behavioral.Strategy;

public class Discount15 implements ITicketStategy{
    @Override
    public double doDiscount(double price) {
        return price * 1.5;
    }
}