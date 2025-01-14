package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * listener for results of {@link XNotifyingDispatch.dispatchWithNotification()}
  * @see XNotifyingDispatch
  */
@js.native
trait XDispatchResultListener extends XEventListener {
  
  /**
    * indicates finished dispatch
    * @param Result contains the result of the dispatch action
    * @see DispatchResultEvent
    */
  def dispatchFinished(Result: DispatchResultEvent): Unit = js.native
}
object XDispatchResultListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    dispatchFinished: DispatchResultEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDispatchResultListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dispatchFinished = js.Any.fromFunction1(dispatchFinished), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDispatchResultListener]
  }
  
  @scala.inline
  implicit class XDispatchResultListenerMutableBuilder[Self <: XDispatchResultListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispatchFinished(value: DispatchResultEvent => Unit): Self = StObject.set(x, "dispatchFinished", js.Any.fromFunction1(value))
  }
}
