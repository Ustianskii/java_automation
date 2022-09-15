package two_sum;
import java.util.Arrays;
import java.util.HashMap;

public class two_sum {

    public static void main(String[] args) {


        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] k = new int[2];

        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!hashmap.containsKey(nums[i])) {

                int n = target - nums[i];

                hashmap.put(n, i);

            } else {

                k[0] = i;
                k[1] = hashmap.get(nums[i]);
                break;

            }
        }

        System.out.println("Because sum of indexes are equal " + target + " ,we return: " + Arrays.toString(k));

    }
}