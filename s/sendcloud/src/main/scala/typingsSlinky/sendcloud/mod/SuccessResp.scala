package typingsSlinky.sendcloud.mod

import typingsSlinky.sendcloud.sendcloudStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuccessResp extends StObject {
  
  var email_id_list: js.Array[String] = js.native
  
  var message: success = js.native
}
object SuccessResp {
  
  @scala.inline
  def apply(email_id_list: js.Array[String], message: success): SuccessResp = {
    val __obj = js.Dynamic.literal(email_id_list = email_id_list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessResp]
  }
  
  @scala.inline
  implicit class SuccessRespMutableBuilder[Self <: SuccessResp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail_id_list(value: js.Array[String]): Self = StObject.set(x, "email_id_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail_id_listVarargs(value: String*): Self = StObject.set(x, "email_id_list", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: success): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
