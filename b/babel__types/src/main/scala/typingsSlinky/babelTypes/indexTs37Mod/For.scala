package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.ForInStatement
import typingsSlinky.babelTypes.babelTypesStrings.ForOfStatement
import typingsSlinky.babelTypes.babelTypesStrings.ForStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.ForInStatement_
  - typingsSlinky.babelTypes.indexTs37Mod.ForStatement_
  - typingsSlinky.babelTypes.indexTs37Mod.ForOfStatement_
*/
trait For extends _Node
object For {
  
  @scala.inline
  def ForInStatement_(body: Statement, left: VariableDeclaration_ | LVal, right: Expression, `type`: ForInStatement): typingsSlinky.babelTypes.indexTs37Mod.ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ForInStatement_]
  }
  
  @scala.inline
  def ForOfStatement_(
    await: Boolean,
    body: Statement,
    left: VariableDeclaration_ | LVal,
    right: Expression,
    `type`: ForOfStatement
  ): typingsSlinky.babelTypes.indexTs37Mod.ForOfStatement_ = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ForOfStatement_]
  }
  
  @scala.inline
  def ForStatement_(body: Statement, `type`: ForStatement): typingsSlinky.babelTypes.indexTs37Mod.ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ForStatement_]
  }
}
