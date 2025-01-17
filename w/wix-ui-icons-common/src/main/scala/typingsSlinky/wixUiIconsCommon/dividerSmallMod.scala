package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DividerSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DividerSmallProps] = js.native
  
  @js.native
  trait DividerSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DividerSmallProps {
    
    @scala.inline
    def apply(): DividerSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DividerSmallProps]
    }
    
    @scala.inline
    implicit class DividerSmallPropsMutableBuilder[Self <: DividerSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DividerSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dividerSmallMod.foo` */
  override def _to: ReactComponentClass[DividerSmallProps] = default
}
