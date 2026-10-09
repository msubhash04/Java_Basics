package DSA;

public class LinearBinarySearch {
    public static void main(String[] args) {
//        int[] nums = {5,6,9,13,26,27,29};
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,26,27,29};
        int target = 26;

        LinearBinarySearch ls = new LinearBinarySearch();
//        int indexResult = ls.linearSearch(nums,target);
//        int indexResult1 = ls.binarySearch(nums,target);

        int indexResult = ls.recBinarySearch(nums,target,0,nums.length);

        if(indexResult != -1)
        {
            System.out.println("The element is found at index  "+indexResult);
        }else{
            System.out.println("The element is not found !!");
        }

    }

    public int linearSearch(int[] nums, int target)
    {
        int steps = 0;
        for(int i=0; i<=nums.length-1;i++)
        {
            steps++;
            if(nums[i]==target){
                System.out.println("The steps taken by Linear Search is  : "+steps);
                return i;
            }
        }
        System.out.println("The steps taken by Linear Search is  : "+steps);
        return -1;
    }

    //Normal binary search function...
    public int binarySearch(int[] nums, int target){
        int start=0, end = nums.length;
        int steps = 0;

        while(start<end){
            steps++;
            int mid = (start+end)/2;

            if(nums[mid]==target){
                System.out.println("The steps taken by Binary Search is  : "+steps);
                return mid;
            } else if (nums[mid]<target) {
                start = mid+1;
            } else {
                end = end - 1;
            }
        }
        System.out.println("The steps taken by Binary Search is  : "+steps);
        return -1;
    }

    //Recursive Binary search function...
    public int recBinarySearch(int[] nums,int target,int start,int end){
        int mid = (start+end)/2;
        if(nums[mid] == target){
            return mid;
        } else if (nums[mid]<target) {
            return recBinarySearch(nums,target,mid+1,end);
        }else {
            return recBinarySearch(nums, target, start, mid-1);
        }
    }
}
