package com.scala.parser

import sys.process._
import java.net.URL
import java.io.File
import scala.io.Source


object MainClass {
   val hrefRegex = """\<a.*?href=\"2014(.*?)\".*?\>.*?\</a>""".r
  val hrefRegex1 = """\<a.*?href=\"(.*?)\".*?\>.*?\</a>""".r
  
  
  def main(args: Array[String]): Unit = {
    //source Url
    val sourceUrl = "http://mail-archives.apache.org/mod_mbox/maven-users/"
    // it creates non-empty iterator
    val source = Source.fromURL(new URL(sourceUrl))
    // lst contains the list of urls fetched from href
    val lst = parse(sourceUrl, source)
    download(lst)
    println("----Download Finished ----...")
  }

  
  

  /*
   * This method will parse over the available links*/
  def parse(sourceUrl: String, source: Source): List[Link] = {
    val links: List[Link] = Nil
    //source.mkString does all magic...
    //it converts all data present on a url into string
    //findAllIn method matches the whatever value present in regex and return into a string
    populate(hrefRegex.findAllIn(source.mkString).toList, links, sourceUrl)

  }


  /*
   * This method iterates over listOfMatches populate the Link
   * */
  def populate(listOfMatches: List[String], listOfLinks: List[Link], sourceUrl: String): List[Link] = listOfMatches match {

    case head :: tail => {
      head match {
        case hrefRegex1(url) => {
          populate(tail, new Link(sourceUrl, url) :: listOfLinks, sourceUrl)

        }
        case _ => {
          // skip the item
          populate(tail, listOfLinks, sourceUrl)
        }
      }
    }
    case _ => listOfLinks

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