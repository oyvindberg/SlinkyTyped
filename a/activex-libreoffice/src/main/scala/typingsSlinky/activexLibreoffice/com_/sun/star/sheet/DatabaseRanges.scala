package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a collection of database ranges in a spreadsheet document.
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
@js.native
trait DatabaseRanges
  extends XDatabaseRanges
     with XEnumerationAccess
     with XIndexAccess
object DatabaseRanges {
  
  @scala.inline
  def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addNewByName: (String, CellRangeAddress) => Unit,
    createEnumeration: () => XEnumeration,
    getByIndex: Double => js.Any,
    getByName: String => js.Any,
    getCount: () => Double,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit
  ): DatabaseRanges = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addNewByName = js.Any.fromFunction2(addNewByName), createEnumeration = js.Any.fromFunction0(createEnumeration), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
    __obj.asInstanceOf[DatabaseRanges]
  }
}
