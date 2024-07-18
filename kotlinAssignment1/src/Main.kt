// Function to sum integers from 1 to a specified maximum
fun sumUpTo(max: Int): Int {
    // Initialize the sum variable
    var sum = 0
    // Loop through integers from 1 to max (inclusive) and add to sum
    for (i in 1..max) {
        sum += i
    }
    return sum
}

// Iterative function to find the factorial of a specified integer
fun factorialIterative(n: Int): Int {
    // Initialize the factorial variable
    var factorial = 1
    // Loop through integers from 1 to n (inclusive) and multiply to factorial
    for (i in 1..n) {
        factorial *= i
    }
    return factorial
}

// Lambda expression to find the factorial of a specified integer
val factorialLambda: (Int) -> Int = { n ->
    // Initialize the factorial variable
    var factorial = 1
    // Loop through integers from 1 to n (inclusive) and multiply to factorial
    for (i in 1..n) {
        factorial *= i
    }
    factorial
}

// Recursive function to find the factorial of a specified integer
fun factorialRecursive(n: Int): Int {
    // Base case: if n is 0 or 1, return 1
    return if (n == 0 || n == 1) {
        1
    } else {
        // Recursive case: n * factorial of (n - 1)
        n * factorialRecursive(n - 1)
    }
}

// Example usage
fun main() {
    for (i in 1..5) {
        println("Sum from 1 to $i is: ${sumUpTo(i)}")
    }

    for (i in 1..5) {
        println("Factorial of $i using iteration is: ${factorialIterative(i)}")
        println("Factorial of $i using lambda is: ${factorialLambda(i)}")
        println("Factorial of $i using recursion is: ${factorialRecursive(i)}")
    }
}
