package src

import play.api.inject.guice.GuiceApplicationBuilder
import service.BookService
import models.Product


object Main extends App {

  val injector = GuiceApplicationBuilder().injector()

  val bookService = injector.instanceOf[BookService[Product]]

  bookService.getBook
}
