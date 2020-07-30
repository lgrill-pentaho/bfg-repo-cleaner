package com.madgag.git.bfg.cli

import scala.util.Random

package object stoptrump {
  val urls = Seq(
    "https://www.aclu.org/",
    "https://www.theguardian.com/us-news/trump-administration",
    "https://github.com/bkeepers/stop-trump",
    "https://www.rescue.org/topic/refugees-america"
  )

  assert(urls.forall(_.startsWith("https://")))

  def dontGiveUp(): String = {
    val url = urls(Random.nextInt(urls.size))

    s"""
       |
       |--
       |You can rewrite history in Git - don't let anyone do it for real!
       |--
       |
       |""".stripMargin

  }
}
