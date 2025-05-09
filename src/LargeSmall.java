public class LargeSmall {
    public static void main(String[] args) {
        int[] no = {34, 29, 8, 100, -5, -6};

        int max = no[0];
        int min = no[0];

        for (int i = 1; i < no.length; i++) {
            if (no[i] > max) {
                max = no[i];
            } else if (no[i] < min) {
                min = no[i];
            }
        }

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}
