package typingsSlinky.pulumiAws.mod.iam

import typingsSlinky.pulumiAws.sshKeyMod.SshKeyArgs
import typingsSlinky.pulumiAws.sshKeyMod.SshKeyState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "iam.SshKey")
@js.native
class SshKey protected ()
  extends typingsSlinky.pulumiAws.iamMod.SshKey {
  /**
    * Create a SshKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SshKeyArgs) = this()
  def this(name: String, args: SshKeyArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object SshKey {
  
  /**
    * Get an existing SshKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "iam.SshKey.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.sshKeyMod.SshKey = js.native
  @JSImport("@pulumi/aws", "iam.SshKey.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.sshKeyMod.SshKey = js.native
  @JSImport("@pulumi/aws", "iam.SshKey.get")
  @js.native
  def get(name: String, id: Input[ID], state: SshKeyState): typingsSlinky.pulumiAws.sshKeyMod.SshKey = js.native
  @JSImport("@pulumi/aws", "iam.SshKey.get")
  @js.native
  def get(name: String, id: Input[ID], state: SshKeyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.sshKeyMod.SshKey = js.native
  
  /**
    * Returns true if the given object is an instance of SshKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "iam.SshKey.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/sshKey.SshKey */ Boolean = js.native
}
