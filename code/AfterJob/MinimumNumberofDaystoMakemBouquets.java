package code.AfterJob;

public class MinimumNumberofDaystoMakemBouquets {
    public static void main(String[] args) {

        int[] arr = { 7, 7, 7, 7, 12, 7, 7 };
        int ans = minDays(arr, 2, 3);
        System.out.println("ANS " + ans);

    }

    public static int minDays(int[] bloomDay, int m, int k) {

        int totalflowers = bloomDay.length; // this is the total flowers that must be in the array

        if (totalflowers < m * k) {
            return -1;
        }

        int[] bloomed = new int[totalflowers];

        int max = max(bloomDay);
        int min = 1; // atleast 1 din tho hoga he hoga

        // the number of Ith variable holds the total number of days that flower requried to become totally evloved 


       
        


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

}
