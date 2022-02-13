/*https://leetcode.com/problems/subsets/*/
class Solution {
  /*
  1
  
  1 1 2 1 3
  1 2 3
  */
    
    public void func(List<List<Integer>> ret,
       ArrayList<Integer> input, int [] nums, int idx) {
      
      for(int i = idx+1 ; i < nums.length ; ++i) {
        ArrayList<Integer> out = new ArrayList<>(input);
        out.add(nums[i]);
        ret.add(out);
        func(ret,out,nums,i);
      }
    }
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> ret = new ArrayList<List<Integer>>();
      ArrayList<Integer> empty = new ArrayList<Integer>();
      ret.add(empty);
      func(ret,empty,nums,-1);
      return ret;
    }
}
