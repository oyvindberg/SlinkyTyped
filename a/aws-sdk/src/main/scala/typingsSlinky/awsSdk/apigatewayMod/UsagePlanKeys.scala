package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsagePlanKeys extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfUsagePlanKey] = js.native
  
  var position: js.UndefOr[String] = js.native
}
object UsagePlanKeys {
  
  @scala.inline
  def apply(): UsagePlanKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlanKeys]
  }
  
  @scala.inline
  implicit class UsagePlanKeysMutableBuilder[Self <: UsagePlanKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ListOfUsagePlanKey): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: UsagePlanKey*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
