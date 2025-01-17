package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignTopMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignTop", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AlignTopProps] = js.native
  
  @js.native
  trait AlignTopProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AlignTopProps {
    
    @scala.inline
    def apply(): AlignTopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignTopProps]
    }
    
    @scala.inline
    implicit class AlignTopPropsMutableBuilder[Self <: AlignTopProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AlignTopProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignTopMod.foo` */
  override def _to: ReactComponentClass[AlignTopProps] = default
}
