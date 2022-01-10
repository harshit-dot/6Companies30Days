class Solution
{
    public String FirstNonRepeating(String s)
    {
        StringBuilder sb = new StringBuilder();
        Queue<character> q = new LinkedList<>();
        int freq[] = new int[26];
        
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            q.offer(ch);
            freq[ch - 'a']++;
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1)q.poll();
            if(q.size() > 0 )sb.append(q.peek());
            else sb.append('#');
        }
        
        return sb.toString();    
    }
}