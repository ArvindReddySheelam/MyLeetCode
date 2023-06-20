class Solution {
    public void duplicateZeros(int[] arr) {
         ArrayList<Integer> list1 = new ArrayList<>();
       for(int i = 0; i<arr.length; i++){
           if(arr[i] == 0){
               list1.add(0);
                  list1.add(0);
           }
           else{
               list1.add(arr[i]);
           }
       }
       for(int i = 0; i<arr.length; i++){
           arr[i] = list1.get(i);
       }
    }
}