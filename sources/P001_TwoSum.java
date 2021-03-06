public class P001_TwoSum{
    public int[] twoSum(int[] nums, int target) { // problem 1...
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int comp = target - nums[i];
            if(m.containsKey(comp)){
                return new int[] {m.get(comp), i};
            }
            m.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution.");
    }
}