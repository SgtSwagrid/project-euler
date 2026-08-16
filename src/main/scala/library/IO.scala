package io.github.sgtswagrid.euler
package library

import scala.io.Source
import scala.util.Using

object IO:

  def readLines(file: String): List[String] =
    Using.resource(Source.fromFile(file))(_.getLines().toList)
