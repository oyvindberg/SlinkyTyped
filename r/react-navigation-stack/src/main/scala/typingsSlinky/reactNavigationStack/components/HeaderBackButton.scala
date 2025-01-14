package typingsSlinky.reactNavigationStack.components

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.mod.Animated.WithAnimatedValue
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationStack.anon.TintColorString
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderLeftButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderBackButton {
  
  @JSImport("react-navigation-stack", "HeaderBackButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backImage(value: /* props */ TintColorString => ReactElement): this.type = set("backImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def canGoBack(value: Boolean): this.type = set("canGoBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelStyle(value: WithAnimatedValue[StyleProp[TextStyle]]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelStyleNull: this.type = set("labelStyle", null)
    
    @scala.inline
    def labelVisible(value: Boolean): this.type = set("labelVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLabelLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLabelLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def pressColorAndroid(value: String): this.type = set("pressColorAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def screenLayout(value: typingsSlinky.reactNavigationStack.vendorTypesMod.Layout): this.type = set("screenLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleLayout(value: typingsSlinky.reactNavigationStack.vendorTypesMod.Layout): this.type = set("titleLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def truncatedLabel(value: String): this.type = set("truncatedLabel", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HeaderBackButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StackHeaderLeftButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
