package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds the composite type.
  */
@js.native
trait SchemaCompositeType extends StObject {
  
  /**
    * An optional textual description of the resource; provided by the client
    * when the resource is created.
    */
  var description: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  /**
    * Output only. Creation timestamp in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.native
  
  /**
    * Map of labels; provided by the client when the resource is created or
    * updated. Specifically: Label keys must be between 1 and 63 characters
    * long and must conform to the following regular expression:
    * [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63
    * characters long and must conform to the regular expression
    * ([a-z]([-a-z0-9]*[a-z0-9])?)?
    */
  var labels: js.UndefOr[js.Array[SchemaCompositeTypeLabelEntry]] = js.native
  
  /**
    * Name of the composite type, must follow the expression:
    * [a-z]([-a-z0-9_.]{0,61}[a-z0-9])?.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The Operation that most recently ran, or is currently
    * running, on this composite type.
    */
  var operation: js.UndefOr[SchemaOperation] = js.native
  
  /**
    * Output only. Server defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  /**
    * Files for the template type.
    */
  var templateContents: js.UndefOr[SchemaTemplateContents] = js.native
}
object SchemaCompositeType {
  
  @scala.inline
  def apply(): SchemaCompositeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompositeType]
  }
  
  @scala.inline
  implicit class SchemaCompositeTypeMutableBuilder[Self <: SchemaCompositeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[SchemaCompositeTypeLabelEntry]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: SchemaCompositeTypeLabelEntry*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperation(value: SchemaOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTemplateContents(value: SchemaTemplateContents): Self = StObject.set(x, "templateContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateContentsUndefined: Self = StObject.set(x, "templateContents", js.undefined)
  }
}
