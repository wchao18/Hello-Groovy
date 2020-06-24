package com.it.variable

//闭包中三个重要的变量
//this、owner、delegate

def scriptClouser = {
    println('test:' + this)  //代表闭包定义处的类
    println('test:' + owner) //代表闭包定义处的类或者对象
    println('test:' + delegate) //代表任意对象，默认与owner一样
}
scriptClouser.call()


class People {

    def static scriptClouser = {
        println('test:' + this)  //代表闭包定义处的类
        println('test:' + owner) //代表闭包定义处的类或者对象
        println('test:' + delegate) //代表任意对象，默认与owner一样
    }

    def static say() {
        def scriptClouser = {
            println('test:' + this)  //代表闭包定义处的类
            println('test:' + owner) //代表闭包定义处的类或者对象
            println('test:' + delegate) //代表任意对象，默认与owner一样
        }
    }
}

People.scriptClouser.call()
People.say().scriptClouser.call()

//闭包中定义一个闭包
def nestClouser = {
    def innerClouser = {
        println('inner:' + this)  //代表闭包定义处的类
        println('inner:' + owner) //代表闭包定义处的类或者对象,nestClouser处对象
        println('inner:' + delegate) //代表任意对象，默认与owner一样,nestClouser处对象
    }
    //this和owner不能修改
    //innerClouser.delegate = new People();
    innerClouser.call()
    println('outer:' + this)  //代表闭包定义处的类
    println('outer:' + owner) //代表闭包定义处的类或者对象
    println('outer:' + delegate) //代表任意对象，默认与owner一样
}
nestClouser.call()

//闭包的委托策略
class Student {
    String name;

    Student(String name) {
        this.name = name
    }
    def say = {
        "my name is ${name}"
    }

    String toString() {
        say.call()
    }
}

class Teacher {
    //String name
    String name1

    Teacher(String name) {
        this.name1 = name
    }
}

def stu = new Student("哈哈")
def tea = new Teacher("呵呵")
//修改闭包,两步走
stu.say.delegate = tea
stu.say.resolveStrategy = Closure.DELEGATE_FIRST//先从委托对象中查找,没找到再从owner中查找
println stu.toString()

