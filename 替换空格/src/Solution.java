/**
 * Created by haigeek on 2017/7/8.
 * 从后往前的方法
 */
public class Solution {
    public String replaceSpace(StringBuffer str){
        int spacenum=0;
        //计算空格个数
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                spacenum++;
            }
        }
        int indexold=str.length()-1;
        int newlength=str.length()+spacenum*2;//设置新的字符串长度
        int indexnew=newlength-1;
        str.setLength(newlength);
        for(;indexold>=0;indexold--){
            if(str.charAt(indexold)==' '){
                str.setCharAt(indexnew--,'0');
                str.setCharAt(indexnew--,'2');
                str.setCharAt(indexnew--,'%');
            }else {
                str.setCharAt(indexnew--,str.charAt(indexold));
            }
        }
        return str.toString();
    }
}
