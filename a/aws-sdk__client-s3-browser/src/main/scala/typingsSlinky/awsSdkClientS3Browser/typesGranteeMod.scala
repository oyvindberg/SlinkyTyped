package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.AmazonCustomerByEmail
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.CanonicalUser
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGranteeMod {
  
  @js.native
  trait Grantee extends StObject {
    
    /**
      * <p>Screen name of the grantee.</p>
      */
    var DisplayName: js.UndefOr[String] = js.native
    
    /**
      * <p>Email address of the grantee.</p>
      */
    var EmailAddress: js.UndefOr[String] = js.native
    
    /**
      * <p>The canonical user ID of the grantee.</p>
      */
    var ID: js.UndefOr[String] = js.native
    
    /**
      * <p>Type of grantee</p>
      */
    var Type: CanonicalUser | AmazonCustomerByEmail | Group | String = js.native
    
    /**
      * <p>URI of the grantee group.</p>
      */
    var URI: js.UndefOr[String] = js.native
  }
  object Grantee {
    
    @scala.inline
    def apply(Type: CanonicalUser | AmazonCustomerByEmail | Group | String): Grantee = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Grantee]
    }
    
    @scala.inline
    implicit class GranteeMutableBuilder[Self <: Grantee] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
      
      @scala.inline
      def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      @scala.inline
      def setType(value: CanonicalUser | AmazonCustomerByEmail | Group | String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
    }
  }
  
  type UnmarshalledGrantee = Grantee
}
