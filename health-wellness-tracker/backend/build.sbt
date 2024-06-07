name := "health-wellness-tracker"

version := "1.0"

scalaVersion := "2.13.10"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play" % "2.8.11",
  "org.postgresql" % "postgresql" % "42.2.23",
  "com.typesafe.play" %% "play-slick" % "5.0.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "5.0.0"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
