class Solution {
    public void reverseString(char[] s) {
        int front = 0;
        int last = s.length-1;
        while(front <= last){
            char temp = s[front];
            s[front] = s[last];
            s[last] = temp;
            front++;
            last--;
        }
    }
}