```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 //This line will cause unexpected behaviour if a and b are not numbers
  }
  return a + b
}

println myMethod(null, 5)
println myMethod(10, null)
println myMethod(null, null)
println myMethod(5,5) //this line works as expected
```