organization := "org.scalablytyped.slinky"
name := "algoliasearch-helper"
version := "3.3.2-633f34"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "algolia__cache-common" % "4.8.0-465033",
  "org.scalablytyped.slinky" %%% "algolia__client-analytics" % "4.8.0-1cef0c",
  "org.scalablytyped.slinky" %%% "algolia__client-common" % "4.8.0-1030ed",
  "org.scalablytyped.slinky" %%% "algolia__client-recommendation" % "4.8.0-edd3d7",
  "org.scalablytyped.slinky" %%% "algolia__client-search" % "4.8.0-ff5c29",
  "org.scalablytyped.slinky" %%% "algolia__logger-common" % "4.8.0-8f6d0e",
  "org.scalablytyped.slinky" %%% "algolia__requester-common" % "4.8.0-c5dcf5",
  "org.scalablytyped.slinky" %%% "algolia__transporter" % "4.8.0-5a108a",
  "org.scalablytyped.slinky" %%% "algoliasearch" % "4.8.0-88bc2a",
  "org.scalablytyped.slinky" %%% "events" % "3.0-dt-20200515Z-825b5d",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
