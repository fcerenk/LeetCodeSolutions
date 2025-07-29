import java.util.Map;
import java.util.HashMap;


class Solution {
    //1.first approach
    // in here time complexity o(n2) because we have nested loop each of take n element.space comp. o(1) stable
    //this is brute force approach

    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i =0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    arr[0]=i;
                    arr[1]=j;
                    //no need to create new arr again to assign indices just use your method
                    //return new int[]{i,j};
                }
            }
        }
        return arr;
        //return null;
    }

    //2.approach
    //hashmap stores items in key/value pair like dictionary where each key maps to spesific value using map interface
    //Instead of accessing elements by an index (like with ArrayList), you use a key to retrieve its associated value.
    //we have array of nums in here , keep in mind this data structure, string-string string-int
    //arraylist is like search one by one it takes plenty of time rather than hashmap(key-value)
    //this is efficient solution time complexity o(n)
    public int[] twoSum2(int[] nums, int target)
    {

        Map<Integer, Integer> map = new HashMap<>(); //map interface hashmap its implementation

        for(int i =0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                //this method check whether key on map or not,here check complement num is on map before
                return new int[]{map.get(complement), i};
                //if we have complement before on map , return with get its index, i is other num index
            }
            map.put(nums[i], i);
            //if we do not have complement before , assign current num and its index on map after that search complement
            //first nums[i] after its index on map,hashmap
        }

        return null;
    }



}

