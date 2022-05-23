package algori_lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Store {
    int num;
    int count;
}

public class Test3 {
    public static void main(String[] args) {
        List<Store> stores = new ArrayList<>();
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 3, 2);

        list.stream().forEach((i) -> {

            int checkSum = 0;

            for (Store store : stores) {
                if (store.num == i) {
                    store.count++;
                    checkSum++;
                }
            }

            if (checkSum == 0) {
                stores.add(new Store(i, 1));
            }
        });

        int mostNum = 0;
        for (int i = 0; i < stores.size(); i++) {
            if (i == 0) {
                mostNum = stores.get(i).num;
                continue;
            }

            if (stores.get(i - 1).count < stores.get(i).count) {
                mostNum = stores.get(i).num;
            }
        }
        System.out.println("가장 많이 나온 숫자는 : " + mostNum);
    }
}
