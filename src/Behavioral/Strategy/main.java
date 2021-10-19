package Behavioral.Strategy;

public class main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.setPrice(12);
        ticket.setiTicketStategy(new Discount15());
        double price = ticket.getPromote();
        System.out.println(price);
    }
}
