package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.UsersBlockEndpoint
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1069` extends StObject {
  
  var parameters: RequestParameters with (Omit[UsersBlockEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[_] = js.native
}
object `1069` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersBlockEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[_]
  ): `1069` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1069`]
  }
  
  @scala.inline
  implicit class `1069MutableBuilder`[Self <: `1069`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[UsersBlockEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
