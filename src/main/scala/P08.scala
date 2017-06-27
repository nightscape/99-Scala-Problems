package org.p99.scala

object P08 {

  def compress[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case x :: Nil => x :: Nil
    case x :: y :: rest if x == y => compress(x :: rest)
    case x :: y :: rest => x :: compress(y :: rest)
  }

}
