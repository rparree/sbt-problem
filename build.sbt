
ThisBuild / scalaVersion     := "3.1.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = (project in file("."))
  .settings(
    name := "fs2-workshops",
    libraryDependencies += "co.fs2" %% "fs2-core" % "2.5.10",
    libraryDependencies += "co.fs2" %% "fs2-io" % "2.5.10",

  )

