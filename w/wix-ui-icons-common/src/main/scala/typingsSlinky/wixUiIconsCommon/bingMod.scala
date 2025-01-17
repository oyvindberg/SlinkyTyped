package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bingMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Bing", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BingProps] = js.native
  
  @js.native
  trait BingProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BingProps {
    
    @scala.inline
    def apply(): BingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BingProps]
    }
    
    @scala.inline
    implicit class BingPropsMutableBuilder[Self <: BingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BingProps]
  
  /* This means you don't have to write `default`, but can instead just say `bingMod.foo` */
  override def _to: ReactComponentClass[BingProps] = default
}
