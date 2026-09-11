class Solution {
    public int totalNumbers(int[] digits) {
        int arr[]=new int[10];
        int ans=0;
        for(int i=0;i<digits.length;i++){
            arr[digits[i]]++;
        }
        for(int i=100;i<=998;i=i+2){
            int hundred=i/100;
            int tens=(i/10)%10;
            int ones=i%10;
            arr[hundred]--;
            arr[tens]--;
            arr[ones]--;
            if(arr[hundred]>=0&&arr[tens]>=0&&arr[ones]>=0) ans++;
            arr[hundred]++;
            arr[ones]++;
            arr[tens]++;
        }
        return ans;
    
    }
}