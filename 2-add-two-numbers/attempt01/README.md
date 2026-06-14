# LeetCode 2 - Add Two Numbers

This repository contains my first working attempt at LeetCode problem 2, **Add Two Numbers**.

The goal of the problem is to add two non-negative integers stored in reverse order as linked lists, then return the result as a linked list in the same reverse-order format.

## Status

This solution works for the sample case included in `Solution.java`.

I am keeping this repository as a record of an early attempt rather than rewriting it into an ideal solution. The code reflects the approach I tried at the time.

## Approach

The solution:

1. Builds two linked lists manually in `Solution.java`.
2. Converts each linked list into a number string.
3. Uses `BigInteger` to add the two values.
4. Converts the result back into a reversed linked list.
5. Prints the resulting linked-list values.

For the included example:

```text
l1 = 2 -> 4 -> 3
l2 = 5 -> 6 -> 4
```

These represent:

```text
342 + 465 = 807
```

The program prints:

```text
708
```

This is the linked-list result in reverse order.