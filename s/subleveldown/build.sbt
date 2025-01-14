organization := "org.scalablytyped.slinky"
name := "subleveldown"
version := "4.1-dt-20191226Z-c552aa"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "abstract-leveldown" % "5.0-dt-20180913Z-9b6651",
  "org.scalablytyped.slinky" %%% "level-codec" % "9.0-dt-20200515Z-c8b6bd",
  "org.scalablytyped.slinky" %%% "levelup" % "4.3-dt-20201002Z-f363ec",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
