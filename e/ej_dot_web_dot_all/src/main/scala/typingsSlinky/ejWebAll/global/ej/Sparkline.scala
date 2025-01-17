package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Sparkline")
@js.native
class Sparkline protected ()
  extends typingsSlinky.ejWebAll.ej.Sparkline {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object Sparkline {
  
  @JSGlobal("ej.Sparkline")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Sparkline.FontStyle")
  @js.native
  object FontStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Sparkline.FontStyle with Double] = js.native
    
    /* 1 */ val Italic: typingsSlinky.ejWebAll.ej.Sparkline.FontStyle.Italic with Double = js.native
    
    /* 0 */ val Normal: typingsSlinky.ejWebAll.ej.Sparkline.FontStyle.Normal with Double = js.native
  }
  
  @JSGlobal("ej.Sparkline.FontWeight")
  @js.native
  object FontWeight extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Sparkline.FontWeight with Double] = js.native
    
    /* 1 */ val Bold: typingsSlinky.ejWebAll.ej.Sparkline.FontWeight.Bold with Double = js.native
    
    /* 2 */ val Lighter: typingsSlinky.ejWebAll.ej.Sparkline.FontWeight.Lighter with Double = js.native
    
    /* 0 */ val Regular: typingsSlinky.ejWebAll.ej.Sparkline.FontWeight.Regular with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Sparkline.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Sparkline.Theme")
  @js.native
  object Theme extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Sparkline.Theme with Double] = js.native
    
    /* 0 */ val Azure: typingsSlinky.ejWebAll.ej.Sparkline.Theme.Azure with Double = js.native
    
    /* 3 */ val Azuredark: typingsSlinky.ejWebAll.ej.Sparkline.Theme.Azuredark with Double = js.native
    
    /* 2 */ val FlatDark: typingsSlinky.ejWebAll.ej.Sparkline.Theme.FlatDark with Double = js.native
    
    /* 1 */ val FlatLight: typingsSlinky.ejWebAll.ej.Sparkline.Theme.FlatLight with Double = js.native
    
    /* 9 */ val GradientDark: typingsSlinky.ejWebAll.ej.Sparkline.Theme.GradientDark with Double = js.native
    
    /* 8 */ val GradientLight: typingsSlinky.ejWebAll.ej.Sparkline.Theme.GradientLight with Double = js.native
    
    /* 4 */ val Lime: typingsSlinky.ejWebAll.ej.Sparkline.Theme.Lime with Double = js.native
    
    /* 5 */ val LimeDark: typingsSlinky.ejWebAll.ej.Sparkline.Theme.LimeDark with Double = js.native
    
    /* 6 */ val Saffron: typingsSlinky.ejWebAll.ej.Sparkline.Theme.Saffron with Double = js.native
    
    /* 7 */ val SaffronDark: typingsSlinky.ejWebAll.ej.Sparkline.Theme.SaffronDark with Double = js.native
  }
  
  @JSGlobal("ej.Sparkline.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Sparkline.Type with Double] = js.native
    
    /* 0 */ val Area: typingsSlinky.ejWebAll.ej.Sparkline.Type.Area with Double = js.native
    
    /* 2 */ val Column: typingsSlinky.ejWebAll.ej.Sparkline.Type.Column with Double = js.native
    
    /* 1 */ val Line: typingsSlinky.ejWebAll.ej.Sparkline.Type.Line with Double = js.native
    
    /* 3 */ val Pie: typingsSlinky.ejWebAll.ej.Sparkline.Type.Pie with Double = js.native
    
    /* 4 */ val WinLoss: typingsSlinky.ejWebAll.ej.Sparkline.Type.WinLoss with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Sparkline.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.Sparkline = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.Sparkline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
