package PrintLinkListTailToHead;

import java.util.ArrayList;
import java.util.Stack;

public class printListFromTailToHead {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(ListNode cur = listNode; cur != null; cur = cur.next) {
            stack.push(cur.val);
        }
        while(!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }
}
