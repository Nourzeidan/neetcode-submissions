class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        set.addAll(Arrays.stream(nums).mapToObj(c -> (int) c).toList());       
        if(nums.length == set.size()){
            return false;
        }
        return true;
    }
}