package typingsSlinky.snykDockerPlugin

import typingsSlinky.snykDockerPlugin.analyzerTypesMod.OSRelease
import typingsSlinky.snykDockerPlugin.distDockerMod.DockerOptions
import typingsSlinky.snykDockerPlugin.dockerFileMod.DockerFileAnalysis
import typingsSlinky.snykDockerPlugin.extractorTypesMod.ExtractedLayers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/os-release", JSImport.Namespace)
@js.native
object osReleaseMod extends js.Object {
  def detectDynamically(targetImage: String): js.Promise[OSRelease] = js.native
  def detectDynamically(targetImage: String, dockerfileAnalysis: DockerFileAnalysis): js.Promise[OSRelease] = js.native
  def detectDynamically(targetImage: String, dockerfileAnalysis: DockerFileAnalysis, options: DockerOptions): js.Promise[OSRelease] = js.native
  def detectStatically(extractedLayers: ExtractedLayers): js.Promise[OSRelease] = js.native
}

