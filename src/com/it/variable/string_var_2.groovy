package com.it.variable

//双引号可扩展字符串
def str = "a single string"
println str.class

def doubleStr = "test ${str}"
println doubleStr
println doubleStr.class
println echo(doubleStr)

def echo(String msg){
    return "传参" + msg;
}

def str2 = "\'哈哈\'"
println str2

//单引号
def str1 = 'a single string'
println str1

//三单引号
def thupleName = '''\
test
test1
test2
test3
'''
println thupleName