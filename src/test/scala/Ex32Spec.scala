import org.scalatest.Matchers._
import org.scalatest._

class Ex32Spec extends WordSpec {

  "List obj" should {

    "return the tail of the list" in {
      List.tail(List(1,2,3,4)) shouldEqual List(2,3,4)
    }

    "set a new head on a list" in {
      List.setHead(List(1, 2, 3, 4), 7) shouldEqual List(7, 2, 3, 4)
    }
  }
}
