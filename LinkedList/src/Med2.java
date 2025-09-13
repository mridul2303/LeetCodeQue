public class Med2 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null) return null;

            // Step 1: copy values into ArrayList (dynamic size)
            java.util.ArrayList<Integer> arr = new java.util.ArrayList<>();
            ListNode temp = head;
            while (temp != null) {
                arr.add(temp.val);
                temp = temp.next;
            }

            // Step 2: sort values
            java.util.Collections.sort(arr);

            // Step 3: put values back into linked list
            temp = head;
            int i = 0;
            while (temp != null) {
                temp.val = arr.get(i++);
                temp = temp.next;
            }

            return head; // return sorted list
        }
    }
    //efficient way is merge sort:
    class EfficientSolution {
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) {
                return head; // base case
            }

            // Step 1: split list into two halves using slow/fast pointers
            ListNode slow = head, fast = head, prev = null;
            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            prev.next = null; // cut the list into 2 halves

            // Step 2: sort each half
            ListNode left = sortList(head);
            ListNode right = sortList(slow);

            // Step 3: merge sorted halves
            return merge(left, right);
        }

        // Merge two sorted lists
        private ListNode merge(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0);
            ListNode tail = dummy;

            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    tail.next = l1;
                    l1 = l1.next;
                } else {
                    tail.next = l2;
                    l2 = l2.next;
                }
                tail = tail.next;
            }

            // attach remaining nodes
            if (l1 != null) tail.next = l1;
            if (l2 != null) tail.next = l2;

            return dummy.next;
        }
    }


}


