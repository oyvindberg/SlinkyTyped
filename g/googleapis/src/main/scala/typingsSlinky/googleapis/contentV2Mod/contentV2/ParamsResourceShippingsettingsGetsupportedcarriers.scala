package typingsSlinky.googleapis.contentV2Mod.contentV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceShippingsettingsGetsupportedcarriers extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the account for which to retrieve the supported carriers.
    */
  var merchantId: js.UndefOr[String] = js.native
}
object ParamsResourceShippingsettingsGetsupportedcarriers {
  
  @scala.inline
  def apply(): ParamsResourceShippingsettingsGetsupportedcarriers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceShippingsettingsGetsupportedcarriers]
  }
  
  @scala.inline
  implicit class ParamsResourceShippingsettingsGetsupportedcarriersMutableBuilder[Self <: ParamsResourceShippingsettingsGetsupportedcarriers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
