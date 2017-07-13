import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by haigeek on 2017/7/13.
 */
class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}
//非递归的方式
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer>stack=new Stack<>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer>list=new ArrayList<>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}
//递归的方式
public class Solution2{
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer>list=new ArrayList<>();
        if(listNode!=null){
            this.printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
}
