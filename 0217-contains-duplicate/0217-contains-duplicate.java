class Solution {
    public boolean containsDuplicate(int[] arr) {
        Set<Integer> p=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        p.add(arr[i]);
        if(p.size()<arr.length)
            return true;
        else
            return false;
        
    }
}