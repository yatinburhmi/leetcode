# [GCD or HCF](https://www.geeksforgeeks.org/program-to-find-gcd-or-hcf-of-two-numbers/)

Given two numbers a and b, find the greatest common divisor of a and b.

**Example 1:**

```
Input: a = 5 , b = 10
Output: 10 5
Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
```

## Solution/Approach

### Euclidean Algorithm

Euclid's algorithm uses the principle that the GCD of a set of two numbers does not change if you replace the larger of the two with the remainder when you divide the larger of the two by the smaller.

```
gcd(a,b){
    if(b == 0){
        return |a|;
    }
    return gcd(b, a%b);
}
```

> TC: log(min(a,b))

### Brute force approach

gcd(a,b)
if a > b, that means the gcd can be min(a,b)
therefore, we can run a loop from min(a,b) till 2.

```
int gcd = 1;
for(int i = min(a,b); i >1, i--){
    if(a%i == 0 && b%i == 0){
        return i;
    }
}
```

> TC: O(min(a,b))
