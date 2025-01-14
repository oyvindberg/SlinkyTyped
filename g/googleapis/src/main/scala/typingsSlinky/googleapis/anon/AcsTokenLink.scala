package typingsSlinky.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcsTokenLink extends StObject {
  
  var acsTokenLink: js.UndefOr[String] = js.native
  
  var downloadLink: js.UndefOr[String] = js.native
  
  var isAvailable: js.UndefOr[Boolean] = js.native
}
object AcsTokenLink {
  
  @scala.inline
  def apply(): AcsTokenLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcsTokenLink]
  }
  
  @scala.inline
  implicit class AcsTokenLinkMutableBuilder[Self <: AcsTokenLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcsTokenLink(value: String): Self = StObject.set(x, "acsTokenLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcsTokenLinkUndefined: Self = StObject.set(x, "acsTokenLink", js.undefined)
    
    @scala.inline
    def setDownloadLink(value: String): Self = StObject.set(x, "downloadLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadLinkUndefined: Self = StObject.set(x, "downloadLink", js.undefined)
    
    @scala.inline
    def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAvailableUndefined: Self = StObject.set(x, "isAvailable", js.undefined)
  }
}
