package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exposureSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ExposureSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ExposureSmallProps] = js.native
  
  @js.native
  trait ExposureSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ExposureSmallProps {
    
    @scala.inline
    def apply(): ExposureSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExposureSmallProps]
    }
    
    @scala.inline
    implicit class ExposureSmallPropsMutableBuilder[Self <: ExposureSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ExposureSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `exposureSmallMod.foo` */
  override def _to: ReactComponentClass[ExposureSmallProps] = default
}
