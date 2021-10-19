package Behavioral.Strategy;

public class Ticket {

    private ITicketStategy iTicketStategy;

    private double price;

    private String name;

    public ITicketStategy getiTicketStategy() {
        return iTicketStategy;
    }

    public void setiTicketStategy(ITicketStategy iTicketStategy) {
        this.iTicketStategy = iTicketStategy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPromote(){
        return iTicketStategy.doDiscount(price);
    }

    public Ticket(){}
    public Ticket(ITicketStategy iTicketStategy){
        this.iTicketStategy = iTicketStategy;
    }
}
