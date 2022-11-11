import java.util.HashSet;
import java.util.Set;

public class Session {
    private String filmName;

    private Hall hall;

    private Set<Ticket> reservedSeats = new HashSet<>();

    public Session() {
    }

    public Session(String filmName, Hall hall) {
        this.filmName = filmName;
        this.hall = hall;
    }

    public Ticket reserveSeat(int row, int seat) {
        if (seatIsNotWalid(row - 1, seat - 1)) throw new IllegalArgumentException("Seat does not exist");
        Ticket ticket = new Ticket(row, seat,this.filmName);
        if (this.reservedSeats.contains(ticket)) throw new IllegalArgumentException("Your seat already booked");
        this.reservedSeats.add(ticket);
        return ticket;
    }

    private boolean seatIsNotWalid(int row, int seat) {
        return row < 0 || seat < 0 ||
                this.hall.getSeats().length < row || this.hall.getSeats()[row].length < seat;
    }
}
