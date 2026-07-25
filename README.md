# Kotlin Assignment 1: Basic Math & Recursion

A simple Kotlin project demonstrating foundational programming constructs, including loops, mathematical formulas, functional lambda expressions, and recursive functions.

## Overview

This assignment implements calculations for cumulative summation and factorial permutations using various idiomatic Kotlin approaches:

1. **Summation (`1` to `N`):**
    * **Iterative Loop (`sumUpTo`):** Calculates cumulative daily reward points using a standard `for` loop across an inclusive range.
    * **Gauss's Formula (`gaussSummation`):** An O(1) constant-time mathematical calculation using n(n + 1) / 2.

2. **Factorial Calculations ($N!$):**
    * **Iterative (`factorialIterative`):** Calculates total item orderings using a `for` loop.
    * **Lambda Expression (`factorialLambda`):** Uses functional collection processing via `.fold()`.
    * **Tail-Recursive (`factorialRecursive`):** Implements recursion optimized with Kotlin's `tailrec` modifier to prevent stack overflow.

## Project Structure

```text
src/
└── main/
    └── kotlin/
        └── org/
            └── example/
                └── Main.kt    # Entry point and function definitions
```
## Running the Code

1. Open the project in IntelliJ IDEA.
2. Run `Main.kt` by clicking the green play button next to the `main()` function.

***Created as part of the Android Development course.***