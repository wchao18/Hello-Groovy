package com.it.variable

//闭包
def clouserStr = {
    println 'hello groovy!'
}
clouserStr.call()
clouserStr()

def test_method = { name, age -> println "hello " + name + "," + "my age is ${age}" }
//隐式参数 it
def test_default_param = { println "hello ${it}" }
def name = 'groovy!'
test_method(name, 26)
//加返回值
def result = test_default_param('groovy')
println result