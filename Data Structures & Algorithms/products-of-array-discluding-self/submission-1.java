class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            int x = 1;
            for(int j=0;j<nums.length;j++) {
                if(i != j) {
                    x *= nums[j];
                }
            }
            list.add(x);
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}