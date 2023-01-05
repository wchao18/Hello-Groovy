package com.it.demo

def obj = new Demo01BasicNotice(bookname: "斗罗大陆",description: "尚硅谷是个学习的好地方");
obj["description"] = '测试'
println(obj.getBookname())
println(obj.description)