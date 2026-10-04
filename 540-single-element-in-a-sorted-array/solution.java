// 0 ms | 53.2 MB
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n= nums.length;
        int s=0;
         int e=n-1;
         while(s<=e){
            int mid=s+(e-s)/2;

            if(s==e){
                return nums[s];
            }
            int currentValue=nums[mid];
            int preValue=-1;
            if(mid -1>=0){
                preValue=nums[mid-1];
            }
            int nextValue=-1;
            if(mid + 1 <n){
                nextValue=nums[mid+1];
            }

            if(currentValue != preValue && currentValue != nextValue){
                return currentValue;
            }
            if(currentValue != preValue && currentValue == nextValue){
                int startintIndexPair=mid;
                if((startintIndexPair & 1)==1){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }else if(currentValue == preValue && currentValue != nextValue){
                int endingIndexPair=mid;
                if((endingIndexPair & 1)==1){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }

         }
         return -1;
        
    }
}