package CodingTest.sua.Bronze;

import java.io.*;

public class SumOfNumbers_11720 {

    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String nums = br.readLine();

        int sum = 0;

        for(int i=0; i<N; i++){
            sum += Character.getNumericValue(nums.charAt(i));
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();


    }

}
