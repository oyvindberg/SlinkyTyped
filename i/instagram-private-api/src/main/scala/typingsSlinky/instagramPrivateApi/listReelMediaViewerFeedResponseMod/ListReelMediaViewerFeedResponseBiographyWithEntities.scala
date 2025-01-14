package typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReelMediaViewerFeedResponseBiographyWithEntities extends StObject {
  
  var entities: js.Array[_] = js.native
  
  var raw_text: String = js.native
}
object ListReelMediaViewerFeedResponseBiographyWithEntities {
  
  @scala.inline
  def apply(entities: js.Array[_], raw_text: String): ListReelMediaViewerFeedResponseBiographyWithEntities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseBiographyWithEntities]
  }
  
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseBiographyWithEntitiesMutableBuilder[Self <: ListReelMediaViewerFeedResponseBiographyWithEntities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[_]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: js.Any*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setRaw_text(value: String): Self = StObject.set(x, "raw_text", value.asInstanceOf[js.Any])
  }
}
