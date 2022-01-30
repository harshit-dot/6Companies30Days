class Solution {
    public boolean winnerOfGame(String str) {
        int a=0, b=0;
        for(int i=1;i<str.length()-1;i++){
            if(str.charAt(i-1) == str.charAt(i) && str.charAt(i)==str.charAt(i+1)){
                if(str.charAt(i) == 'A') a++;
                if(str.charAt(i) == 'B') b++;
            }
        }
        return a>b;
    }
}
