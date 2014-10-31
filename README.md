createAliasTest
===============

Shows CreateAlias not working

After running the application, go to `localhost:8080/CreateAliasTest/report/index` which will error out while running `createAlias` query. 

```groovy
class RequestService {
  def getResults (User user) {
    UserRequest.createCriteria().list() {
      createAlias("request","req")
      eq("user", user)
      eq("req.type","Test")
    }
  }
}
```

The Query resides in: https://github.com/Omnipresent/createAliasTest/blob/master/grails-app/services/createaliastest/RequestService.groovy
