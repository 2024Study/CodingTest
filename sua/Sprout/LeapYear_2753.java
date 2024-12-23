package CodingTest.sua.Sprout;

import java.io.*;

public class LeapYear_2753 {

    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        //윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
        bw.write(((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? "1" : "0");
        bw.flush();
        bw.close();

    }

}
