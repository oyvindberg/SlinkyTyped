package typingsSlinky.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceProfile extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The description of the instance profile.
    */
  var description: js.UndefOr[Message] = js.native
  
  /**
    * An array of strings containing the list of app packages that should not be cleaned up from the device after a test run completes. The list of packages is considered only if you set packageCleanup to true.
    */
  var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.native
  
  /**
    * The name of the instance profile.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * When set to true, Device Farm removes app packages after a test run. The default value is false for private devices.
    */
  var packageCleanup: js.UndefOr[Boolean] = js.native
  
  /**
    * When set to true, Device Farm reboots the instance after a test run. The default value is true.
    */
  var rebootAfterUse: js.UndefOr[Boolean] = js.native
}
object InstanceProfile {
  
  @scala.inline
  def apply(): InstanceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceProfile]
  }
  
  @scala.inline
  implicit class InstanceProfileMutableBuilder[Self <: InstanceProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExcludeAppPackagesFromCleanup(value: PackageIds): Self = StObject.set(x, "excludeAppPackagesFromCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeAppPackagesFromCleanupUndefined: Self = StObject.set(x, "excludeAppPackagesFromCleanup", js.undefined)
    
    @scala.inline
    def setExcludeAppPackagesFromCleanupVarargs(value: String*): Self = StObject.set(x, "excludeAppPackagesFromCleanup", js.Array(value :_*))
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPackageCleanup(value: Boolean): Self = StObject.set(x, "packageCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageCleanupUndefined: Self = StObject.set(x, "packageCleanup", js.undefined)
    
    @scala.inline
    def setRebootAfterUse(value: Boolean): Self = StObject.set(x, "rebootAfterUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebootAfterUseUndefined: Self = StObject.set(x, "rebootAfterUse", js.undefined)
  }
}
