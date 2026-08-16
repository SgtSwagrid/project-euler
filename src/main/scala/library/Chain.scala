package io.github.sgtswagrid.euler
package library

import scala.collection.mutable

object Chain:

  def iterateWhileDistinct[X](start: X, next: X => X): LazyList[X] =
    val seen = mutable.Set[X]()
    LazyList.iterate(start)(next).takeWhile(x => !seen.contains(x)).tapEach(seen.add)
