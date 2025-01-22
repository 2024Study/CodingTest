package CodingTest.sua.Bronze;

import java.io.*;

public class Hashing_15829 {

    private static final int MOD = 1234567891;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int L = Integer.parseInt(br.readLine());

        String str = br.readLine();

        long res = calHash(str);


        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }


    private static long calHash(String str){
        //각 알파벳의 순서 수*31의 n제곱수
        long hash = 0;

        //31^0은 1이므로 1로 초기화해야됨
        long pow = 1;
        for (int i = 0; i < str.length(); i++) {
            hash = (hash + (str.charAt(i) - 'a' + 1) * pow) % MOD;
            pow = (pow * 31) % MOD;
        }
        return hash;
    }
}
