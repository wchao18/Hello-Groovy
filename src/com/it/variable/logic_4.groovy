package com.it.variable

def x = 30
def result

switch (x){
    case "1":
        result = 'test1:' + x
        break
    case "2":
        result = 'test2:' + x
        break
    case [4,5,6,'inlist']:
        result = 'list'
        break
    case 20..30:
        result = 'range'
        break
    case Integer:
        result = 'integer'
        break
    case BigDecimal:
        result = "bigdecimal"
        break
}
println result

