package com.it.variable

def str = "groovy"
//字符串填充
println str.center(8,'a')
//左边填充
println str.padLeft(8,'a')

//比较大小
println 't'.compareTo(str)
println 't' > str
println str[0]
println str[0..2]
//字符串去除
println str - 'g'
println str.minus('g')
//字符串颠倒
println str.reverse()
//首字母大写
println str.capitalize()
//是否是数字
def number = '3.14'
println number.isNumber()



