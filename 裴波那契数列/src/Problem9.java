/**
 * Created by haigeek on 2017/9/3.
 * Two代表f(n-2)的部分即小一点的组合
 * One代表F(n-1)的部分即大一点的组合
 */
public class Problem9 {
    public long Fibonacci(int n){
        long result=0;
        long fibnMInusOne=1;
        long fibnMInusTwo=0;
        if(n==0)
            return fibnMInusTwo;
        if(n==1)
            return fibnMInusOne;
        for(int i=2;i<=n;i++){
            result = fibnMInusOne+fibnMInusTwo;
            fibnMInusTwo=fibnMInusOne;
            fibnMInusOne=result;
        }
        return result;
    }
}
