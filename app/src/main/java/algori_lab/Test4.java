package algori_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int num = 19;
        List<Integer> bins = new ArrayList<>();

        // 19/2 = 9 ... 1
        // 9/2 = 4 ... 1
        // 4/2 = 2 ... 0
        // 2/2 = 1 ... 0
        // 1/2 = 0 ... 1
        // 거꾸로 나열 [1 0 0 1 1]

        int mok = num;
        int namerge = 0;
        while (true) {
            namerge = mok % 2;
            mok = mok / 2;

            bins.add(namerge);

            if (mok == 0)
                break;
        }
        for (int j = bins.size() - 1; j >= 0; j--) {
            System.out.print(bins.get(j) + " ");
        }

    }
}
