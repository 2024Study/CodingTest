package CodingTest.sua;

import java.io.*;

public class AsciiCode_11654 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        char character  = input.charAt(0);

        int asciiValue = (int) character;

        bw.write(asciiValue + "\n");

        bw.flush();
        bw.close();
        br.close();



    }
}
