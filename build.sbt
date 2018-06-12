name := "Shopping"

version := "1.0"

scalaVersion := "2.11.8"


lazy val root = (project in file(".")).enablePlugins(PlayScala)

val libraryDependencies = Seq(
  "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test,
  "org.seleniumhq.selenium" % "selenium-java" % "2.32.0" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test",
  "org.jsoup" % "jsoup" % "1.7.2" % "test",
  "com.springer" %% "casper-commons-test-tools" % "0.47" % "test",
  "com.timgroup" % "java-statsd-client" % "3.0.1"
)
        