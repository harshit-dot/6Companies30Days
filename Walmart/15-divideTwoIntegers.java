public class Solution {
public int divide(int dividend, int divisor) {
    Boolean positive=true;
    if(dividend>=0&&divisor>0||dividend<=0&&divisor<0){
        positive=true;
    }else if(dividend<=0&&divisor>0||dividend>=0&&divisor<0){
        positive=false;
    }else{
        return Integer.MAX_VALUE;
    }
    
    long ldividend=Math.abs((long)dividend);
    long ldivisor=Math.abs((long)divisor);
    long result=0;
    while(ldividend>=ldivisor){
        long tmpDivisor=ldivisor;
        long tmpResult=1;
        while((tmpDivisor<<1)<ldividend){tmpDivisor<<=1;tmpResult<<=1;}
        ldividend-=tmpDivisor;
        result+=tmpResult;
    }
    if(result>Integer.MAX_VALUE&&positive)
        return Integer.MAX_VALUE;
    if(result>Integer.MAX_VALUE&&!positive)
        return Integer.MIN_VALUE;
    if(positive){
        return (int)result;
    }else{
        return -1*(int)result;
    }
}
}

