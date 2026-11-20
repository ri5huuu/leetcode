class Solution {
    public int countDigits(int num) {
        int count = 0;
        int number = num;
        while(num!=0){
            if(num%10!=0&&number%(num%10)==0){
                count+=1;
            }
            num/=10;
        }
        return count;
    }
}