package typingsSlinky.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAxisTitle extends IAnnotation {
  
  var padding: Double = js.native
}
object IAxisTitle {
  
  @scala.inline
  def apply(
    active: Boolean,
    add: String => IAnnotation,
    bounds: IRectangle,
    chart: IChart,
    clicked: IPoint => Boolean,
    draw: () => Unit,
    format: IFormat,
    items: js.Array[IAnnotation],
    margins: IMargins,
    mousedown: js.Any => Boolean,
    mousemove: js.Any => Boolean,
    padding: Double,
    position: IPoint,
    resize: () => Unit,
    text: String,
    transparent: Boolean,
    visible: Boolean
  ): IAxisTitle = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), bounds = bounds.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), draw = js.Any.fromFunction0(draw), format = format.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], resize = js.Any.fromFunction0(resize), text = text.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAxisTitle]
  }
  
  @scala.inline
  implicit class IAxisTitleMutableBuilder[Self <: IAxisTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
