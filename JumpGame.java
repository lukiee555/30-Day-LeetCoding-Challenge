class Solution {
    public boolean canJump(int[] A) {
        if(A.length <= 1)
        return true;
 
    int max = A[0]; 
    for(int i=0; i<A.length; i++){
        if(max <= i && A[i] == 0) 
            return false;
 
        if(i + A[i] > max){
            max = i + A[i];
        }
 
        if(max >= A.length-1) 
            return true;
    }
 
    return false;
    }
}