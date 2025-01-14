package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparklineValueAxisItemCrosshair extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var dashType: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var tooltip: js.UndefOr[SparklineValueAxisItemCrosshairTooltip] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object SparklineValueAxisItemCrosshair {
  
  @scala.inline
  def apply(): SparklineValueAxisItemCrosshair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineValueAxisItemCrosshair]
  }
  
  @scala.inline
  implicit class SparklineValueAxisItemCrosshairMutableBuilder[Self <: SparklineValueAxisItemCrosshair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashType(value: Double): Self = StObject.set(x, "dashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashTypeUndefined: Self = StObject.set(x, "dashType", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setTooltip(value: SparklineValueAxisItemCrosshairTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
