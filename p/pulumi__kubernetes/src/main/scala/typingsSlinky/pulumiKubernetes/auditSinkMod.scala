package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.outputMod.auditregistration.v1alpha1.AuditSinkSpec
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.auditregistrationDotk8sDotioSlashv1alpha1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auditSinkMod {
  
  @JSImport("@pulumi/kubernetes/auditregistration/v1alpha1/auditSink", "AuditSink")
  @js.native
  class AuditSink protected () extends CustomResource {
    /**
      * Create a AuditSink resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AuditSinkArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AuditSinkArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[auditregistrationDotk8sDotioSlashv1alpha1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.AuditSink] = js.native
    
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Spec defines the audit configuration spec
      */
    val spec: Output_[AuditSinkSpec] = js.native
  }
  /* static members */
  object AuditSink {
    
    /**
      * Get an existing AuditSink resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/auditregistration/v1alpha1/auditSink", "AuditSink.get")
    @js.native
    def get(name: String, id: Input[ID]): AuditSink = js.native
    @JSImport("@pulumi/kubernetes/auditregistration/v1alpha1/auditSink", "AuditSink.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): AuditSink = js.native
    
    /**
      * Returns true if the given object is an instance of AuditSink.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/auditregistration/v1alpha1/auditSink", "AuditSink.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSink.AuditSink */ Boolean = js.native
  }
  
  @js.native
  trait AuditSinkArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[auditregistrationDotk8sDotioSlashv1alpha1]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.AuditSink]] = js.native
    
    val metadata: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.native
    
    /**
      * Spec defines the audit configuration spec
      */
    val spec: js.UndefOr[
        Input[typingsSlinky.pulumiKubernetes.inputMod.auditregistration.v1alpha1.AuditSinkSpec]
      ] = js.native
  }
  object AuditSinkArgs {
    
    @scala.inline
    def apply(): AuditSinkArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuditSinkArgs]
    }
    
    @scala.inline
    implicit class AuditSinkArgsMutableBuilder[Self <: AuditSinkArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[auditregistrationDotk8sDotioSlashv1alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.AuditSink]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[typingsSlinky.pulumiKubernetes.inputMod.auditregistration.v1alpha1.AuditSinkSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
