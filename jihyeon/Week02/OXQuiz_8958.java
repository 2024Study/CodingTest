package CodingTest.jihyeon.Week02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OXQuiz_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());


        String[] testCases = new String[count];

        for (int i = 0; i < count; i++) {
            testCases[i] = br.readLine();
            int score = 0;
            int resultScore = 0;

            for (int j = 0; j < testCases[i].length(); j++) {
                if (testCases[i].charAt(j) == 'O') {
                    score++;
                    resultScore += score;
                }
                if (testCases[i].charAt(j) == 'X') {
                    score = 0;
                }
            }
            bw.write(String.valueOf(resultScore));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
