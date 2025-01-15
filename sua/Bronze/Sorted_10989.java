package CodingTest.sua.Bronze;

import java.io.*;

public class Sorted_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001];

        for (int i = 0; i < N; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i <= 10000; i++) {
            while (count[i] > 0) {
                bw.write(Integer.toString(i));
                bw.newLine();
                count[i]--;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
