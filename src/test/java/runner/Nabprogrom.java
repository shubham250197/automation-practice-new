package runner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
public class Nabprogrom {
    public static void main(String[] args) {
        //Solution sol = new Solution();

        int[] A1 = {1, 3, 6, 4, 1, 2};
        int[] A2 = {1, 2, 3};
        int[] A3 = {-1, -3};
        int[] A4 = {2, 3, 7, 6, 8, -1, -10, 15};

    /*    System.out.println("Missing integer for A1: " + sol.solution(A1)); // Expected 5
        System.out.println("Missing integer for A2: " + sol.solution(A2)); // Expected 4
        System.out.println("Missing integer for A3: " + sol.solution(A3)); // Expected 1
        System.out.println("Missing integer for A4: " + sol.solution(A4)); // Expected 1*/
    }

    public int solution(int[] A) {
        int n = A.length;
        boolean[] present = new boolean[n + 1];  // only need to track [1..n]

        // Mark which numbers from 1..n exist in the array
        for (int num : A) {
            if (num > 0 && num <= n) {
                present[num] = true;
            }
        }

        // Find the first missing positive integer
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        // If all 1..n are present, then the answer is n+1
        return n + 1;
    }
}





