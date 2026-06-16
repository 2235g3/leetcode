# LeetCode 11 - Container With Most Water

This repository contains my first attempt at LeetCode problem 11 **Container With Most Water**.

The goal of the problem is to find two lines that together with the x-axis form a container, returning the maximum amount of water a container can store.

## Current approach

Left and right pointers dictate the area of the container. If the line at the left pointer is smaller than the right, the left pointer increments (and vice versa).
A while loop is used to reduce the number of iteratios because when the value of the pointers are the same, it means the algorithm has already searched the optimal areas.

