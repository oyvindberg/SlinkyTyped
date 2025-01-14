package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.added
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.drag
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.end
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.removed
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.start
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewDragEvent extends StObject {
  
  var action: start | added | update | removed | end = js.native
  
  var angle: Double = js.native
  
  var button: js.Any = js.native
  
  var buttons: Double = js.native
  
  var native: js.Any = js.native
  
  var origin: ViewDragEventOrigin = js.native
  
  var radius: Double = js.native
  
  var stopPropagation: js.Function = js.native
  
  var timestamp: Double = js.native
  
  var `type`: drag = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object ViewDragEvent {
  
  @scala.inline
  def apply(
    action: start | added | update | removed | end,
    angle: Double,
    button: js.Any,
    buttons: Double,
    native: js.Any,
    origin: ViewDragEventOrigin,
    radius: Double,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: drag,
    x: Double,
    y: Double
  ): ViewDragEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewDragEvent]
  }
  
  @scala.inline
  implicit class ViewDragEventMutableBuilder[Self <: ViewDragEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: start | added | update | removed | end): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: js.Any): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: ViewDragEventOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: drag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
