package com.scala.crawler

import java.lang.String
import java.util.{List,ArrayList}
import org.gridgain.grid._


class LoadUrlTask  {

  def split(gridSize:Int, url:String):List[GridJob] = {
    val jobs:List[GridJob] = new ArrayList[GridJob]()
    val job:GridJob = new LoadUrlJob(url)
    jobs.add(job)
    jobs
  }
}