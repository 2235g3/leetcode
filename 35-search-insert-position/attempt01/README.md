# LeetCode 35 - Search Insert Position

This repository contains my first attempt at LeetCode problem 35, **Search Insert Position**.

The goal of the problem is to return the index of an item in a sorted array or, if not found, the index of where it would be.

## Current Approach

A while loop updates the left and right pointers so the searchable area halves each iteration.
When the left pointer points to the same position as the right pointer it indicates there is a single value left to check which means that target is either: not in the nums array and so checks whether it slots in the current index or the next; or it is the single value left to check.
My solution implements a binary search but I chose to not use recursion due to increased memory usage.