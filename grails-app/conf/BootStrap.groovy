import createaliastest.*


class BootStrap {

    def init = { servletContext ->

      User user1 = new User(username: "Foo1", password: "Bar").save(failOnError: true)
      User user2 = new User(username: "Foo2", password: "Bar").save(failOnError: true)
      User user3 = new User(username: "Foo3", password: "Bar").save(failOnError: true)
      User user4 = new User(username: "Foo4", password: "Bar").save(failOnError: true)

      Request req1 = new Request(type: "TypeA").save(failOnError: true)
      Request req2 = new Request(type: "TypeB").save(failOnError: true)
      Request req3 = new Request(type: "TypeC").save(failOnError: true)
      Request req4 = new Request(type: "TypeD").save(failOnError: true)

       UserRequest.create(user1, req1,true)
       UserRequest.create(user1, req2, true)
       UserRequest.create(user2, req1, true)
       UserRequest.create(user3, req3, true)
       UserRequest.create(user4, req4, true)
       UserRequest.create(user1, req4, true)

    }
    def destroy = {
    }
}
