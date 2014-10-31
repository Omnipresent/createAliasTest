package createaliastest



class RequestService {
  def getResults (User user) {
    UserRequest.createCriteria().list() {
      //createAlias("request","req")
      eq("user", user)
      /*eq("request.type","TypeA")*/
      request {
        eq ("type", "TypeA")
      }
      /*req {
        eq ("type", "TypeA")
      }*/
    }
  }
}
