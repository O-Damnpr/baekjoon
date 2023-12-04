class Solution {
    public int solution(String[] babbling) {
        int voca = 0;
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
                voca++;
            }
        }
        return voca;
    }
}