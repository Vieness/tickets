public class StandardHall extends Hall {
    private int[][] hallOrdinary = {{1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},};

    @Override
    public int[][] getSeats() {
        return this.hallOrdinary;
    }
}
