package typingsSlinky.ejWebAll.global.ej.datavisualization

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import typingsSlinky.ejWebAll.ej.Sparkline.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.datavisualization.Sparkline")
@js.native
class Sparkline protected ()
  extends typingsSlinky.ejWebAll.ej.datavisualization.Sparkline {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: Model) = this()
  def this(element: JQuery, options: Model) = this()
}
object Sparkline {
  
  @JSGlobal("ej.datavisualization.Sparkline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.datavisualization.Sparkline.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.FontStyle with Double] = js.native
    
    /* 1 */ val Italic: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.FontStyle.Italic with Double = js.native
    
    /* 0 */ val Normal: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.FontStyle.Normal with Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Sparkline.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.FontWeight with Double] = js.native
    
    /* 1 */ val Bold: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.FontWeight.Bold with Double = js.native
    
    /* 2 */ val Lighter: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.FontWeight.Lighter with Double = js.native
    
    /* 0 */ val Regular: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.FontWeight.Regular with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.Sparkline.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.datavisualization.Sparkline.Theme")
  @js.native
  object Theme extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Theme with Double] = js.native
    
    /* 0 */ val Azure: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Theme.Azure with Double = js.native
    
    /* 3 */ val Azuredark: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Theme.Azuredark with Double = js.native
    
    /* 2 */ val FlatDark: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Theme.FlatDark with Double = js.native
    
    /* 1 */ val FlatLight: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Theme.FlatLight with Double = js.native
    
    /* 9 */ val GradientDark: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Theme.GradientDark with Double = js.native
    
    /* 8 */ val GradientLight: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Theme.GradientLight with Double = js.native
    
    /* 4 */ val Lime: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Theme.Lime with Double = js.native
    
    /* 5 */ val LimeDark: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Theme.LimeDark with Double = js.native
    
    /* 6 */ val Saffron: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Theme.Saffron with Double = js.native
    
    /* 7 */ val SaffronDark: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Theme.SaffronDark with Double = js.native
  }
  
  @JSGlobal("ej.datavisualization.Sparkline.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Type with Double] = js.native
    
    /* 0 */ val Area: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Type.Area with Double = js.native
    
    /* 2 */ val Column: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Type.Column with Double = js.native
    
    /* 1 */ val Line: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Type.Line with Double = js.native
    
    /* 3 */ val Pie: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Type.Pie with Double = js.native
    
    /* 4 */ val WinLoss: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline.Type.WinLoss with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.datavisualization.Sparkline.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.datavisualization.Sparkline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
