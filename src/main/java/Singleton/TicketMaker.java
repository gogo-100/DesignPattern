package SingletonPattern;

public class TicketMaker {
    private static int ticketCount = 1000;
    private volatile static TicketMaker ticket;
    public static TicketMaker getNextTicketNumber(){
        ticketCount++;
        System.out.println(ticketCount);
        return TicketMaker.getInstance();
    }
    private TicketMaker(){

    }
    public static TicketMaker getInstance(){
        if(ticket == null){
            synchronized (TicketMaker.class){
                if(ticket == null){
                    ticket = new TicketMaker();
                }
            }
        }
        return ticket;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(getNextTicketNumber());
        }
    }
}
