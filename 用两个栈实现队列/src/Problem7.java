import java.util.Stack;

/**
 * Created by haigeek on 2017/9/3.
 */
public class Problem7<T> {
    Stack<T> stack1=new Stack<T>();
    Stack<T> stack2=new Stack<T>();
    public void appendTail(T t){
        stack1.push(t);
    }
    public T deleteHead() throws Exception{
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            throw new Exception("队列为空 不能删除");
        }
        return stack2.pop();
    }
}
