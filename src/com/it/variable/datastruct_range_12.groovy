package com.it.variable

def range = 1..20
println range[3]

println range.contains(20)
println range.from
println range.to

range.each {
    println it
}
println("***********************")
for (Number i in range) {
    println(i)
}