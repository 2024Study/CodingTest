package CodingTest.jihyeon.Week02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DrawStar2_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int startLine;
        try {
            startLine = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
        for(int i = 1; i < startLine + 1; i++) {
            for (int j = 1; j < startLine + 1; j++) {
                if(j < startLine - i+1) {
                    bw.write(" ");
                }else {
                    bw.write("*");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
