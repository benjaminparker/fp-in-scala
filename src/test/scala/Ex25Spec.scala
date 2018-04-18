import org.scalatest.Matchers._
import org.scalatest._

class Ex25Spec extends WordSpec {

  "Compose" should {

    "work" in {
      val composed = Ex25.compose((a: Int) => a + 10, (b: Int) => b * 2)
      composed(3) shouldEqual 16
    }
  }
}
