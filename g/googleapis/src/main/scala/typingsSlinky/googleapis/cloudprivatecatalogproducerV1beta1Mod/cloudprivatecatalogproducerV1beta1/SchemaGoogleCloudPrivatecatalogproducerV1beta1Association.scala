package typingsSlinky.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An association tuple that pairs a `Catalog` to a resource that can use the
  * `Catalog`. After association, a google.cloud.privatecatalog.v1beta1.Catalog
  * becomes available to consumers under specified Association.resource and all
  * of its child nodes. Users who have the `cloudprivatecatalog.targets.get`
  * permission on any of the resource nodes can access the catalog and child
  * products under the node.  For example, suppose the cloud resource hierarchy
  * is as follows:  * organizations/example.com   * folders/team     *
  * projects/test  After creating an association with
  * `organizations/example.com`, the catalog `catalogs/1`  is accessible from
  * the following paths:  * organizations/example.com * folders/team *
  * projects/test  Users can access them by
  * google.cloud.v1beta1.PrivateCatalog.SearchCatalogs action.
  */
@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1Association extends StObject {
  
  /**
    * The creation time of the association.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The resource name of the catalog association, in the format
    * `catalogs/{catalog_id}/associations/{association_id}&#39;.  A unique
    * identifier for the catalog association, which is generated by catalog
    * service.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Required. The user-supplied fully qualified name of the `Resource`
    * associated to the `Catalog`. It supports `Organization`, `Folder`, and
    * `Project`. Values are of the form  *
    * `//cloudresourcemanager.googleapis.com/projects/{product_number}` *
    * `//cloudresourcemanager.googleapis.com/folders/{folder_id}` *
    * `//cloudresourcemanager.googleapis.com/organizations/{organization_id}`
    */
  var resource: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudPrivatecatalogproducerV1beta1Association {
  
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1Association = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1AssociationMutableBuilder[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1Association] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
