package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDistributionRequest extends StObject {
  
  /**
    * The distribution ID. 
    */
  var Id: String = js.native
  
  /**
    * The value of the ETag header that you received when you disabled the distribution. For example: E2QWRUHAPOMQZL. 
    */
  var IfMatch: js.UndefOr[String] = js.native
}
object DeleteDistributionRequest {
  
  @scala.inline
  def apply(Id: String): DeleteDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDistributionRequest]
  }
  
  @scala.inline
  implicit class DeleteDistributionRequestMutableBuilder[Self <: DeleteDistributionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
