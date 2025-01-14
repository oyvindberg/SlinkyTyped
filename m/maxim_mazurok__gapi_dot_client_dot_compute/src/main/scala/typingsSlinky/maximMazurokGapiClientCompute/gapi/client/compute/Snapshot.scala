package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snapshot extends StObject {
  
  /** [Output Only] Set to true if snapshots are automatically created by applying resource policy on the target disk. */
  var autoCreated: js.UndefOr[Boolean] = js.native
  
  /**
    * Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only
    * for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only
    * if it has a non-empty value.
    */
  var chainName: js.UndefOr[String] = js.native
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /** [Output Only] Size of the source disk, specified in GB. */
  var diskSizeGb: js.UndefOr[String] = js.native
  
  /** [Output Only] Number of bytes downloaded to restore a snapshot to a disk. */
  var downloadBytes: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** [Output Only] Type of the resource. Always compute#snapshot for Snapshot resources. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A fingerprint for the labels being applied to this snapshot, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by
    * Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the
    * request will fail with error 412 conditionNotMet.
    *
    * To see the latest fingerprint, make a get() request to retrieve a snapshot.
    */
  var labelFingerprint: js.UndefOr[String] = js.native
  
  /** Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.Snapshot with TopLevel[js.Any]
  ] = js.native
  
  /** [Output Only] Integer license codes indicating which licenses are attached to this snapshot. */
  var licenseCodes: js.UndefOr[js.Array[String]] = js.native
  
  /** [Output Only] A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses attached (such as a Windows image). */
  var licenses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Encrypts the snapshot using a customer-supplied encryption key.
    *
    * After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot later. For example, you must provide the encryption key when you
    * create a disk from the encrypted snapshot in a future request.
    *
    * Customer-supplied encryption keys do not protect access to metadata of the snapshot.
    *
    * If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do not need to provide a key to
    * use the snapshot later.
    */
  var snapshotEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.native
  
  /** The source disk used to create this snapshot. */
  var sourceDisk: js.UndefOr[String] = js.native
  
  /** The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key. */
  var sourceDiskEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.native
  
  /**
    * [Output Only] The ID value of the disk used to create this snapshot. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a
    * given disk name.
    */
  var sourceDiskId: js.UndefOr[String] = js.native
  
  /** [Output Only] The status of the snapshot. This can be CREATING, DELETING, FAILED, READY, or UPLOADING. */
  var status: js.UndefOr[String] = js.native
  
  /** [Output Only] A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot creation/deletion. */
  var storageBytes: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning
    * the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
    */
  var storageBytesStatus: js.UndefOr[String] = js.native
  
  /** Cloud Storage bucket storage location of the snapshot (regional or multi-regional). */
  var storageLocations: js.UndefOr[js.Array[String]] = js.native
}
object Snapshot {
  
  @scala.inline
  def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  
  @scala.inline
  implicit class SnapshotMutableBuilder[Self <: Snapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCreated(value: Boolean): Self = StObject.set(x, "autoCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreatedUndefined: Self = StObject.set(x, "autoCreated", js.undefined)
    
    @scala.inline
    def setChainName(value: String): Self = StObject.set(x, "chainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainNameUndefined: Self = StObject.set(x, "chainName", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    @scala.inline
    def setDownloadBytes(value: String): Self = StObject.set(x, "downloadBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadBytesUndefined: Self = StObject.set(x, "downloadBytes", js.undefined)
    
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
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.Snapshot with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLicenseCodes(value: js.Array[String]): Self = StObject.set(x, "licenseCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseCodesUndefined: Self = StObject.set(x, "licenseCodes", js.undefined)
    
    @scala.inline
    def setLicenseCodesVarargs(value: String*): Self = StObject.set(x, "licenseCodes", js.Array(value :_*))
    
    @scala.inline
    def setLicenses(value: js.Array[String]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
    
    @scala.inline
    def setLicensesVarargs(value: String*): Self = StObject.set(x, "licenses", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSnapshotEncryptionKey(value: CustomerEncryptionKey): Self = StObject.set(x, "snapshotEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotEncryptionKeyUndefined: Self = StObject.set(x, "snapshotEncryptionKey", js.undefined)
    
    @scala.inline
    def setSourceDisk(value: String): Self = StObject.set(x, "sourceDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDiskEncryptionKey(value: CustomerEncryptionKey): Self = StObject.set(x, "sourceDiskEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDiskEncryptionKeyUndefined: Self = StObject.set(x, "sourceDiskEncryptionKey", js.undefined)
    
    @scala.inline
    def setSourceDiskId(value: String): Self = StObject.set(x, "sourceDiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDiskIdUndefined: Self = StObject.set(x, "sourceDiskId", js.undefined)
    
    @scala.inline
    def setSourceDiskUndefined: Self = StObject.set(x, "sourceDisk", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStorageBytes(value: String): Self = StObject.set(x, "storageBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageBytesStatus(value: String): Self = StObject.set(x, "storageBytesStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageBytesStatusUndefined: Self = StObject.set(x, "storageBytesStatus", js.undefined)
    
    @scala.inline
    def setStorageBytesUndefined: Self = StObject.set(x, "storageBytes", js.undefined)
    
    @scala.inline
    def setStorageLocations(value: js.Array[String]): Self = StObject.set(x, "storageLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageLocationsUndefined: Self = StObject.set(x, "storageLocations", js.undefined)
    
    @scala.inline
    def setStorageLocationsVarargs(value: String*): Self = StObject.set(x, "storageLocations", js.Array(value :_*))
  }
}
