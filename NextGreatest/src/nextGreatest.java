import java.lang.reflect.Array;
import java.util.*;

public class nextGreatest {
	
	public static ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
		
        ArrayList<Integer> resultArray = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
		//System.out.println(a.size());

		for (int i = 0; i <= a.size(); i++) {
			int currentVal = a.get(i);

			for (int j = i; j <= a.size(); j++) {
				System.out.println(i);
				System.out.println(j);

				if (j >= (a.size() - 1)) {
					stack.push(-1);
					resultArray.add(-1);
				} else if (a.get(j + 1) > currentVal) {
					resultArray.add(a.get(j + 1));
					stack.push(a.get(j + 1));
					break;
				}
			}
		}

		return resultArray;
	}
	
    public static void main(String[] args) {

    	ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4, 5, 2, 10));
    	System.out.println(nextGreater(a));
    }

}
