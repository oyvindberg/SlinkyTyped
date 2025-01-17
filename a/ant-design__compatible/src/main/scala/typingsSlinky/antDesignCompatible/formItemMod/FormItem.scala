package typingsSlinky.antDesignCompatible.formItemMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignCompatible.antDesignCompatibleStrings._empty
import typingsSlinky.antDesignCompatible.antDesignCompatibleStrings.error
import typingsSlinky.antDesignCompatible.antDesignCompatibleStrings.success
import typingsSlinky.antDesignCompatible.antDesignCompatibleStrings.validating
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormItem
  extends Component[FormItemProps, js.Any, js.Any] {
  var helpShow: Boolean = js.native
  @JSName("componentDidMount")
  def componentDidMount_MFormItem(): Unit = js.native
  def getChildProp(prop: String): js.Any = js.native
  def getControls(children: TagMod[Any], recursively: Boolean): js.Array[ReactElement] = js.native
  def getField(): js.Any = js.native
  def getHelpMessage(): js.Object = js.native
  def getId(): js.Any = js.native
  def getMeta(): js.Any = js.native
  def getOnlyControl(): ReactElement = js.native
  def getValidateStatus(): error | _empty | success | validating = js.native
  def isRequired(): js.Any = js.native
  def onHelpAnimEnd(_key: String, helpShow: Boolean): Unit = js.native
  def onLabelClick(): Unit = js.native
  def renderChildren(prefixCls: String): js.Array[ReactElement] = js.native
  def renderExtra(prefixCls: String): ReactElement = js.native
  def renderFormItem(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def renderHelp(prefixCls: String): ReactElement = js.native
  def renderLabel(prefixCls: String): ReactElement = js.native
  def renderValidateWrapper(prefixCls: String, c1: TagMod[Any], c2: TagMod[Any], c3: TagMod[Any]): ReactElement = js.native
  def renderWrapper(prefixCls: String, children: TagMod[Any]): ReactElement = js.native
}

