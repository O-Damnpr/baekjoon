class Solution {
    public String solution(String polynomial) {
        int xnum = 0;
        int num = 0;
        for(String s : polynomial.split(" ")){
            if(s.contains("x")){
                xnum += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            } else if(!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }
        return (xnum != 0 ? xnum > 1 ? xnum + "x" : "x" : "") 
        		+ (num != 0 ? (xnum != 0 ? " + " : "") 
                + num : xnum == 0 ? "0" : "");
    }
}