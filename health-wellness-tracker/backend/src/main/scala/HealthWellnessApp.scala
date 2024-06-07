import play.api._
import play.api.mvc._
import play.api.routing.sird._
import play.api.routing.Router
import play.filters.HttpFiltersComponents

class HealthWellnessApp(context: ApplicationLoader.Context) 
  extends BuiltInComponentsFromContext(context) 
  with HttpFiltersComponents {

  lazy val userController = new controllers.UserController(controllerComponents)

  override def router: Router = Router.from {
    case GET(p"/users") => userController.listUsers
    case POST(p"/users") => userController.createUser
  }
}
