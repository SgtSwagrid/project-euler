package io.github.sgtswagrid.euler

import library.{IO, Memo}

/** https://projecteuler.net/problem=18 */
object Problem0018:

  @main
  def solution18(): Unit = println(solve("input/Problem0018.txt"))
  def solve(file: String): Int = maxSum(readInput(file))

  private def readInput(file: String): Triangle =
    Triangle(IO.readLines(file).map(l => l.split(" ").map(_.toInt)))

  private val maxSum: Triangle => Int = Memo.memoise: triangle =>
    triangle.children match
      case Some((left, right)) => triangle.root + Math.max(maxSum(left), maxSum(right))
      case None => triangle.root

  private case class Triangle(values: Seq[Seq[Int]], row: Int = 0, col: Int = 0):
    val root: Int = values(row)(col)
    val height: Int = values.size - row
    def children: Option[(Triangle, Triangle)] =
      Option.when(height > 1)(Triangle(values, row + 1, col), Triangle(values, row + 1, col + 1))
