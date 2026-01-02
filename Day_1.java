import java.util.*;   // Import utility classes like Scanner

class Day_1 {

    // Function to find the element repeated N times
    public int repeatedNTimes(int[] nums) {

        // Frequency array to count how many times each number appears
        int freq[] = new int[100001];

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {

            // Increase count of the current number
            freq[nums[i]]++;

            // If the number appears 2 or more times
            if (freq[nums[i]] >= 2) {
                // Return the repeated number
                return nums[i];
            }
        }

        // Safety return (will not execute for this problem)
        return -1;
    }

    public static void main(String[] args) {

        // Scanner to take input from user
        Scanner scan = new Scanner(System.in);

        // Read size of the array
        int n = scan.nextInt();

        // Declare array
        int nums[] = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        // Create object of Solution class
        Day_1 s = new Day_1();

        // Call the function and store result
        int result = s.repeatedNTimes(nums);

        // Print the repeated element
        System.out.println(result);
    }
}
