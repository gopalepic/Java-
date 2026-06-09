package Contest.Contensts.Contest467;

public class EarlistTimeToFinish {
    public static void main(String[] args) {

        int[][] taks = { { 1, 6 }, { 2, 3 } };
        earliestTime(taks);
    }

    public static int earliestTime(int[][] tasks) {
        int minimumTime = Integer.MAX_VALUE;

        for (int i = 0; i < tasks.length ; i++) {
            int Sum = 0;
            for (int j = 0; j < tasks[i].length ; j++) {
                Sum += tasks[i][j];

            }

            if (Sum <= minimumTime) {
                minimumTime = Sum;
            }
        }

        return minimumTime;

    }
}
