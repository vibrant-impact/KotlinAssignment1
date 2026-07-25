package org.example

/**
 * Calculates the total sum of integers from 1 up to [maximumTargetNumber].
 * Real-world use case: Calculating cumulative daily login reward points across a series of consecutive days.
 *
 * @param maximumTargetNumber The final day or maximum limit to sum up to.
 * @return The total accumulated sum from 1 to [maximumTargetNumber].
 */
fun sumUpTo(maximumTargetNumber: Int): Int {
    // Return 0 if maximumTargetNumber is less than 1 (handles invalid or zero input)
    if (maximumTargetNumber < 1) {
        return 0
    }

    var accumulatedTotal = 0

    // Loop through values from 1 up to maximumTargetNumber (inclusive)
    for (currentNumber in 1..maximumTargetNumber) {
        accumulatedTotal += currentNumber
    }

    return accumulatedTotal
}

/**
 * Alternative summation using Gauss's formula: n * (n + 1) / 2
 * Real-world use case: Instant O(1) mathematical calculation for high-performance analytics.
 *
 * @param maximumTargetNumber The upper limit integer to sum up to.
 * @return The total calculated sum.
 */
fun gaussSummation(maximumTargetNumber: Int): Int {
    if (maximumTargetNumber < 1) return 0
    return maximumTargetNumber * (maximumTargetNumber + 1) / 2
}

/**
 * Calculates the factorial of an integer iteratively using a loop.
 * Real-world use case: Determining total possible unique orderings or permutations of items.
 *
 * @param itemQuantity The total count of items to calculate permutations for.
 * @return The calculated factorial, or 1 if itemQuantity is 0 or 1.
 */
fun factorialIterative(itemQuantity: Int): Long {
    // Return 1 for 0! or 1! according to standard factorial definitions
    if (itemQuantity <= 1) return 1L

    var totalPermutations = 1L

    // Loop through values from 2 up to itemQuantity (inclusive)
    for (currentMultiplier in 2..itemQuantity) {
        totalPermutations *= currentMultiplier
    }

    return totalPermutations
}

/**
 * Calculates factorial using a functional lambda expression.
 * Accepts an Int parameter representing item quantity and returns a Long result.
 */
val factorialLambda: (Int) -> Long = { itemQuantity ->
    if (itemQuantity <= 1) {
        1L
    } else {
        // Multiply all elements from 2L up to itemQuantity starting with an initial accumulator value of 1L
        (2L..itemQuantity.toLong()).fold(1L) { accumulator, currentMultiplier ->
            accumulator * currentMultiplier
        }
    }
}

/**
 * Calculates factorial recursively using tail-call optimization.
 *
 * @param itemQuantity The total count of items remaining to multiply.
 * @param accumulator Holds the running product across recursive call stack frames.
 * @return The final factorial total.
 */
tailrec fun factorialRecursive(itemQuantity: Int, accumulator: Long = 1L): Long {
    // Base case: stop recursion when itemQuantity reaches 1 or 0
    if (itemQuantity <= 1) return accumulator

    // Recursive call: decrease itemQuantity by 1 and update running product
    return factorialRecursive(itemQuantity - 1, itemQuantity * accumulator)
}

fun main() {
    // Real-world scenario 1: Calculating cumulative reward points over 10 days
    val totalDaysToCalculate = 10
    val loopSumResult = sumUpTo(totalDaysToCalculate)
    val gaussSumResult = gaussSummation(totalDaysToCalculate)

    println("--- Cumulative Point Calculations (Summation) ---")
    println("Iterative Loop Sum (1 to $totalDaysToCalculate days): $loopSumResult points")
    println("Gauss Formula Sum  (1 to $totalDaysToCalculate days): $gaussSumResult points")
    println()

    // Real-world scenario 2: Calculating unique sequence orderings for 5 items
    val totalItemsInSequence = 5

    println("--- Sequence Permutation Calculations (Factorial) ---")
    println("Iterative: $totalItemsInSequence! = ${factorialIterative(totalItemsInSequence)} orderings")
    println("Lambda:    $totalItemsInSequence! = ${factorialLambda(totalItemsInSequence)} orderings")
    println("Recursive: $totalItemsInSequence! = ${factorialRecursive(totalItemsInSequence)} orderings")
}