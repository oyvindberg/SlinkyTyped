organization := "org.scalablytyped.slinky"
name := "router5"
version := "8.0.1-946a43"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "path-parser" % "6.1.0-e54f11",
  "org.scalablytyped.slinky" %%% "route-node" % "4.1.1-53b488",
  "org.scalablytyped.slinky" %%% "router5-transition-path" % "8.0.1-32d2d9",
  "org.scalablytyped.slinky" %%% "search-params" % "3.0.0-b17a32",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
