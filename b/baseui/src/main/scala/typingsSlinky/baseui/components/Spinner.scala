package typingsSlinky.baseui.components

import typingsSlinky.baseui.iconMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spinner {
  
  @JSImport("baseui/icon", "Spinner")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Spinner.type): SharedBuilder_IconProps_510117459 = new SharedBuilder_IconProps_510117459(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IconProps): SharedBuilder_IconProps_510117459 = new SharedBuilder_IconProps_510117459(js.Array(this.component, p.asInstanceOf[js.Any]))
}
