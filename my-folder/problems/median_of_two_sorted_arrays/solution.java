class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
   ArrayList<Integer> mergedarray = new ArrayList<>();

   for(int i : nums1){
       mergedarray.add(i);
   }
    for(int j : nums2){
       mergedarray.add(j);
   }
   Collections.sort(mergedarray);

     if(mergedarray.size()%2 != 0){
        int res = (mergedarray.size() + 1)/2;
       float var = mergedarray.get(res-1);
       return var;
     }else{
        int middle = mergedarray.size()/2;
         float res = (mergedarray.get(middle-1) + mergedarray.get(middle));
         float res1 = res/2;
         return res1;
     }  
    }
}