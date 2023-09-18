import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    int[] answer = {};

    List<Integer> list = new ArrayList<Integer>();
    for (int i=0; i<arr.length; i++){
      if(i==0){
           list.add(arr[i]);
      }else if(arr[i] != arr[i-1]){
          list.add(arr[i]);
      }
    }
   answer = new int[list.size()];
   for(int j = 0; j<list.size(); j++){
      answer[j] = list.get(j);
   }
   return answer;
}
}