package typingsSlinky.activexLibreoffice.com_.sun.star.container

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access contents through an implicit (unique) ID. */
@js.native
trait XImplicitIDAccess extends XElementAccess {
  
  /** @returns a sequence with all existing implicit IDs. */
  val ImplicitIDs: SafeArray[String] = js.native
  
  /** @returns the element with the specified implicit ID. */
  def getByImplicitID(ID: String): js.Any = js.native
  
  /** @returns a sequence with all existing implicit IDs. */
  def getImplicitIDs(): SafeArray[String] = js.native
}
object XImplicitIDAccess {
  
  @scala.inline
  def apply(
    ElementType: `type`,
    ImplicitIDs: SafeArray[String],
    acquire: () => Unit,
    getByImplicitID: String => js.Any,
    getElementType: () => `type`,
    getImplicitIDs: () => SafeArray[String],
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XImplicitIDAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], ImplicitIDs = ImplicitIDs.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByImplicitID = js.Any.fromFunction1(getByImplicitID), getElementType = js.Any.fromFunction0(getElementType), getImplicitIDs = js.Any.fromFunction0(getImplicitIDs), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XImplicitIDAccess]
  }
  
  @scala.inline
  implicit class XImplicitIDAccessMutableBuilder[Self <: XImplicitIDAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetByImplicitID(value: String => js.Any): Self = StObject.set(x, "getByImplicitID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetImplicitIDs(value: () => SafeArray[String]): Self = StObject.set(x, "getImplicitIDs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImplicitIDs(value: SafeArray[String]): Self = StObject.set(x, "ImplicitIDs", value.asInstanceOf[js.Any])
  }
}
