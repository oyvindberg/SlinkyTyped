package typingsSlinky.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionUseDbOptions extends js.Object {
  
  /**
    * If true, cache results so calling `useDb()` multiple times with the same name only creates 1 connection object.
    */
  var useCache: js.UndefOr[Boolean] = js.native
}
object ConnectionUseDbOptions {
  
  @scala.inline
  def apply(): ConnectionUseDbOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionUseDbOptions]
  }
  
  @scala.inline
  implicit class ConnectionUseDbOptionsOps[Self <: ConnectionUseDbOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUseCache(value: Boolean): Self = this.set("useCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCache: Self = this.set("useCache", js.undefined)
  }
}
