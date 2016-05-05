package com.scala.parser

class Link(val parent: String, val link: String) {
  //it appends  the parent with required url
  override def toString = {
    parent + link
  }
}