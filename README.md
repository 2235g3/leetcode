# LeetCode Attempts

This repository contains my LeetCode attempts without cluttering my main account or other project folders.

The goal is to keep a record of each attempt as it was written. Some solutions are working first attempts, while others are kept as failed attempts or learning snapshots.

## Structure

Each problem has its own folder named with the LeetCode problem number and title.

```text
problem-number-problem-name/
  attempt01/
    Solution.<extension>
    README.md
```

All attempts are stored in classes named `Solution.<extension>`, where `<extension>` is replaced with the appropriate file type.

## Attempts

| Problem | Attempt | Status | Notes |
| --- | --- | --- | --- |
| [1 - Two Sum](1-two-sum/attempt01/README.md) | attempt01 | Successful attempt | Brute-force nested-loop solution. |
| [2 - Add Two Numbers](2-add-two-numbers/attempt01/README.md) | attempt01 | Successful attempt | Uses `BigInteger` rather than the intended carry-based linked-list approach. |
| [5 - Longest Palindromic Substring](5-longest-palindromic-substring/attempt01/README.md) | attempt01 | Failed attempt | Does not reliably return a valid palindrome. |
| [9 - Palindrome Number](9-palindrome-number/attempt01/README.md) | attempt01 | Successful attempt | Reverses half of the number without converting to a string. |
| [11 - Containter With Most Water](11-container-with-most-water/attempt01/README.md) | attempt01 | Successful attempt | Left and right pointers update to disregard the shortest line to attempt to create a larger area. |
| [13 - Roman to Integer](13-roman-to-integer/attempt01/README.md) | attempt01 | Successful attempt | Compares each Roman numeral with the next one to handle subtraction cases. |
| [14 - Longest Common Prefix](14-longest-common-prefix/attempt01/README.md) | attempt01 | Successful attempt | Compares strings character by character. |
| [20 - Valid Parentheses](20-valid-parentheses/attempt01/README.md) | attempt01 | In Progress | Implementation in progress. |
| [29 - Divide Two Integers](29-divide-two-integers/attempt01/README.md) | attempt01 | Failed attempt | Repeated subtraction approach does not handle all overflow edge cases. |
| [35 - Search Insert Position](35-search-insert-position/attempt01/README.md) | attempt01 | Successful attempt | Uses a while loop to update left and right pointers to implement a binary search. |
| [58 - Length of Last Word](58-length-of-last-word/attempt01/README.md) | attempt01 | Successful attempt | Uses a for loop to reverse iterate through and check the state of the word. |
| [724 - Find Pivot Index](724-find-pivot-index/attempt01/README.md) | attempt01 | Successful attempt | Brute-force left/right sum comparison. |
| [1480 - Running Sum of 1D Array](1480-running-sum-of-1d-array/attempt01/README.md) | attempt01 | Succesful attempt | Brute-force running sum calculation. |

## Notes

- These attempts are not always polished final solutions.
- Failed attempts are intentionally kept to show the learning process.
- There is no shared build system or automated test suite at the moment.
