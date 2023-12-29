import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int max = 0;
        int where = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
                where = i+1;
            }
        }

        System.out.print(max+"\n"+where);
    }
}