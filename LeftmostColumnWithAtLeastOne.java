/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int row, int col) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int min = Integer.MAX_VALUE;
        List<Integer> dimensions = binaryMatrix.dimensions();
        int rows = dimensions.get(0);
        int columns = dimensions.get(1);
        for(int i = rows - 1; i >= 0; --i){
            boolean foundOne = false;
            for(int j = columns - 1; j >= 0; --j){
                int current = binaryMatrix.get(i , j);
                if(current == 0 && j != columns - 1 && foundOne){
                    if(j <= min) {
                        min = j + 1;
                        if(min == 0)
                            return 0;
                        columns = min;
                        break;
                    }
                }else if(current == 0)
                    break;
                else if(current == 1 && j == 0)
                    return 0;
                else if(current == 1)
                    foundOne = true;
            }

        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}