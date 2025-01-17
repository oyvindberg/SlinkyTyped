package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.TreeView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTreeView extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: TreeView = js.native
}
object TypeofTreeView {
  
  @scala.inline
  def apply(Locale: js.Any, fn: TreeView): TypeofTreeView = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTreeView]
  }
  
  @scala.inline
  implicit class TypeofTreeViewMutableBuilder[Self <: TypeofTreeView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: TreeView): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
