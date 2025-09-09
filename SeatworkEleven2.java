public class SeatworkEleven2 {
    public static void main(String[] args) {
        System.out.println("SEATWORKELEVENPART2");
        System.out.println();
        int[][] myNumber = { {1, 4, 2}, {3, 6, 8, 5, 2} };

        for (int row = 0; row < myNumber.length; row++) {
            for (int col = 0; col < myNumber[row].length; col++) {
                System.out.println("myNumber[" + row + "]["+ col +"] = " + myNumber[row][col]);
            }
        }
    }
}   
