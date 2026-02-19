

## Table of Contents

* [Problems & Solutions](https://www.google.com/search?q=%23problems--solutions)
* [Sorting Algorithms](https://www.google.com/search?q=%23sorting-algorithms)
* [Array Utilities](https://www.google.com/search?q=%23array-utilities)

---

## Problems & Solutions

### 1. Two Sum

* **Difficulty:** Easy
* **Problem:** Given an array of integers and a target, return indices of the two numbers that add up to the target.
* **Implementation:** Uses a `HashMap` to achieve  time complexity by storing previously seen numbers and their indices.

### 2. Palindrome Number

* **Difficulty:** Easy
* **Problem:** Determine if an integer  is a palindrome without converting it to a string.
* **Implementation:** Reverses the second half of the number and compares it with the first half.

### 3. N Meetings in One Room

* **Difficulty:** Easy
* **Problem:** Find the maximum number of meetings that can be held in a single room given start and end times.
* **Implementation:** A **Greedy** approach that sorts meetings by their end times to maximize capacity.

### 4. Insert Interval

* **Difficulty:** Medium
* **Problem:** Insert a new interval into a sorted list of non-overlapping intervals and merge if necessary.
* **Implementation:** Iterates through intervals to handle those before, during (merging), and after the new interval.

### 5. Non-overlapping Intervals

* **Difficulty:** Medium
* **Problem:** Find the minimum number of intervals to remove to make the rest non-overlapping.
* **Implementation:** Sorts by end times and uses a greedy approach to keep the maximum number of non-overlapping intervals.

---

## Sorting Algorithms

The `Sorting` directory contains various classic sorting techniques and Java's built-in methods:

* **Bubble Sort:** Repeatedly steps through the list, compares adjacent elements, and swaps them.
* **Selection Sort:** Finds the minimum element from the unsorted part and puts it at the beginning.
* **Insertion Sort:** Builds the final sorted array one item at a time.
* **Inbuilt Sorting:** Demonstrates the use of `Arrays.sort()` for both ascending and descending (using `Collections.reverseOrder()`) order.

---

## Array Utilities

* **Largest Element:** A simple utility method to find the maximum value in an integer array.
