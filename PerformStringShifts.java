class Solution {
    public String stringShift(String s, int[][] shift) {
        int val = 0;
        for(int i = 0; i < shift.length; i++){
            val += shift[i][0] == 0?-shift[i][1]:shift[i][1];
        }
        int len = s.length();
        val %= len;  
        
        String result = "";
        if(val>0)
            result = s.substring(len-val,len) + s.substring(0,len-val);
        else
            result = s.substring(-val,len) + s.substring(0,-val);
        
        return result;
    }
}