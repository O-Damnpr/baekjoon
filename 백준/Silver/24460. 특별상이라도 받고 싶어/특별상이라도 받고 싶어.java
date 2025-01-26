import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int board[][] = new int[N][N];
        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(special(0, 0, N, board));
    }
    public static int special(int x, int y, int N, int[][] board) {
        if(N == 1) {
            return board[0][0];
        }
        if(N == 2) {
            int arr[] = new int[4];
            int index = 0;
            for(int i = x; i < x + N; i++) {
                for(int j = y; j < y + N; j++) {
                    arr[index++] = board[i][j];
                }
            }
            Arrays.sort(arr);
            return arr[1];
        }
        else {
            int arr[] = new int[4];
            arr[0] = special(x, y, N/2, board);
            arr[1] = special(x, y + N/2, N/2, board);
            arr[2] = special(x + N/2, y, N/2, board);
            arr[3] = special(x + N/2, y + N/2, N/2, board);
            Arrays.sort(arr);
            return arr[1];
        }
    }
}