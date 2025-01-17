package typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIosPostInstallAttributionRequest extends StObject {
  
  /** App installation epoch time (https://en.wikipedia.org/wiki/Unix_time). This is a client signal for a more accurate weak match. */
  var appInstallationTime: js.UndefOr[String] = js.native
  
  /** APP bundle ID. */
  var bundleId: js.UndefOr[String] = js.native
  
  /** Device information. */
  var device: js.UndefOr[DeviceInfo] = js.native
  
  /** iOS version, ie: 9.3.5. Consider adding "build". */
  var iosVersion: js.UndefOr[String] = js.native
  
  /** App post install attribution retrieval information. Disambiguates mechanism (iSDK or developer invoked) to retrieve payload from clicked link. */
  var retrievalMethod: js.UndefOr[String] = js.native
  
  /** Google SDK version. Version takes the form "$major.$minor.$patch" */
  var sdkVersion: js.UndefOr[String] = js.native
  
  /**
    * Possible unique matched link that server need to check before performing fingerprint match. If passed link is short server need to expand the link. If link is long server need to
    * vslidate the link.
    */
  var uniqueMatchLinkToCheck: js.UndefOr[String] = js.native
  
  /** Strong match page information. Disambiguates between default UI and custom page to present when strong match succeeds/fails to find cookie. */
  var visualStyle: js.UndefOr[String] = js.native
}
object GetIosPostInstallAttributionRequest {
  
  @scala.inline
  def apply(): GetIosPostInstallAttributionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIosPostInstallAttributionRequest]
  }
  
  @scala.inline
  implicit class GetIosPostInstallAttributionRequestMutableBuilder[Self <: GetIosPostInstallAttributionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstallationTime(value: String): Self = StObject.set(x, "appInstallationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstallationTimeUndefined: Self = StObject.set(x, "appInstallationTime", js.undefined)
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setDevice(value: DeviceInfo): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setIosVersion(value: String): Self = StObject.set(x, "iosVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosVersionUndefined: Self = StObject.set(x, "iosVersion", js.undefined)
    
    @scala.inline
    def setRetrievalMethod(value: String): Self = StObject.set(x, "retrievalMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrievalMethodUndefined: Self = StObject.set(x, "retrievalMethod", js.undefined)
    
    @scala.inline
    def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    
    @scala.inline
    def setUniqueMatchLinkToCheck(value: String): Self = StObject.set(x, "uniqueMatchLinkToCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueMatchLinkToCheckUndefined: Self = StObject.set(x, "uniqueMatchLinkToCheck", js.undefined)
    
    @scala.inline
    def setVisualStyle(value: String): Self = StObject.set(x, "visualStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualStyleUndefined: Self = StObject.set(x, "visualStyle", js.undefined)
  }
}
