package com.it.variable

def colors = [red: 'ff0000', green: '00ff00', blue: '0000ff']

//索引方式
println colors['red']
println colors.red

//添加元素1
colors.put("white","45666")

//添加元素2
colors.yellow = 'ffff00'
colors.black = 'ff9999'
println colors.toMapString()

colors.complex = [a: 1, b: 2]
println colors.toMapString()
println colors.getClass()  //class java.util.LinkedHashMap

//map的详细操作
def students = [
        1: [number: '0001', name: 'Bob',
            score : 55, sex: 'male'],
        2: [number: '0002', name: 'Johnny',
            score : 62, sex: 'female'],
        3: [number: '0003', name: 'Claire',
            score : 73, sex: 'female'],
        4: [number: '0004', name: 'Amy',
            score : 66, sex: 'male']
]

students.eachWithIndex {
    s, index -> println("索引：" + index + ":" + s.key + " : " + "${s.value}")
}
println("****************************************************************")
students.eachWithIndex {
    k1, v, index -> println("索引：" + index + ":" + k1 + " : " + v)
}

//map的查找
def entry = students.find {
    s -> return s.value.score > 60
}
println entry

//统计方法
def count = students.count {
    s -> s.value.score > 60 && s.value.sex == 'male'
}
println count

//map
def names = students.findAll {
    s -> s.value.score > 60 && s.value.sex == 'male'
}.collect {
    s -> return s.value.name
}
println names

//groupBy
def group = students.groupBy {
    s -> s.value.score > 60 ? '及格' : '不及格'
}
println group

//排序
def sort = students.sort {
    s1, s2 ->
        def score1 =  s1.value.score
        def score2 = s2.value.score
        return score1 == score2 ? 0 : score1 < score2 ? -1 : 1
}
println sort
