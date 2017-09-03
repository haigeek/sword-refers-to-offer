/**
 * Created by haigeek on 2017/9/3.
 */
public class Problem8 {
    public int minNumberInRotateArray(int [] array) throws Exception{
        if(array==null)
            throw new Exception("null");
        int index1=0;
        int index2=array.length-1;
        int indexMid=index1;
        while (array[index1]>=array[index2]){
            //只有两个元素
            if(index2-index1==1) {
                indexMid = index2;
                break;
            }
            indexMid=(index1+index2)/2;
            //如果下标index1；index2，indexMid指向的元素值相等，则进行顺序查找
            if(array[index1]==array[index2]&&array[indexMid]==array[index1])
                return MInInOrder(array,index1,index2);
            if(array[indexMid]>=array[index1])
                index1=indexMid;
            else if(array[indexMid]<=array[index2])
                index2=indexMid;
        }
        return array[indexMid];
}

    private int MInInOrder(int[] array, int index1, int index2) {
        int result=array[index1];
        for(int i=index1;i<index2;i++){
            if(result>array[i])
                result=array[i];
        }
        return result;
    }

    }
