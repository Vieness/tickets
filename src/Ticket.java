import java.util.Objects;

public class Ticket {
    private int row;
    private int seat;

    private String film;

    public Ticket(int row, int seat, String film) {
        this.row = row;
        this.seat = seat;
        this.film = film;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return row == ticket.row && seat == ticket.seat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, seat);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "row=" + row +
                ", seat=" + seat +
                ", film='" + film + '\'' +
                '}';
    }
}
