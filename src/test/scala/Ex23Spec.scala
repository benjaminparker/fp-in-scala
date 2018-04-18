import org.scalatest.Matchers._
import org.scalatest._

class Ex23Spec extends WordSpec {

  "Curry" should {

    "work" in {
      val curried = Ex23.curry( (a: Int, b: Int) => a * b)
      curried(5)(3) shouldEqual 15
    }
  }
}
