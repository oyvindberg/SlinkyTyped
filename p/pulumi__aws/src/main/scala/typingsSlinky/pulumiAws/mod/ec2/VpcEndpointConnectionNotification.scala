package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.vpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotificationArgs
import typingsSlinky.pulumiAws.vpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotificationState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.VpcEndpointConnectionNotification")
@js.native
class VpcEndpointConnectionNotification protected ()
  extends typingsSlinky.pulumiAws.ec2Mod.VpcEndpointConnectionNotification {
  /**
    * Create a VpcEndpointConnectionNotification resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcEndpointConnectionNotificationArgs) = this()
  def this(name: String, args: VpcEndpointConnectionNotificationArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object VpcEndpointConnectionNotification {
  
  /**
    * Get an existing VpcEndpointConnectionNotification resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "ec2.VpcEndpointConnectionNotification.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.vpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotification = js.native
  @JSImport("@pulumi/aws", "ec2.VpcEndpointConnectionNotification.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotification = js.native
  @JSImport("@pulumi/aws", "ec2.VpcEndpointConnectionNotification.get")
  @js.native
  def get(name: String, id: Input[ID], state: VpcEndpointConnectionNotificationState): typingsSlinky.pulumiAws.vpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotification = js.native
  @JSImport("@pulumi/aws", "ec2.VpcEndpointConnectionNotification.get")
  @js.native
  def get(
    name: String,
    id: Input[ID],
    state: VpcEndpointConnectionNotificationState,
    opts: CustomResourceOptions
  ): typingsSlinky.pulumiAws.vpcEndpointConnectionNotificationMod.VpcEndpointConnectionNotification = js.native
  
  /**
    * Returns true if the given object is an instance of VpcEndpointConnectionNotification.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "ec2.VpcEndpointConnectionNotification.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointConnectionNotification.VpcEndpointConnectionNotification */ Boolean = js.native
}
