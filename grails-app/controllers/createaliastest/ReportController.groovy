package createaliastest

class ReportController {

    def requestService

    def index() {
          render  requestService.getResults(User.get(1))
    }
}
