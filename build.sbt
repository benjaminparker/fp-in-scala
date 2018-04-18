import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.needstyping",
      scalaVersion := "2.12.5",
      version      := "1.0-SNAPSHOT"
    )),
    name := "fp-in-scala",
    libraryDependencies += scalaTest % Test
  )
