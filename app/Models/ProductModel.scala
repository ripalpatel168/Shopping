package models

trait BaseProduct {
  def serializeString : String
}

case class Product(id: Int = 0,
                   name: String,
                   category: String,
                   description: String,
                   price: Double,
                   brand: String) extends BaseProduct {
  def serializeString: String = "Product"
}

case class Book(id: Int = 0,
                name: String,
                category: String,
                description: String,
                price: Double,
                brand: String,
                author : String,
                DOI : String)  extends BaseProduct{
  def serializeString: String = "Book"
}


case class SearchResult(id:Int, name: String, category: String, price: String, brand: String, snippet: String)

//object SearchResult {
//
//  implicit object searchFormat extends Format[SearchResult] {
//
//    // convert from Tweet object to JSON (serializing to JSON)
//    def writes(result: SearchResult): JsValue = {
//      //  tweetSeq == Seq[(String, play.api.libs.json.JsString)]
//      val tweetSeq = Seq(
//        "id" -> JsString(result.id.toString),
//        "name" -> JsString(result.name),
//        "category" -> JsString(result.category),
//        "price" -> JsString(result.price),
//        "brand" -> JsString(result.brand),
//        "snippet" -> JsString(result.snippet)
//      )
//      JsObject(tweetSeq)
//    }
//
//    // convert from JSON string to a Tweet object (de-serializing from JSON)
//    // (i don't need this method; just here to satisfy the api)
//    def reads(json: JsValue): JsResult[SearchResult] = {
//      JsSuccess(SearchResult(0,"","","","",""))
//    }
//
//  }

