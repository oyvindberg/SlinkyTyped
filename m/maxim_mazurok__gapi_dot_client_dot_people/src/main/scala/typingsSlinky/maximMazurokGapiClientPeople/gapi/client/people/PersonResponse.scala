package typingsSlinky.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonResponse extends StObject {
  
  /** **DEPRECATED** (Please use status instead) [HTTP 1.1 status code] (http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html). */
  var httpStatusCode: js.UndefOr[Double] = js.native
  
  /** The person. */
  var person: js.UndefOr[Person] = js.native
  
  /**
    * The original requested resource name. May be different than the resource name on the returned person. The resource name can change when adding or removing fields that link a contact
    * and profile such as a verified email, verified phone number, or a profile URL.
    */
  var requestedResourceName: js.UndefOr[String] = js.native
  
  /** The status of the response. */
  var status: js.UndefOr[Status] = js.native
}
object PersonResponse {
  
  @scala.inline
  def apply(): PersonResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonResponse]
  }
  
  @scala.inline
  implicit class PersonResponseMutableBuilder[Self <: PersonResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpStatusCode(value: Double): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpStatusCodeUndefined: Self = StObject.set(x, "httpStatusCode", js.undefined)
    
    @scala.inline
    def setPerson(value: Person): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
    
    @scala.inline
    def setRequestedResourceName(value: String): Self = StObject.set(x, "requestedResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedResourceNameUndefined: Self = StObject.set(x, "requestedResourceName", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
