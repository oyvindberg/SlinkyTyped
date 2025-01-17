package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookDirtiedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object WorkbookDirtiedEventUIParam {
  
  @scala.inline
  def apply(): WorkbookDirtiedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookDirtiedEventUIParam]
  }
  
  @scala.inline
  implicit class WorkbookDirtiedEventUIParamMutableBuilder[Self <: WorkbookDirtiedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
