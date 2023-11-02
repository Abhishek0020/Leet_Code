class Solution {
    public char repeatedCharacter(String s) {
        Set <Character> st = new HashSet<>();
        for (char i:s.toCharArray()){
            if (st.contains(i))
                return i;
            
            else
                st.add(i);
                
            
        }
        return 'a';
    }
}