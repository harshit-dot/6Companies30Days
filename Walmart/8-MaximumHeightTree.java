class Solution{
    static int height(int N){
        // code here
        int a=1;
        int b=1;
        int c=2*N;
        int sq=(int)(Math.sqrt(b+(4*c)));
        return (int)Math.ceil(((-b+sq)/(2*a)));
    }
}
