import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = solution(a, b);
        System.out.println(n);
    }

    private static int solution(int num, int expo) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(num);
        while (true) {
            int n = list.get(list.size() - 1);
            int tmp = 0;
            while (n != 0) {
                tmp += (int) Math.pow(n % 10, expo);
                n /= 10;
            }
            if (list.contains(tmp)) {
                return list.indexOf(tmp);
            }
            else {
                list.add(tmp);
            }
        }
    }
}