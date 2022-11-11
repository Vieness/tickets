public class MiniHall extends Hall {
    private int[][] hallMini = {{1, 2, 3},
            {1, 2, 3},
            {1, 2, 3}};
    @Override
    public int[][] getSeats() {
        return this.hallMini;
    }
}
