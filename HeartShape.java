public class HeartShape {
    public static void main(String[] args) {
        int n = 6; // size of the heart

        // Upper part of heart
        for (int i = n/2; i <= n; i += 2) {
            // Print space
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }

            // Left lobe
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Space between lobes
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Right lobe
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part of heart 
        for (int i = n; i >= 1; i--) {
            // Leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
