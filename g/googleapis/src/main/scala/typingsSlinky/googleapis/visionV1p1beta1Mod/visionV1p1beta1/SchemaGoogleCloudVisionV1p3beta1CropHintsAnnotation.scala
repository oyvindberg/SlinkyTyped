package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of crop hints that are used to generate new crops when serving images.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1CropHintsAnnotation extends StObject {
  
  /**
    * Crop hint results.
    */
  var cropHints: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1CropHint]] = js.native
}
object SchemaGoogleCloudVisionV1p3beta1CropHintsAnnotation {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1CropHintsAnnotation]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1CropHintsAnnotationMutableBuilder[Self <: SchemaGoogleCloudVisionV1p3beta1CropHintsAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCropHints(value: js.Array[SchemaGoogleCloudVisionV1p3beta1CropHint]): Self = StObject.set(x, "cropHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropHintsUndefined: Self = StObject.set(x, "cropHints", js.undefined)
    
    @scala.inline
    def setCropHintsVarargs(value: SchemaGoogleCloudVisionV1p3beta1CropHint*): Self = StObject.set(x, "cropHints", js.Array(value :_*))
  }
}
