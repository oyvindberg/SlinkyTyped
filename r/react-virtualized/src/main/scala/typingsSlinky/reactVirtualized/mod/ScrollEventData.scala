package typingsSlinky.reactVirtualized.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollEventData extends StObject {
  
  var clientHeight: Double = js.native
  
  var scrollHeight: Double = js.native
  
  var scrollTop: Double = js.native
}
object ScrollEventData {
  
  @scala.inline
  def apply(clientHeight: Double, scrollHeight: Double, scrollTop: Double): ScrollEventData = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollEventData]
  }
  
  @scala.inline
  implicit class ScrollEventDataMutableBuilder[Self <: ScrollEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
