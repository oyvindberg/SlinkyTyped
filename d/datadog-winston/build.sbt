organization := "org.scalablytyped.slinky"
name := "datadog-winston"
version := "1.0-dt-20200225Z-5774d9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "logform" % "2.2.0-4d5e3c",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "winston-transport" % "4.4.0-ceb2d6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
