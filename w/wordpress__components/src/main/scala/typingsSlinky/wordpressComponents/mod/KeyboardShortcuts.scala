package typingsSlinky.wordpressComponents.mod

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeyboardShortcuts extends Shortcut {
  
  @JSImport("@wordpress/components", "KeyboardShortcuts")
  @js.native
  val ^ : ComponentType[Props] = js.native
  
  type _To = ComponentType[Props]
  
  /* This means you don't have to write `^`, but can instead just say `KeyboardShortcuts.foo` */
  override def _to: ComponentType[Props] = ^
}
