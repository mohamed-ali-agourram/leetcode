// https://leetcode.com/problems/palindrome-number/description/
class PalindromeNumber {
    public static void main(String[] args) {
        boolean solution = solution(55554);
        System.out.println(solution);
    }

    public static boolean solution(int x) {
        boolean isPalindrome = false;
        String[] number_array = ("" + x).split("");
        String[] swap = new String[number_array.length];
        int j = 0;
        for(int i = number_array.length - 1; i >= 0; i--){
            swap[j] = number_array[i];
            j++;
        }
        boolean is_valid = String.join("", number_array).equals(String.join("", swap));
        if (x > 0 && is_valid) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}