package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOperationsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Cloud SQL instance ID. This does not include the project ID.
    */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of operations per response.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * A previously-returned page token representing part of the larger set of
    * results to view.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Project ID of the project that contains the instance.
    */
  var project: js.UndefOr[String] = js.native
}
object ParamsResourceOperationsList {
  
  @scala.inline
  def apply(): ParamsResourceOperationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOperationsList]
  }
  
  @scala.inline
  implicit class ParamsResourceOperationsListMutableBuilder[Self <: ParamsResourceOperationsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
