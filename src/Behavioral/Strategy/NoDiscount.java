package Behavioral.Strategy;

public class NoDiscount implements ITicketStategy{
    @Override
    public double doDiscount(double price) {
        return 0;
    }
}
