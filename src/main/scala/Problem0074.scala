package io.github.sgtswagrid.euler

import library.{Chain, Combinatorics, Digits}

/** https://projecteuler.net/problem=74 */
object Problem0074:

  @main
  def solution74(): Unit = println:
    (1 until 1000000).count(start => Chain.iterateWhileDistinct(start, digitFactorialSum).sizeIs == 60)

  private def digitFactorialSum(n: Int): Int =
    Digits.digits(n).map(Combinatorics.factorial).sum.toInt
