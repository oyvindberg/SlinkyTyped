package typingsSlinky.cookieclicker

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DOMTokenList
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLAreaElement
import org.scalajs.dom.raw.HTMLAudioElement
import org.scalajs.dom.raw.HTMLBRElement
import org.scalajs.dom.raw.HTMLBaseElement
import org.scalajs.dom.raw.HTMLBodyElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.HTMLDListElement
import org.scalajs.dom.raw.HTMLDataListElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLEmbedElement
import org.scalajs.dom.raw.HTMLFieldSetElement
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLHRElement
import org.scalajs.dom.raw.HTMLHeadElement
import org.scalajs.dom.raw.HTMLHeadingElement
import org.scalajs.dom.raw.HTMLHtmlElement
import org.scalajs.dom.raw.HTMLIFrameElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLLIElement
import org.scalajs.dom.raw.HTMLLabelElement
import org.scalajs.dom.raw.HTMLLegendElement
import org.scalajs.dom.raw.HTMLLinkElement
import org.scalajs.dom.raw.HTMLMapElement
import org.scalajs.dom.raw.HTMLMenuElement
import org.scalajs.dom.raw.HTMLMetaElement
import org.scalajs.dom.raw.HTMLModElement
import org.scalajs.dom.raw.HTMLOListElement
import org.scalajs.dom.raw.HTMLObjectElement
import org.scalajs.dom.raw.HTMLOptGroupElement
import org.scalajs.dom.raw.HTMLOptionElement
import org.scalajs.dom.raw.HTMLParagraphElement
import org.scalajs.dom.raw.HTMLParamElement
import org.scalajs.dom.raw.HTMLPreElement
import org.scalajs.dom.raw.HTMLProgressElement
import org.scalajs.dom.raw.HTMLQuoteElement
import org.scalajs.dom.raw.HTMLScriptElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.HTMLSourceElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.HTMLStyleElement
import org.scalajs.dom.raw.HTMLTableCaptionElement
import org.scalajs.dom.raw.HTMLTableColElement
import org.scalajs.dom.raw.HTMLTableElement
import org.scalajs.dom.raw.HTMLTableRowElement
import org.scalajs.dom.raw.HTMLTableSectionElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import org.scalajs.dom.raw.HTMLTitleElement
import org.scalajs.dom.raw.HTMLTrackElement
import org.scalajs.dom.raw.HTMLUListElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.NamedNodeMap
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import org.scalajs.dom.raw.ParentNode
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.SVGCircleElement
import org.scalajs.dom.raw.SVGClipPathElement
import org.scalajs.dom.raw.SVGDefsElement
import org.scalajs.dom.raw.SVGDescElement
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGEllipseElement
import org.scalajs.dom.raw.SVGFEBlendElement
import org.scalajs.dom.raw.SVGFEColorMatrixElement
import org.scalajs.dom.raw.SVGFEComponentTransferElement
import org.scalajs.dom.raw.SVGFECompositeElement
import org.scalajs.dom.raw.SVGFEConvolveMatrixElement
import org.scalajs.dom.raw.SVGFEDiffuseLightingElement
import org.scalajs.dom.raw.SVGFEDisplacementMapElement
import org.scalajs.dom.raw.SVGFEDistantLightElement
import org.scalajs.dom.raw.SVGFEFloodElement
import org.scalajs.dom.raw.SVGFEFuncAElement
import org.scalajs.dom.raw.SVGFEFuncBElement
import org.scalajs.dom.raw.SVGFEFuncGElement
import org.scalajs.dom.raw.SVGFEFuncRElement
import org.scalajs.dom.raw.SVGFEGaussianBlurElement
import org.scalajs.dom.raw.SVGFEImageElement
import org.scalajs.dom.raw.SVGFEMergeElement
import org.scalajs.dom.raw.SVGFEMergeNodeElement
import org.scalajs.dom.raw.SVGFEMorphologyElement
import org.scalajs.dom.raw.SVGFEOffsetElement
import org.scalajs.dom.raw.SVGFEPointLightElement
import org.scalajs.dom.raw.SVGFESpecularLightingElement
import org.scalajs.dom.raw.SVGFESpotLightElement
import org.scalajs.dom.raw.SVGFETileElement
import org.scalajs.dom.raw.SVGFETurbulenceElement
import org.scalajs.dom.raw.SVGFilterElement
import org.scalajs.dom.raw.SVGGElement
import org.scalajs.dom.raw.SVGImageElement
import org.scalajs.dom.raw.SVGLineElement
import org.scalajs.dom.raw.SVGLinearGradientElement
import org.scalajs.dom.raw.SVGMarkerElement
import org.scalajs.dom.raw.SVGMaskElement
import org.scalajs.dom.raw.SVGMetadataElement
import org.scalajs.dom.raw.SVGPathElement
import org.scalajs.dom.raw.SVGPatternElement
import org.scalajs.dom.raw.SVGPolygonElement
import org.scalajs.dom.raw.SVGPolylineElement
import org.scalajs.dom.raw.SVGRadialGradientElement
import org.scalajs.dom.raw.SVGRectElement
import org.scalajs.dom.raw.SVGSVGElement
import org.scalajs.dom.raw.SVGStopElement
import org.scalajs.dom.raw.SVGSwitchElement
import org.scalajs.dom.raw.SVGSymbolElement
import org.scalajs.dom.raw.SVGTSpanElement
import org.scalajs.dom.raw.SVGTextElement
import org.scalajs.dom.raw.SVGTextPathElement
import org.scalajs.dom.raw.SVGUseElement
import org.scalajs.dom.raw.SVGViewElement
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WebGLContextAttributes
import org.scalajs.dom.raw.WebGLRenderingContext
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.cookieclicker.Game.GardenMinigame
import typingsSlinky.cookieclicker.Game.GrimoireMinigame
import typingsSlinky.cookieclicker.Game.MinigameObject
import typingsSlinky.cookieclicker.Game.PantheonMinigame
import typingsSlinky.cookieclicker.Game.StocksMinigame
import typingsSlinky.cookieclicker.cookieclickerNumbers.`8`
import typingsSlinky.cookieclicker.cookieclickerStrings.`2d`
import typingsSlinky.cookieclicker.cookieclickerStrings.`object`
import typingsSlinky.cookieclicker.cookieclickerStrings.`var`
import typingsSlinky.cookieclicker.cookieclickerStrings.a
import typingsSlinky.cookieclicker.cookieclickerStrings.abbr
import typingsSlinky.cookieclicker.cookieclickerStrings.abort
import typingsSlinky.cookieclicker.cookieclickerStrings.address
import typingsSlinky.cookieclicker.cookieclickerStrings.animationcancel
import typingsSlinky.cookieclicker.cookieclickerStrings.animationend
import typingsSlinky.cookieclicker.cookieclickerStrings.animationiteration
import typingsSlinky.cookieclicker.cookieclickerStrings.animationstart
import typingsSlinky.cookieclicker.cookieclickerStrings.applet
import typingsSlinky.cookieclicker.cookieclickerStrings.area
import typingsSlinky.cookieclicker.cookieclickerStrings.article
import typingsSlinky.cookieclicker.cookieclickerStrings.aside
import typingsSlinky.cookieclicker.cookieclickerStrings.audio
import typingsSlinky.cookieclicker.cookieclickerStrings.auxclick
import typingsSlinky.cookieclicker.cookieclickerStrings.b
import typingsSlinky.cookieclicker.cookieclickerStrings.base
import typingsSlinky.cookieclicker.cookieclickerStrings.basefont
import typingsSlinky.cookieclicker.cookieclickerStrings.bdi
import typingsSlinky.cookieclicker.cookieclickerStrings.bdo
import typingsSlinky.cookieclicker.cookieclickerStrings.bitmaprenderer
import typingsSlinky.cookieclicker.cookieclickerStrings.blank
import typingsSlinky.cookieclicker.cookieclickerStrings.blockquote
import typingsSlinky.cookieclicker.cookieclickerStrings.blur
import typingsSlinky.cookieclicker.cookieclickerStrings.body
import typingsSlinky.cookieclicker.cookieclickerStrings.br
import typingsSlinky.cookieclicker.cookieclickerStrings.button
import typingsSlinky.cookieclicker.cookieclickerStrings.cancel
import typingsSlinky.cookieclicker.cookieclickerStrings.canplay
import typingsSlinky.cookieclicker.cookieclickerStrings.canplaythrough
import typingsSlinky.cookieclicker.cookieclickerStrings.canvas
import typingsSlinky.cookieclicker.cookieclickerStrings.caption
import typingsSlinky.cookieclicker.cookieclickerStrings.change
import typingsSlinky.cookieclicker.cookieclickerStrings.circle
import typingsSlinky.cookieclicker.cookieclickerStrings.cite
import typingsSlinky.cookieclicker.cookieclickerStrings.click
import typingsSlinky.cookieclicker.cookieclickerStrings.clipPath
import typingsSlinky.cookieclicker.cookieclickerStrings.close
import typingsSlinky.cookieclicker.cookieclickerStrings.code
import typingsSlinky.cookieclicker.cookieclickerStrings.col
import typingsSlinky.cookieclicker.cookieclickerStrings.colgroup
import typingsSlinky.cookieclicker.cookieclickerStrings.contextmenu
import typingsSlinky.cookieclicker.cookieclickerStrings.copy
import typingsSlinky.cookieclicker.cookieclickerStrings.cuechange
import typingsSlinky.cookieclicker.cookieclickerStrings.cut
import typingsSlinky.cookieclicker.cookieclickerStrings.data
import typingsSlinky.cookieclicker.cookieclickerStrings.datalist
import typingsSlinky.cookieclicker.cookieclickerStrings.dblclick
import typingsSlinky.cookieclicker.cookieclickerStrings.dd
import typingsSlinky.cookieclicker.cookieclickerStrings.defs
import typingsSlinky.cookieclicker.cookieclickerStrings.del
import typingsSlinky.cookieclicker.cookieclickerStrings.desc
import typingsSlinky.cookieclicker.cookieclickerStrings.details
import typingsSlinky.cookieclicker.cookieclickerStrings.dfn
import typingsSlinky.cookieclicker.cookieclickerStrings.dialog
import typingsSlinky.cookieclicker.cookieclickerStrings.dir
import typingsSlinky.cookieclicker.cookieclickerStrings.div
import typingsSlinky.cookieclicker.cookieclickerStrings.dl
import typingsSlinky.cookieclicker.cookieclickerStrings.drag
import typingsSlinky.cookieclicker.cookieclickerStrings.dragend
import typingsSlinky.cookieclicker.cookieclickerStrings.dragenter
import typingsSlinky.cookieclicker.cookieclickerStrings.dragexit
import typingsSlinky.cookieclicker.cookieclickerStrings.dragleave
import typingsSlinky.cookieclicker.cookieclickerStrings.dragover
import typingsSlinky.cookieclicker.cookieclickerStrings.dragstart
import typingsSlinky.cookieclicker.cookieclickerStrings.drop
import typingsSlinky.cookieclicker.cookieclickerStrings.dt
import typingsSlinky.cookieclicker.cookieclickerStrings.durationchange
import typingsSlinky.cookieclicker.cookieclickerStrings.ellipse
import typingsSlinky.cookieclicker.cookieclickerStrings.em
import typingsSlinky.cookieclicker.cookieclickerStrings.embed
import typingsSlinky.cookieclicker.cookieclickerStrings.emptied
import typingsSlinky.cookieclicker.cookieclickerStrings.ended
import typingsSlinky.cookieclicker.cookieclickerStrings.error
import typingsSlinky.cookieclicker.cookieclickerStrings.feBlend
import typingsSlinky.cookieclicker.cookieclickerStrings.feColorMatrix
import typingsSlinky.cookieclicker.cookieclickerStrings.feComponentTransfer
import typingsSlinky.cookieclicker.cookieclickerStrings.feComposite
import typingsSlinky.cookieclicker.cookieclickerStrings.feConvolveMatrix
import typingsSlinky.cookieclicker.cookieclickerStrings.feDiffuseLighting
import typingsSlinky.cookieclicker.cookieclickerStrings.feDisplacementMap
import typingsSlinky.cookieclicker.cookieclickerStrings.feDistantLight
import typingsSlinky.cookieclicker.cookieclickerStrings.feFlood
import typingsSlinky.cookieclicker.cookieclickerStrings.feFuncA
import typingsSlinky.cookieclicker.cookieclickerStrings.feFuncB
import typingsSlinky.cookieclicker.cookieclickerStrings.feFuncG
import typingsSlinky.cookieclicker.cookieclickerStrings.feFuncR
import typingsSlinky.cookieclicker.cookieclickerStrings.feGaussianBlur
import typingsSlinky.cookieclicker.cookieclickerStrings.feImage
import typingsSlinky.cookieclicker.cookieclickerStrings.feMerge
import typingsSlinky.cookieclicker.cookieclickerStrings.feMergeNode
import typingsSlinky.cookieclicker.cookieclickerStrings.feMorphology
import typingsSlinky.cookieclicker.cookieclickerStrings.feOffset
import typingsSlinky.cookieclicker.cookieclickerStrings.fePointLight
import typingsSlinky.cookieclicker.cookieclickerStrings.feSpecularLighting
import typingsSlinky.cookieclicker.cookieclickerStrings.feSpotLight
import typingsSlinky.cookieclicker.cookieclickerStrings.feTile
import typingsSlinky.cookieclicker.cookieclickerStrings.feTurbulence
import typingsSlinky.cookieclicker.cookieclickerStrings.fieldset
import typingsSlinky.cookieclicker.cookieclickerStrings.figcaption
import typingsSlinky.cookieclicker.cookieclickerStrings.figure
import typingsSlinky.cookieclicker.cookieclickerStrings.filter
import typingsSlinky.cookieclicker.cookieclickerStrings.focus
import typingsSlinky.cookieclicker.cookieclickerStrings.focusin
import typingsSlinky.cookieclicker.cookieclickerStrings.focusout
import typingsSlinky.cookieclicker.cookieclickerStrings.font
import typingsSlinky.cookieclicker.cookieclickerStrings.footer
import typingsSlinky.cookieclicker.cookieclickerStrings.foreignObject
import typingsSlinky.cookieclicker.cookieclickerStrings.form
import typingsSlinky.cookieclicker.cookieclickerStrings.frame
import typingsSlinky.cookieclicker.cookieclickerStrings.frameset
import typingsSlinky.cookieclicker.cookieclickerStrings.fullscreenchange
import typingsSlinky.cookieclicker.cookieclickerStrings.fullscreenerror
import typingsSlinky.cookieclicker.cookieclickerStrings.g
import typingsSlinky.cookieclicker.cookieclickerStrings.gotpointercapture
import typingsSlinky.cookieclicker.cookieclickerStrings.h1
import typingsSlinky.cookieclicker.cookieclickerStrings.h2
import typingsSlinky.cookieclicker.cookieclickerStrings.h3
import typingsSlinky.cookieclicker.cookieclickerStrings.h4
import typingsSlinky.cookieclicker.cookieclickerStrings.h5
import typingsSlinky.cookieclicker.cookieclickerStrings.h6
import typingsSlinky.cookieclicker.cookieclickerStrings.head
import typingsSlinky.cookieclicker.cookieclickerStrings.header
import typingsSlinky.cookieclicker.cookieclickerStrings.hgroup
import typingsSlinky.cookieclicker.cookieclickerStrings.hr
import typingsSlinky.cookieclicker.cookieclickerStrings.html
import typingsSlinky.cookieclicker.cookieclickerStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typingsSlinky.cookieclicker.cookieclickerStrings.httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg
import typingsSlinky.cookieclicker.cookieclickerStrings.i
import typingsSlinky.cookieclicker.cookieclickerStrings.iframe
import typingsSlinky.cookieclicker.cookieclickerStrings.image
import typingsSlinky.cookieclicker.cookieclickerStrings.img
import typingsSlinky.cookieclicker.cookieclickerStrings.input
import typingsSlinky.cookieclicker.cookieclickerStrings.ins
import typingsSlinky.cookieclicker.cookieclickerStrings.invalid
import typingsSlinky.cookieclicker.cookieclickerStrings.kbd
import typingsSlinky.cookieclicker.cookieclickerStrings.keydown
import typingsSlinky.cookieclicker.cookieclickerStrings.keypress
import typingsSlinky.cookieclicker.cookieclickerStrings.keyup
import typingsSlinky.cookieclicker.cookieclickerStrings.label
import typingsSlinky.cookieclicker.cookieclickerStrings.legend
import typingsSlinky.cookieclicker.cookieclickerStrings.li
import typingsSlinky.cookieclicker.cookieclickerStrings.line
import typingsSlinky.cookieclicker.cookieclickerStrings.linearGradient
import typingsSlinky.cookieclicker.cookieclickerStrings.link
import typingsSlinky.cookieclicker.cookieclickerStrings.load
import typingsSlinky.cookieclicker.cookieclickerStrings.loadeddata
import typingsSlinky.cookieclicker.cookieclickerStrings.loadedmetadata
import typingsSlinky.cookieclicker.cookieclickerStrings.loadstart
import typingsSlinky.cookieclicker.cookieclickerStrings.lostpointercapture
import typingsSlinky.cookieclicker.cookieclickerStrings.main
import typingsSlinky.cookieclicker.cookieclickerStrings.map
import typingsSlinky.cookieclicker.cookieclickerStrings.mark
import typingsSlinky.cookieclicker.cookieclickerStrings.marker
import typingsSlinky.cookieclicker.cookieclickerStrings.marquee
import typingsSlinky.cookieclicker.cookieclickerStrings.mask
import typingsSlinky.cookieclicker.cookieclickerStrings.menu
import typingsSlinky.cookieclicker.cookieclickerStrings.meta
import typingsSlinky.cookieclicker.cookieclickerStrings.metadata
import typingsSlinky.cookieclicker.cookieclickerStrings.meter
import typingsSlinky.cookieclicker.cookieclickerStrings.mousedown
import typingsSlinky.cookieclicker.cookieclickerStrings.mouseenter
import typingsSlinky.cookieclicker.cookieclickerStrings.mouseleave
import typingsSlinky.cookieclicker.cookieclickerStrings.mousemove
import typingsSlinky.cookieclicker.cookieclickerStrings.mouseout
import typingsSlinky.cookieclicker.cookieclickerStrings.mouseover
import typingsSlinky.cookieclicker.cookieclickerStrings.mouseup
import typingsSlinky.cookieclicker.cookieclickerStrings.nav
import typingsSlinky.cookieclicker.cookieclickerStrings.noscript
import typingsSlinky.cookieclicker.cookieclickerStrings.ol
import typingsSlinky.cookieclicker.cookieclickerStrings.optgroup
import typingsSlinky.cookieclicker.cookieclickerStrings.option
import typingsSlinky.cookieclicker.cookieclickerStrings.output
import typingsSlinky.cookieclicker.cookieclickerStrings.p
import typingsSlinky.cookieclicker.cookieclickerStrings.param
import typingsSlinky.cookieclicker.cookieclickerStrings.paste
import typingsSlinky.cookieclicker.cookieclickerStrings.path
import typingsSlinky.cookieclicker.cookieclickerStrings.pattern
import typingsSlinky.cookieclicker.cookieclickerStrings.pause
import typingsSlinky.cookieclicker.cookieclickerStrings.picture
import typingsSlinky.cookieclicker.cookieclickerStrings.play
import typingsSlinky.cookieclicker.cookieclickerStrings.playing
import typingsSlinky.cookieclicker.cookieclickerStrings.pointercancel
import typingsSlinky.cookieclicker.cookieclickerStrings.pointerdown
import typingsSlinky.cookieclicker.cookieclickerStrings.pointerenter
import typingsSlinky.cookieclicker.cookieclickerStrings.pointerleave
import typingsSlinky.cookieclicker.cookieclickerStrings.pointermove
import typingsSlinky.cookieclicker.cookieclickerStrings.pointerout
import typingsSlinky.cookieclicker.cookieclickerStrings.pointerover
import typingsSlinky.cookieclicker.cookieclickerStrings.pointerup
import typingsSlinky.cookieclicker.cookieclickerStrings.polygon
import typingsSlinky.cookieclicker.cookieclickerStrings.polyline
import typingsSlinky.cookieclicker.cookieclickerStrings.pre
import typingsSlinky.cookieclicker.cookieclickerStrings.progress
import typingsSlinky.cookieclicker.cookieclickerStrings.q
import typingsSlinky.cookieclicker.cookieclickerStrings.radialGradient
import typingsSlinky.cookieclicker.cookieclickerStrings.ratechange
import typingsSlinky.cookieclicker.cookieclickerStrings.rect
import typingsSlinky.cookieclicker.cookieclickerStrings.reset
import typingsSlinky.cookieclicker.cookieclickerStrings.resize
import typingsSlinky.cookieclicker.cookieclickerStrings.rp
import typingsSlinky.cookieclicker.cookieclickerStrings.rt
import typingsSlinky.cookieclicker.cookieclickerStrings.ruby
import typingsSlinky.cookieclicker.cookieclickerStrings.s
import typingsSlinky.cookieclicker.cookieclickerStrings.samp
import typingsSlinky.cookieclicker.cookieclickerStrings.script
import typingsSlinky.cookieclicker.cookieclickerStrings.scroll
import typingsSlinky.cookieclicker.cookieclickerStrings.section
import typingsSlinky.cookieclicker.cookieclickerStrings.securitypolicyviolation
import typingsSlinky.cookieclicker.cookieclickerStrings.seeked
import typingsSlinky.cookieclicker.cookieclickerStrings.seeking
import typingsSlinky.cookieclicker.cookieclickerStrings.select
import typingsSlinky.cookieclicker.cookieclickerStrings.selectionchange
import typingsSlinky.cookieclicker.cookieclickerStrings.selectstart
import typingsSlinky.cookieclicker.cookieclickerStrings.slot
import typingsSlinky.cookieclicker.cookieclickerStrings.small
import typingsSlinky.cookieclicker.cookieclickerStrings.source
import typingsSlinky.cookieclicker.cookieclickerStrings.span
import typingsSlinky.cookieclicker.cookieclickerStrings.stalled
import typingsSlinky.cookieclicker.cookieclickerStrings.stop
import typingsSlinky.cookieclicker.cookieclickerStrings.strong
import typingsSlinky.cookieclicker.cookieclickerStrings.sub
import typingsSlinky.cookieclicker.cookieclickerStrings.submit
import typingsSlinky.cookieclicker.cookieclickerStrings.summary
import typingsSlinky.cookieclicker.cookieclickerStrings.sup
import typingsSlinky.cookieclicker.cookieclickerStrings.suspend
import typingsSlinky.cookieclicker.cookieclickerStrings.svg
import typingsSlinky.cookieclicker.cookieclickerStrings.switch
import typingsSlinky.cookieclicker.cookieclickerStrings.symbol
import typingsSlinky.cookieclicker.cookieclickerStrings.table
import typingsSlinky.cookieclicker.cookieclickerStrings.tbody
import typingsSlinky.cookieclicker.cookieclickerStrings.td
import typingsSlinky.cookieclicker.cookieclickerStrings.template
import typingsSlinky.cookieclicker.cookieclickerStrings.text
import typingsSlinky.cookieclicker.cookieclickerStrings.textPath
import typingsSlinky.cookieclicker.cookieclickerStrings.textarea
import typingsSlinky.cookieclicker.cookieclickerStrings.tfoot
import typingsSlinky.cookieclicker.cookieclickerStrings.th
import typingsSlinky.cookieclicker.cookieclickerStrings.thead
import typingsSlinky.cookieclicker.cookieclickerStrings.time
import typingsSlinky.cookieclicker.cookieclickerStrings.timeupdate
import typingsSlinky.cookieclicker.cookieclickerStrings.title
import typingsSlinky.cookieclicker.cookieclickerStrings.toggle
import typingsSlinky.cookieclicker.cookieclickerStrings.touchcancel
import typingsSlinky.cookieclicker.cookieclickerStrings.touchend
import typingsSlinky.cookieclicker.cookieclickerStrings.touchmove
import typingsSlinky.cookieclicker.cookieclickerStrings.touchstart
import typingsSlinky.cookieclicker.cookieclickerStrings.tr
import typingsSlinky.cookieclicker.cookieclickerStrings.track
import typingsSlinky.cookieclicker.cookieclickerStrings.transitioncancel
import typingsSlinky.cookieclicker.cookieclickerStrings.transitionend
import typingsSlinky.cookieclicker.cookieclickerStrings.transitionrun
import typingsSlinky.cookieclicker.cookieclickerStrings.transitionstart
import typingsSlinky.cookieclicker.cookieclickerStrings.tspan
import typingsSlinky.cookieclicker.cookieclickerStrings.u
import typingsSlinky.cookieclicker.cookieclickerStrings.ul
import typingsSlinky.cookieclicker.cookieclickerStrings.use
import typingsSlinky.cookieclicker.cookieclickerStrings.video
import typingsSlinky.cookieclicker.cookieclickerStrings.view
import typingsSlinky.cookieclicker.cookieclickerStrings.volumechange
import typingsSlinky.cookieclicker.cookieclickerStrings.waiting
import typingsSlinky.cookieclicker.cookieclickerStrings.wbr
import typingsSlinky.cookieclicker.cookieclickerStrings.webgl
import typingsSlinky.cookieclicker.cookieclickerStrings.webgl2
import typingsSlinky.cookieclicker.cookieclickerStrings.wheel
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.Animation
import typingsSlinky.std.BlobCallback
import typingsSlinky.std.CanvasRenderingContext2DSettings
import typingsSlinky.std.ChildNode
import typingsSlinky.std.DOMRect
import typingsSlinky.std.DOMRectList
import typingsSlinky.std.DOMStringMap
import typingsSlinky.std.EventListenerOrEventListenerObject
import typingsSlinky.std.FocusOptions
import typingsSlinky.std.FullscreenOptions
import typingsSlinky.std.GetRootNodeOptions
import typingsSlinky.std.HTMLAppletElement
import typingsSlinky.std.HTMLBaseFontElement
import typingsSlinky.std.HTMLCollectionOf
import typingsSlinky.std.HTMLDataElement
import typingsSlinky.std.HTMLDetailsElement
import typingsSlinky.std.HTMLDialogElement
import typingsSlinky.std.HTMLDirectoryElement
import typingsSlinky.std.HTMLFontElement
import typingsSlinky.std.HTMLFrameElement
import typingsSlinky.std.HTMLFrameSetElement
import typingsSlinky.std.HTMLMarqueeElement
import typingsSlinky.std.HTMLMeterElement
import typingsSlinky.std.HTMLOutputElement
import typingsSlinky.std.HTMLPictureElement
import typingsSlinky.std.HTMLSlotElement
import typingsSlinky.std.HTMLTableDataCellElement
import typingsSlinky.std.HTMLTableHeaderCellElement
import typingsSlinky.std.HTMLTemplateElement
import typingsSlinky.std.HTMLTimeElement
import typingsSlinky.std.ImageBitmapRenderingContext
import typingsSlinky.std.ImageBitmapRenderingContextSettings
import typingsSlinky.std.InsertPosition
import typingsSlinky.std.Keyframe
import typingsSlinky.std.KeyframeAnimationOptions
import typingsSlinky.std.OffscreenCanvas
import typingsSlinky.std.OnErrorEventHandler
import typingsSlinky.std.PropertyIndexedKeyframes
import typingsSlinky.std.RenderingContext
import typingsSlinky.std.SVGForeignObjectElement
import typingsSlinky.std.ScrollIntoViewOptions
import typingsSlinky.std.ScrollToOptions
import typingsSlinky.std.SecurityPolicyViolationEvent
import typingsSlinky.std.ShadowRoot
import typingsSlinky.std.ShadowRootInit
import typingsSlinky.std.WebGL2RenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bank extends StObject {
    
    var Bank: MinigameObject[StocksMinigame] = js.native
    
    var Farm: MinigameObject[GardenMinigame] = js.native
    
    var Temple: MinigameObject[PantheonMinigame] = js.native
    
    var `Wizard tower`: MinigameObject[GrimoireMinigame] = js.native
  }
  object Bank {
    
    @scala.inline
    def apply(
      Bank: MinigameObject[StocksMinigame],
      Farm: MinigameObject[GardenMinigame],
      Temple: MinigameObject[PantheonMinigame],
      `Wizard tower`: MinigameObject[GrimoireMinigame]
    ): Bank = {
      val __obj = js.Dynamic.literal(Bank = Bank.asInstanceOf[js.Any], Farm = Farm.asInstanceOf[js.Any], Temple = Temple.asInstanceOf[js.Any])
      __obj.updateDynamic("Wizard tower")((`Wizard tower`).asInstanceOf[js.Any])
      __obj.asInstanceOf[Bank]
    }
    
    @scala.inline
    implicit class BankMutableBuilder[Self <: Bank] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBank(value: MinigameObject[StocksMinigame]): Self = StObject.set(x, "Bank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFarm(value: MinigameObject[GardenMinigame]): Self = StObject.set(x, "Farm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemple(value: MinigameObject[PantheonMinigame]): Self = StObject.set(x, "Temple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWizard tower`(value: MinigameObject[GrimoireMinigame]): Self = StObject.set(x, "Wizard tower", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cost extends StObject {
    
    /**
      * The overridden cost of the spell
      */
    var cost: js.UndefOr[Double] = js.native
    
    /**
      * The additional fail chance of the spell
      */
    var failChanceAdd: js.UndefOr[Double] = js.native
    
    /**
      * The minimum the fail chance of the spell
      */
    var failChanceMax: js.UndefOr[Double] = js.native
    
    /**
      * The multiplier of the fail chance of the spell
      */
    var failChanceMult: js.UndefOr[Double] = js.native
    
    /**
      * The overridden fail chance of the spell
      */
    var failChanceSet: js.UndefOr[Double] = js.native
    
    /**
      * If true, the spell isn't counted towards the spell count
      */
    var passthrough: js.UndefOr[Boolean] = js.native
  }
  object Cost {
    
    @scala.inline
    def apply(): Cost = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cost]
    }
    
    @scala.inline
    implicit class CostMutableBuilder[Self <: Cost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
      
      @scala.inline
      def setFailChanceAdd(value: Double): Self = StObject.set(x, "failChanceAdd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailChanceAddUndefined: Self = StObject.set(x, "failChanceAdd", js.undefined)
      
      @scala.inline
      def setFailChanceMax(value: Double): Self = StObject.set(x, "failChanceMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailChanceMaxUndefined: Self = StObject.set(x, "failChanceMax", js.undefined)
      
      @scala.inline
      def setFailChanceMult(value: Double): Self = StObject.set(x, "failChanceMult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailChanceMultUndefined: Self = StObject.set(x, "failChanceMult", js.undefined)
      
      @scala.inline
      def setFailChanceSet(value: Double): Self = StObject.set(x, "failChanceSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailChanceSetUndefined: Self = StObject.set(x, "failChanceSet", js.undefined)
      
      @scala.inline
      def setPassthrough(value: Boolean): Self = StObject.set(x, "passthrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassthroughUndefined: Self = StObject.set(x, "passthrough", js.undefined)
    }
  }
  
  @js.native
  trait Frame extends StObject {
    
    var frame: Double = js.native
    
    var id: Double = js.native
    
    var pic: String = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  object Frame {
    
    @scala.inline
    def apply(frame: Double, id: Double, pic: String, x: Double, y: Double, z: Double): Frame = {
      val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Frame]
    }
    
    @scala.inline
    implicit class FrameMutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrame(value: Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPic(value: String): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.HTMLCanvasElement & {  width :8,   height :8,   alt :'blank'} */
  @js.native
  trait HTMLCanvasElementwidth8he extends StObject {
    
    val ATTRIBUTE_NODE: Double = js.native
    
    /**
      * node is a CDATASection node.
      */
    val CDATA_SECTION_NODE: Double = js.native
    
    /**
      * node is a Comment node.
      */
    val COMMENT_NODE: Double = js.native
    
    /**
      * node is a DocumentFragment node.
      */
    val DOCUMENT_FRAGMENT_NODE: Double = js.native
    
    /**
      * node is a document.
      */
    val DOCUMENT_NODE: Double = js.native
    
    /**
      * Set when other is a descendant of node.
      */
    val DOCUMENT_POSITION_CONTAINED_BY: Double = js.native
    
    /**
      * Set when other is an ancestor of node.
      */
    val DOCUMENT_POSITION_CONTAINS: Double = js.native
    
    /**
      * Set when node and other are not in the same tree.
      */
    val DOCUMENT_POSITION_DISCONNECTED: Double = js.native
    
    /**
      * Set when other is following node.
      */
    val DOCUMENT_POSITION_FOLLOWING: Double = js.native
    
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double = js.native
    
    /**
      * Set when other is preceding node.
      */
    val DOCUMENT_POSITION_PRECEDING: Double = js.native
    
    /**
      * node is a doctype.
      */
    val DOCUMENT_TYPE_NODE: Double = js.native
    
    /**
      * node is an element.
      */
    val ELEMENT_NODE: Double = js.native
    
    val ENTITY_NODE: Double = js.native
    
    val ENTITY_REFERENCE_NODE: Double = js.native
    
    val NOTATION_NODE: Double = js.native
    
    /**
      * node is a ProcessingInstruction node.
      */
    val PROCESSING_INSTRUCTION_NODE: Double = js.native
    
    /**
      * node is a Text node.
      */
    val TEXT_NODE: Double = js.native
    
    var accessKey: String = js.native
    
    val accessKeyLabel: String = js.native
    
    /**
      * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
      * 
      * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
      * 
      * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
      * 
      * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
      * 
      * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
      * 
      * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
      */
    def addEventListener(`type`: String): Unit = js.native
    def addEventListener(`type`: String, listener: Null, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(`type`: animationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(`type`: dragexit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(`type`: pointercancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    /**
      * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
      * 
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def after(nodes: (Node | String)*): Unit = js.native
    
    var alt: blank = js.native
    
    def animate(): Animation = js.native
    def animate(keyframes: js.Array[Keyframe]): Animation = js.native
    def animate(keyframes: js.Array[Keyframe], options: Double): Animation = js.native
    def animate(keyframes: js.Array[Keyframe], options: KeyframeAnimationOptions): Animation = js.native
    def animate(keyframes: Null, options: Double): Animation = js.native
    def animate(keyframes: Null, options: KeyframeAnimationOptions): Animation = js.native
    def animate(keyframes: PropertyIndexedKeyframes): Animation = js.native
    def animate(keyframes: PropertyIndexedKeyframes, options: Double): Animation = js.native
    def animate(keyframes: PropertyIndexedKeyframes, options: KeyframeAnimationOptions): Animation = js.native
    
    /**
      * Inserts nodes after the last child of node, while replacing strings in nodes with equivalent Text nodes.
      * 
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def append(nodes: (Node | String)*): Unit = js.native
    
    def appendChild[T /* <: Node */](newChild: T): T = js.native
    
    val assignedSlot: HTMLSlotElement | Null = js.native
    
    /**
      * Creates a shadow root for element and returns it.
      */
    def attachShadow(init: ShadowRootInit): ShadowRoot = js.native
    
    val attributes: NamedNodeMap = js.native
    
    var autocapitalize: String = js.native
    
    var autofocus: Boolean = js.native
    
    /**
      * Returns node's node document's document base URL.
      */
    val baseURI: String = js.native
    
    /**
      * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
      * 
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def before(nodes: (Node | String)*): Unit = js.native
    
    def blur(): Unit = js.native
    
    val childElementCount: Double = js.native
    
    /**
      * Returns the children.
      */
    val childNodes: NodeListOf[ChildNode with Node] = js.native
    
    /**
      * Returns the child elements.
      */
    val children: HTMLCollection = js.native
    
    /**
      * Allows for manipulation of element's class content attribute as a set of whitespace-separated tokens through a DOMTokenList object.
      */
    val classList: DOMTokenList = js.native
    
    /**
      * Returns the value of element's class content attribute. Can be set to change it.
      */
    var className: String = js.native
    
    def click(): Unit = js.native
    
    val clientHeight: Double = js.native
    
    val clientLeft: Double = js.native
    
    val clientTop: Double = js.native
    
    val clientWidth: Double = js.native
    
    /**
      * Returns a copy of node. If deep is true, the copy also includes the node's descendants.
      */
    def cloneNode(): Node = js.native
    def cloneNode(deep: Boolean): Node = js.native
    
    def closest[E /* <: Element */](selector: String): E | Null = js.native
    /**
      * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
      */
    @JSName("closest")
    def closest_a(selector: a): HTMLAnchorElement | Null = js.native
    @JSName("closest")
    def closest_abbr(selector: abbr): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_address(selector: address): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_applet(selector: applet): HTMLAppletElement | Null = js.native
    @JSName("closest")
    def closest_area(selector: area): HTMLAreaElement | Null = js.native
    @JSName("closest")
    def closest_article(selector: article): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_aside(selector: aside): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_audio(selector: audio): HTMLAudioElement | Null = js.native
    @JSName("closest")
    def closest_b(selector: b): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_base(selector: base): HTMLBaseElement | Null = js.native
    @JSName("closest")
    def closest_basefont(selector: basefont): HTMLBaseFontElement | Null = js.native
    @JSName("closest")
    def closest_bdi(selector: bdi): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_bdo(selector: bdo): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_blockquote(selector: blockquote): HTMLQuoteElement | Null = js.native
    @JSName("closest")
    def closest_body(selector: body): HTMLBodyElement | Null = js.native
    @JSName("closest")
    def closest_br(selector: br): HTMLBRElement | Null = js.native
    @JSName("closest")
    def closest_button(selector: button): HTMLButtonElement | Null = js.native
    @JSName("closest")
    def closest_canvas(selector: canvas): HTMLCanvasElement | Null = js.native
    @JSName("closest")
    def closest_caption(selector: caption): HTMLTableCaptionElement | Null = js.native
    @JSName("closest")
    def closest_circle(selector: circle): SVGCircleElement | Null = js.native
    @JSName("closest")
    def closest_cite(selector: cite): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_clipPath(selector: clipPath): SVGClipPathElement | Null = js.native
    @JSName("closest")
    def closest_code(selector: code): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_col(selector: col): HTMLTableColElement | Null = js.native
    @JSName("closest")
    def closest_colgroup(selector: colgroup): HTMLTableColElement | Null = js.native
    @JSName("closest")
    def closest_data(selector: data): HTMLDataElement | Null = js.native
    @JSName("closest")
    def closest_datalist(selector: datalist): HTMLDataListElement | Null = js.native
    @JSName("closest")
    def closest_dd(selector: dd): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_defs(selector: defs): SVGDefsElement | Null = js.native
    @JSName("closest")
    def closest_del(selector: del): HTMLModElement | Null = js.native
    @JSName("closest")
    def closest_desc(selector: desc): SVGDescElement | Null = js.native
    @JSName("closest")
    def closest_details(selector: details): HTMLDetailsElement | Null = js.native
    @JSName("closest")
    def closest_dfn(selector: dfn): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_dialog(selector: dialog): HTMLDialogElement | Null = js.native
    @JSName("closest")
    def closest_dir(selector: dir): HTMLDirectoryElement | Null = js.native
    @JSName("closest")
    def closest_div(selector: div): HTMLDivElement | Null = js.native
    @JSName("closest")
    def closest_dl(selector: dl): HTMLDListElement | Null = js.native
    @JSName("closest")
    def closest_dt(selector: dt): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_ellipse(selector: ellipse): SVGEllipseElement | Null = js.native
    @JSName("closest")
    def closest_em(selector: em): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_embed(selector: embed): HTMLEmbedElement | Null = js.native
    @JSName("closest")
    def closest_feBlend(selector: feBlend): SVGFEBlendElement | Null = js.native
    @JSName("closest")
    def closest_feColorMatrix(selector: feColorMatrix): SVGFEColorMatrixElement | Null = js.native
    @JSName("closest")
    def closest_feComponentTransfer(selector: feComponentTransfer): SVGFEComponentTransferElement | Null = js.native
    @JSName("closest")
    def closest_feComposite(selector: feComposite): SVGFECompositeElement | Null = js.native
    @JSName("closest")
    def closest_feConvolveMatrix(selector: feConvolveMatrix): SVGFEConvolveMatrixElement | Null = js.native
    @JSName("closest")
    def closest_feDiffuseLighting(selector: feDiffuseLighting): SVGFEDiffuseLightingElement | Null = js.native
    @JSName("closest")
    def closest_feDisplacementMap(selector: feDisplacementMap): SVGFEDisplacementMapElement | Null = js.native
    @JSName("closest")
    def closest_feDistantLight(selector: feDistantLight): SVGFEDistantLightElement | Null = js.native
    @JSName("closest")
    def closest_feFlood(selector: feFlood): SVGFEFloodElement | Null = js.native
    @JSName("closest")
    def closest_feFuncA(selector: feFuncA): SVGFEFuncAElement | Null = js.native
    @JSName("closest")
    def closest_feFuncB(selector: feFuncB): SVGFEFuncBElement | Null = js.native
    @JSName("closest")
    def closest_feFuncG(selector: feFuncG): SVGFEFuncGElement | Null = js.native
    @JSName("closest")
    def closest_feFuncR(selector: feFuncR): SVGFEFuncRElement | Null = js.native
    @JSName("closest")
    def closest_feGaussianBlur(selector: feGaussianBlur): SVGFEGaussianBlurElement | Null = js.native
    @JSName("closest")
    def closest_feImage(selector: feImage): SVGFEImageElement | Null = js.native
    @JSName("closest")
    def closest_feMerge(selector: feMerge): SVGFEMergeElement | Null = js.native
    @JSName("closest")
    def closest_feMergeNode(selector: feMergeNode): SVGFEMergeNodeElement | Null = js.native
    @JSName("closest")
    def closest_feMorphology(selector: feMorphology): SVGFEMorphologyElement | Null = js.native
    @JSName("closest")
    def closest_feOffset(selector: feOffset): SVGFEOffsetElement | Null = js.native
    @JSName("closest")
    def closest_fePointLight(selector: fePointLight): SVGFEPointLightElement | Null = js.native
    @JSName("closest")
    def closest_feSpecularLighting(selector: feSpecularLighting): SVGFESpecularLightingElement | Null = js.native
    @JSName("closest")
    def closest_feSpotLight(selector: feSpotLight): SVGFESpotLightElement | Null = js.native
    @JSName("closest")
    def closest_feTile(selector: feTile): SVGFETileElement | Null = js.native
    @JSName("closest")
    def closest_feTurbulence(selector: feTurbulence): SVGFETurbulenceElement | Null = js.native
    @JSName("closest")
    def closest_fieldset(selector: fieldset): HTMLFieldSetElement | Null = js.native
    @JSName("closest")
    def closest_figcaption(selector: figcaption): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_figure(selector: figure): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_filter(selector: filter): SVGFilterElement | Null = js.native
    @JSName("closest")
    def closest_font(selector: font): HTMLFontElement | Null = js.native
    @JSName("closest")
    def closest_footer(selector: footer): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_foreignObject(selector: foreignObject): SVGForeignObjectElement | Null = js.native
    @JSName("closest")
    def closest_form(selector: form): HTMLFormElement | Null = js.native
    @JSName("closest")
    def closest_frame(selector: frame): HTMLFrameElement | Null = js.native
    @JSName("closest")
    def closest_frameset(selector: frameset): HTMLFrameSetElement | Null = js.native
    @JSName("closest")
    def closest_g(selector: g): SVGGElement | Null = js.native
    @JSName("closest")
    def closest_h1(selector: h1): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h2(selector: h2): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h3(selector: h3): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h4(selector: h4): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h5(selector: h5): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_h6(selector: h6): HTMLHeadingElement | Null = js.native
    @JSName("closest")
    def closest_head(selector: head): HTMLHeadElement | Null = js.native
    @JSName("closest")
    def closest_header(selector: header): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_hgroup(selector: hgroup): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_hr(selector: hr): HTMLHRElement | Null = js.native
    @JSName("closest")
    def closest_html(selector: html): HTMLHtmlElement | Null = js.native
    @JSName("closest")
    def closest_i(selector: i): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_iframe(selector: iframe): HTMLIFrameElement | Null = js.native
    @JSName("closest")
    def closest_image(selector: image): SVGImageElement | Null = js.native
    @JSName("closest")
    def closest_img(selector: img): HTMLImageElement | Null = js.native
    @JSName("closest")
    def closest_input(selector: input): HTMLInputElement | Null = js.native
    @JSName("closest")
    def closest_ins(selector: ins): HTMLModElement | Null = js.native
    @JSName("closest")
    def closest_kbd(selector: kbd): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_label(selector: label): HTMLLabelElement | Null = js.native
    @JSName("closest")
    def closest_legend(selector: legend): HTMLLegendElement | Null = js.native
    @JSName("closest")
    def closest_li(selector: li): HTMLLIElement | Null = js.native
    @JSName("closest")
    def closest_line(selector: line): SVGLineElement | Null = js.native
    @JSName("closest")
    def closest_linearGradient(selector: linearGradient): SVGLinearGradientElement | Null = js.native
    @JSName("closest")
    def closest_link(selector: link): HTMLLinkElement | Null = js.native
    @JSName("closest")
    def closest_main(selector: main): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_map(selector: map): HTMLMapElement | Null = js.native
    @JSName("closest")
    def closest_mark(selector: mark): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_marker(selector: marker): SVGMarkerElement | Null = js.native
    @JSName("closest")
    def closest_marquee(selector: marquee): HTMLMarqueeElement | Null = js.native
    @JSName("closest")
    def closest_mask(selector: mask): SVGMaskElement | Null = js.native
    @JSName("closest")
    def closest_menu(selector: menu): HTMLMenuElement | Null = js.native
    @JSName("closest")
    def closest_meta(selector: meta): HTMLMetaElement | Null = js.native
    @JSName("closest")
    def closest_metadata(selector: metadata): SVGMetadataElement | Null = js.native
    @JSName("closest")
    def closest_meter(selector: meter): HTMLMeterElement | Null = js.native
    @JSName("closest")
    def closest_nav(selector: nav): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_noscript(selector: noscript): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_object(selector: `object`): HTMLObjectElement | Null = js.native
    @JSName("closest")
    def closest_ol(selector: ol): HTMLOListElement | Null = js.native
    @JSName("closest")
    def closest_optgroup(selector: optgroup): HTMLOptGroupElement | Null = js.native
    @JSName("closest")
    def closest_option(selector: option): HTMLOptionElement | Null = js.native
    @JSName("closest")
    def closest_output(selector: output): HTMLOutputElement | Null = js.native
    @JSName("closest")
    def closest_p(selector: p): HTMLParagraphElement | Null = js.native
    @JSName("closest")
    def closest_param(selector: param): HTMLParamElement | Null = js.native
    @JSName("closest")
    def closest_path(selector: path): SVGPathElement | Null = js.native
    @JSName("closest")
    def closest_pattern(selector: pattern): SVGPatternElement | Null = js.native
    @JSName("closest")
    def closest_picture(selector: picture): HTMLPictureElement | Null = js.native
    @JSName("closest")
    def closest_polygon(selector: polygon): SVGPolygonElement | Null = js.native
    @JSName("closest")
    def closest_polyline(selector: polyline): SVGPolylineElement | Null = js.native
    @JSName("closest")
    def closest_pre(selector: pre): HTMLPreElement | Null = js.native
    @JSName("closest")
    def closest_progress(selector: progress): HTMLProgressElement | Null = js.native
    @JSName("closest")
    def closest_q(selector: q): HTMLQuoteElement | Null = js.native
    @JSName("closest")
    def closest_radialGradient(selector: radialGradient): SVGRadialGradientElement | Null = js.native
    @JSName("closest")
    def closest_rect(selector: rect): SVGRectElement | Null = js.native
    @JSName("closest")
    def closest_rp(selector: rp): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_rt(selector: rt): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_ruby(selector: ruby): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_s(selector: s): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_samp(selector: samp): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_script(selector: script): HTMLScriptElement | Null = js.native
    @JSName("closest")
    def closest_section(selector: section): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_select(selector: select): HTMLSelectElement | Null = js.native
    @JSName("closest")
    def closest_slot(selector: slot): HTMLSlotElement | Null = js.native
    @JSName("closest")
    def closest_small(selector: small): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_source(selector: source): HTMLSourceElement | Null = js.native
    @JSName("closest")
    def closest_span(selector: span): HTMLSpanElement | Null = js.native
    @JSName("closest")
    def closest_stop(selector: stop): SVGStopElement | Null = js.native
    @JSName("closest")
    def closest_strong(selector: strong): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_style(selector: typingsSlinky.cookieclicker.cookieclickerStrings.style): HTMLStyleElement | Null = js.native
    @JSName("closest")
    def closest_sub(selector: sub): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_summary(selector: summary): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_sup(selector: sup): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_svg(selector: svg): SVGSVGElement | Null = js.native
    @JSName("closest")
    def closest_switch(selector: switch): SVGSwitchElement | Null = js.native
    @JSName("closest")
    def closest_symbol(selector: symbol): SVGSymbolElement | Null = js.native
    @JSName("closest")
    def closest_table(selector: table): HTMLTableElement | Null = js.native
    @JSName("closest")
    def closest_tbody(selector: tbody): HTMLTableSectionElement | Null = js.native
    @JSName("closest")
    def closest_td(selector: td): HTMLTableDataCellElement | Null = js.native
    @JSName("closest")
    def closest_template(selector: template): HTMLTemplateElement | Null = js.native
    @JSName("closest")
    def closest_text(selector: text): SVGTextElement | Null = js.native
    @JSName("closest")
    def closest_textPath(selector: textPath): SVGTextPathElement | Null = js.native
    @JSName("closest")
    def closest_textarea(selector: textarea): HTMLTextAreaElement | Null = js.native
    @JSName("closest")
    def closest_tfoot(selector: tfoot): HTMLTableSectionElement | Null = js.native
    @JSName("closest")
    def closest_th(selector: th): HTMLTableHeaderCellElement | Null = js.native
    @JSName("closest")
    def closest_thead(selector: thead): HTMLTableSectionElement | Null = js.native
    @JSName("closest")
    def closest_time(selector: time): HTMLTimeElement | Null = js.native
    @JSName("closest")
    def closest_title(selector: title): HTMLTitleElement | Null = js.native
    @JSName("closest")
    def closest_tr(selector: tr): HTMLTableRowElement | Null = js.native
    @JSName("closest")
    def closest_track(selector: track): HTMLTrackElement | Null = js.native
    @JSName("closest")
    def closest_tspan(selector: tspan): SVGTSpanElement | Null = js.native
    @JSName("closest")
    def closest_u(selector: u): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_ul(selector: ul): HTMLUListElement | Null = js.native
    @JSName("closest")
    def closest_use(selector: use): SVGUseElement | Null = js.native
    @JSName("closest")
    def closest_var(selector: `var`): HTMLElement | Null = js.native
    @JSName("closest")
    def closest_video(selector: video): HTMLVideoElement | Null = js.native
    @JSName("closest")
    def closest_view(selector: view): SVGViewElement | Null = js.native
    @JSName("closest")
    def closest_wbr(selector: wbr): HTMLElement | Null = js.native
    
    /**
      * Returns a bitmask indicating the position of other relative to node.
      */
    def compareDocumentPosition(other: Node): Double = js.native
    
    /**
      * Returns true if other is an inclusive descendant of node, and false otherwise.
      */
    def contains(): Boolean = js.native
    def contains(other: Node): Boolean = js.native
    
    var contentEditable: String = js.native
    
    val dataset: DOMStringMap = js.native
    
    var dir: String = js.native
    
    /**
      * Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
      */
    def dispatchEvent(event: Event): Boolean = js.native
    
    var draggable: Boolean = js.native
    
    var enterKeyHint: String = js.native
    
    /**
      * Returns the first child.
      */
    val firstChild: ChildNode | Null = js.native
    
    /**
      * Returns the first child that is an element, and null otherwise.
      */
    val firstElementChild: Element | Null = js.native
    
    def focus(): Unit = js.native
    def focus(options: FocusOptions): Unit = js.native
    
    def getAnimations(): js.Array[Animation] = js.native
    
    /**
      * Returns element's first attribute whose qualified name is qualifiedName, and null if there is no such attribute otherwise.
      */
    def getAttribute(qualifiedName: String): String | Null = js.native
    
    /**
      * Returns element's attribute whose namespace is namespace and local name is localName, and null if there is no such attribute otherwise.
      */
    def getAttributeNS(namespace: String, localName: String): String | Null = js.native
    def getAttributeNS(namespace: Null, localName: String): String | Null = js.native
    
    /**
      * Returns the qualified names of all element's attributes. Can contain duplicates.
      */
    def getAttributeNames(): js.Array[String] = js.native
    
    def getAttributeNode(qualifiedName: String): Attr | Null = js.native
    
    def getAttributeNodeNS(namespace: String, localName: String): Attr | Null = js.native
    def getAttributeNodeNS(namespace: Null, localName: String): Attr | Null = js.native
    
    def getBoundingClientRect(): DOMRect = js.native
    
    def getClientRects(): DOMRectList = js.native
    
    def getContext(contextId: String): RenderingContext | Null = js.native
    def getContext(contextId: String, options: js.Any): RenderingContext | Null = js.native
    /**
      * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
      * @param contextId The identifier (ID) of the type of canvas to create. Internet Explorer 9 and Internet Explorer 10 support only a 2-D context using canvas.getContext("2d"); IE11 Preview also supports 3-D or WebGL context using canvas.getContext("experimental-webgl");
      */
    @JSName("getContext")
    def getContext_2d(contextId: `2d`): org.scalajs.dom.raw.CanvasRenderingContext2D | Null = js.native
    @JSName("getContext")
    def getContext_2d(contextId: `2d`, options: CanvasRenderingContext2DSettings): org.scalajs.dom.raw.CanvasRenderingContext2D | Null = js.native
    @JSName("getContext")
    def getContext_bitmaprenderer(contextId: bitmaprenderer): ImageBitmapRenderingContext | Null = js.native
    @JSName("getContext")
    def getContext_bitmaprenderer(contextId: bitmaprenderer, options: ImageBitmapRenderingContextSettings): ImageBitmapRenderingContext | Null = js.native
    @JSName("getContext")
    def getContext_webgl(contextId: webgl): WebGLRenderingContext | Null = js.native
    @JSName("getContext")
    def getContext_webgl(contextId: webgl, options: WebGLContextAttributes): WebGLRenderingContext | Null = js.native
    @JSName("getContext")
    def getContext_webgl2(contextId: webgl2): WebGL2RenderingContext | Null = js.native
    @JSName("getContext")
    def getContext_webgl2(contextId: webgl2, options: WebGLContextAttributes): WebGL2RenderingContext | Null = js.native
    
    /**
      * Returns a HTMLCollection of the elements in the object on which the method was invoked (a document or an element) that have all the classes given by classNames. The classNames argument is interpreted as a space-separated list of classes.
      */
    def getElementsByClassName(classNames: String): HTMLCollectionOf[Element] = js.native
    
    def getElementsByTagName(qualifiedName: String): HTMLCollectionOf[Element] = js.native
    
    def getElementsByTagNameNS(namespaceURI: String, localName: String): HTMLCollectionOf[Element] = js.native
    @JSName("getElementsByTagNameNS")
    def getElementsByTagNameNS_httpwwww3org1999xhtml(namespaceURI: httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, localName: String): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagNameNS")
    def getElementsByTagNameNS_httpwwww3org2000svg(namespaceURI: httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg, localName: String): HTMLCollectionOf[SVGElement] = js.native
    
    @JSName("getElementsByTagName")
    def getElementsByTagName_a(qualifiedName: a): HTMLCollectionOf[HTMLAnchorElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_abbr(qualifiedName: abbr): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_address(qualifiedName: address): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_applet(qualifiedName: applet): HTMLCollectionOf[HTMLAppletElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_area(qualifiedName: area): HTMLCollectionOf[HTMLAreaElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_article(qualifiedName: article): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_aside(qualifiedName: aside): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_audio(qualifiedName: audio): HTMLCollectionOf[HTMLAudioElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_b(qualifiedName: b): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_base(qualifiedName: base): HTMLCollectionOf[HTMLBaseElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_basefont(qualifiedName: basefont): HTMLCollectionOf[HTMLBaseFontElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_bdi(qualifiedName: bdi): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_bdo(qualifiedName: bdo): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_blockquote(qualifiedName: blockquote): HTMLCollectionOf[HTMLQuoteElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_body(qualifiedName: body): HTMLCollectionOf[HTMLBodyElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_br(qualifiedName: br): HTMLCollectionOf[HTMLBRElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_button(qualifiedName: button): HTMLCollectionOf[HTMLButtonElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_canvas(qualifiedName: canvas): HTMLCollectionOf[HTMLCanvasElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_caption(qualifiedName: caption): HTMLCollectionOf[HTMLTableCaptionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_circle(qualifiedName: circle): HTMLCollectionOf[SVGCircleElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_cite(qualifiedName: cite): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_clipPath(qualifiedName: clipPath): HTMLCollectionOf[SVGClipPathElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_code(qualifiedName: code): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_col(qualifiedName: col): HTMLCollectionOf[HTMLTableColElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_colgroup(qualifiedName: colgroup): HTMLCollectionOf[HTMLTableColElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_data(qualifiedName: data): HTMLCollectionOf[HTMLDataElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_datalist(qualifiedName: datalist): HTMLCollectionOf[HTMLDataListElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dd(qualifiedName: dd): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_defs(qualifiedName: defs): HTMLCollectionOf[SVGDefsElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_del(qualifiedName: del): HTMLCollectionOf[HTMLModElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_desc(qualifiedName: desc): HTMLCollectionOf[SVGDescElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_details(qualifiedName: details): HTMLCollectionOf[HTMLDetailsElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dfn(qualifiedName: dfn): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dialog(qualifiedName: dialog): HTMLCollectionOf[HTMLDialogElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dir(qualifiedName: dir): HTMLCollectionOf[HTMLDirectoryElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_div(qualifiedName: div): HTMLCollectionOf[HTMLDivElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dl(qualifiedName: dl): HTMLCollectionOf[HTMLDListElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_dt(qualifiedName: dt): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ellipse(qualifiedName: ellipse): HTMLCollectionOf[SVGEllipseElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_em(qualifiedName: em): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_embed(qualifiedName: embed): HTMLCollectionOf[HTMLEmbedElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feBlend(qualifiedName: feBlend): HTMLCollectionOf[SVGFEBlendElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feColorMatrix(qualifiedName: feColorMatrix): HTMLCollectionOf[SVGFEColorMatrixElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feComponentTransfer(qualifiedName: feComponentTransfer): HTMLCollectionOf[SVGFEComponentTransferElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feComposite(qualifiedName: feComposite): HTMLCollectionOf[SVGFECompositeElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feConvolveMatrix(qualifiedName: feConvolveMatrix): HTMLCollectionOf[SVGFEConvolveMatrixElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feDiffuseLighting(qualifiedName: feDiffuseLighting): HTMLCollectionOf[SVGFEDiffuseLightingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feDisplacementMap(qualifiedName: feDisplacementMap): HTMLCollectionOf[SVGFEDisplacementMapElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feDistantLight(qualifiedName: feDistantLight): HTMLCollectionOf[SVGFEDistantLightElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFlood(qualifiedName: feFlood): HTMLCollectionOf[SVGFEFloodElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFuncA(qualifiedName: feFuncA): HTMLCollectionOf[SVGFEFuncAElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFuncB(qualifiedName: feFuncB): HTMLCollectionOf[SVGFEFuncBElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFuncG(qualifiedName: feFuncG): HTMLCollectionOf[SVGFEFuncGElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feFuncR(qualifiedName: feFuncR): HTMLCollectionOf[SVGFEFuncRElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feGaussianBlur(qualifiedName: feGaussianBlur): HTMLCollectionOf[SVGFEGaussianBlurElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feImage(qualifiedName: feImage): HTMLCollectionOf[SVGFEImageElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feMerge(qualifiedName: feMerge): HTMLCollectionOf[SVGFEMergeElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feMergeNode(qualifiedName: feMergeNode): HTMLCollectionOf[SVGFEMergeNodeElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feMorphology(qualifiedName: feMorphology): HTMLCollectionOf[SVGFEMorphologyElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feOffset(qualifiedName: feOffset): HTMLCollectionOf[SVGFEOffsetElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_fePointLight(qualifiedName: fePointLight): HTMLCollectionOf[SVGFEPointLightElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feSpecularLighting(qualifiedName: feSpecularLighting): HTMLCollectionOf[SVGFESpecularLightingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feSpotLight(qualifiedName: feSpotLight): HTMLCollectionOf[SVGFESpotLightElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feTile(qualifiedName: feTile): HTMLCollectionOf[SVGFETileElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_feTurbulence(qualifiedName: feTurbulence): HTMLCollectionOf[SVGFETurbulenceElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_fieldset(qualifiedName: fieldset): HTMLCollectionOf[HTMLFieldSetElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_figcaption(qualifiedName: figcaption): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_figure(qualifiedName: figure): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_filter(qualifiedName: filter): HTMLCollectionOf[SVGFilterElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_font(qualifiedName: font): HTMLCollectionOf[HTMLFontElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_footer(qualifiedName: footer): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_foreignObject(qualifiedName: foreignObject): HTMLCollectionOf[SVGForeignObjectElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_form(qualifiedName: form): HTMLCollectionOf[HTMLFormElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_frame(qualifiedName: frame): HTMLCollectionOf[HTMLFrameElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_frameset(qualifiedName: frameset): HTMLCollectionOf[HTMLFrameSetElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_g(qualifiedName: g): HTMLCollectionOf[SVGGElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h1(qualifiedName: h1): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h2(qualifiedName: h2): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h3(qualifiedName: h3): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h4(qualifiedName: h4): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h5(qualifiedName: h5): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_h6(qualifiedName: h6): HTMLCollectionOf[HTMLHeadingElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_head(qualifiedName: head): HTMLCollectionOf[HTMLHeadElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_header(qualifiedName: header): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_hgroup(qualifiedName: hgroup): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_hr(qualifiedName: hr): HTMLCollectionOf[HTMLHRElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_html(qualifiedName: html): HTMLCollectionOf[HTMLHtmlElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_i(qualifiedName: i): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_iframe(qualifiedName: iframe): HTMLCollectionOf[HTMLIFrameElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_image(qualifiedName: image): HTMLCollectionOf[SVGImageElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_img(qualifiedName: img): HTMLCollectionOf[HTMLImageElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_input(qualifiedName: input): HTMLCollectionOf[HTMLInputElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ins(qualifiedName: ins): HTMLCollectionOf[HTMLModElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_kbd(qualifiedName: kbd): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_label(qualifiedName: label): HTMLCollectionOf[HTMLLabelElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_legend(qualifiedName: legend): HTMLCollectionOf[HTMLLegendElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_li(qualifiedName: li): HTMLCollectionOf[HTMLLIElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_line(qualifiedName: line): HTMLCollectionOf[SVGLineElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_linearGradient(qualifiedName: linearGradient): HTMLCollectionOf[SVGLinearGradientElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_link(qualifiedName: link): HTMLCollectionOf[HTMLLinkElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_main(qualifiedName: main): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_map(qualifiedName: map): HTMLCollectionOf[HTMLMapElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_mark(qualifiedName: mark): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_marker(qualifiedName: marker): HTMLCollectionOf[SVGMarkerElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_marquee(qualifiedName: marquee): HTMLCollectionOf[HTMLMarqueeElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_mask(qualifiedName: mask): HTMLCollectionOf[SVGMaskElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_menu(qualifiedName: menu): HTMLCollectionOf[HTMLMenuElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_meta(qualifiedName: meta): HTMLCollectionOf[HTMLMetaElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_metadata(qualifiedName: metadata): HTMLCollectionOf[SVGMetadataElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_meter(qualifiedName: meter): HTMLCollectionOf[HTMLMeterElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_nav(qualifiedName: nav): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_noscript(qualifiedName: noscript): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_object(qualifiedName: `object`): HTMLCollectionOf[HTMLObjectElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ol(qualifiedName: ol): HTMLCollectionOf[HTMLOListElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_optgroup(qualifiedName: optgroup): HTMLCollectionOf[HTMLOptGroupElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_option(qualifiedName: option): HTMLCollectionOf[HTMLOptionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_output(qualifiedName: output): HTMLCollectionOf[HTMLOutputElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_p(qualifiedName: p): HTMLCollectionOf[HTMLParagraphElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_param(qualifiedName: param): HTMLCollectionOf[HTMLParamElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_path(qualifiedName: path): HTMLCollectionOf[SVGPathElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_pattern(qualifiedName: pattern): HTMLCollectionOf[SVGPatternElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_picture(qualifiedName: picture): HTMLCollectionOf[HTMLPictureElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_polygon(qualifiedName: polygon): HTMLCollectionOf[SVGPolygonElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_polyline(qualifiedName: polyline): HTMLCollectionOf[SVGPolylineElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_pre(qualifiedName: pre): HTMLCollectionOf[HTMLPreElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_progress(qualifiedName: progress): HTMLCollectionOf[HTMLProgressElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_q(qualifiedName: q): HTMLCollectionOf[HTMLQuoteElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_radialGradient(qualifiedName: radialGradient): HTMLCollectionOf[SVGRadialGradientElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_rect(qualifiedName: rect): HTMLCollectionOf[SVGRectElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_rp(qualifiedName: rp): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_rt(qualifiedName: rt): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ruby(qualifiedName: ruby): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_s(qualifiedName: s): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_samp(qualifiedName: samp): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_script(qualifiedName: script): HTMLCollectionOf[HTMLScriptElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_section(qualifiedName: section): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_select(qualifiedName: select): HTMLCollectionOf[HTMLSelectElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_slot(qualifiedName: slot): HTMLCollectionOf[HTMLSlotElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_small(qualifiedName: small): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_source(qualifiedName: source): HTMLCollectionOf[HTMLSourceElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_span(qualifiedName: span): HTMLCollectionOf[HTMLSpanElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_stop(qualifiedName: stop): HTMLCollectionOf[SVGStopElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_strong(qualifiedName: strong): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_style(qualifiedName: typingsSlinky.cookieclicker.cookieclickerStrings.style): HTMLCollectionOf[HTMLStyleElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_sub(qualifiedName: sub): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_summary(qualifiedName: summary): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_sup(qualifiedName: sup): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_svg(qualifiedName: svg): HTMLCollectionOf[SVGSVGElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_switch(qualifiedName: switch): HTMLCollectionOf[SVGSwitchElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_symbol(qualifiedName: symbol): HTMLCollectionOf[SVGSymbolElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_table(qualifiedName: table): HTMLCollectionOf[HTMLTableElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_tbody(qualifiedName: tbody): HTMLCollectionOf[HTMLTableSectionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_td(qualifiedName: td): HTMLCollectionOf[HTMLTableDataCellElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_template(qualifiedName: template): HTMLCollectionOf[HTMLTemplateElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_text(qualifiedName: text): HTMLCollectionOf[SVGTextElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_textPath(qualifiedName: textPath): HTMLCollectionOf[SVGTextPathElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_textarea(qualifiedName: textarea): HTMLCollectionOf[HTMLTextAreaElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_tfoot(qualifiedName: tfoot): HTMLCollectionOf[HTMLTableSectionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_th(qualifiedName: th): HTMLCollectionOf[HTMLTableHeaderCellElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_thead(qualifiedName: thead): HTMLCollectionOf[HTMLTableSectionElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_time(qualifiedName: time): HTMLCollectionOf[HTMLTimeElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_title(qualifiedName: title): HTMLCollectionOf[HTMLTitleElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_tr(qualifiedName: tr): HTMLCollectionOf[HTMLTableRowElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_track(qualifiedName: track): HTMLCollectionOf[HTMLTrackElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_tspan(qualifiedName: tspan): HTMLCollectionOf[SVGTSpanElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_u(qualifiedName: u): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_ul(qualifiedName: ul): HTMLCollectionOf[HTMLUListElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_use(qualifiedName: use): HTMLCollectionOf[SVGUseElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_var(qualifiedName: `var`): HTMLCollectionOf[HTMLElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_video(qualifiedName: video): HTMLCollectionOf[HTMLVideoElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_view(qualifiedName: view): HTMLCollectionOf[SVGViewElement] = js.native
    @JSName("getElementsByTagName")
    def getElementsByTagName_wbr(qualifiedName: wbr): HTMLCollectionOf[HTMLElement] = js.native
    
    /**
      * Returns node's root.
      */
    def getRootNode(): Node = js.native
    def getRootNode(options: GetRootNodeOptions): Node = js.native
    
    /**
      * Returns true if element has an attribute whose qualified name is qualifiedName, and false otherwise.
      */
    def hasAttribute(qualifiedName: String): Boolean = js.native
    
    /**
      * Returns true if element has an attribute whose namespace is namespace and local name is localName.
      */
    def hasAttributeNS(namespace: String, localName: String): Boolean = js.native
    def hasAttributeNS(namespace: Null, localName: String): Boolean = js.native
    
    /**
      * Returns true if element has attributes, and false otherwise.
      */
    def hasAttributes(): Boolean = js.native
    
    /**
      * Returns whether node has children.
      */
    def hasChildNodes(): Boolean = js.native
    
    def hasPointerCapture(pointerId: Double): Boolean = js.native
    
    /**
      * Gets or sets the height of a canvas element on a document.
      */
    var height: Double with `8` = js.native
    
    var hidden: Boolean = js.native
    
    /**
      * Returns the value of element's id content attribute. Can be set to change it.
      */
    var id: String = js.native
    
    var innerHTML: String = js.native
    
    var innerText: String = js.native
    
    var inputMode: String = js.native
    
    def insertAdjacentElement(position: InsertPosition, insertedElement: Element): Element | Null = js.native
    
    def insertAdjacentHTML(where: InsertPosition, html: String): Unit = js.native
    
    def insertAdjacentText(where: InsertPosition, text: String): Unit = js.native
    
    def insertBefore[T /* <: Node */](newChild: T): T = js.native
    def insertBefore[T /* <: Node */](newChild: T, refChild: Node): T = js.native
    
    /**
      * Returns true if node is connected and false otherwise.
      */
    val isConnected: Boolean = js.native
    
    val isContentEditable: Boolean = js.native
    
    def isDefaultNamespace(): Boolean = js.native
    def isDefaultNamespace(namespace: String): Boolean = js.native
    
    /**
      * Returns whether node and otherNode have the same properties.
      */
    def isEqualNode(): Boolean = js.native
    def isEqualNode(otherNode: Node): Boolean = js.native
    
    def isSameNode(): Boolean = js.native
    def isSameNode(otherNode: Node): Boolean = js.native
    
    var lang: String = js.native
    
    /**
      * Returns the last child.
      */
    val lastChild: ChildNode | Null = js.native
    
    /**
      * Returns the last child that is an element, and null otherwise.
      */
    val lastElementChild: Element | Null = js.native
    
    /**
      * Returns the local name.
      */
    val localName: String = js.native
    
    def lookupNamespaceURI(): String | Null = js.native
    def lookupNamespaceURI(prefix: String): String | Null = js.native
    
    def lookupPrefix(): String | Null = js.native
    def lookupPrefix(namespace: String): String | Null = js.native
    
    /**
      * Returns true if matching selectors against element's root yields element, and false otherwise.
      */
    def matches(selectors: String): Boolean = js.native
    
    def msGetRegionContent(): js.Any = js.native
    
    /**
      * Returns the namespace.
      */
    val namespaceURI: String | Null = js.native
    
    /**
      * Returns the first following sibling that is an element, and null otherwise.
      */
    val nextElementSibling: Element | Null = js.native
    
    /**
      * Returns the next sibling.
      */
    val nextSibling: ChildNode | Null = js.native
    
    /**
      * Returns a string appropriate for the type of node.
      */
    val nodeName: String = js.native
    
    /**
      * Returns the type of node.
      */
    val nodeType: Double = js.native
    
    var nodeValue: String | Null = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    /**
      * Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes.
      */
    def normalize(): Unit = js.native
    
    val offsetHeight: Double = js.native
    
    val offsetLeft: Double = js.native
    
    val offsetParent: Element | Null = js.native
    
    val offsetTop: Double = js.native
    
    val offsetWidth: Double = js.native
    
    /**
      * Fires when the user aborts the download.
      * @param ev The event.
      */
    var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null = js.native
    
    var onanimationcancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onanimationend: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onanimationiteration: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onanimationstart: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null = js.native
    
    var onauxclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the object loses the input focus.
      * @param ev The focus event.
      */
    var onblur: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null = js.native
    
    var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when playback is possible, but would require further buffering.
      * @param ev The event.
      */
    var oncanplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var oncanplaythrough: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the contents of the object or selection have changed.
      * @param ev The event.
      */
    var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user clicks the left mouse button on the object
      * @param ev The mouse event.
      */
    var onclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user clicks the right mouse button in the client area, opening the context menu.
      * @param ev The mouse event.
      */
    var oncontextmenu: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var oncopy: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | Null = js.native
    
    var oncuechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var oncut: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | Null = js.native
    
    /**
      * Fires when the user double-clicks the object.
      * @param ev The mouse event.
      */
    var ondblclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires on the source object continuously during a drag operation.
      * @param ev The event.
      */
    var ondrag: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the source object when the user releases the mouse at the close of a drag operation.
      * @param ev The event.
      */
    var ondragend: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the target element when the user drags the object to a valid drop target.
      * @param ev The drag event.
      */
    var ondragenter: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    var ondragexit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
      * @param ev The drag event.
      */
    var ondragleave: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the target element continuously while the user drags the object over a valid drop target.
      * @param ev The event.
      */
    var ondragover: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Fires on the source object when the user starts to drag a text selection or selected object.
      * @param ev The event.
      */
    var ondragstart: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    var ondrop: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null = js.native
    
    /**
      * Occurs when the duration attribute is updated.
      * @param ev The event.
      */
    var ondurationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the media element is reset to its initial state.
      * @param ev The event.
      */
    var onemptied: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the end of playback is reached.
      * @param ev The event
      */
    var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when an error occurs during object loading.
      * @param ev The event.
      */
    var onerror: OnErrorEventHandler = js.native
    
    /**
      * Fires when the object receives focus.
      * @param ev The event.
      */
    var onfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null = js.native
    
    var onfullscreenchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onfullscreenerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var ongotpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var oninput: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var oninvalid: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user presses a key.
      * @param ev The keyboard event
      */
    var onkeydown: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
    
    /**
      * Fires when the user presses an alphanumeric key.
      * @param ev The event.
      */
    var onkeypress: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
    
    /**
      * Fires when the user releases a key.
      * @param ev The keyboard event
      */
    var onkeyup: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null = js.native
    
    /**
      * Fires immediately after the browser loads the object.
      * @param ev The event.
      */
    var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when media data is loaded at the current playback position.
      * @param ev The event.
      */
    var onloadeddata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the duration and dimensions of the media have been determined.
      * @param ev The event.
      */
    var onloadedmetadata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when Internet Explorer begins looking for media data.
      * @param ev The event.
      */
    var onloadstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onlostpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    /**
      * Fires when the user clicks the object with either mouse button.
      * @param ev The mouse event.
      */
    var onmousedown: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onmouseenter: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onmouseleave: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse over the object.
      * @param ev The mouse event.
      */
    var onmousemove: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse pointer outside the boundaries of the object.
      * @param ev The mouse event.
      */
    var onmouseout: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user moves the mouse pointer into the object.
      * @param ev The mouse event.
      */
    var onmouseover: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    /**
      * Fires when the user releases a mouse button while the mouse is over the object.
      * @param ev The mouse event.
      */
    var onmouseup: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null = js.native
    
    var onpaste: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | Null = js.native
    
    /**
      * Occurs when playback is paused.
      * @param ev The event.
      */
    var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the play method is requested.
      * @param ev The event.
      */
    var onplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the audio or video has started playing.
      * @param ev The event.
      */
    var onplaying: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onpointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    var onpointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null = js.native
    
    /**
      * Occurs to indicate progress while downloading media data.
      * @param ev The event.
      */
    var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | Null = js.native
    
    /**
      * Occurs when the playback rate is increased or decreased.
      * @param ev The event.
      */
    var onratechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the user resets a form.
      * @param ev The event.
      */
    var onreset: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onresize: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null = js.native
    
    /**
      * Fires when the user repositions the scroll box in the scroll bar on the object.
      * @param ev The event.
      */
    var onscroll: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onsecuritypolicyviolation: (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]) | Null = js.native
    
    /**
      * Occurs when the seek operation ends.
      * @param ev The event.
      */
    var onseeked: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the current playback position is moved.
      * @param ev The event.
      */
    var onseeking: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Fires when the current selection changes.
      * @param ev The event.
      */
    var onselect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onselectionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onselectstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when the download has stopped.
      * @param ev The event.
      */
    var onstalled: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onsubmit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs if the load operation has been intentionally halted.
      * @param ev The event.
      */
    var onsuspend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs to indicate the current playback position.
      * @param ev The event.
      */
    var ontimeupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var ontoggle: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
    
    var ontransitioncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    var ontransitionend: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    var ontransitionrun: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    var ontransitionstart: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null = js.native
    
    /**
      * Occurs when the volume is changed, or playback is muted or unmuted.
      * @param ev The event.
      */
    var onvolumechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    /**
      * Occurs when playback stops because the next frame of a video resource is not available.
      * @param ev The event.
      */
    var onwaiting: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
    
    var onwheel: (js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]) | Null = js.native
    
    var outerHTML: String = js.native
    
    val ownerDocument: Document = js.native
    
    /**
      * Returns the parent element.
      */
    val parentElement: HTMLElement | Null = js.native
    
    /**
      * Returns the parent.
      */
    val parentNode: (Node with ParentNode) | Null = js.native
    
    /**
      * Returns the namespace prefix.
      */
    val prefix: String | Null = js.native
    
    /**
      * Inserts nodes before the first child of node, while replacing strings in nodes with equivalent Text nodes.
      * 
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def prepend(nodes: (Node | String)*): Unit = js.native
    
    /**
      * Returns the first preceding sibling that is an element, and null otherwise.
      */
    val previousElementSibling: Element | Null = js.native
    
    /**
      * Returns the previous sibling.
      */
    val previousSibling: ChildNode | Null = js.native
    
    def querySelector[E /* <: Element */](selectors: String): E | Null = js.native
    
    def querySelectorAll[E /* <: Element */](selectors: String): NodeListOf[E with Node] = js.native
    /**
      * Returns all element descendants of node that match selectors.
      */
    @JSName("querySelectorAll")
    def querySelectorAll_a(selectors: a): NodeListOf[HTMLAnchorElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_abbr(selectors: abbr): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_address(selectors: address): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_applet(selectors: applet): NodeListOf[HTMLAppletElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_area(selectors: area): NodeListOf[HTMLAreaElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_article(selectors: article): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_aside(selectors: aside): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_audio(selectors: audio): NodeListOf[HTMLAudioElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_b(selectors: b): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_base(selectors: base): NodeListOf[HTMLBaseElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_basefont(selectors: basefont): NodeListOf[HTMLBaseFontElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_bdi(selectors: bdi): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_bdo(selectors: bdo): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_blockquote(selectors: blockquote): NodeListOf[HTMLQuoteElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_body(selectors: body): NodeListOf[HTMLBodyElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_br(selectors: br): NodeListOf[HTMLBRElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_button(selectors: button): NodeListOf[HTMLButtonElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_canvas(selectors: canvas): NodeListOf[HTMLCanvasElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_caption(selectors: caption): NodeListOf[HTMLTableCaptionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_circle(selectors: circle): NodeListOf[SVGCircleElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_cite(selectors: cite): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_clipPath(selectors: clipPath): NodeListOf[SVGClipPathElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_code(selectors: code): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_col(selectors: col): NodeListOf[HTMLTableColElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_colgroup(selectors: colgroup): NodeListOf[HTMLTableColElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_data(selectors: data): NodeListOf[HTMLDataElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_datalist(selectors: datalist): NodeListOf[HTMLDataListElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dd(selectors: dd): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_defs(selectors: defs): NodeListOf[SVGDefsElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_del(selectors: del): NodeListOf[HTMLModElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_desc(selectors: desc): NodeListOf[SVGDescElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_details(selectors: details): NodeListOf[HTMLDetailsElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dfn(selectors: dfn): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dialog(selectors: dialog): NodeListOf[HTMLDialogElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dir(selectors: dir): NodeListOf[HTMLDirectoryElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_div(selectors: div): NodeListOf[HTMLDivElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dl(selectors: dl): NodeListOf[HTMLDListElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dt(selectors: dt): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ellipse(selectors: ellipse): NodeListOf[SVGEllipseElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_em(selectors: em): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_embed(selectors: embed): NodeListOf[HTMLEmbedElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feBlend(selectors: feBlend): NodeListOf[SVGFEBlendElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feColorMatrix(selectors: feColorMatrix): NodeListOf[SVGFEColorMatrixElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feComponentTransfer(selectors: feComponentTransfer): NodeListOf[SVGFEComponentTransferElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feComposite(selectors: feComposite): NodeListOf[SVGFECompositeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feConvolveMatrix(selectors: feConvolveMatrix): NodeListOf[SVGFEConvolveMatrixElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feDiffuseLighting(selectors: feDiffuseLighting): NodeListOf[SVGFEDiffuseLightingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feDisplacementMap(selectors: feDisplacementMap): NodeListOf[SVGFEDisplacementMapElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feDistantLight(selectors: feDistantLight): NodeListOf[SVGFEDistantLightElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFlood(selectors: feFlood): NodeListOf[SVGFEFloodElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncA(selectors: feFuncA): NodeListOf[SVGFEFuncAElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncB(selectors: feFuncB): NodeListOf[SVGFEFuncBElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncG(selectors: feFuncG): NodeListOf[SVGFEFuncGElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncR(selectors: feFuncR): NodeListOf[SVGFEFuncRElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feGaussianBlur(selectors: feGaussianBlur): NodeListOf[SVGFEGaussianBlurElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feImage(selectors: feImage): NodeListOf[SVGFEImageElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feMerge(selectors: feMerge): NodeListOf[SVGFEMergeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feMergeNode(selectors: feMergeNode): NodeListOf[SVGFEMergeNodeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feMorphology(selectors: feMorphology): NodeListOf[SVGFEMorphologyElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feOffset(selectors: feOffset): NodeListOf[SVGFEOffsetElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_fePointLight(selectors: fePointLight): NodeListOf[SVGFEPointLightElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feSpecularLighting(selectors: feSpecularLighting): NodeListOf[SVGFESpecularLightingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feSpotLight(selectors: feSpotLight): NodeListOf[SVGFESpotLightElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feTile(selectors: feTile): NodeListOf[SVGFETileElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feTurbulence(selectors: feTurbulence): NodeListOf[SVGFETurbulenceElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_fieldset(selectors: fieldset): NodeListOf[HTMLFieldSetElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_figcaption(selectors: figcaption): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_figure(selectors: figure): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_filter(selectors: filter): NodeListOf[SVGFilterElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_font(selectors: font): NodeListOf[HTMLFontElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_footer(selectors: footer): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_foreignObject(selectors: foreignObject): NodeListOf[SVGForeignObjectElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_form(selectors: form): NodeListOf[HTMLFormElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_frame(selectors: frame): NodeListOf[HTMLFrameElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_frameset(selectors: frameset): NodeListOf[HTMLFrameSetElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_g(selectors: g): NodeListOf[SVGGElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h1(selectors: h1): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h2(selectors: h2): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h3(selectors: h3): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h4(selectors: h4): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h5(selectors: h5): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h6(selectors: h6): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_head(selectors: head): NodeListOf[HTMLHeadElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_header(selectors: header): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_hgroup(selectors: hgroup): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_hr(selectors: hr): NodeListOf[HTMLHRElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_html(selectors: html): NodeListOf[HTMLHtmlElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_i(selectors: i): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_iframe(selectors: iframe): NodeListOf[HTMLIFrameElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_image(selectors: image): NodeListOf[SVGImageElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_img(selectors: img): NodeListOf[HTMLImageElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_input(selectors: input): NodeListOf[HTMLInputElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ins(selectors: ins): NodeListOf[HTMLModElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_kbd(selectors: kbd): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_label(selectors: label): NodeListOf[HTMLLabelElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_legend(selectors: legend): NodeListOf[HTMLLegendElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_li(selectors: li): NodeListOf[HTMLLIElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_line(selectors: line): NodeListOf[SVGLineElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_linearGradient(selectors: linearGradient): NodeListOf[SVGLinearGradientElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_link(selectors: link): NodeListOf[HTMLLinkElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_main(selectors: main): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_map(selectors: map): NodeListOf[HTMLMapElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_mark(selectors: mark): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_marker(selectors: marker): NodeListOf[SVGMarkerElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_marquee(selectors: marquee): NodeListOf[HTMLMarqueeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_mask(selectors: mask): NodeListOf[SVGMaskElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_menu(selectors: menu): NodeListOf[HTMLMenuElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_meta(selectors: meta): NodeListOf[HTMLMetaElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_metadata(selectors: metadata): NodeListOf[SVGMetadataElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_meter(selectors: meter): NodeListOf[HTMLMeterElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_nav(selectors: nav): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_noscript(selectors: noscript): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_object(selectors: `object`): NodeListOf[HTMLObjectElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ol(selectors: ol): NodeListOf[HTMLOListElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_optgroup(selectors: optgroup): NodeListOf[HTMLOptGroupElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_option(selectors: option): NodeListOf[HTMLOptionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_output(selectors: output): NodeListOf[HTMLOutputElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_p(selectors: p): NodeListOf[HTMLParagraphElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_param(selectors: param): NodeListOf[HTMLParamElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_path(selectors: path): NodeListOf[SVGPathElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_pattern(selectors: pattern): NodeListOf[SVGPatternElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_picture(selectors: picture): NodeListOf[HTMLPictureElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_polygon(selectors: polygon): NodeListOf[SVGPolygonElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_polyline(selectors: polyline): NodeListOf[SVGPolylineElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_pre(selectors: pre): NodeListOf[HTMLPreElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_progress(selectors: progress): NodeListOf[HTMLProgressElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_q(selectors: q): NodeListOf[HTMLQuoteElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_radialGradient(selectors: radialGradient): NodeListOf[SVGRadialGradientElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_rect(selectors: rect): NodeListOf[SVGRectElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_rp(selectors: rp): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_rt(selectors: rt): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ruby(selectors: ruby): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_s(selectors: s): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_samp(selectors: samp): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_script(selectors: script): NodeListOf[HTMLScriptElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_section(selectors: section): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_select(selectors: select): NodeListOf[HTMLSelectElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_slot(selectors: slot): NodeListOf[HTMLSlotElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_small(selectors: small): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_source(selectors: source): NodeListOf[HTMLSourceElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_span(selectors: span): NodeListOf[HTMLSpanElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_stop(selectors: stop): NodeListOf[SVGStopElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_strong(selectors: strong): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_style(selectors: typingsSlinky.cookieclicker.cookieclickerStrings.style): NodeListOf[HTMLStyleElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_sub(selectors: sub): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_summary(selectors: summary): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_sup(selectors: sup): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_svg(selectors: svg): NodeListOf[SVGSVGElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_switch(selectors: switch): NodeListOf[SVGSwitchElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_symbol(selectors: symbol): NodeListOf[SVGSymbolElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_table(selectors: table): NodeListOf[HTMLTableElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tbody(selectors: tbody): NodeListOf[HTMLTableSectionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_td(selectors: td): NodeListOf[HTMLTableDataCellElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_template(selectors: template): NodeListOf[HTMLTemplateElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_text(selectors: text): NodeListOf[SVGTextElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_textPath(selectors: textPath): NodeListOf[SVGTextPathElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_textarea(selectors: textarea): NodeListOf[HTMLTextAreaElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tfoot(selectors: tfoot): NodeListOf[HTMLTableSectionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_th(selectors: th): NodeListOf[HTMLTableHeaderCellElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_thead(selectors: thead): NodeListOf[HTMLTableSectionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_time(selectors: time): NodeListOf[HTMLTimeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_title(selectors: title): NodeListOf[HTMLTitleElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tr(selectors: tr): NodeListOf[HTMLTableRowElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_track(selectors: track): NodeListOf[HTMLTrackElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tspan(selectors: tspan): NodeListOf[SVGTSpanElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_u(selectors: u): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ul(selectors: ul): NodeListOf[HTMLUListElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_use(selectors: use): NodeListOf[SVGUseElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_var(selectors: `var`): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_video(selectors: video): NodeListOf[HTMLVideoElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_view(selectors: view): NodeListOf[SVGViewElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_wbr(selectors: wbr): NodeListOf[HTMLElement with Node] = js.native
    
    /**
      * Returns the first element that is a descendant of node that matches selectors.
      */
    @JSName("querySelector")
    def querySelector_a(selectors: a): HTMLAnchorElement | Null = js.native
    @JSName("querySelector")
    def querySelector_abbr(selectors: abbr): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_address(selectors: address): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_applet(selectors: applet): HTMLAppletElement | Null = js.native
    @JSName("querySelector")
    def querySelector_area(selectors: area): HTMLAreaElement | Null = js.native
    @JSName("querySelector")
    def querySelector_article(selectors: article): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_aside(selectors: aside): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_audio(selectors: audio): HTMLAudioElement | Null = js.native
    @JSName("querySelector")
    def querySelector_b(selectors: b): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_base(selectors: base): HTMLBaseElement | Null = js.native
    @JSName("querySelector")
    def querySelector_basefont(selectors: basefont): HTMLBaseFontElement | Null = js.native
    @JSName("querySelector")
    def querySelector_bdi(selectors: bdi): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_bdo(selectors: bdo): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_blockquote(selectors: blockquote): HTMLQuoteElement | Null = js.native
    @JSName("querySelector")
    def querySelector_body(selectors: body): HTMLBodyElement | Null = js.native
    @JSName("querySelector")
    def querySelector_br(selectors: br): HTMLBRElement | Null = js.native
    @JSName("querySelector")
    def querySelector_button(selectors: button): HTMLButtonElement | Null = js.native
    @JSName("querySelector")
    def querySelector_canvas(selectors: canvas): HTMLCanvasElement | Null = js.native
    @JSName("querySelector")
    def querySelector_caption(selectors: caption): HTMLTableCaptionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_circle(selectors: circle): SVGCircleElement | Null = js.native
    @JSName("querySelector")
    def querySelector_cite(selectors: cite): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_clipPath(selectors: clipPath): SVGClipPathElement | Null = js.native
    @JSName("querySelector")
    def querySelector_code(selectors: code): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_col(selectors: col): HTMLTableColElement | Null = js.native
    @JSName("querySelector")
    def querySelector_colgroup(selectors: colgroup): HTMLTableColElement | Null = js.native
    @JSName("querySelector")
    def querySelector_data(selectors: data): HTMLDataElement | Null = js.native
    @JSName("querySelector")
    def querySelector_datalist(selectors: datalist): HTMLDataListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dd(selectors: dd): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_defs(selectors: defs): SVGDefsElement | Null = js.native
    @JSName("querySelector")
    def querySelector_del(selectors: del): HTMLModElement | Null = js.native
    @JSName("querySelector")
    def querySelector_desc(selectors: desc): SVGDescElement | Null = js.native
    @JSName("querySelector")
    def querySelector_details(selectors: details): HTMLDetailsElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dfn(selectors: dfn): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dialog(selectors: dialog): HTMLDialogElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dir(selectors: dir): HTMLDirectoryElement | Null = js.native
    @JSName("querySelector")
    def querySelector_div(selectors: div): HTMLDivElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dl(selectors: dl): HTMLDListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dt(selectors: dt): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ellipse(selectors: ellipse): SVGEllipseElement | Null = js.native
    @JSName("querySelector")
    def querySelector_em(selectors: em): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_embed(selectors: embed): HTMLEmbedElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feBlend(selectors: feBlend): SVGFEBlendElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feColorMatrix(selectors: feColorMatrix): SVGFEColorMatrixElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feComponentTransfer(selectors: feComponentTransfer): SVGFEComponentTransferElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feComposite(selectors: feComposite): SVGFECompositeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feConvolveMatrix(selectors: feConvolveMatrix): SVGFEConvolveMatrixElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feDiffuseLighting(selectors: feDiffuseLighting): SVGFEDiffuseLightingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feDisplacementMap(selectors: feDisplacementMap): SVGFEDisplacementMapElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feDistantLight(selectors: feDistantLight): SVGFEDistantLightElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFlood(selectors: feFlood): SVGFEFloodElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncA(selectors: feFuncA): SVGFEFuncAElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncB(selectors: feFuncB): SVGFEFuncBElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncG(selectors: feFuncG): SVGFEFuncGElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncR(selectors: feFuncR): SVGFEFuncRElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feGaussianBlur(selectors: feGaussianBlur): SVGFEGaussianBlurElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feImage(selectors: feImage): SVGFEImageElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feMerge(selectors: feMerge): SVGFEMergeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feMergeNode(selectors: feMergeNode): SVGFEMergeNodeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feMorphology(selectors: feMorphology): SVGFEMorphologyElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feOffset(selectors: feOffset): SVGFEOffsetElement | Null = js.native
    @JSName("querySelector")
    def querySelector_fePointLight(selectors: fePointLight): SVGFEPointLightElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feSpecularLighting(selectors: feSpecularLighting): SVGFESpecularLightingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feSpotLight(selectors: feSpotLight): SVGFESpotLightElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feTile(selectors: feTile): SVGFETileElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feTurbulence(selectors: feTurbulence): SVGFETurbulenceElement | Null = js.native
    @JSName("querySelector")
    def querySelector_fieldset(selectors: fieldset): HTMLFieldSetElement | Null = js.native
    @JSName("querySelector")
    def querySelector_figcaption(selectors: figcaption): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_figure(selectors: figure): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_filter(selectors: filter): SVGFilterElement | Null = js.native
    @JSName("querySelector")
    def querySelector_font(selectors: font): HTMLFontElement | Null = js.native
    @JSName("querySelector")
    def querySelector_footer(selectors: footer): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_foreignObject(selectors: foreignObject): SVGForeignObjectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_form(selectors: form): HTMLFormElement | Null = js.native
    @JSName("querySelector")
    def querySelector_frame(selectors: frame): HTMLFrameElement | Null = js.native
    @JSName("querySelector")
    def querySelector_frameset(selectors: frameset): HTMLFrameSetElement | Null = js.native
    @JSName("querySelector")
    def querySelector_g(selectors: g): SVGGElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h1(selectors: h1): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h2(selectors: h2): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h3(selectors: h3): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h4(selectors: h4): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h5(selectors: h5): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h6(selectors: h6): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_head(selectors: head): HTMLHeadElement | Null = js.native
    @JSName("querySelector")
    def querySelector_header(selectors: header): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_hgroup(selectors: hgroup): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_hr(selectors: hr): HTMLHRElement | Null = js.native
    @JSName("querySelector")
    def querySelector_html(selectors: html): HTMLHtmlElement | Null = js.native
    @JSName("querySelector")
    def querySelector_i(selectors: i): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_iframe(selectors: iframe): HTMLIFrameElement | Null = js.native
    @JSName("querySelector")
    def querySelector_image(selectors: image): SVGImageElement | Null = js.native
    @JSName("querySelector")
    def querySelector_img(selectors: img): HTMLImageElement | Null = js.native
    @JSName("querySelector")
    def querySelector_input(selectors: input): HTMLInputElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ins(selectors: ins): HTMLModElement | Null = js.native
    @JSName("querySelector")
    def querySelector_kbd(selectors: kbd): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_label(selectors: label): HTMLLabelElement | Null = js.native
    @JSName("querySelector")
    def querySelector_legend(selectors: legend): HTMLLegendElement | Null = js.native
    @JSName("querySelector")
    def querySelector_li(selectors: li): HTMLLIElement | Null = js.native
    @JSName("querySelector")
    def querySelector_line(selectors: line): SVGLineElement | Null = js.native
    @JSName("querySelector")
    def querySelector_linearGradient(selectors: linearGradient): SVGLinearGradientElement | Null = js.native
    @JSName("querySelector")
    def querySelector_link(selectors: link): HTMLLinkElement | Null = js.native
    @JSName("querySelector")
    def querySelector_main(selectors: main): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_map(selectors: map): HTMLMapElement | Null = js.native
    @JSName("querySelector")
    def querySelector_mark(selectors: mark): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_marker(selectors: marker): SVGMarkerElement | Null = js.native
    @JSName("querySelector")
    def querySelector_marquee(selectors: marquee): HTMLMarqueeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_mask(selectors: mask): SVGMaskElement | Null = js.native
    @JSName("querySelector")
    def querySelector_menu(selectors: menu): HTMLMenuElement | Null = js.native
    @JSName("querySelector")
    def querySelector_meta(selectors: meta): HTMLMetaElement | Null = js.native
    @JSName("querySelector")
    def querySelector_metadata(selectors: metadata): SVGMetadataElement | Null = js.native
    @JSName("querySelector")
    def querySelector_meter(selectors: meter): HTMLMeterElement | Null = js.native
    @JSName("querySelector")
    def querySelector_nav(selectors: nav): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_noscript(selectors: noscript): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_object(selectors: `object`): HTMLObjectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ol(selectors: ol): HTMLOListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_optgroup(selectors: optgroup): HTMLOptGroupElement | Null = js.native
    @JSName("querySelector")
    def querySelector_option(selectors: option): HTMLOptionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_output(selectors: output): HTMLOutputElement | Null = js.native
    @JSName("querySelector")
    def querySelector_p(selectors: p): HTMLParagraphElement | Null = js.native
    @JSName("querySelector")
    def querySelector_param(selectors: param): HTMLParamElement | Null = js.native
    @JSName("querySelector")
    def querySelector_path(selectors: path): SVGPathElement | Null = js.native
    @JSName("querySelector")
    def querySelector_pattern(selectors: pattern): SVGPatternElement | Null = js.native
    @JSName("querySelector")
    def querySelector_picture(selectors: picture): HTMLPictureElement | Null = js.native
    @JSName("querySelector")
    def querySelector_polygon(selectors: polygon): SVGPolygonElement | Null = js.native
    @JSName("querySelector")
    def querySelector_polyline(selectors: polyline): SVGPolylineElement | Null = js.native
    @JSName("querySelector")
    def querySelector_pre(selectors: pre): HTMLPreElement | Null = js.native
    @JSName("querySelector")
    def querySelector_progress(selectors: progress): HTMLProgressElement | Null = js.native
    @JSName("querySelector")
    def querySelector_q(selectors: q): HTMLQuoteElement | Null = js.native
    @JSName("querySelector")
    def querySelector_radialGradient(selectors: radialGradient): SVGRadialGradientElement | Null = js.native
    @JSName("querySelector")
    def querySelector_rect(selectors: rect): SVGRectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_rp(selectors: rp): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_rt(selectors: rt): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ruby(selectors: ruby): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_s(selectors: s): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_samp(selectors: samp): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_script(selectors: script): HTMLScriptElement | Null = js.native
    @JSName("querySelector")
    def querySelector_section(selectors: section): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_select(selectors: select): HTMLSelectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_slot(selectors: slot): HTMLSlotElement | Null = js.native
    @JSName("querySelector")
    def querySelector_small(selectors: small): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_source(selectors: source): HTMLSourceElement | Null = js.native
    @JSName("querySelector")
    def querySelector_span(selectors: span): HTMLSpanElement | Null = js.native
    @JSName("querySelector")
    def querySelector_stop(selectors: stop): SVGStopElement | Null = js.native
    @JSName("querySelector")
    def querySelector_strong(selectors: strong): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_style(selectors: typingsSlinky.cookieclicker.cookieclickerStrings.style): HTMLStyleElement | Null = js.native
    @JSName("querySelector")
    def querySelector_sub(selectors: sub): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_summary(selectors: summary): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_sup(selectors: sup): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_svg(selectors: svg): SVGSVGElement | Null = js.native
    @JSName("querySelector")
    def querySelector_switch(selectors: switch): SVGSwitchElement | Null = js.native
    @JSName("querySelector")
    def querySelector_symbol(selectors: symbol): SVGSymbolElement | Null = js.native
    @JSName("querySelector")
    def querySelector_table(selectors: table): HTMLTableElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tbody(selectors: tbody): HTMLTableSectionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_td(selectors: td): HTMLTableDataCellElement | Null = js.native
    @JSName("querySelector")
    def querySelector_template(selectors: template): HTMLTemplateElement | Null = js.native
    @JSName("querySelector")
    def querySelector_text(selectors: text): SVGTextElement | Null = js.native
    @JSName("querySelector")
    def querySelector_textPath(selectors: textPath): SVGTextPathElement | Null = js.native
    @JSName("querySelector")
    def querySelector_textarea(selectors: textarea): HTMLTextAreaElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tfoot(selectors: tfoot): HTMLTableSectionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_th(selectors: th): HTMLTableHeaderCellElement | Null = js.native
    @JSName("querySelector")
    def querySelector_thead(selectors: thead): HTMLTableSectionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_time(selectors: time): HTMLTimeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_title(selectors: title): HTMLTitleElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tr(selectors: tr): HTMLTableRowElement | Null = js.native
    @JSName("querySelector")
    def querySelector_track(selectors: track): HTMLTrackElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tspan(selectors: tspan): SVGTSpanElement | Null = js.native
    @JSName("querySelector")
    def querySelector_u(selectors: u): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ul(selectors: ul): HTMLUListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_use(selectors: use): SVGUseElement | Null = js.native
    @JSName("querySelector")
    def querySelector_var(selectors: `var`): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_video(selectors: video): HTMLVideoElement | Null = js.native
    @JSName("querySelector")
    def querySelector_view(selectors: view): SVGViewElement | Null = js.native
    @JSName("querySelector")
    def querySelector_wbr(selectors: wbr): HTMLElement | Null = js.native
    
    def releasePointerCapture(pointerId: Double): Unit = js.native
    
    /**
      * Removes node.
      */
    def remove(): Unit = js.native
    
    /**
      * Removes element's first attribute whose qualified name is qualifiedName.
      */
    def removeAttribute(qualifiedName: String): Unit = js.native
    
    /**
      * Removes element's attribute whose namespace is namespace and local name is localName.
      */
    def removeAttributeNS(namespace: String, localName: String): Unit = js.native
    def removeAttributeNS(namespace: Null, localName: String): Unit = js.native
    
    def removeAttributeNode(attr: Attr): Attr = js.native
    
    def removeChild[T /* <: Node */](oldChild: T): T = js.native
    
    /**
      * Removes the event listener in target's event listener list with the same type, callback, and options.
      */
    def removeEventListener(`type`: String): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationcancel(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(`type`: animationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationiteration(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationstart(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_auxclick(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_blur(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(`type`: cancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cancel(
      `type`: cancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplay(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_canplaythrough(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_change(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_click(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_contextmenu(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(`type`: copy, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_copy(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cuechange(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(`type`: cut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_cut(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dblclick(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drag(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragend(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragenter(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(`type`: dragexit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragexit(
      `type`: dragexit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragleave(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragover(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_dragstart(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_drop(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_durationchange(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_emptied(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ended(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focus(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusin(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_focusout(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenchange(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_fullscreenerror(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gotpointercapture(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_input(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_invalid(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keydown(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keypress(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_keyup(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_load(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadeddata(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadedmetadata(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_loadstart(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lostpointercapture(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousedown(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseenter(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseleave(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mousemove(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseout(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseover(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mouseup(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(`type`: paste, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_paste(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pause(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_play(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_playing(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(`type`: pointercancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointercancel(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerdown(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerenter(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerleave(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointermove(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerout(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerover(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pointerup(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_ratechange(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_reset(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_resize(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_scroll(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securitypolicyviolation(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeked(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_seeking(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_select(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectionchange(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_selectstart(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stalled(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_submit(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_suspend(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_timeupdate(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_toggle(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchcancel(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchend(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchmove(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_touchstart(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitioncancel(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionend(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionrun(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_transitionstart(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_volumechange(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_waiting(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_wheel(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
      options: Boolean
    ): Unit = js.native
    
    def replaceChild[T /* <: Node */](newChild: Node, oldChild: T): T = js.native
    
    /**
      * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
      * 
      * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
      */
    def replaceWith(nodes: (Node | String)*): Unit = js.native
    
    /**
      * Displays element fullscreen and resolves promise when done.
      * 
      * When supplied, options's navigationUI member indicates whether showing navigation UI while in fullscreen is preferred or not. If set to "show", navigation simplicity is preferred over screen space, and if set to "hide", more screen space is preferred. User agents are always free to honor user preference over the application's. The default value "auto" indicates no application preference.
      */
    def requestFullscreen(): js.Promise[Unit] = js.native
    def requestFullscreen(options: FullscreenOptions): js.Promise[Unit] = js.native
    
    def requestPointerLock(): Unit = js.native
    
    def scroll(): Unit = js.native
    def scroll(options: ScrollToOptions): Unit = js.native
    def scroll(x: Double, y: Double): Unit = js.native
    
    def scrollBy(): Unit = js.native
    def scrollBy(options: ScrollToOptions): Unit = js.native
    def scrollBy(x: Double, y: Double): Unit = js.native
    
    val scrollHeight: Double = js.native
    
    def scrollIntoView(): Unit = js.native
    def scrollIntoView(arg: Boolean): Unit = js.native
    def scrollIntoView(arg: ScrollIntoViewOptions): Unit = js.native
    
    var scrollLeft: Double = js.native
    
    def scrollTo(): Unit = js.native
    def scrollTo(options: ScrollToOptions): Unit = js.native
    def scrollTo(x: Double, y: Double): Unit = js.native
    
    var scrollTop: Double = js.native
    
    val scrollWidth: Double = js.native
    
    /**
      * Sets the value of element's first attribute whose qualified name is qualifiedName to value.
      */
    def setAttribute(qualifiedName: String, value: String): Unit = js.native
    
    /**
      * Sets the value of element's attribute whose namespace is namespace and local name is localName to value.
      */
    def setAttributeNS(namespace: String, qualifiedName: String, value: String): Unit = js.native
    def setAttributeNS(namespace: Null, qualifiedName: String, value: String): Unit = js.native
    
    def setAttributeNode(attr: Attr): Attr | Null = js.native
    
    def setAttributeNodeNS(attr: Attr): Attr | Null = js.native
    
    def setPointerCapture(pointerId: Double): Unit = js.native
    
    /**
      * Returns element's shadow root, if any, and if shadow root's mode is "open", and null otherwise.
      */
    val shadowRoot: ShadowRoot | Null = js.native
    
    /**
      * Returns the value of element's slot content attribute. Can be set to change it.
      */
    var slot: String = js.native
    
    var spellcheck: Boolean = js.native
    
    val style: CSSStyleDeclaration = js.native
    
    var tabIndex: Double = js.native
    
    /**
      * Returns the HTML-uppercased qualified name.
      */
    val tagName: String = js.native
    
    var textContent: String | Null = js.native
    
    var title: String = js.native
    
    def toBlob(callback: BlobCallback): Unit = js.native
    def toBlob(callback: BlobCallback, `type`: js.UndefOr[scala.Nothing], quality: js.Any): Unit = js.native
    def toBlob(callback: BlobCallback, `type`: String): Unit = js.native
    def toBlob(callback: BlobCallback, `type`: String, quality: js.Any): Unit = js.native
    
    /**
      * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
      * @param type The standard MIME type for the image format to return. If you do not specify this parameter, the default value is a PNG format image.
      */
    def toDataURL(): String = js.native
    def toDataURL(`type`: js.UndefOr[scala.Nothing], quality: js.Any): String = js.native
    def toDataURL(`type`: String): String = js.native
    def toDataURL(`type`: String, quality: js.Any): String = js.native
    
    /**
      * If force is not given, "toggles" qualifiedName, removing it if it is present and adding it if it is not present. If force is true, adds qualifiedName. If force is false, removes qualifiedName.
      * 
      * Returns true if qualifiedName is now present, and false otherwise.
      */
    def toggleAttribute(qualifiedName: String): Boolean = js.native
    def toggleAttribute(qualifiedName: String, force: Boolean): Boolean = js.native
    
    def transferControlToOffscreen(): OffscreenCanvas = js.native
    
    var translate: Boolean = js.native
    
    def webkitMatchesSelector(selectors: String): Boolean = js.native
    
    /**
      * Gets or sets the width of a canvas element on a document.
      */
    var width: Double with `8` = js.native
  }
}
