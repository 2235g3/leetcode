# LeetCode 20 - Valid Parentheses

This repository contains my first attempt at LeetCode problem 20 **Valid Parentheses**.

The goal of the problem is to determine whether an input string contains only valid pairs of parentheses.

## Current approach

Opening parentheses are added to a stack, with the tail being incremented and a valid check boolean being set to false.
Closing parantheses are verified by comparing the input closing parenthesis to the closing parenthesis associated to the parenthesis at the top of the stack.
Special cases are dealt with via their own if statements.

## Stats
*Time:* `2ms` *Beating:* `98.04%`
*Memory:* `43.03MB` *Beating:* `84.68%`
