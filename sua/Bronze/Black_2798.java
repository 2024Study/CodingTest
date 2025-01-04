package CodingTest.sua.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Black_2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] cards = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }


        int result = findRes(cards, N, M);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();


    }


    private static int findRes(int[] cards, int N, int M) {
        int max = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= M && sum > max) {
                        max = sum;
                    }
                    if (max == M) return max;
                }
            }
        }
        return max;
    }
}
