package typingsSlinky.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait publishingClient extends StObject {
  
  /**
    * The publishing client's bound records.
    */
  var boundRecords: js.Any = js.native
  
  /**
    * The publishing client's unique identifier.
    */
  var id: String = js.native
}
object publishingClient {
  
  @scala.inline
  def apply(boundRecords: js.Any, id: String): publishingClient = {
    val __obj = js.Dynamic.literal(boundRecords = boundRecords.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[publishingClient]
  }
  
  @scala.inline
  implicit class publishingClientMutableBuilder[Self <: publishingClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundRecords(value: js.Any): Self = StObject.set(x, "boundRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
