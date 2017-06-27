package org.p99.scala

import org.scalatest._

class P01Spec extends UnitSpec {

  "last" should "return the last element of the list" in {
    assert(P01.last(List(1)) == 1)
    assert(P01.last(List(1,2)) == 2)
  }

  "last" should "return throw an exception if the list is empty" in {
    assertThrows[NoSuchElementException] {
      P01.last(List())
    }
  }
}
