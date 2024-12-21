package CodingTest.sua;

import java.io.*;

public class Grade_9498 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int score = Integer.parseInt(br.readLine());

        //90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F

        if (score>=90){
            bw.write("A");
        }
        else if (score>=80){
            bw.write("B");
        }
        else if(score>=70) {
            bw.write("C");
        }
        else if(score>=60) {
            bw.write("D");
        }
        else{
            bw.write("F");
        }


        bw.flush();
        bw.close();
    }
}
