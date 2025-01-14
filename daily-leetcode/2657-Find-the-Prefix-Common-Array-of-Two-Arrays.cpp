class Solution {
public:
    vector<int> findThePrefixCommonArray(vector<int>& A, vector<int>& B) {
        
        int n = A.size();
        std::vector<int> freq(A.size() + 1);
        int count = 0;

        std::vector<int> C;
        C.reserve(A.size());
        
        for(int i = 0; i<A.size(); i++){
            freq[A[i]]++;
            if(freq[A[i]] == 2) count++;

            freq[B[i]]++;
            if(freq[B[i]] == 2) count++;
      
            C.push_back(count);      
        }

        return C;
    }
};