package grails3_rest_demo

class UrlMappings {

    static mappings = {


        "/$controller/$action?/$id?(.$format)?"{


            constraints {
                // apply constraints here
            }
        }


        "/people"(resources:'person')
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
