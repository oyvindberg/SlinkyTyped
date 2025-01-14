package typingsSlinky.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A security policy is comprised of one or more rules. It can also be
  * associated with one or more &#39;targets&#39;. (== resource_for
  * v1.securityPolicies ==) (== resource_for beta.securityPolicies ==)
  */
@js.native
trait SchemaSecurityPolicy extends StObject {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Specifies a fingerprint for this resource, which is essentially a hash of
    * the metadata&#39;s contents and used for optimistic locking. The
    * fingerprint is initially generated by Compute Engine and changes after
    * every request to modify or update metadata. You must always provide an
    * up-to-date fingerprint hash in order to update or change metadata,
    * otherwise the request will fail with error 412 conditionNotMet.  To see
    * the latest fingerprint, make get() request to the security policy.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output only] Type of the resource. Always compute#securityPolicyfor
    * security policies
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A fingerprint for the labels being applied to this security policy, which
    * is essentially a hash of the labels set used for optimistic locking. The
    * fingerprint is initially generated by Compute Engine and changes after
    * every request to modify or update labels. You must always provide an
    * up-to-date fingerprint hash in order to update or change labels.  To see
    * the latest fingerprint, make get() request to the security policy.
    */
  var labelFingerprint: js.UndefOr[String] = js.native
  
  /**
    * Labels to apply to this security policy resource. These can be later
    * modified by the setLabels method. Each label key/value must comply with
    * RFC1035. Label values may be empty.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A list of rules that belong to this policy. There must always be a
    * default rule (rule with priority 2147483647 and match &quot;*&quot;). If
    * no rules are provided when creating a security policy, a default rule
    * with action &quot;allow&quot; will be added.
    */
  var rules: js.UndefOr[js.Array[SchemaSecurityPolicyRule]] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
}
object SchemaSecurityPolicy {
  
  @scala.inline
  def apply(): SchemaSecurityPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicy]
  }
  
  @scala.inline
  implicit class SchemaSecurityPolicyMutableBuilder[Self <: SchemaSecurityPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabelFingerprint(value: String): Self = StObject.set(x, "labelFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFingerprintUndefined: Self = StObject.set(x, "labelFingerprint", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[SchemaSecurityPolicyRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: SchemaSecurityPolicyRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
