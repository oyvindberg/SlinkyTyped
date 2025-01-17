package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videointelligenceV1p2beta1 {
  
  @JSImport("googleapis", "videointelligence_v1p2beta1.Resource$Videos")
  @js.native
  class ResourceVideos protected ()
    extends typingsSlinky.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1.ResourceVideos {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Video Intelligence API
    *
    * Detects objects, explicit content, and scene changes in videos. It also
    * specifies the region for annotation and transcribes speech to text.
    * Supports both asynchronous API and streaming API.
    *
    * @example
    * const {google} = require('googleapis');
    * const videointelligence = google.videointelligence('v1p2beta1');
    *
    * @namespace videointelligence
    * @type {Function}
    * @version v1p2beta1
    * @variation v1p2beta1
    * @param {object=} options Options for Videointelligence
    */
  @JSImport("googleapis", "videointelligence_v1p2beta1.Videointelligence")
  @js.native
  class Videointelligence protected ()
    extends typingsSlinky.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1.Videointelligence {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
