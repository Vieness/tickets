public class BigHall extends Hall {
    private int[][] hallBig = {{1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5}};

    @Override
    public int[][] getSeats() {
        return this.hallBig;
    }
}
