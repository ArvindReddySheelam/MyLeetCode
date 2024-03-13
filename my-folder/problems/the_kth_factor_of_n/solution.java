class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> factors = new ArrayList<>();
        
        int i = 0;
        for(i = 1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                factors.add(i);
            }
        }
        for( ; i>0; i--){
          if(n%i == 0 && i != n/i && i <= n/i){
            factors.add(n/i);
          }
        }
        int kth_factor = 0;
        for(int j = 0; j<factors.size(); j++){
            if(factors.size() >= k){
                kth_factor = factors.get(k-1);
            }else{
            return -1;
            }
        }
        return kth_factor;
    }
}