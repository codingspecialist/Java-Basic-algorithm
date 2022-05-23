package algori_lab;

public class Test2 {
    public static void main(String[] args) {
        Long[] arr = new Long[10];

        // a1 = 1, a2 = 1 기존 값 초기화 필요
        arr[0] = 1L;
        arr[1] = 1L;

        // arr3부터 피보나치 공식 적용 arr[-1] + arr[-2] = arr[현재항]
        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (Long i : arr) {
            System.out.print(i + " ");
        }
    }
}
