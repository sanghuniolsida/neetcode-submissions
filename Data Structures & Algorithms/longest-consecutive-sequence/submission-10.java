class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int[] answer = new int[set.size()];
        Iterator<Integer> iterSet = set.iterator();
        int i = 0;
        while(iterSet.hasNext()) {
            int x = iterSet.next();
            answer[i] = x;
            i++;
        }

        Arrays.sort(answer);
        int result = 1;
        int max = 0;
        for(int j=0;j<answer.length-1;j++) {
            if(answer[j]+1 != answer[j+1]) {
                max = Math.max(max,result);
                result = 1;
            }
            
            if(answer[j]+1 == answer[j+1]) { result++; }
        }
        if(answer.length == 0) { result = 0;}
        //if(answer.length == result) { max = result; }
        max = Math.max(max, result);
        return max;
    }
}
/*
1. set으로 중복을 없애준다.
2. 우선순위큐로 순서를 정렬해준다. or 배열에 넣고, 정렬한다.
*/

