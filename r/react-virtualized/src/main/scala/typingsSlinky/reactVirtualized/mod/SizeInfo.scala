package typingsSlinky.reactVirtualized.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeInfo extends StObject {
  
  var height: Double = js.native
  
  var width: Double = js.native
}
object SizeInfo {
  
  @scala.inline
  def apply(height: Double, width: Double): SizeInfo = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeInfo]
  }
  
  @scala.inline
  implicit class SizeInfoMutableBuilder[Self <: SizeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
