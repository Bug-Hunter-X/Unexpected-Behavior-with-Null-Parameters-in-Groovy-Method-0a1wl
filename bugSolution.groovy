```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    throw new NullPointerException("Parameters cannot be null")
  }
  return a + b
}

println myMethod(5, 5)

try {
  println myMethod(null, 5)
} catch (NullPointerException e) {
  println "Exception caught: "+ e.message
}

try {
  println myMethod(10, null)
} catch (NullPointerException e) {
  println "Exception caught: "+ e.message
}

try {
  println myMethod(null, null)
} catch (NullPointerException e) {
  println "Exception caught: "+ e.message
}
```