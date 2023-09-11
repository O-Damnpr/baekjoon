class Solution {
    public int[] solution(int[] num_list) {
        int holnum = 0;
        int jjaknum = 0;
        for(int i = 0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                holnum++;
            } else {
                jjacknum++;
            }
        }
        System.out.println("%d, %d", holnum, jjacknum);
    }
}