package typingsSlinky.semanticUiApi.anon

import typingsSlinky.semanticUiApi.semanticUiApiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'response'> */
@js.native
trait PickImplresponse extends StObject {
  
  var response: js.Any | `false` = js.native
}
object PickImplresponse {
  
  @scala.inline
  def apply(response: js.Any | `false`): PickImplresponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplresponse]
  }
  
  @scala.inline
  implicit class PickImplresponseMutableBuilder[Self <: PickImplresponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse(value: js.Any | `false`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
