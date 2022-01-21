ThisBuild / scalaVersion := "2.12.13"
ThisBuild / organization := "MultiArmBandit"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello",
    libraryDependencies  ++= Seq(
      "org.scalanlp" %% "breeze" % "0.13"
    )
  )
