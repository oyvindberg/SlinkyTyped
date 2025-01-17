package typingsSlinky.gapiClientSurveys

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.gapiClientSurveys.gapi.client.surveys.MobileapppanelsResource
import typingsSlinky.gapiClientSurveys.gapi.client.surveys.ResultsResource
import typingsSlinky.gapiClientSurveys.gapi.client.surveys.SurveysResource
import typingsSlinky.gapiClientSurveys.gapiClientSurveysStrings.surveys
import typingsSlinky.gapiClientSurveys.gapiClientSurveysStrings.v2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Surveys API v2 */
      def load(name: surveys, version: v2): js.Thenable[Unit] = js.native
      def load(name: surveys, version: v2, callback: js.Function0[_]): Unit = js.native
      
      val mobileapppanels: MobileapppanelsResource = js.native
      
      val results: ResultsResource = js.native
      
      @js.native
      object surveys extends TopLevel[SurveysResource]
    }
  }
}
