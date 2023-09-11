class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        for(;;){
            if(money >= 5500) {
                money = money - 5500;
                answer[0] += 1;
            } else {
                answer[1] = money;
                break;
            }
        }
        return answer;
    }
}