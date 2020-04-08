import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class group_anagram {
    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for(String cur: strs){
            char[] characters = cur.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters);
            if(!hashMap.containsKey(sorted)){
                hashMap.put(sorted, new ArrayList<>());
            }
            hashMap.get(sorted).add(cur);
        }
        result.addAll(hashMap.values());
        return result;
    }
}