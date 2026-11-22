class Solution {
    public boolean checkString(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        for(int i=1;i<n;i++){
            if(arr[i]=='a'&&arr[i-1]=='b') return false;
        }
        return true;
    }
}