package org.imaginea

import grails.rest.Resource

@Resource(uri='/automobiles')
class Car {

    String make
    String model

    static constraints = {
    }
}
