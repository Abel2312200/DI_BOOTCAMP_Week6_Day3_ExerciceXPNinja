public class ItterateValues {
    public static void main(String[] args) {
        // declaration global variables
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // display array
        for (int i = 0; i < array.length; i++) { // loop for current line
            for (int j = 0; j <array[i].length ; j++) { // loop for current column
                System.out.print(String.format("%d ",array[i][j]));
            }
            System.out.println(); // next line
        }


    }
}
