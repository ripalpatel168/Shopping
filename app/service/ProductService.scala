package service

import models.BaseProduct

class ProductService[A <: BaseProduct]{

  def getProduct = {
    println("ProductService")
  }

}
