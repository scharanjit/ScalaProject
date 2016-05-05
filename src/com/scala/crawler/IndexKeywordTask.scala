package com.scala.crawler

import java.lang.String
import java.util.{List,ArrayList}
import org.gridgain.grid.GridJob
import org.gridgain.grid.GridTaskNoReduceSplitAdapter


class IndexKeywordsTask extends GridTaskNoReduceSplitAdapter[String] {

  protected def split( gridSize:Int, url:String):List[GridJob] = {
    val jobs:List[GridJob] = new ArrayList[GridJob]()
    val job:GridJob = new IndexKeywordsJob(url)
    jobs.add(job)
    jobs
  }
  
}