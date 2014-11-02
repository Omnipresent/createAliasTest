package createaliastest



class RequestService {
  def getResults (User user) {
    UserRequest.createCriteria().list() {
      createAlias("request","req")
      eq("user", user)
      request {
        eq ("type", "TypeA")
      }
    }
  }
}
