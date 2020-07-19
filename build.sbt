name := "docker-kube-sample"

version := "0.1"

lazy val dockerKubeSample = project
  .in(file("."))
  .settings(basicSettings)

lazy val basicSettings = Seq(
  scalaVersion := "2.12.10",
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-http" % "10.1.12",
    "com.typesafe.akka" %% "akka-stream" % "2.5.26",
    "org.postgresql" % "postgresql" % "42.2.7",
    "com.typesafe.slick" %% "slick" % "3.2.3",
    "org.slf4j" % "slf4j-nop" % "1.7.30"
  )
)
