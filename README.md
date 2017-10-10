CPEN 221 / Fall 2017
Lab 4: Zero-Sum Subsequences
=========

# Zero-Sum Subsequences

> The skeleton source code for this question is in the package `zeroSumSubsequence`. You have to implement the method _getMaximumLength_ in the class _ZeroSumSubsequence_.

Given a list of integers, find the length of the longest subsequence that has a sum of 0. If there is no subsequence that has a sum of 0 then your algorithm would return 0.

## Examples

+ [2, -2]
	+ Returns: 2
	+ The subsequence is 2, -2.

+ [3, 4, -2, -1]
	+ Returns: 3
	+ The subsequence is 3, -2, -1.

+ [-1, -1, 2, -1, -2, 4]
	+ Returns: 4
	+ The subsequence is -1, -1, -2, 4.

+ [1, 2, 0]
	+ Returns: 1
	+ The subsequence is 0.

+ [1, 1, 2]
	+ Returns: 0
	+ There is no 0-sum subsequence.
