package typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1alpha1LabelVideoObjectTrackingOperationMetadata extends StObject {
  
  /** Basic human annotation config used in labeling request. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1alpha1HumanAnnotationConfig] = js.native
}
object GoogleCloudDatalabelingV1alpha1LabelVideoObjectTrackingOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1alpha1LabelVideoObjectTrackingOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1alpha1LabelVideoObjectTrackingOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1alpha1LabelVideoObjectTrackingOperationMetadataMutableBuilder[Self <: GoogleCloudDatalabelingV1alpha1LabelVideoObjectTrackingOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicConfig(value: GoogleCloudDatalabelingV1alpha1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}
