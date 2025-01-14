package typingsSlinky.nextServer.anon

import typingsSlinky.nextServer.nextServerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyParser extends StObject {
  
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    */
  var bodyParser: js.UndefOr[SizeLimit | `false`] = js.native
}
object BodyParser {
  
  @scala.inline
  def apply(): BodyParser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyParser]
  }
  
  @scala.inline
  implicit class BodyParserMutableBuilder[Self <: BodyParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyParser(value: SizeLimit | `false`): Self = StObject.set(x, "bodyParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyParserUndefined: Self = StObject.set(x, "bodyParser", js.undefined)
  }
}
