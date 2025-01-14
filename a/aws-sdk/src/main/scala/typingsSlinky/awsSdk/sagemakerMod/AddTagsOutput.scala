package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTagsOutput extends StObject {
  
  /**
    * A list of tags associated with the Amazon SageMaker resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object AddTagsOutput {
  
  @scala.inline
  def apply(): AddTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTagsOutput]
  }
  
  @scala.inline
  implicit class AddTagsOutputMutableBuilder[Self <: AddTagsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
