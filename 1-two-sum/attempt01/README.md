# LeetCode 1 - Two Sum

This repository contains my first attempt at LeetCode problem 1, **Two Sum**.

The goal of the problem is to find two different indices in an integer array where the two values add up to the target value.

## Current Approach

The solution checks every pair of positions in the array.

For each pair, it:

- adds the two values together
- checks whether the total matches the target
- makes sure the same index is not used twice
- returns the two indices if a valid pair is found

If no pair is found, the method returns an empty array.

## Notes

This is a simple brute-force attempt. It prioritises clear logic over efficiency, so it uses nested loops rather than a hash map.
