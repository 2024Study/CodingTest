package CodingTest.sua.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Common_2609 {
    //최대공약수(GCD): 유클리드 호제법을 사용하여 두 수의 GCD를 계산

    //최소공배수(LCM): GCD를 이용하여 LCM을 계산합니다. LCM은 두 수의 곱을 GCD로 나눈 값

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int gcd = getGCD(num1, num2);
        int lcm = (num1 * num2) / gcd; // LCM 계산

        bw.write(String.valueOf(gcd));
        bw.newLine();
        bw.write(String.valueOf(lcm));
        bw.flush();
        bw.close();
    }

    //최대공앿수 메소드
    private static int getGCD(int a, int b) {
        //유클리드 호제법
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
