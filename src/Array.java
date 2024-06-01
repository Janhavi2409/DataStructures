public class Array {
    public static void main(String[] args) {

        //1D Array
        System.out.println("1 D array:");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        //2D Array
        System.out.println("2 D array:");
        int[][] array2 = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array2[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //3D Array
        System.out.println("3 D array:");
        int[][][] array3 = new int[2][3][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    array3[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(array3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();

        //Jagged Array
        System.out.println("Jagged Array: ");
        int[][] jagged = {
                {1, 2, 4, 5},
                {1, 3, 1},
                {1}
        };
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}