package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotAreasplineAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotAreasplineAnimationOptions {
  
  @scala.inline
  def apply(): PlotAreasplineAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAreasplineAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotAreasplineAnimationOptionsMutableBuilder[Self <: PlotAreasplineAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
