package com.scala.parser

import sys.process._
import java.net.URL
import java.io.File
import scala.io.Source

object MainClass {
  def main(args: Array[String]): Unit = {
    //source Url
    val sourceUrl = "http://mail-archives.apache.org/mod_mbox/maven-users/"
    // it creates non-empty iterator
    val source = Source.fromURL(new URL(sourceUrl))
    // lst contains the list of urls fetched from href
    val lst = LinkParser.parse(sourceUrl, source)
    download(lst)
    println("----Download Finished ----...")
  }

  /*
   * This method downloads the file present at link
   * */
  def download(lst: List[Any]) = {

    lst.foreach {
      link =>
        var lnk = link.toString().substring(0, 64)
        new URL(lnk) #> new File(lnk.substring(53, 60).concat("txt")) !!

    }
  }
}