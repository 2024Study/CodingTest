package CodingTest.sua.Bronze;

import java.io.*;

public class FizzBuzz_28702 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int num = findNum(N);

        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int findNum(int N) {
        if (N == 1) return 1;

        int count = 1;
        int range = 1;

        while (range < N) {
            range += 6 * count;
            count++;
        }

        return count;
    }


}
