import org.scalatest.Matchers._
import org.scalatest._

class Ex32Spec extends WordSpec {

  "List obj" should {

    "return the tail" in {
      List.tail(List(1,2,3,4)) shouldEqual List(2,3,4)
    }

    "set a new head" in {
      List.setHead(List(1, 2, 3, 4), 7) shouldEqual List(7, 2, 3, 4)
    }

    "drop n values" in {
      List.drop(List(1,2,3,4,5,6,7,8), 5) shouldEqual List(6,7,8)
    }

    "drop while" in {
      List.dropWhile(List("dog", "door", "cat", "bed", "mouse"), (w: String) => w contains "d") shouldEqual List("cat", "bed", "mouse")
    }
  }
}
