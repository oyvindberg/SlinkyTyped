package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IP Set that this statement references.
    */
  var arn: Input[String] = js.native
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
    */
  var ipSetForwardedIpConfig: js.UndefOr[
    Input[
      WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig
    ]
  ] = js.native
}
object WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement {
  
  @scala.inline
  def apply(arn: Input[String]): WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementMutableBuilder[Self <: WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetForwardedIpConfig(
      value: Input[
          WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig
        ]
    ): Self = StObject.set(x, "ipSetForwardedIpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetForwardedIpConfigUndefined: Self = StObject.set(x, "ipSetForwardedIpConfig", js.undefined)
  }
}
