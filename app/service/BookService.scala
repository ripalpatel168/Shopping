package service


import com.google.inject.Inject
import models.BaseProduct

class BookService[A <: BaseProduct] @Inject()(libService : ProductService[A]) {

  def getBook = {
    libService.getProduct
  }
}
