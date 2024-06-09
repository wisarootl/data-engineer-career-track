import scala.concurrent.Future

object foo {
  import scala.concurrent.ExecutionContext.Implicits.global
  def addAsync: Future[Int] = Future { 1 + 1 }
}
