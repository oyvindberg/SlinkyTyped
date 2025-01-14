package typingsSlinky.snykDockerPlugin

import typingsSlinky.snykDockerPlugin.distTypesMod.ScannedProjectCustom
import typingsSlinky.snykDockerPlugin.typesMod.FilePathToContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/applications", JSImport.Namespace)
@js.native
object applicationsMod extends js.Object {
  def nodeFilesToScannedProjects(filePathToContent: FilePathToContent): js.Promise[js.Array[ScannedProjectCustom]] = js.native
}

