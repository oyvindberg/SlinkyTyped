package typingsSlinky.lokijs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.lokijs.anon.AsyncResponses
import typingsSlinky.lokijs.anon.Lastsave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In in-memory persistence adapter for an in-memory database.
  * This simple 'key/value' adapter is intended for unit testing and diagnostics.
  *
  * @param [options] - memory adapter options
  * @param [options.asyncResponses=false] - whether callbacks are invoked asynchronously
  * @param [options.asyncTimeout=50] - timeout in ms to queue callbacks
  * @constructor LokiMemoryAdapter
  */
@js.native
trait LokiMemoryAdapter extends LokiPersistenceAdapter {
  
  /**
    * Deletes a database from its in-memory store.
    *
    * @param dbname - name of the database (filename/keyname)
    * @param callback - function to call when done
    */
  @JSName("deleteDatabase")
  def deleteDatabase_MLokiMemoryAdapter(dbname: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  
  var hashStore: StringDictionary[Lastsave] = js.native
  
  var options: AsyncResponses = js.native
  
  /**
    * Saves a serialized database to its in-memory store.
    * (Loki persistence adapter interface function)
    *
    * @param dbname - name of the database (filename/keyname)
    * @param callback - adapter callback to return load result to caller
    */
  @JSName("saveDatabase")
  def saveDatabase_MLokiMemoryAdapter(
    dbname: String,
    dbstring: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = js.native
}
object LokiMemoryAdapter {
  
  @scala.inline
  def apply(
    deleteDatabase: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit,
    hashStore: StringDictionary[Lastsave],
    loadDatabase: (String, js.Function1[/* value */ js.Any, Unit]) => Unit,
    options: AsyncResponses,
    saveDatabase: (String, js.Any, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit
  ): LokiMemoryAdapter = {
    val __obj = js.Dynamic.literal(deleteDatabase = js.Any.fromFunction2(deleteDatabase), hashStore = hashStore.asInstanceOf[js.Any], loadDatabase = js.Any.fromFunction2(loadDatabase), options = options.asInstanceOf[js.Any], saveDatabase = js.Any.fromFunction3(saveDatabase))
    __obj.asInstanceOf[LokiMemoryAdapter]
  }
  
  @scala.inline
  implicit class LokiMemoryAdapterMutableBuilder[Self <: LokiMemoryAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteDatabase(value: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit): Self = StObject.set(x, "deleteDatabase", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHashStore(value: StringDictionary[Lastsave]): Self = StObject.set(x, "hashStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: AsyncResponses): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveDatabase(value: (String, js.Any, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit): Self = StObject.set(x, "saveDatabase", js.Any.fromFunction3(value))
  }
}
