# LeetCode 13 - Roman to Integer

This repository contains my first attempt at LeetCode problem 13, **Roman to Integer**.

The goal of the problem is to convert a Roman numeral string into its integer value.

## Current Approach

The solution stores Roman numerals and their integer values in matching arrays.

For each character, it:

- finds the value of the current Roman numeral
- looks ahead to the next Roman numeral when one exists
- subtracts the current value if it appears before a larger value
- otherwise adds the current value to the total

This handles subtractive Roman numeral cases such as `IV`, `IX`, `XL`, and `CM`.

## Notes

This attempt is written as a LeetCode-style `Solution` class rather than a standalone program with a `main` method.
