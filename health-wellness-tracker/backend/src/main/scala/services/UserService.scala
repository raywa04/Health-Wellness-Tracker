package services

import javax.inject._
import models.User

@Singleton
class UserService @Inject()() {
  private var users = List[User]()

  def listAllUsers(): List[User] = users

  def addUser(user: User): Unit = {
    users = users :+ user
  }
}
