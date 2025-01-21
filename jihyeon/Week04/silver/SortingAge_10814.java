package CodingTest.jihyeon.Week04.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class SortingAge_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        List<Member> members = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            members.add(new Member(age, name, i));
        }

        members.sort(Comparator.comparingInt(Member::getAge).thenComparingInt(Member::getIndex));

        for (Member member : members) {
            bw.write(member.getAge() + " " + member.getName() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

class Member {
    private final int age;
    private final String name;
    private final int index;

    public Member(int age, String name, int index) {
        this.age = age;
        this.name = name;
        this.index = index;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
}
