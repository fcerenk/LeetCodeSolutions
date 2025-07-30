public class TwoSum2 {
    public int[] twoSum(int[] arr, int target){

        for(int i =0; i<arr.length-1; i++){
            int complement = target - arr[i];
            int res = binarySearch(arr,1,arr.length,complement);
            if(res != -1){
                return new int[]{i+1,res+1};
            }

        }




        return null;
    }

    private int binarySearch(int[] arr, int left,int right,int target){
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
}
