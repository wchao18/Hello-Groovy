package com.it.file

import com.it.objectorention.Person
import groovy.json.JsonOutput
import groovy.json.JsonSlurper

def list = [new Person("哈哈",27),
            new Person("呵呵",28)
            ]

def json = JsonOutput.toJson(list)
println json
//格式化输出json
println JsonOutput.prettyPrint(json)

//模拟请求发送
def getNetworkJsonData(String url){
    def connection = new URL(url).openConnection();
    connection.setRequestMethod('GET')
    connection.connect()
    def response = connection.content.text
    //将json转为实体对象
    def jsonParse = new JsonSlurper()
    return jsonParse.parseText(response)
}

def data = getNetworkJsonData("http://localhost:8081/brandApi/find")
println data