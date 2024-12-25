package CodingTest.sua.Bronze;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Rest_3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num=0;

        Set<Integer> uniqueRes = new HashSet<>();

        for(int i=1; i<=10; i++){
            num = Integer.parseInt(br.readLine());
            uniqueRes.add(num%42);
        }


        bw.write(String.valueOf(uniqueRes.size()));
        bw.flush();
        bw.close();


    }

}
