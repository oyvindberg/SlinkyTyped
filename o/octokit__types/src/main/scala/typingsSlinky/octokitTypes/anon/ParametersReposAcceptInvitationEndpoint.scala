package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposAcceptInvitationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposAcceptInvitationRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposAcceptInvitationEndpoint extends StObject {
  
  var parameters: ReposAcceptInvitationEndpoint = js.native
  
  var request: ReposAcceptInvitationRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposAcceptInvitationEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposAcceptInvitationEndpoint,
    request: ReposAcceptInvitationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposAcceptInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAcceptInvitationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposAcceptInvitationEndpointMutableBuilder[Self <: ParametersReposAcceptInvitationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposAcceptInvitationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposAcceptInvitationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
