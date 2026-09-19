// 49 ms | 79.1 MB
class Solution {
    static boolean isValidAns(int[] position, int m, int minForce){
        int ballCount=1;
        int lastPosition=position[0];
        for(int i=1; i<position.length; i++){
            if(position[i]-lastPosition>=minForce){
                ballCount++;
                lastPosition = position[i];
            }if(ballCount==m){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int start=0; 
        int end = position[n-1]-position[0];
        int ans=-1;
        while(start<=end){
            int mid= start+(end-start)/2;
             if(isValidAns(position, m, mid)){
                ans=mid;
                start=mid+1;
             }else{
                end=mid-1;
             }
       
        }
        return ans;
        
    }
}