sealed trait List[+A]

case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {

  def apply[A](as: A*): List[A] = // Variadic function syntax
     if (as.isEmpty) Nil
     else Cons(as.head, apply(as.tail: _*))
  
  def tail[A](l: List[A]): List[A] =
    l match {
      case Nil => Nil     // book answer uses sys.error("tail of empty list")
      case Cons(_, t) => t
    }
}
