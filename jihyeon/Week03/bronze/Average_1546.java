package CodingTest.jihyeon.Week03.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Average_1546 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int[] scores = new int[count];
        float[] newScores = new float[count];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = 0;

        for (int i = 0; i < count; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        float sum = 0;

        for (int score : scores) {
            sum += (float) score / max * 100;
        }

        float average = sum / count;

        bw.write(String.valueOf(average));
        bw.flush();
        bw.close();
    }
}
