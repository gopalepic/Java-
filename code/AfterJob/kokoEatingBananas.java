package code.AfterJob;

public class kokoEatingBananas {
    public static void main(String[] args) {

        int[] piles = { 30, 11, 23, 4, 20 };
        int hour = 6;
        int out = minEatingSpeed(piles, hour);
        System.out.println("OUT " + out);
    }

    // public static int minEatingSpeed(int[] piles, int h) {

    // int cnt = 0;
    // int k = 1;

    // while (cnt != h) {

    // for (int i = 0; i < piles.length; i++) {

    // cnt += Math.ceil((double) piles[i] / k);
    // System.out.println(" I " + i);
    // }

    // if (cnt == h) {
    // break;
    // }

    // cnt = 0;
    // k++;

    // }

    // return k;

    // }

    public static int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = max(piles);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int hours = calculateHours(mid, piles);
            if (hours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;

    }

    public static int max(int[] piles) {

        int max = Integer.MIN_VALUE;
        for (int num : piles) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int calculateHours(int mid, int[] piles) {

        int k = mid;
        int hrs = 0;

        for (int i = 0; i < piles.length; i++) {

            hrs += (Math.ceil((double) piles[i] / k));

        }
        return hrs;
    }
}
