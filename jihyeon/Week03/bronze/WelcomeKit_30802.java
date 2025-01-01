package CodingTest.jihyeon.Week03.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class WelcomeKit_30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int peopleCount = Integer.parseInt(br.readLine());
        StringTokenizer RequestShirtsCount = new StringTokenizer(br.readLine(), " ");

        int[] shirtSize = new int[6];

        StringTokenizer bundle = new StringTokenizer(br.readLine());
        int shirtBundle = Integer.parseInt(bundle.nextToken());
        int penBundle = Integer.parseInt(bundle.nextToken());

        int result = 0, orderShirt = 0;

        for (int i =0; i < 6; i++) {
            shirtSize[i] = Integer.parseInt(RequestShirtsCount.nextToken());

            if (shirtSize[i] % shirtBundle <= 0) {
                orderShirt = shirtSize[i] / shirtBundle;
            }else {
                orderShirt = shirtSize[i] / shirtBundle + 1;
            }
            result += orderShirt;
        }
        bw.write(String.valueOf(result));
        bw.newLine();
        bw.write(String.valueOf(peopleCount/penBundle) + " " + String.valueOf(peopleCount % penBundle));
        bw.flush();
        bw.close();
    }
}
