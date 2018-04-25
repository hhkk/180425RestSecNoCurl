package com.mysecurerest
import grails.rest.*
import com.mysecurerest.*

@Resource(uri='/api/product')
class Product {

    String prodName
    String prodDesc
    Double prodPrice
    Date createDate = new Date()

    static constraints = {
    }
}