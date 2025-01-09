package CodingTest.sua.Bronze;

import java.io.*;

public class DecompositionSum_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int res = findA(N);



        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }

    //N = A + A의 백의자리수 + A의 십의자리수 + A의 일의자리수

    //A = N - A - A의 백의자리수 - A의 십의자리수 - A의 일의자리수

    //A의 자릿수값을 알 수 가 없다... 하나하나 노가다해야된다 -> 완전 탐색(브루트포스 알고리즘)





    private static int findA(int N) {
        for (int A = 1; A < N; A++) {
            int sum = A;
            int temp = A;

            // 각 자릿수를 더함
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            // 만약 sum이 N과 같다면 A를 찾은 것
            if (sum == N) {
                return A;
            }
        }

        // A를 찾지 못한 경우
        return 0;
    }
}
