package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.number
import typingsSlinky.qlik.qlikStrings.slider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertySlider
  extends CustomPropertyCommon
     with CustomProperty {
  
  var component: slider = js.native
  
  var defaultValue: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var step: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CustomPropertySlider: number = js.native
}
object CustomPropertySlider {
  
  @scala.inline
  def apply(component: slider, `type`: number): CustomPropertySlider = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertySlider]
  }
  
  @scala.inline
  implicit class CustomPropertySliderMutableBuilder[Self <: CustomPropertySlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: slider): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
