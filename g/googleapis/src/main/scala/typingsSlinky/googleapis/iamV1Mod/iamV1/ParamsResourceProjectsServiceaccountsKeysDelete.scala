package typingsSlinky.googleapis.iamV1Mod.iamV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsServiceaccountsKeysDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The resource name of the service account key in the following format:
    * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`. Using `-`
    * as a wildcard for the `PROJECT_ID` will infer the project from the
    * account. The `ACCOUNT` value can be the `email` address or the
    * `unique_id` of the service account.
    */
  var name: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsServiceaccountsKeysDelete {
  
  @scala.inline
  def apply(): ParamsResourceProjectsServiceaccountsKeysDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsServiceaccountsKeysDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsServiceaccountsKeysDeleteMutableBuilder[Self <: ParamsResourceProjectsServiceaccountsKeysDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
