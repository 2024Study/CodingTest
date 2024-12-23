package CodingTest.sua.Sprout;

import java.io.*;

public class PrintN_2741 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++){
            bw.write(String.valueOf(i));
            bw.newLine();

        }

        bw.flush();
        bw.close();

    }
}
