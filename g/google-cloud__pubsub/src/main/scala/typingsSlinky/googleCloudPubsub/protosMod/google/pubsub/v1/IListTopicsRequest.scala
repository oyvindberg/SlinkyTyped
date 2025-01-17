package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListTopicsRequest. */
@js.native
trait IListTopicsRequest extends StObject {
  
  /** ListTopicsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.native
  
  /** ListTopicsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.native
  
  /** ListTopicsRequest project */
  var project: js.UndefOr[String | Null] = js.native
}
object IListTopicsRequest {
  
  @scala.inline
  def apply(): IListTopicsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListTopicsRequest]
  }
  
  @scala.inline
  implicit class IListTopicsRequestMutableBuilder[Self <: IListTopicsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNull: Self = StObject.set(x, "project", null)
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
