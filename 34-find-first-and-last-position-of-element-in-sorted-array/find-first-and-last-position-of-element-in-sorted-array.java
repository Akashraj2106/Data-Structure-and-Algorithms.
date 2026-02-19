class Solution {

    int findfrist(int arr[] , int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans  = -1;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                ans = mid;
                e = mid - 1;
            }else if(arr[mid] < target){
                s = mid + 1;
            }else{
                e = mid-1;
            }
        }
        return ans;
    }

 int findlast(int arr[] , int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans  = -1;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                ans = mid;
                s = mid + 1;
            }else if(arr[mid] < target){
                s = mid + 1;
            }else{
                e = mid-1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = findfrist(nums , target);
        ans[1] = findlast(nums , target);

        return ans;

    }
}