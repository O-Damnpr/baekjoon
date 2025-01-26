import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(n >= 5)
            cnt += (n/=5); // n!의 인수에 5의 개수 카운팅
        System.out.println(cnt);
    }
}