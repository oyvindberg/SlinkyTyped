package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapNotesLayerLayerviewCreateEvent extends StObject {
  
  var layerView: LayerView = js.native
  
  var view: View = js.native
}
object MapNotesLayerLayerviewCreateEvent {
  
  @scala.inline
  def apply(layerView: LayerView, view: View): MapNotesLayerLayerviewCreateEvent = {
    val __obj = js.Dynamic.literal(layerView = layerView.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapNotesLayerLayerviewCreateEvent]
  }
  
  @scala.inline
  implicit class MapNotesLayerLayerviewCreateEventMutableBuilder[Self <: MapNotesLayerLayerviewCreateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerView(value: LayerView): Self = StObject.set(x, "layerView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
