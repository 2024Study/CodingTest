package CodingTest.jihyeon.Week03.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FindAlphabet_10809 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int[] alphabet = new int[26];

        for(int i = 0; i<26; i++){
            alphabet[i] = -1;
        }

        for(int i= 0; i < s.length(); i++){
            char c = s.charAt(i);
            int index = c - 'a';

            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        for(int i = 0; i<26; i++){
            bw.write(String.valueOf(alphabet[i]) + " ");
        }

        bw.flush();
        bw.close();
    }
}
