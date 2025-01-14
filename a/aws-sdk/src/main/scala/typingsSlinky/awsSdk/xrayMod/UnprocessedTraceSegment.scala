package typingsSlinky.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnprocessedTraceSegment extends StObject {
  
  /**
    * The error that caused processing to fail.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  
  /**
    * The segment's ID.
    */
  var Id: js.UndefOr[String] = js.native
  
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.native
}
object UnprocessedTraceSegment {
  
  @scala.inline
  def apply(): UnprocessedTraceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedTraceSegment]
  }
  
  @scala.inline
  implicit class UnprocessedTraceSegmentMutableBuilder[Self <: UnprocessedTraceSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
