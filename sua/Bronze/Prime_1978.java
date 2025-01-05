package CodingTest.sua.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Prime_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;


        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)) {
                cnt++;
            }
        }


        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        //n의 제곱근까지만 검사: 약수는 쌍을 이루며, 그 중 작은 수는 항상 제곱근 이하이기 때문
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
