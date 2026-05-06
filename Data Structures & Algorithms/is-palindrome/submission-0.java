class Solution {
    public boolean isPalindrome(String s) {
        Queue<String> q = new LinkedList<>();

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                q.offer(String.valueOf(ch).toLowerCase());
            }
        }

        String[] str = new String[q.size()];

        for(int i=0;i<str.length;i++) {
            str[i] = q.poll();
        }
        int left = 0;
        int right = str.length-1;
        while(left < right) {
            if(!str[left].equals(str[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
