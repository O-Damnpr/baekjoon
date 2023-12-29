import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int[] student = new int[30];

        for (int i = 0; i < 28; i++){
            int success = sc.nextInt();
            student[success-1] = 1;
        }

        for (int i = 0; i<30; i++){
            if (student[i] != 1){
                System.out.println(i+1);
            }
        }
    }
}