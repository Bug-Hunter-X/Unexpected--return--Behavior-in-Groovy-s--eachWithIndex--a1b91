```groovy
def myMethod(List<String> list) {
  boolean shouldStop = false
  list.eachWithIndex { item, index ->
    println "Item $index: $item"
    if (item == "stop") {
      shouldStop = true
    }
  }
  if (shouldStop) {
    println "Stopping early"
    return
  }
  println "Exiting myMethod"
}

myMethod(['a', 'b', 'stop', 'c'])
```