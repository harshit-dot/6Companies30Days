class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        // code here
        ArrayList<ArrayList<String>> lst=new ArrayList<>();
        Arrays.sort(contact);
        for(int i=0;i<s.length();i++){
            ArrayList<String> lst1=new ArrayList<>();
            for(int j=0;j<contact.length;j++){
                if(contact[j].length()>=i+1){
                if(contact[j].substring(0,i+1).equals(s.substring(0,i+1)) && !lst1.contains(contact[j])){
                    lst1.add(contact[j]);
                }
                }
            }
            if(lst1.size()==0){
                lst1.add("0");
            }
            lst.add(new ArrayList<>(lst1));
        }
        return lst;
    }
}