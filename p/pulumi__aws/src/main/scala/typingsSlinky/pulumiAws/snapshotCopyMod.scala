package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapshotCopyMod {
  
  @JSImport("@pulumi/aws/ebs/snapshotCopy", "SnapshotCopy")
  @js.native
  class SnapshotCopy protected () extends CustomResource {
    /**
      * Create a SnapshotCopy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotCopyArgs) = this()
    def this(name: String, args: SnapshotCopyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the EBS Snapshot.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The data encryption key identifier for the snapshot.
      * * `sourceSnapshotId` The ARN of the copied snapshot.
      * * `sourceRegion` The region of the source snapshot.
      */
    val dataEncryptionKeyId: Output_[String] = js.native
    
    /**
      * A description of what the snapshot is.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether the snapshot is encrypted.
      */
    val encrypted: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
      */
    val ownerAlias: Output_[String] = js.native
    
    /**
      * The AWS account ID of the snapshot owner.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * The region of the source snapshot.
      */
    val sourceRegion: Output_[String] = js.native
    
    /**
      * The ARN for the snapshot to be copied.
      */
    val sourceSnapshotId: Output_[String] = js.native
    
    /**
      * A map of tags for the snapshot.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    val volumeId: Output_[String] = js.native
    
    /**
      * The size of the drive in GiBs.
      */
    val volumeSize: Output_[Double] = js.native
  }
  /* static members */
  object SnapshotCopy {
    
    /**
      * Get an existing SnapshotCopy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ebs/snapshotCopy", "SnapshotCopy.get")
    @js.native
    def get(name: String, id: Input[ID]): SnapshotCopy = js.native
    @JSImport("@pulumi/aws/ebs/snapshotCopy", "SnapshotCopy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SnapshotCopy = js.native
    @JSImport("@pulumi/aws/ebs/snapshotCopy", "SnapshotCopy.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyState): SnapshotCopy = js.native
    @JSImport("@pulumi/aws/ebs/snapshotCopy", "SnapshotCopy.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyState, opts: CustomResourceOptions): SnapshotCopy = js.native
    
    /**
      * Returns true if the given object is an instance of SnapshotCopy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ebs/snapshotCopy", "SnapshotCopy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshotCopy.SnapshotCopy */ Boolean = js.native
  }
  
  @js.native
  trait SnapshotCopyArgs extends StObject {
    
    /**
      * A description of what the snapshot is.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether the snapshot is encrypted.
      */
    val encrypted: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The region of the source snapshot.
      */
    val sourceRegion: Input[String] = js.native
    
    /**
      * The ARN for the snapshot to be copied.
      */
    val sourceSnapshotId: Input[String] = js.native
    
    /**
      * A map of tags for the snapshot.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object SnapshotCopyArgs {
    
    @scala.inline
    def apply(sourceRegion: Input[String], sourceSnapshotId: Input[String]): SnapshotCopyArgs = {
      val __obj = js.Dynamic.literal(sourceRegion = sourceRegion.asInstanceOf[js.Any], sourceSnapshotId = sourceSnapshotId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotCopyArgs]
    }
    
    @scala.inline
    implicit class SnapshotCopyArgsMutableBuilder[Self <: SnapshotCopyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setSourceRegion(value: Input[String]): Self = StObject.set(x, "sourceRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceSnapshotId(value: Input[String]): Self = StObject.set(x, "sourceSnapshotId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait SnapshotCopyState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the EBS Snapshot.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The data encryption key identifier for the snapshot.
      * * `sourceSnapshotId` The ARN of the copied snapshot.
      * * `sourceRegion` The region of the source snapshot.
      */
    val dataEncryptionKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A description of what the snapshot is.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether the snapshot is encrypted.
      */
    val encrypted: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
      */
    val ownerAlias: js.UndefOr[Input[String]] = js.native
    
    /**
      * The AWS account ID of the snapshot owner.
      */
    val ownerId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The region of the source snapshot.
      */
    val sourceRegion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN for the snapshot to be copied.
      */
    val sourceSnapshotId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags for the snapshot.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    val volumeId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The size of the drive in GiBs.
      */
    val volumeSize: js.UndefOr[Input[Double]] = js.native
  }
  object SnapshotCopyState {
    
    @scala.inline
    def apply(): SnapshotCopyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotCopyState]
    }
    
    @scala.inline
    implicit class SnapshotCopyStateMutableBuilder[Self <: SnapshotCopyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDataEncryptionKeyId(value: Input[String]): Self = StObject.set(x, "dataEncryptionKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataEncryptionKeyIdUndefined: Self = StObject.set(x, "dataEncryptionKeyId", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setOwnerAlias(value: Input[String]): Self = StObject.set(x, "ownerAlias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerAliasUndefined: Self = StObject.set(x, "ownerAlias", js.undefined)
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setSourceRegion(value: Input[String]): Self = StObject.set(x, "sourceRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRegionUndefined: Self = StObject.set(x, "sourceRegion", js.undefined)
      
      @scala.inline
      def setSourceSnapshotId(value: Input[String]): Self = StObject.set(x, "sourceSnapshotId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceSnapshotIdUndefined: Self = StObject.set(x, "sourceSnapshotId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVolumeId(value: Input[String]): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
      
      @scala.inline
      def setVolumeSize(value: Input[Double]): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeSizeUndefined: Self = StObject.set(x, "volumeSize", js.undefined)
    }
  }
}
