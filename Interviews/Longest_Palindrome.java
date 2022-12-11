import java.util.*;
// Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
// Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
// Example 1:

// Input: s = "abccccdd" // a1b1c4d2 ==> dcc a ccd ==>"dccaccd"
// Output: 7
// Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
// Example 2:

// Input: s = "a"
// Output: 1
// Explanation: The longest palindrome that can be built is "a", whose length is 1.
 

// Constraints:
// 1 <= s.length <= 2000
// s consists of lowercase and/or uppercase English letters only.
public class Solution {
    public static void main(String[] args) {
        String input1 = "abccccdd", input2 = "a", input3 = "Aa", input4 = "abcAccdd", input = input4;
        int[] arr = new int[57];
        Arrays.fill(arr, 0);
        for(int i=0; i<input.length(); i++) {
            int arrIndex = input.charAt(i) - 65;
            arr[arrIndex]++;
        }
        System.out.println("arr " + Arrays.toString(arr));
        
        int maxEvenPalinLength = 0, maxOldPalinLength = 0;
        for(int i=0; i<arr.length; i++) {
            int arrEntry = arr[i];
            if(arrEntry %2 == 0) maxEvenPalinLength += arrEntry;
            else {
                maxOldPalinLength = Math.max(arrEntry, maxOldPalinLength);
            }
        }
        System.out.println("odd " + maxOldPalinLength + " even " + maxEvenPalinLength);
        System.out.println("max palin length " + (maxOldPalinLength + maxEvenPalinLength));
    }
}
