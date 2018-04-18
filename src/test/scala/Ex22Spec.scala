import org.scalatest.Matchers._
import org.scalatest._

class Ex22Spec extends WordSpec {
  "IsSorted" should {

    "be true" in {
      Ex22.isSorted(Array(8,3,1), (a: Int, b: Int) => b < a) shouldEqual true
    }

    "be false" in {
      Ex22.isSorted(Array(2,4,8), (a: Int, b: Int) => b == a * a) shouldEqual false
    }
  }
}
