package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The standard list filter.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * The resource that owns the locations collection, if applicable.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The standard list page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The standard list page token.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsListMutableBuilder[Self <: ParamsResourceProjectsLocationsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
