package com.it.variable


//求阶乘
int fab(int number) {
    int result = 1
    1.upto(number, { s -> result *= s })
    return result;
}

println fab(4)

//求阶乘
int fab2(int number) {
    int result = 1
    number.downto(1, { s -> result *= s })
    return result
}

println fab2(4)

//累计求和
int callSum(int number) {
    int result = 0
    number.times { s -> result += s }
    return result
}

println callSum(10)



