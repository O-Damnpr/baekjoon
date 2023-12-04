class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^-_.a-z0-9]","");
        new_id = new_id.replaceAll("\\.{2,}", ".");
        new_id = new_id.replaceAll("^\\.|\\.&", "");
        new_id = new_id.isEmpty() ? "a" : new_id;
        if (new_id.length() >= 16) {
		new_id = new_id.substring(0, 15);
}       
        new_id = new_id.replaceAll("[.]$", "");
        if (new_id.length() <= 2)
		while (new_id.length() < 3)
				new_id += new_id.charAt(new_id.length()-1);
        answer = new_id;
        return answer;
    }
}