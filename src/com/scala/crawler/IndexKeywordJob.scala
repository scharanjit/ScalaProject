package com.scala.crawler

import java.lang.String
import org.gridgain.grid.GridJobAdapterEx
import org.gridgain.scalar.scalar._

class IndexKeywordsJob(data:String) extends GridJobAdapterEx {
  def execute():Object = {
    println(data)
    // .. actual indexing logic comes here
    null
  }
}