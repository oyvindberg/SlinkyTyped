package typingsSlinky.rax.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentClass[P, S]
  extends StaticLifecycle[P, S]
     with Instantiable1[/* props */ P, Component[P, S, js.Any]]
     with Instantiable2[/* props */ P, /* context */ js.Any, Component[P, S, js.Any]] {
  
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var contextType: js.UndefOr[Context[_]] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMap[P]] = js.native
}
