

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
   int *Size,*ans,i,j,*a,*b;
    Size = (int*)malloc(2*sizeof(int));
    for(i = 0; i<numsSize; i++)
    {
       for(j= i+1; j<numsSize; j++)
       {
          if(nums[i]+nums[j] == target)
          {    
              *returnSize = 2;
             Size[0] = i;
              Size[1] = j; }}}
        return Size;
}