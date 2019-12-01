package ramis;

public class SecondLowest {

    public static void main(String[] args) {

        int [] arr = {2,1,4,2,3,2,34,2,3,6,0};

        System.out.println(findSecondLowestNum(arr));


    }
    public static int findSecondLowestNum(int[] nums){
        int min = nums[0];
        int secondMin = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(min > nums[i]){
                secondMin = min;
                min = nums[i];
            }


        }
        return secondMin;
    }

}
