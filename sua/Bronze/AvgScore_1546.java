package CodingTest.sua.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class AvgScore_1546 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());
            sum += score;
            if (score > max) {
                max = score;
            }
        }

        double result = calAvg(sum, max, N);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }


    //평균 구하는 메소드
    private static double calAvg(int sum, int max, int N){
        return (double) sum * 100 / max / N;
    }

}
