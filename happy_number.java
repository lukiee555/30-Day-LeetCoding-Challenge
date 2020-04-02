import java.util.*; 

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> visited = new HashSet<>();
        if (n <= 0) return false;
        while (n != 1) {
            int current = n;
            int sum = 0;
            while (current != 0) {
                sum += (current % 10) * (current % 10);
                current /= 10;
            }
            if (visited.contains(sum)) {
                return false;
            }
            visited.add(sum);
            n = sum;
        }
        return true;
    }
}