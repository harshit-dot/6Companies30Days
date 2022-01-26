class GfG
{
	public int missingNumber(String s){

            for(int len = 1; len<=5; len++){
                int missingNum = findMissingUtil(len,s);
                if(missingNum != -1) return missingNum;
            }
            return -1;
            
    }
    
    private int findMissingUtil(int len, String s){

        int missingNum = -1;
        int i = 0;
        
        int prevNum = 0;
        while(i<s.length() && len>0){
            prevNum = prevNum * 10 + (int)(s.charAt(i) - '0');
            len--;
            i++;   
        }
        
        while(i<s.length()){
            int num = 0;
            while(i<s.length() && num<prevNum){
                num = num*10 + (int)(s.charAt(i)-'0');
                i++;
            }         
            if(prevNum != -1){
                if(prevNum+1 == num){}
                else if(prevNum+2 == num && missingNum == -1) {
                    missingNum = prevNum+1;
                }
                else{
                    return -1;
                }
            }
            prevNum = num;
        }
        return missingNum;
    }
}
