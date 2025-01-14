package typingsSlinky.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRequestContext extends StObject {
  
  /** The type of HTTP request, such as `GET`, `POST`, etc. */
  var method: js.UndefOr[String] = js.native
  
  /** The referrer information that is provided with the request. */
  var referrer: js.UndefOr[String] = js.native
  
  /**
    * The IP address from which the request originated. This can be IPv4, IPv6, or a token which is derived from the IP address, depending on the data that has been provided in the error
    * report.
    */
  var remoteIp: js.UndefOr[String] = js.native
  
  /** The HTTP response status code for the request. */
  var responseStatusCode: js.UndefOr[Double] = js.native
  
  /** The URL of the request. */
  var url: js.UndefOr[String] = js.native
  
  /** The user agent information that is provided with the request. */
  var userAgent: js.UndefOr[String] = js.native
}
object HttpRequestContext {
  
  @scala.inline
  def apply(): HttpRequestContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRequestContext]
  }
  
  @scala.inline
  implicit class HttpRequestContextMutableBuilder[Self <: HttpRequestContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    @scala.inline
    def setRemoteIp(value: String): Self = StObject.set(x, "remoteIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIpUndefined: Self = StObject.set(x, "remoteIp", js.undefined)
    
    @scala.inline
    def setResponseStatusCode(value: Double): Self = StObject.set(x, "responseStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatusCodeUndefined: Self = StObject.set(x, "responseStatusCode", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
