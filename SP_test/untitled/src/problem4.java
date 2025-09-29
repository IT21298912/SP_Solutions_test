import java.util.*;

public class problem4 {
    public problem4() {
    }

    public static void main(String[] args) {

        List<String> numbers = new ArrayList<>(Arrays.asList("3", "30", "34", "5", "9"));
        String largest = getLargestNumber(numbers);
        System.out.println(largest);

    } public static String getLargestNumber(List<String> nums) {
        // Sort using custom Comparator
        Collections.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        // If the largest number is "0", all numbers are zeros
        if (nums.get(0).equals("0")) {
            return "0";
        }

        // Concatenate all numbers
        StringBuilder result = new StringBuilder();
        for (String s : nums) {
            result.append(s);
        }
        return result.toString();
    }

}
