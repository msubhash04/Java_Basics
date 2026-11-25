package DSA;

public class BubbleSort {
    public static void main(String[] args) {
        int []nums = {6,5,2,8,9,4,-1};
        int temp = 0;

        System.out.print("Before sorting the elements ");

        for(int beforeSort:nums)
        {
            System.out.print(beforeSort+" ");
        }

        for(int i=0; i<=nums.length-1;i++){
            for (int j=0; j<nums.length-1-i;j++)
            {
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("After  sorting the elements ");

        for(int afterSort:nums)
        {
            System.out.print(afterSort+" ");
        }

    }
}
