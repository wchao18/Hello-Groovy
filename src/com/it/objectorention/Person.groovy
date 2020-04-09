package com.it.objectorention

/**
 * groovy中默认都是public
 */
class Person implements Action {
    String name

    Integer age

    Person(String name, Integer age) {
        this.name = name
        this.age = age
    }

    def increaseAge(Integer age) {
        this.age += age
    }

    /**
     * 一个方法没有，默认执行这个方法
     * @param name
     * @param args
     * @return
     */
    def methodMissing(String name, def args) {
        return "the method is ${name},the params is ${args}"
    }

    @Override
    Object invokeMethod(String s, Object o) {
        return "invoke the method is ${s},the params is ${o}"
    }

    @Override
    void eat() {

    }

    @Override
    void say() {

    }

    @Override
    void play() {

    }
}
