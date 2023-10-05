import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<priorities.length; i++){
            list.add(priorities[i]);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i<priorities.length; i++){
            queue.add(priorities[i]);
        }
        
        int locationIndex = location;
        
        for(;;){
            MaxValue max = maxNum(list);
        int queuePoll = queue.poll();
        if (queuePoll != max.getMax()) {
            queue.add(queuePoll);
        } else {
            answer++;
            list.remove(max.getIndex());
            if (locationIndex == 0) {
                break;
        }
      }
    
      locationIndex--;
      if (locationIndex == -1) {
        locationIndex = queue.size() - 1;
      }
    }
    return answer;
    }
    
    private MaxValue maxNum(List<Integer> list) {
    MaxValue mv = new MaxValue(0, 0);

    for (int i = 0; i < list.size(); i++) {
      if (mv.getMax() < list.get(i)) {
        mv.setMax(list.get(i));
        mv.setIndex(i);
      }
    }
    return mv;
  }
    
    class MaxValue {
    int max;
    int index;

    public MaxValue(int max, int index) {
      this.max = max;
      this.index = index;
    }

    public int getMax() {
      return max;
    }

    public void setMax(int max) {
      this.max = max;
    }

    public int getIndex() {
      return index;
    }

    public void setIndex(int index) {
      this.index = index;
    }
  }
}