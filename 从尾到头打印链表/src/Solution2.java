import java.util.ArrayList;

/**
 * Created by haigeek on 2017/7/13.
 */
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
