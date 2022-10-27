class Solution {
    public boolean isAnagram(String s, String t) {
        
       /* char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        if(Arrays.equals(c1,c2))
            return true;
        
        return false;*/
        
        int[] arr=new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i) - 'a']++;
        }
        
        for(int i=0;i<t.length();i++)
        {
            arr[t.charAt(i) - 'a']--;
        }
        
        
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
                return false;
        }
        return true;
    }
}