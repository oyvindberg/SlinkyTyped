package typingsSlinky.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFirewallDeleteProtectionResponse extends StObject {
  
  /**
    * 
    */
  var DeleteProtection: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the firewall.
    */
  var FirewallArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
    */
  var FirewallName: js.UndefOr[ResourceName] = js.native
  
  /**
    * An optional token that you can use for optimistic locking. Network Firewall returns a token to your requests that access the firewall. The token marks the state of the firewall resource at the time of the request.  To make an unconditional change to the firewall, omit the token in your update request. Without the token, Network Firewall performs your updates regardless of whether the firewall has changed since you last retrieved it. To make a conditional change to the firewall, provide the token in your update request. Network Firewall uses the token to ensure that the firewall hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the firewall again to get a current copy of it with a new token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: js.UndefOr[typingsSlinky.awsSdk.networkfirewallMod.UpdateToken] = js.native
}
object UpdateFirewallDeleteProtectionResponse {
  
  @scala.inline
  def apply(): UpdateFirewallDeleteProtectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFirewallDeleteProtectionResponse]
  }
  
  @scala.inline
  implicit class UpdateFirewallDeleteProtectionResponseMutableBuilder[Self <: UpdateFirewallDeleteProtectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteProtection(value: Boolean): Self = StObject.set(x, "DeleteProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteProtectionUndefined: Self = StObject.set(x, "DeleteProtection", js.undefined)
    
    @scala.inline
    def setFirewallArn(value: ResourceArn): Self = StObject.set(x, "FirewallArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallArnUndefined: Self = StObject.set(x, "FirewallArn", js.undefined)
    
    @scala.inline
    def setFirewallName(value: ResourceName): Self = StObject.set(x, "FirewallName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallNameUndefined: Self = StObject.set(x, "FirewallName", js.undefined)
    
    @scala.inline
    def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTokenUndefined: Self = StObject.set(x, "UpdateToken", js.undefined)
  }
}
