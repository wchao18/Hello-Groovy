package com.it.variable

//def list = new ArrayList()//java中定义

def list = [1, 2, 3, 4, 5, 6]
println list.class
println list.size()

def arr = [1, 2, 3, 4, 5] as int[]
int[] arr2 = [1, 2, 3, 4]

//集合排序
def sortList = [-6, -5, -3, -10]
Collections.sort(sortList)
println sortList

def sortList2 = ['a', 'cdsa', 'sdf', '']
sortList2.sort {
    it -> return it.size()
}
println sortList2

//列表的查找
def findList = [-6, 100, -3, -10]
def filter = findList.find() {
    s -> s % 2 == 0
}
println filter
//最小值最大值
println findList.min()
println findList.max()
println("****************")
println findList.min{return Math.abs(it)}
println findList.max{return Math.abs(it)}



