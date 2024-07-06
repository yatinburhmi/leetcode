# Find all Divisors of a number

<!----- Description-------->

Given a number `n` return all the divisors of n.

## Solution:

array of divisors arrDivisors = [];
I can run a for loop from 2 to sqrt(n);

```
for(int i = 1; i<= Math.sqrt(n); i++){
    if(n%i == 0){
        arr.push(i);
        arr.push(n/i); // to get the other divisor
    }
}
```
