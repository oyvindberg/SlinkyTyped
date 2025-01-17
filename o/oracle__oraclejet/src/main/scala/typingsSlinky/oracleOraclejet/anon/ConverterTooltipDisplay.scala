package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConverterTooltipDisplay extends StObject {
  
  var converter: js.UndefOr[typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[String]] = js.native
  
  var tooltipDisplay: js.UndefOr[off | auto] = js.native
  
  var tooltipLabel: js.UndefOr[String] = js.native
}
object ConverterTooltipDisplay {
  
  @scala.inline
  def apply(): ConverterTooltipDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterTooltipDisplay]
  }
  
  @scala.inline
  implicit class ConverterTooltipDisplayMutableBuilder[Self <: ConverterTooltipDisplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverter(value: typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[String]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
    
    @scala.inline
    def setTooltipDisplay(value: off | auto): Self = StObject.set(x, "tooltipDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipDisplayUndefined: Self = StObject.set(x, "tooltipDisplay", js.undefined)
    
    @scala.inline
    def setTooltipLabel(value: String): Self = StObject.set(x, "tooltipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipLabelUndefined: Self = StObject.set(x, "tooltipLabel", js.undefined)
  }
}
