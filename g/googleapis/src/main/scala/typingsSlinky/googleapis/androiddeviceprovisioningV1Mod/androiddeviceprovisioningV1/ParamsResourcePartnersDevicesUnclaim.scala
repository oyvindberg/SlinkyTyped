package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePartnersDevicesUnclaim extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required. The ID of the reseller partner.
    */
  var partnerId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUnclaimDeviceRequest] = js.native
}
object ParamsResourcePartnersDevicesUnclaim {
  
  @scala.inline
  def apply(): ParamsResourcePartnersDevicesUnclaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersDevicesUnclaim]
  }
  
  @scala.inline
  implicit class ParamsResourcePartnersDevicesUnclaimMutableBuilder[Self <: ParamsResourcePartnersDevicesUnclaim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaUnclaimDeviceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
