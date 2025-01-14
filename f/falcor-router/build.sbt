organization := "org.scalablytyped.slinky"
name := "falcor-router"
version := "0.8-dt-20201002Z-4fe6c5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "falcor" % "2.0-dt-20200515Z-b1f07b",
  "org.scalablytyped.slinky" %%% "falcor-http-datasource" % "0.1.3-dt-20201002Z-8fc243",
  "org.scalablytyped.slinky" %%% "falcor-json-graph" % "1.1.7-dt-20201002Z-15dcac",
  "org.scalablytyped.slinky" %%% "rx" % "4.1.0-48a711",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
