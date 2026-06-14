# LeetCode 53 - Length of Last Word

This repository contains my first attempt at LeetCode problem 53, *Length of Last Word.*

The goal of the current problem is to return the length of the last word in the string.

## Current Approach

String `s` gets converted to a char array which enables me to iterate through the string in reverse order.
Each iteration checks if the last word:
- has started, and updates the boolean marker.
- is ongoing, and updates the count.
- has ended, and returns the count.
