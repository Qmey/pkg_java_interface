import java.io.*;

public class word_1task {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Yerlan\\IdeaProjects\\Test project\\src\\input.txt"));
        PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\Yerlan\\IdeaProjects\\Test project\\src\\output.txt"));


        int N = Integer.parseInt(reader.readLine());


        String[] timeStrings = reader.readLine().split(" ");
        int[] times = new int[N];
        for (int i = 0; i < N; i++) {
            times[i] = Integer.parseInt(timeStrings[i]);
        }

        int[] penalties = calculatePenalties(times);

        int winner = getWinner(penalties);

        writer.println(winner);

        reader.close();
        writer.close();
    }


    private static int[] calculatePenalties(int[] times) {
        int[] penalties = new int[3];

        for (int i = 0; i < times.length; i++) {
            penalties[0] += times[i] * (i + 1);
        }

        for (int i = times.length - 1, j = 0; i >= 0; i--, j++) {
            penalties[1] += times[i] * (j + 1);
        }

        int[] sortedTimes = times.clone();
        java.util.Arrays.sort(sortedTimes);
        for (int i = 0; i < sortedTimes.length; i++) {
            penalties[2] += sortedTimes[i] * (i + 1);
        }

        return penalties;
    }


    private static int getWinner(int[] penalties) {
        if (penalties[0] < penalties[1] && penalties[0] < penalties[2]) {
            return 1;
        } else if (penalties[1] < penalties[0] && penalties[1] < penalties[2]) {
            return 3;
        } else {
            return 2;
        }
    }
}
