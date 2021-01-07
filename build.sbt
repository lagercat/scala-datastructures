ThisBuild / scalaVersion := "2.13.4"

val scalaTest = "org.scalatest" %% "scalatest" % "3.2.2"
lazy val root = (project in file("."))
  .settings(
    name := "scala-datastructures",
    libraryDependencies += scalaTest % Test
  )
