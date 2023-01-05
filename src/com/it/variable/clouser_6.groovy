package com.it.variable

//闭包
def clouserStr = {
    s->
    println "hello ${s}"
}

//闭包调用
clouserStr.call("groovy")
//闭包调用
cl  ouserStr("java")

def test_method = { name, age -> println "hello " + name + "," + "my age is ${age}" }

//闭包调用
def name = 'groovy!'
test_method.call(name, 26)

//隐式参数 it
def test_default_param = { println "hello ${it}" }

//闭包也有返回值,默认null
def result = test_default_param("groovy")
println result
