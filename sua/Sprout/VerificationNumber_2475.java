package CodingTest.sua.Sprout;

import java.io.*;
import java.util.StringTokenizer;

public class VerificationNumber_2475 {
    public static void main(String[] args)throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //for문으로 다시.
//        int A = Integer.parseInt(st.nextToken());
//        int B = Integer.parseInt(st.nextToken());
//        int C = Integer.parseInt(st.nextToken());
//        int D = Integer.parseInt(st.nextToken());
//        int E = Integer.parseInt(st.nextToken());
//
//        int res = (A*A + B*B + C*C + D*D + E*E)%10;

        int [] numbers = new int[5];

        int sum = 0;

        for (int i=0;i<5;i++){
            numbers[i] = Integer.parseInt(st.nextToken());
            sum +=numbers[i]*numbers[i];
        }

        int res = sum % 10;


        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();



    }
}
