package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BlockSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BlockSmallProps] = js.native
  
  @js.native
  trait BlockSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BlockSmallProps {
    
    @scala.inline
    def apply(): BlockSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockSmallProps]
    }
    
    @scala.inline
    implicit class BlockSmallPropsMutableBuilder[Self <: BlockSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BlockSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `blockSmallMod.foo` */
  override def _to: ReactComponentClass[BlockSmallProps] = default
}
