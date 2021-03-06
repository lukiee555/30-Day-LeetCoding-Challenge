class Solution {
    public boolean isValidSequence(TreeNode root, int[] arr) {
       
        return checkPath(root, arr, 0);
       
    }
   
     private static boolean checkPath(TreeNode root, int arr[], int index)
    {
         if(root == null || index == arr.length)
             return false;
        
         if(root.left == null && root.right == null && root.val == arr[index] && index == arr.length-1)
             return true;
       
         return root.val == arr[index] && (checkPath(root.left, arr, index+1) || checkPath(root.right, arr, index+1));
   
    }
}