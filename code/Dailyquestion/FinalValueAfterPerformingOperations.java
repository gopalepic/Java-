package code.Dailyquestion;

public class FinalValueAfterPerformingOperations {
    public static void main(String[] args) {
        String[] s = {"++X","++X","X++"};
        int ans = finalValueAfterOperations(s);
        System.out.println(ans);
    }

    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("++X")) {
                ++X;
            }
            if (operations[i].equals("X++")) {
                X++;
            }
            if (operations[i].equals("--X")) {
                --X;
            }
            if (operations[i].equals("X--")) {
                X--;
            }
        }

        return X;
    }
}
