package runner;

public class Task1 {


    public void main(String[] args){

        String arr = "aaAbcCABBC";

        int result = solution(arr);
        System.out.println(result);

    }

    public  int solution(String letters) {
        boolean[] lowerSeen = new boolean[26];
        boolean[] upperSeen = new boolean[26];
        boolean[] valid = new boolean[26]; // mark letters still valid candidates

        // Initially, all letters are valid until proven otherwise
        for (int i = 0; i < 26; i++) valid[i] = true;

        for (char ch : letters.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                int idx = ch - 'a';

                // If uppercase was already seen, this invalidates the letter
                if (upperSeen[idx]) {
                    valid[idx] = false;
                } else {
                    lowerSeen[idx] = true;
                }
            } else { // Uppercase
                int idx = ch - 'A';

                // If no lowercase was seen before, or already invalid, mark invalid
                if (!lowerSeen[idx] || !valid[idx]) {
                    valid[idx] = false;
                } else {
                    upperSeen[idx] = true;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (lowerSeen[i] && upperSeen[i] && valid[i]) {
                count++;
            }
        }

        return count;
    }
}

