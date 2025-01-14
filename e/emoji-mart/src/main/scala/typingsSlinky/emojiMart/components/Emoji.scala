package typingsSlinky.emojiMart.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiSkin
import typingsSlinky.emojiMart.sharedPropsMod.EmojiProps
import typingsSlinky.emojiMart.sharedPropsMod.EmojiSet
import typingsSlinky.emojiMart.sharedPropsMod.EmojiSheetSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Emoji {
  
  @scala.inline
  def apply(emoji: String | EmojiData, size: Double): Builder = {
    val __props = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EmojiProps]))
  }
  
  @JSImport("emoji-mart/dist-es/components/emoji/emoji", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def backgroundImageFn(value: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String): this.type = set("backgroundImageFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def fallback(value: (/* emoji */ EmojiData, EmojiProps) => ReactComponentClass[js.Object] | ReactElement): this.type = set("fallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def forceSize(value: Boolean): this.type = set("forceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def html(value: Boolean): this.type = set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def native(value: Boolean): this.type = set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onLeave(value: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def onOver(value: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def set(value: EmojiSet): this.type = set("set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sheetColumns(value: Double): this.type = set("sheetColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sheetRows(value: Double): this.type = set("sheetRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sheetSize(value: EmojiSheetSize): this.type = set("sheetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skin(value: EmojiSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: Boolean): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EmojiProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
