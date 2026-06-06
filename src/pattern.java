public class pattern {
    public static void main(String[] args) {
        int n = 4; // number of rows in upper half

        int start = 3; // starting number
        int[] rowStart = new int[n]; // to store starting number of each row

        // Upper half
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                rowStart[i] = start;
            } else {
                rowStart[i] = rowStart[i - 1] + i + 1;
            }

            int num = rowStart[i];
            for (int j = 0; j <= i; j++) {
                System.out.print(num-- + " ");
            }
            System.out.println();
        }

        // Lower half (mirror of upper half)
        for (int i = n - 2; i >= 0; i--) {
            int num = rowStart[i];
            for (int j = 0; j <= i; j++) {
                System.out.print(num-- + " ");
            }
            System.out.println();
        }
    }
}