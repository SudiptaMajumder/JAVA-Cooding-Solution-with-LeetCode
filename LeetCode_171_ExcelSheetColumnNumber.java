/* 171. Excel Sheet Column Number

Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701 */

import java.util.*;
public class LeetCode_171_ExcelSheetColumnNumber {

    public static int titleToNumber(String columnTitle) {
        int result=0;
        for (int i = 0; i<columnTitle.length(); i++){
            char c = columnTitle.charAt(i);
            result = result*26  + (c-'A' + 1);
        }
        return result;
    }

    public static void main(String args[]) {
        //LeetCode_171_ExcelSheetColumnNumber solution = new LeetCode_171_ExcelSheetColumnNumber();
    
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("AA"));
        System.out.println(titleToNumber("ZY")); 
      }
}