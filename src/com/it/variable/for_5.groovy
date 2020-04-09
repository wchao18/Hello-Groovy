package com.it.variable

def sum = 0

for (i in 0..9) {
    sum += i
}
println sum

//对list循环
def sum2 = 0
for (i in [1, 3, 6]) {
    sum2 += i
}
println sum2

//对map循环
def sum3 = 0
def str3 = ''
for (i in ['a': 1, 'b': 2]) {
    sum3 += i.value
    str3 += i.key
}
println sum3
println str3