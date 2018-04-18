import org.scalatest.Matchers._
import org.scalatest._

class Ex32Spec extends WordSpec {

  "tail" should {

    "return the end of the list" in {
      List.tail(List(1,2,3,4)) shouldEqual List(2,3,4)
    }
  }
}
