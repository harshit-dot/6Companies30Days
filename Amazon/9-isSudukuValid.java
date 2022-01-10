class Solution{
    static int isValid(int mat[][]){
        // code here
        Set<String> s=new HashSet<String>();
       
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(mat[i][j]!=0){
                    String ans1="row"+String.valueOf(i)+String.valueOf(mat[i][j]);
                    String ans2="col"+String.valueOf(j)+String.valueOf(mat[i][j]);
                    String ans3="box"+String.valueOf((i/3)*3+(j/3))+String.valueOf(mat[i][j]);
                    if(!s.contains(ans1) && !s.contains(ans2)&& !s.contains(ans3)){
                        s.add(ans1);
                        s.add(ans2);
                        s.add(ans3);
                    }
                    else{
                        return 0;
                    }
                }
                
            }
        }
        return 1;
    }
}