# 13. Roman to Integer

🔗 [LeetCode Problem - Roman to Integer](https://leetcode.com/problems/roman-to-integer/)  
**Difficulty:** Easy

## Problem Statement

Roman numerals are represented by seven different symbols:

| Symbol | Value  |
|--------|--------|
| I      | 1      |
| V      | 5      |
| X      | 10     |
| L      | 50     |
| C      | 100    |
| D      | 500    |
| M      | 1000   |

For example:
- `II` = `2` (two ones added together)
- `XII` = `12` (`X + II`)
- `XXVII` = `27` (`XX + V + II`)

Roman numerals are usually written from **largest to smallest** from left to right.  
However, in specific cases, subtraction is used instead of addition:
- `IV` (4) instead of `IIII` → `I` comes before `V`, so we subtract: `5 - 1 = 4`
- `IX` (9) → `X - I = 9`
- `XL` (40) → `L - X = 40`
- `XC` (90) → `C - X = 90`
- `CD` (400) → `D - C = 400`
- `CM` (900) → `M - C = 900`

### Task:
Given a Roman numeral, convert it to an integer.

## Examples

**Example 1:**
```plaintext
Input: s = "III"
Output: 3
Explanation: III = 3.
```

**Example 2:**
```plaintext
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V = 5, III = 3.
```

**Example 3:**
```plaintext
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90, and IV = 4.
```
