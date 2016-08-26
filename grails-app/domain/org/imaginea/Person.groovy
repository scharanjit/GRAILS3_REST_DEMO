package org.imaginea

import grails.rest.Resource



@Resource(uri="/people", formats=['json','html'])
class Person {

    String firstName
    String lastName
    Integer age
    static constraints = {
    }
}
