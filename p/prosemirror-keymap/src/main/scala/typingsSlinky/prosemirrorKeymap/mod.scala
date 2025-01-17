package typingsSlinky.prosemirrorKeymap

import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.prosemirrorCommands.mod.Keymap
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.Plugin
import typingsSlinky.prosemirrorView.mod.EditorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-keymap", "keydownHandler")
  @js.native
  def keydownHandler[S /* <: Schema[_, _] */](bindings: Keymap[S]): js.Function2[/* view */ EditorView[_], /* event */ KeyboardEvent, Boolean] = js.native
  
  @JSImport("prosemirror-keymap", "keymap")
  @js.native
  def keymap[S /* <: Schema[_, _] */](bindings: Keymap[S]): Plugin[_, _] = js.native
}
