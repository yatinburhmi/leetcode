# [1952. Three Divisors](https://leetcode.com/problems/three-divisors/description/)

Easy
Topics: Maths

Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.

An integer m is a divisor of n if there exists an integer k such that n = k \* m.

**Example 1:**

```
Input: n = 2
Output: false
Explanation: 2 has only two divisors: 1 and 2.
```

**Example 2:**

```
Input: n = 4
Output: true
Explanation: 4 has three divisors: 1, 2, and 4.
```

**Constraints:**

`1 <= n <= 104`

## Solution

**Intuition**
To have an optimal approach, we need to understand the symmetry property of divisors.

if d is a divisor of n, then n/d is also a divisor of n.
Therefore using this symmetry property, we can conclude that we only need to run a loop till sqrt(n). (As all the other divisors will be in pairs).

Approach
Run a loop from i = 1 till sqrt(n)
If i is a divisor of n, increase count.
Increase the count for other divisor(which will be n/i)
if i is a square-root of n, make sure not to add it again.
Complexity
Time complexity:
O(sqrt(n))

Space complexity:
O(1)
