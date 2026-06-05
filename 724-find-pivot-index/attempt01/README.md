# LeetCode 724 - Find Pivot Index

This repository contains my first attempt at LeetCode problem 724, **Find Pivot Index**.

The goal of the problem is to find an index in an integer array where the sum of all numbers to the left of the index is equal to the sum of all numbers to the right of the index.

## Current Approach

The solution checks each index in the array one by one.

For each index, it:

- adds up the numbers on the left side
- adds up the numbers on the right side
- compares the two totals
- returns the current index if they match

If no matching index is found, the method returns `-1`.

## Example

The current example in `Main.java` uses:

```java
int[] nums = {2, 1, -1};
```

For this input, the pivot index is `0`, because there are no numbers to the left, and the numbers to the right add up to `0`.