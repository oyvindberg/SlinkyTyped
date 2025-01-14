package typingsSlinky.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.InBodyParameterObject
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.GeneralParameterObject
*/
trait Parameter
  extends typingsSlinky.openapiTypes.mod.OpenAPI.Parameter
object Parameter {
  
  @scala.inline
  def GeneralParameterObject(in: String, name: String, `type`: String): typingsSlinky.openapiTypes.mod.OpenAPIV2.GeneralParameterObject = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.openapiTypes.mod.OpenAPIV2.GeneralParameterObject]
  }
  
  @scala.inline
  def InBodyParameterObject(in: String, name: String, schema: Schema): typingsSlinky.openapiTypes.mod.OpenAPIV2.InBodyParameterObject = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.openapiTypes.mod.OpenAPIV2.InBodyParameterObject]
  }
}
