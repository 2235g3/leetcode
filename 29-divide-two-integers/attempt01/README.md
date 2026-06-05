# LeetCode 29 - Divide Two Integers

This repository contains my first attempt at LeetCode problem 29, **Divide Two Integers**.

The goal of the problem is to divide two integers without using multiplication, division, or modulus operators, while clamping overflow to the 32-bit signed integer range.

## Status

This is a failed attempt.

The code captures the basic idea of repeated subtraction, but it does not handle all required edge cases correctly. In particular, negating `Integer.MIN_VALUE` overflows before the calculation can proceed safely.

## Current Approach

The solution:

- tracks whether the result should be positive or negative
- converts negative inputs into positive values
- repeatedly subtracts the divisor from the dividend
- counts how many times subtraction succeeds
- clamps the final result to the signed 32-bit integer range

## Notes

This attempt is kept as a record of the first approach. A more complete solution would need safer handling for overflow cases and a faster strategy than repeated subtraction.
