# LeetCode 14 - Longest Common Prefix

This repository contains my first attempt at LeetCode problem 14, **Longest Common Prefix**.

The goal of the problem is to find the longest starting substring shared by every string in an array.

## Current Approach

The solution first finds the length of the shortest string, since the common prefix cannot be longer than that.

It then:

- checks each character position from left to right
- compares every string against the first string at that position
- returns the prefix as soon as a mismatch is found
- returns the shortest string length as the prefix length if no mismatch is found

## Notes

This attempt is written as a LeetCode-style `Solution` class and uses a direct character-by-character comparison.
