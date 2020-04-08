import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for(int a: arr)
            set.add(a);
        
        for( int i = 0; i < arr.length; i++)
            if(set.contains(arr[i] + 1))
                result++;
        return result;

    }
}