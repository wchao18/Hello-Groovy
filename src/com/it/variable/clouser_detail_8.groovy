package com.it.variable

//description: 字符串和闭包的

def str = 'the 2 end 10'

str.each { s -> print s.multiply(2) }
println()

str.each { String s -> print s }
println()

println str.each { s -> s }
println()


//find 找到满足第一个条件的数据
def findFirstNumber = str.find {
    it-> it.isNumber()
}
println findFirstNumber

//find 找到满足第一个条件的数据
println str.find({
    s->s.isNumber()
})

println list = str.findAll {
    s -> s.isNumber()
}

//找出满足条件的任意一个
println str.any {
    s -> s.isNumber()
}

//找出满足条件的每一项
println str.every() {
    s -> s.isNumber()
}

//字符串转大写
println str.collect {
    s -> s.toUpperCase()
}