public int findMaxLength(int [] nums){
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    hashMap.put(0,-1);
    int max_length = 0;
    int count = 0;
    for(int i = 0; i < nums.length; i++){
        if(nums[i] == 0){
            count+= -1;
        }else{
            count += 1;
        }
        if(hashMap.containsKey(count)){
            max_length = Math.max(max_length, i - hashMap.get(count));

        }else{
            hashMap.put(count, i);
        }
    }
    return max_length;
}