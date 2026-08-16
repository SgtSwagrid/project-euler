package io.github.sgtswagrid.euler
package library

import scala.collection.mutable

object Memo:

  def memoise[I, O](f: I => O): I => O =
    val memo = mutable.Map[I, O]()
    x => memo.getOrElseUpdate(x, f(x))
