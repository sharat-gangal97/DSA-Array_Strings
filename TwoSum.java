import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        Arrays.stream(twoSum2(new int[]{2,7,11, 15}, 9)).asDoubleStream().forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            int dif = target - nums[i];
            System.out.println("for index "+ i + "with diff "+dif);
            for(int j = i+1; j <nums.length; j++){
                System.out.println("  for index "+ j + "with value "+nums[j]);
                if(nums[j] == dif){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0,0};
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            System.out.println("for index "+ i + " with diff "+diff);
            if((resultMap.getOrDefault(diff, -1)) != -1 ){
                return new int[] {resultMap.get(diff), i};
            } else {
                System.out.println("update map with key "+nums[i] + " with value "+ i);
                resultMap.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
