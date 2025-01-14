package typingsSlinky.stripe.anon

import typingsSlinky.stripe.mod.paymentMethods.IPaymentMethodType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeT[T /* <: IPaymentMethodType */] extends StObject {
  
  var `type`: T = js.native
}
object TypeT {
  
  @scala.inline
  def apply[T /* <: IPaymentMethodType */](`type`: T): TypeT[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeT[T]]
  }
  
  @scala.inline
  implicit class TypeTMutableBuilder[Self <: TypeT[_], T /* <: IPaymentMethodType */] (val x: Self with TypeT[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
