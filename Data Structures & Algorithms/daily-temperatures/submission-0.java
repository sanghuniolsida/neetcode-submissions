class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];

        int day = 0;
        for(int i=0;i<temperatures.length-1;i++) {
            for(int j=i+1;j<temperatures.length;j++) {
                if(temperatures[i] < temperatures[j]) {
                    day++;
                    answer[i] = day;
                    break;
                } else {
                    day++;
                }
            }
            day = 0;
        }
        return answer;
    }
}
