package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.CarePlan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyCarePlan extends StObject {
  
  var body: CarePlan = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.CarePlan = js.native
}
object BodyCarePlan {
  
  @scala.inline
  def apply(body: CarePlan, resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.CarePlan): BodyCarePlan = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyCarePlan]
  }
  
  @scala.inline
  implicit class BodyCarePlanMutableBuilder[Self <: BodyCarePlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: CarePlan): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.CarePlan): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
