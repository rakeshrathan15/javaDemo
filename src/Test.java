public class Test {
    public static void main(String[] args) {
        TicketBookService t1= new TicketBookService();
        Ticket ticket= t1.getTicket(3,"salar"," 10");
       // t1.bookTicket(6,"salar","6.00");
        System.out.println(ticket);

        System.out.println("hello");
    }

}
