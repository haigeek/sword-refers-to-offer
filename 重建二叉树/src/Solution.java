import java.util.Arrays;

/**
 * Created by haigeek on 2017/7/13.
 * 递归
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int []pre,int []in){
       if(pre.length==0||in.length==0){
           return null;
       }
       TreeNode node=new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(pre[0]==in[i]){
                node.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));//复制新数组递归
                node.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return node;
    }
}
