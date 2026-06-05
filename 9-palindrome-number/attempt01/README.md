# LeetCode 9 - Palindrome Number

This repository contains my first attempt at LeetCode problem 9, **Palindrome Number**.

The goal of the problem is to decide whether an integer reads the same forwards and backwards.

## Current Approach

The solution avoids converting the number into a string.

It:

- immediately rejects negative numbers
- rejects non-zero numbers ending in `0`
- reverses half of the number mathematically
- compares the first half with the reversed second half

This handles both even-length and odd-length numbers.

## Notes

This attempt follows the common numeric approach for the problem and keeps the reversal limited to half of the number.
