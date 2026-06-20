# LeetCode 88 - Merge Sorted Array

This repository contains my first attempt at LeetCode problem 88 **Merge Sorted Array**.

The goal of the problem is to merge two sorted arrays given that one of the arrays stores the output value as well contains the some of the input values.

## Current approach

Two pointers are created which help point to where the next value to check is. 
The full nums1 array is reversed looped through and values are added to the end in order to maintain the arrays' integrity.
Each loop boundaries are checked to prevent out-of-bounds errors, then the comparison is checked and the appropriate value is added to nums1.

## Stats

**Time:** `0ms` *Beating:* `100%`

**Memory:** `43.35MB` *Beating:* `98.44%`

