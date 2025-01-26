import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

        int nPeopleCount = Integer.parseInt(bReader.readLine());
        
        int[] arrWeight = new int[nPeopleCount];
        int[] arrHeight = new int[nPeopleCount];
        
        int[] arrResult = new int[nPeopleCount];

    	for(int i = 0; i < nPeopleCount; i++) {
			StringTokenizer st = new StringTokenizer(bReader.readLine());
			arrWeight[i] = Integer.parseInt(st.nextToken());
			arrHeight[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	for(int i = 0; i < nPeopleCount; i++) {
    		int nWeightTemp = arrWeight[i];
    		int nHeightTemp = arrHeight[i];
    		
    		int nRate = 1;
    		for(int j = 0; j < nPeopleCount; j++) {
            		// 본인은 안비교
    			if(j==i)
    				continue;
    			if(nWeightTemp < arrWeight[j] && nHeightTemp < arrHeight[j]) {
    				nRate++;
    			} 
    		}
    		System.out.print(nRate + " ");
    	}
        
	}
}