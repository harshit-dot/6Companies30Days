class Solution
{
    int atoi(String str) {
	// Your code here
	
    int k;
	try{
	     k=Integer.parseInt(str);
	     
	}
    catch(Exception e){
     k=-1;
    }
    return k;
    }
}

