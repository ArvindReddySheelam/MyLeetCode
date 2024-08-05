class Solution {
    public String kthDistinct(String[] arr, int k) {
        
     Map<String,Integer> map = new HashMap<>();

       for(String ele : arr){
          map.put(ele,map.getOrDefault(ele,0)+1);
       }

       for(String ele : arr){
          if(map.get(ele) == 1){
            k--;
          }
          if(k == 0){
            return ele;
          }
       }
       return "";
    }
    }