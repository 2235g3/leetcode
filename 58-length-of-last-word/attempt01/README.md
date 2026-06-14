# LeetCode 58 - Length of Last Word

This repository contains my first attempt at LeetCode problem 58, **Length of Last Word**.

The goal of the problem is to return the length of the last word in the string.

## Current Approach

The string is converted to a character array so it can be iterated through in reverse.
Each iteration checks if the last word:
- has started, and updates the boolean marker.
- is ongoing, and updates the count.
- has ended, and returns the count.

