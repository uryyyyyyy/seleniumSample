name := """seleniumSample"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
	"org.seleniumhq.selenium" % "selenium-java" % "2.51.0",
	"org.scalatest" %% "scalatest" % "3.0.0-M15",
	"junit" % "junit" % "4.12"
)

