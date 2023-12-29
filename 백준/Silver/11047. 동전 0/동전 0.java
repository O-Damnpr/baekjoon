import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = N-1; i >= 0; i--) {
            if (arr[i] <= K){
                result += K/arr[i];
                K = K%arr[i];
            }
        }

        System.out.println(result);
    }
}