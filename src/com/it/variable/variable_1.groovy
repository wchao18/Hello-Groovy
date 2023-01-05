package com.it.variable

//强定义类型
int x = 10

println(x.class)

double y = 3.14
println(y.class)

//弱定义类型,def可以省略掉
a = 10
def b = 3.15
def c = "哈哈"
println(a.class)
println(b.class)
println(c.class)

//变换数据类型
a='test'
println a.class

//调用带参数的方法时可以省略括号
print a + ":" + c

//断言
//assert b ==10