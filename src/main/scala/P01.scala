package org.p99.scala

object P01 {

  def last[T](list: List[T]): T = list match {
    case Nil => throw new NoSuchElementException("Cannot extract last element of empty list")
    case x :: Nil => x
    case x :: xs => last(xs)
  }
}
