package typingsSlinky.pulumiAws.mod.apigateway

import typingsSlinky.pulumiAws.requestValidatorMod.RequestValidatorArgs
import typingsSlinky.pulumiAws.requestValidatorMod.RequestValidatorState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "apigateway.RequestValidator")
@js.native
class RequestValidator protected ()
  extends typingsSlinky.pulumiAws.apigatewayMod.RequestValidator {
  /**
    * Create a RequestValidator resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RequestValidatorArgs) = this()
  def this(name: String, args: RequestValidatorArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object RequestValidator {
  
  /**
    * Get an existing RequestValidator resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "apigateway.RequestValidator.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.requestValidatorMod.RequestValidator = js.native
  @JSImport("@pulumi/aws", "apigateway.RequestValidator.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.requestValidatorMod.RequestValidator = js.native
  @JSImport("@pulumi/aws", "apigateway.RequestValidator.get")
  @js.native
  def get(name: String, id: Input[ID], state: RequestValidatorState): typingsSlinky.pulumiAws.requestValidatorMod.RequestValidator = js.native
  @JSImport("@pulumi/aws", "apigateway.RequestValidator.get")
  @js.native
  def get(name: String, id: Input[ID], state: RequestValidatorState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.requestValidatorMod.RequestValidator = js.native
  
  /**
    * Returns true if the given object is an instance of RequestValidator.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "apigateway.RequestValidator.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/requestValidator.RequestValidator */ Boolean = js.native
}
