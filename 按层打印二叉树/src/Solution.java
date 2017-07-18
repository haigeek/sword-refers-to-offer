
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by haigeek on 2017/7/18.
 */
class TreeNode{
    int val=0;
    TreeNode left=null;
    TreeNode right=null;

    public TreeNode(int val){
        this.val=val;
    }
}
public class Solution {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer>tmp=new ArrayList<Integer>();
        LinkedList<TreeNode> q=new LinkedList<TreeNode>();
        if(pRoot==null){
            return list;
        }
        q.add(pRoot);
        int now=1;
        int next=0;
        while (!q.isEmpty()){
            TreeNode t=q.remove();
            now--;
            tmp.add(t.val);
            if(t.left!=null){
                q.add(t.left);
                next++;
            }
            if(t.right!=null){
                q.add(t.right);
                next++;
            }
            if(now==0){
                list.add(new ArrayList<Integer>(tmp));
                tmp.clear();
                now=next;
                next=0;
            }
        }
        return list;
    }
}

