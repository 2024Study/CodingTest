package CodingTest.sua.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class MinimumAndMaximum_10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());


        StringTokenizer st = new StringTokenizer(br.readLine());

        // 초기값 설정: min은 최대값, max는 최소값으로 초기화
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // 각 정수에 대해 반복
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(min, num); // 최소값 비교
            max = Math.max(max, num); // 최대값 최댓값 비교
        }


        bw.write(min + " " + max + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}

