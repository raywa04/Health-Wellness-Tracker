package controllers

import javax.inject._
import play.api.mvc._
import services.UserService

@Singleton
class UserController @Inject()(cc: ControllerComponents, userService: UserService) extends AbstractController(cc) {

  def listUsers = Action {
    val users = userService.listAllUsers()
    Ok(users.toString)
  }

  def createUser = Action { implicit request =>
    val json = request.body.asJson.get
    val user = json.as[User]
    userService.addUser(user)
    Created(s"User ${user.name} created")
  }
}
