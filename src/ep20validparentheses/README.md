# 20. Valid Parentheses

🔗 [LeetCode Problem - Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)  
**Difficulty:** Easy

## Problem Statement

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is **valid**.

An input string is valid if:
- Open brackets must be **closed by the same type** of brackets.
- Open brackets must be **closed in the correct order**.
- Every closing bracket has a corresponding **open bracket of the same type**.

## Examples

**Example 1:**
```plaintext
Input: s = "()"
Output: true
```

**Example 2:**
```plaintext
Input: s = "()[]{}"
Output: true
```

**Example 3:**
```plaintext
Input: s = "(]"
Output: false
```

**Example 4:**
```plaintext
Input: s = "([])"
Output: true
```
