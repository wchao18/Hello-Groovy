package com.it.objectorention

/**
 * 对象调用属性最终都是调用get、set方法
 */
def person = new Person('哈哈', 26)
println person
println(person.name)
println(person.age)

person.increaseAge(2)
println(person.age)

//方法没有执行自定义的方法
println(person.test())

//给person中动态增加属性
Person.metaClass.sex = 'male'
def person1 = new Person('哈哈', 26)
println person1.sex
//修改动态属性
person1.sex = 'female'
println(person1.sex)

//动态增加方法
Person.metaClass.sexUpperCase = {
    -> sex.toUpperCase()
}
println person1.sexUpperCase()
println("**********" + person1.sex)

//动态添加静态方法
Person.metaClass.static.createPerson = {
    name, age -> new Person(name, age)
}

def person2 = Person.createPerson('哈哈', 27)
println person2.age
