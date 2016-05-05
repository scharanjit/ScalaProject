package com.scala.crawler

import org.apache.http.HttpEntity
import org.apache.http.impl.client.HttpClientBuilder
import org.apache.http.impl.client.BasicCookieStore
import org.apache.http.client.methods.HttpGet
import org.apache.http.cookie.Cookie

import com.gargoylesoftware.htmlunit._
import com.gargoylesoftware.htmlunit.html._
import org.apache.http.HttpEntity
import scala.collection.JavaConversions._
import scala.concurrent._
import scala.concurrent.duration._
import ExecutionContext.Implicits.global

object Crawl  {

  def download(url: String, cookies: Set[Cookie]=Set.empty): HttpEntity = {
    val cookieStore = new BasicCookieStore
    cookies.foreach(cookieStore.addCookie)

    val http = HttpClientBuilder
                 .create
                 .setDefaultCookieStore(cookieStore)
                 .build

    val response = http.execute(new HttpGet(url))
    response.getEntity
  }
 var  version: BrowserVersion = BrowserVersion.FIREFOX_45
   private[this] val client = new WebClient(version)
  
  def main(args: Array[String]): Unit = {
    val cookies = client.getCookieManager.getCookies.map(_.toHttpClient).toSet
    Crawl.download("http://mail-archives.apache.org/mod_mbox/maven-users/",cookies)
  }
  
  
}