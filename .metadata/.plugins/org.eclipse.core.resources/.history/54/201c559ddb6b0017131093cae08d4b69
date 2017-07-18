
//  Definition for singly-linked list.
  class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
 
public class Solution {
    ListNode left;
    
    public int lPalin(ListNode A) {
        
        left = A;
		
		int result = helper(A);
		
		return result;
    }
    
    public int helper(ListNode right) {
		
		if (right == null)
			return 1;
	
		int x = helper(right.next);
		if (x == 0)
			return 0;
	
		int y = 0;
		if (left.val == right.val) {
		    y = 1;
		}
	
		left = left.next;
	
		return y;
}
}