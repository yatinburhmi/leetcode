---
comments: true
difficulty: Easy
source: Biweekly Contest 5 Q2
tags:
  - Math
---

<!-- problem:start -->

# [1134. Armstrong Number 🔒](https://leetcode.com/problems/armstrong-number)

[中文文档](/solution/1100-1199/1134.Armstrong%20Number/README.md)

## Description

<!-- description:start -->

Given an integer `n`, return true if and only if it is an Armstrong number.

The `k`-digit number `n` is an Armstrong number if and only if the `kth` power of each digit sums to `n`.

Example 1:

```
Input: n = 153
Output: true
Explanation: 153 is a 3-digit number, and 153 = 13 + 53 + 33.
```

Example 2:

```
Input: n = 123
Output: false
Explanation: 123 is a 3-digit number, and 123 != 13 + 23 + 33 = 36.
```

Constraints:

==1 <= n <= 10^8^==

<!-- description:end -->

## Solution

1. Count the no. of digits in n.
   - Convert n to string and then use `k = str.length()` function.
2. run a loop

```
    for(int i=x; i>0; i=x/10){
        sum = Math.pow(x%10, k);
    }
    return sum === num;
```
