package CodingTest.jihyeon.Week03.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class RightTriangle_4153 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int side1 = Integer.parseInt(st.nextToken());
            int side2 = Integer.parseInt(st.nextToken());
            int side3 = Integer.parseInt(st.nextToken());

            if (side1 ==0 && side2 == 0 && side3 == 0){
                break;
            }
            int maxSide = Math.max(side1, Math.max(side2, side3));
            int sumOfSquares = side1 * side1 + side2 * side2 + side3 * side3 - maxSide * maxSide;

            if (maxSide * maxSide == sumOfSquares) {
                bw.write("right");
            }else {
                bw.write("wrong");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
