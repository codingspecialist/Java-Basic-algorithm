package algori_lab.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Student {
    private String name;
    private String no;
}

public class Test {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("손오공", "1682"),
                new Student("저팔계", "1772"),
                new Student("사오정", "1813"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("검색을 하고 싶으면 y, 종료는 n");
            String input = sc.nextLine();

            if (input.equals("y")) {
                System.out.println("검색어를 입력하세요!");

                String name = sc.nextLine();

                list.stream().forEach((s) -> {
                    if (s.getName().equals(name)) {
                        System.out.println("해당 학생의 학번은 : " + s.getNo());
                    }
                });
            } else if (input.equals("n")) {
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. y 혹은 n을 입력하세요");
                continue;
            }

        }

        System.out.println("프로그램이 종료되었습니다.");
    }
}
