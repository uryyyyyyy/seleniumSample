package com.github.uryyyyyyy.selenium.google

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.scalatest.selenium.WebBrowser
import org.scalatest.{FlatSpec, Matchers}

class HelloTest extends FlatSpec with Matchers with WebBrowser {

	val webDriver: WebDriver = new FirefoxDriver()
	//implicit val webDriver: WebDriver = new HtmlUnitDriver()

	val host = "http://qiita.com/"

	"The blog app home page" should "have the correct title" in {
		go.to(host)(webDriver)
		pageTitle(webDriver) should be ("Qiita - A technical knowledge sharing platform for programmers.")
		quit()(webDriver)
	}

	"Hello" should "have tests" in {
		true should === (true)
	}
}