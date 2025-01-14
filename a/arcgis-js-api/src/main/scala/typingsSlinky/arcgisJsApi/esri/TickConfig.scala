package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.average
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.count
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.max
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.min
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.percent
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.position
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tick
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.value
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TickConfig extends Object {
  
  /**
    * Callback for formatting tick labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var labelFormatFunction: js.UndefOr[SliderLabelFormatter] = js.native
  
  /**
    * Indicates whether to render labels for the ticks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var labelsVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * The mode or method of positioning ticks along the slider track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var mode: count | percent | position = js.native
  
  /**
    * Callback that fires for each tick.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var tickCreatedFunction: js.UndefOr[TickCreatedFunction] = js.native
  
  /**
    * Indicates where ticks will be rendered below the track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
    */
  var values: Double | js.Array[Double] = js.native
}
object TickConfig {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: count | percent | position,
    propertyIsEnumerable: PropertyKey => Boolean,
    values: Double | js.Array[Double]
  ): TickConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickConfig]
  }
  
  @scala.inline
  implicit class TickConfigMutableBuilder[Self <: TickConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "labelFormatFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLabelFormatFunctionUndefined: Self = StObject.set(x, "labelFormatFunction", js.undefined)
    
    @scala.inline
    def setLabelsVisible(value: Boolean): Self = StObject.set(x, "labelsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVisibleUndefined: Self = StObject.set(x, "labelsVisible", js.undefined)
    
    @scala.inline
    def setMode(value: count | percent | position): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickCreatedFunction(
      value: (/* value */ Double, /* tickElement */ HTMLElement, /* labelElement */ js.UndefOr[HTMLElement]) => Unit
    ): Self = StObject.set(x, "tickCreatedFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTickCreatedFunctionUndefined: Self = StObject.set(x, "tickCreatedFunction", js.undefined)
    
    @scala.inline
    def setValues(value: Double | js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
