package kthSmallest;

import java.util.*;

public class kthSmallest {
	
    public static int kthsmallest(final List<Integer> a, int k) {
    	//check if array is empty
        if(a == null || a.size() == 0)
             return -1;
        //get max and min values of array
        int min = Collections.min(a);
        int max = Collections.max(a);

        while(min <= max) {
            int mid = min + (max - min)/2;
            int lessThanMid = 0;
            int equalToMid = 0;

            for(int i = 0; i < a.size(); i++) {
                if(a.get(i) < mid) {
                	lessThanMid++;
                }else if(a.get(i) == mid) {
                	equalToMid++;
                }
                if(lessThanMid >= k) break;
            }

            if(lessThanMid < k && lessThanMid + equalToMid >= k){
                return mid;
            }else if(lessThanMid >= k) {
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {

    	List<Integer> a = Arrays.asList(2,1,4,3,2);
    	System.out.println(kthsmallest(a, 3));
    }
    
}
