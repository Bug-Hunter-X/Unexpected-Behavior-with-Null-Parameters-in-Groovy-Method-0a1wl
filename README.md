# Groovy Null Parameter Handling Bug

This repository demonstrates a common issue in Groovy where unexpected behavior can occur when a method receives null parameters. The `myMethod` function, designed to add two numbers, implicitly returns 0 when either parameter is null. This may not always be the desired behavior. The solution illustrates how to improve null handling and make the method's behavior more explicit and predictable.

## Bug Description

The `myMethod` function returns 0 if either `a` or `b` is null. While this avoids runtime errors, it might not be the intended behavior. For instance, the addition of null values should ideally result in null or throw an exception.

## Solution

The solution incorporates explicit null checks and introduces an exception for improved robustness. Now, the `myMethod` function throws a `NullPointerException` when either parameter is null, ensuring clarity and better error handling.