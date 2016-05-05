package com.scala.parser

import scala.io.Source
import scala.util.matching.Regex
import scala.xml._

object LinkParser {

  val hrefRegex = """\<a.*?href=\"2014(.*?)\".*?\>.*?\</a>""".r
  val hrefRegex1 = """\<a.*?href=\"(.*?)\".*?\>.*?\</a>""".r

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

}


