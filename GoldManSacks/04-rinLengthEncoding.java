class GfG
 {
	String encode(String str)
	{
          //Your code here
          String s="";
          int j=0;
          int n=str.length();
          for(int i=0;i<n-1;i++){
              if(str.charAt(i)!=str.charAt(i+1)){
                  s=s+str.charAt(i)+String.valueOf(i+1-j);
                  j=i+1;
              }
          }
          s=s+str.charAt(str.length()-1)+String.valueOf(n-j);
          return s;
          
	}
	
 