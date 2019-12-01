package ramis;

public class SecondLarge {


    public static void main(String[] args) {


        int [] nums = {1,2,1,4};

        int max = nums[0];
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                second = max;
                max = nums[i];
            }
        }

        System.out.println(max);
        System.out.println(second);


    }
}
