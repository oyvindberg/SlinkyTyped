package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsSlinky.officeUiFabricReact.tooltipHostTypesMod.ITooltipHost
import typingsSlinky.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import typingsSlinky.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostStyleProps
import typingsSlinky.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostStyles
import typingsSlinky.officeUiFabricReact.tooltipHostTypesMod.TooltipOverflowMode
import typingsSlinky.officeUiFabricReact.tooltipTypesMod.ITooltipProps
import typingsSlinky.officeUiFabricReact.tooltipTypesMod.TooltipDelay
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.reactStrings.`additions removals`
import typingsSlinky.react.reactStrings.`additions text`
import typingsSlinky.react.reactStrings.`inline`
import typingsSlinky.react.reactStrings.`removals additions`
import typingsSlinky.react.reactStrings.`removals text`
import typingsSlinky.react.reactStrings.`text additions`
import typingsSlinky.react.reactStrings.`text removals`
import typingsSlinky.react.reactStrings.additions
import typingsSlinky.react.reactStrings.all
import typingsSlinky.react.reactStrings.ascending
import typingsSlinky.react.reactStrings.assertive
import typingsSlinky.react.reactStrings.both
import typingsSlinky.react.reactStrings.copy
import typingsSlinky.react.reactStrings.date
import typingsSlinky.react.reactStrings.decimal
import typingsSlinky.react.reactStrings.descending
import typingsSlinky.react.reactStrings.dialog
import typingsSlinky.react.reactStrings.email
import typingsSlinky.react.reactStrings.execute
import typingsSlinky.react.reactStrings.grammar
import typingsSlinky.react.reactStrings.grid
import typingsSlinky.react.reactStrings.horizontal
import typingsSlinky.react.reactStrings.inherit
import typingsSlinky.react.reactStrings.link
import typingsSlinky.react.reactStrings.list
import typingsSlinky.react.reactStrings.listbox
import typingsSlinky.react.reactStrings.location
import typingsSlinky.react.reactStrings.menu
import typingsSlinky.react.reactStrings.mixed
import typingsSlinky.react.reactStrings.move
import typingsSlinky.react.reactStrings.no
import typingsSlinky.react.reactStrings.none
import typingsSlinky.react.reactStrings.numeric
import typingsSlinky.react.reactStrings.off
import typingsSlinky.react.reactStrings.on
import typingsSlinky.react.reactStrings.other
import typingsSlinky.react.reactStrings.page
import typingsSlinky.react.reactStrings.polite
import typingsSlinky.react.reactStrings.popup
import typingsSlinky.react.reactStrings.removals
import typingsSlinky.react.reactStrings.search
import typingsSlinky.react.reactStrings.spelling
import typingsSlinky.react.reactStrings.step
import typingsSlinky.react.reactStrings.tel
import typingsSlinky.react.reactStrings.text
import typingsSlinky.react.reactStrings.time
import typingsSlinky.react.reactStrings.tree
import typingsSlinky.react.reactStrings.url
import typingsSlinky.react.reactStrings.vertical
import typingsSlinky.react.reactStrings.yes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TooltipHostBase {
  
  @JSImport("office-ui-fabric-react", "TooltipHostBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.TooltipHostBase] {
    
    @scala.inline
    def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-atomic`(value: Boolean): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-busy`(value: Boolean): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-disabled`(value: Boolean): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-expanded`(value: Boolean): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-grabbed`(value: Boolean): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-hidden`(value: Boolean): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-modal`(value: Boolean): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiline`(value: Boolean): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiselectable`(value: Boolean): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-readonly`(value: Boolean): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-required`(value: Boolean): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-selected`(value: Boolean): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def calloutProps(value: ICalloutProps): this.type = set("calloutProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeDelay(value: Double): this.type = set("closeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[ITooltipHost]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ ITooltipHost | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[ITooltipHost]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: String | ReactElement | js.Array[ReactElement]): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentVarargs(value: ReactElement*): this.type = set("content", js.Array(value :_*))
    
    @scala.inline
    def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def delay(value: TooltipDelay): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def directionalHint(value: DirectionalHint): this.type = set("directionalHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def directionalHintForRTL(value: DirectionalHint): this.type = set("directionalHintForRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hostClassName(value: String): this.type = set("hostClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inlist(value: js.Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAbort(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationEnd(
      value: SyntheticAnimationEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationIteration(
      value: SyntheticAnimationEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationStart(
      value: SyntheticAnimationEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAuxClick(
      value: SyntheticMouseEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforeInput(
      value: SyntheticEvent[
          EventTarget with (HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase), 
          Event
        ] => Unit
    ): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlur(
      value: SyntheticFocusEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlay(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlayThrough(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(
      value: SyntheticEvent[
          EventTarget with (HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase), 
          Event
        ] => Unit
    ): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(
      value: SyntheticMouseEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionEnd(
      value: SyntheticCompositionEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionStart(
      value: SyntheticCompositionEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionUpdate(
      value: SyntheticCompositionEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenu(
      value: SyntheticMouseEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCopy(
      value: SyntheticClipboardEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCut(
      value: SyntheticClipboardEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDoubleClick(
      value: SyntheticMouseEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrag(
      value: DragEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnd(
      value: DragEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnter(
      value: DragEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragExit(
      value: DragEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragLeave(
      value: DragEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragOver(
      value: DragEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStart(
      value: DragEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrop(
      value: DragEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDurationChange(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEmptied(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEncrypted(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnded(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def onError(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(
      value: SyntheticFocusEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInput(
      value: SyntheticEvent[
          EventTarget with (HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase), 
          Event
        ] => Unit
    ): this.type = set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInvalid(
      value: SyntheticEvent[
          EventTarget with (HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase), 
          Event
        ] => Unit
    ): this.type = set("onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(
      value: SyntheticKeyboardEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(
      value: SyntheticKeyboardEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUp(
      value: SyntheticKeyboardEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoad(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadStart(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedData(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedMetadata(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDown(
      value: SyntheticMouseEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(
      value: SyntheticMouseEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(
      value: SyntheticMouseEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMove(
      value: SyntheticMouseEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOut(
      value: SyntheticMouseEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOver(
      value: SyntheticMouseEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUp(
      value: SyntheticMouseEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPaste(
      value: SyntheticClipboardEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPause(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlay(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlaying(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerCancel(
      value: SyntheticPointerEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerDown(
      value: SyntheticPointerEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerEnter(
      value: SyntheticPointerEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerLeave(
      value: SyntheticPointerEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerMove(
      value: SyntheticPointerEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOut(
      value: SyntheticPointerEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOver(
      value: SyntheticPointerEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerUp(
      value: SyntheticPointerEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onProgress(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRateChange(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReset(
      value: SyntheticEvent[
          EventTarget with (HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase), 
          Event
        ] => Unit
    ): this.type = set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(
      value: SyntheticUIEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeked(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeking(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStalled(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSubmit(
      value: SyntheticEvent[
          EventTarget with (HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase), 
          Event
        ] => Unit
    ): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSuspend(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTimeUpdate(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTooltipToggle(value: /* isTooltipVisible */ Boolean => Unit): this.type = set("onTooltipToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(
      value: SyntheticTouchEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(
      value: SyntheticTouchEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(
      value: SyntheticTouchEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(
      value: SyntheticTouchEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTransitionEnd(
      value: SyntheticTransitionEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVolumeChange(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWaiting(
      value: SyntheticEvent[
          Event, 
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWheel(
      value: SyntheticWheelEvent[
          HTMLDivElement | typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
        ] => Unit
    ): this.type = set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def overflowMode(value: TooltipOverflowMode): this.type = set("overflowMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaDescribedBy(value: Boolean): this.type = set("setAriaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: IStyleFunctionOrObject[ITooltipHostStyleProps, ITooltipHostStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesFunction1(value: ITooltipHostStyleProps => DeepPartial[ITooltipHostStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipProps(value: ITooltipProps): this.type = set("tooltipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TooltipHostBase.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ITooltipHostProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
