package typingsSlinky.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for `TestIamPermissions` method.
  */
@js.native
trait SchemaGoogleIamV1TestIamPermissionsRequest extends StObject {
  
  /**
    * The set of permissions to check for the `resource`. Permissions with
    * wildcards (such as &#39;*&#39; or &#39;storage.*&#39;) are not allowed.
    * For more information see [IAM
    * Overview](https://cloud.google.com/iam/docs/overview#permissions).
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGoogleIamV1TestIamPermissionsRequest {
  
  @scala.inline
  def apply(): SchemaGoogleIamV1TestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamV1TestIamPermissionsRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleIamV1TestIamPermissionsRequestMutableBuilder[Self <: SchemaGoogleIamV1TestIamPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
