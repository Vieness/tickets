public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        Session session = cinema.getSessions().get(0);

        Ticket ticket = session.reserveSeat(2,1);
        System.out.println(ticket);
    }
}