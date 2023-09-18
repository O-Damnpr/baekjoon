class Solution {
    boolean solution(String s) {
        char[] str = s.toCharArray();
        boolean answer = false;
        int count = 0;
        for(char c : str){
            count += c == '(' ? 1:-1;
            if(count < 0) return false;
        }
        return count == 0;
    }
    
}