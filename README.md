#GRAILS3_REST_DEMO
This is a grails & restfull architecture demo project

```
grails url-mappings-report

grails run-app
```

There is no need to create a controller because we are entertaining the domain class with that resource

#Create a person

```
curl -i -X POST -H "Content-Type: application/json" -H "Accept:application/json" -d '{"firstName":"Jake","lastName":"Brown","age":14}' http://localhost:8080/people

```

#Update the person
````
curl -i application/json" -d '{"firstName":"Jake2","lastName":"Brown","age":14}' http://localhost:8080/people
````

#Output
````
HTTP/1.1 201 Created
Server: Apache-Coyote/1.1
X-Application-Context: application:development
Location: http://localhost:8080/people/2
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Fri, 26 Aug 2016 06:45:02 GMT
`````

#Requestin Application to retreive all the people


```
curl -i http://localhost:8080/people.json

#Output

HTTP/1.1 200 OK
Server: Apache-Coyote/1.1
X-Application-Context: application:development
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Fri, 26 Aug 2016 06:56:23 GMT

[{"id":1,"age":14,"firstName":"Jake3","lastName":"Brown"},{"id":2,"age":14,"firstName":"Jake3","lastName":"Brown"}]
```
