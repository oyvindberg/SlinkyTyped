package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.JSXAttribute
import typingsSlinky.babelTypes.babelTypesStrings.JSXClosingElement
import typingsSlinky.babelTypes.babelTypesStrings.JSXClosingFragment
import typingsSlinky.babelTypes.babelTypesStrings.JSXElement
import typingsSlinky.babelTypes.babelTypesStrings.JSXEmptyExpression
import typingsSlinky.babelTypes.babelTypesStrings.JSXExpressionContainer
import typingsSlinky.babelTypes.babelTypesStrings.JSXFragment
import typingsSlinky.babelTypes.babelTypesStrings.JSXIdentifier
import typingsSlinky.babelTypes.babelTypesStrings.JSXMemberExpression
import typingsSlinky.babelTypes.babelTypesStrings.JSXNamespacedName
import typingsSlinky.babelTypes.babelTypesStrings.JSXOpeningElement
import typingsSlinky.babelTypes.babelTypesStrings.JSXOpeningFragment
import typingsSlinky.babelTypes.babelTypesStrings.JSXSpreadAttribute
import typingsSlinky.babelTypes.babelTypesStrings.JSXSpreadChild
import typingsSlinky.babelTypes.babelTypesStrings.JSXText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.JSXAttribute_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXClosingElement_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXElement_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXEmptyExpression_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXExpressionContainer_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXSpreadChild_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXIdentifier_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXMemberExpression_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXNamespacedName_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXOpeningElement_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXSpreadAttribute_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXText_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXFragment_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXOpeningFragment_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXClosingFragment_
*/
trait JSX extends _Node
object JSX {
  
  @scala.inline
  def JSXAttribute_(name: JSXIdentifier_ | JSXNamespacedName_, `type`: JSXAttribute): typingsSlinky.babelTypes.indexTs37Mod.JSXAttribute_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXAttribute_]
  }
  
  @scala.inline
  def JSXClosingElement_(name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_, `type`: JSXClosingElement): typingsSlinky.babelTypes.indexTs37Mod.JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXClosingElement_]
  }
  
  @scala.inline
  def JSXClosingFragment_(`type`: JSXClosingFragment): typingsSlinky.babelTypes.indexTs37Mod.JSXClosingFragment_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXClosingFragment_]
  }
  
  @scala.inline
  def JSXElement_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | typingsSlinky.babelTypes.indexTs37Mod.JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_,
    `type`: JSXElement
  ): typingsSlinky.babelTypes.indexTs37Mod.JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXElement_]
  }
  
  @scala.inline
  def JSXEmptyExpression_(`type`: JSXEmptyExpression): typingsSlinky.babelTypes.indexTs37Mod.JSXEmptyExpression_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXEmptyExpression_]
  }
  
  @scala.inline
  def JSXExpressionContainer_(expression: Expression | JSXEmptyExpression_, `type`: JSXExpressionContainer): typingsSlinky.babelTypes.indexTs37Mod.JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXExpressionContainer_]
  }
  
  @scala.inline
  def JSXFragment_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | typingsSlinky.babelTypes.indexTs37Mod.JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_,
    `type`: JSXFragment
  ): typingsSlinky.babelTypes.indexTs37Mod.JSXFragment_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXFragment_]
  }
  
  @scala.inline
  def JSXIdentifier_(name: String, `type`: JSXIdentifier): typingsSlinky.babelTypes.indexTs37Mod.JSXIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXIdentifier_]
  }
  
  @scala.inline
  def JSXMemberExpression_(
    `object`: typingsSlinky.babelTypes.indexTs37Mod.JSXMemberExpression_ | JSXIdentifier_,
    property: JSXIdentifier_,
    `type`: JSXMemberExpression
  ): typingsSlinky.babelTypes.indexTs37Mod.JSXMemberExpression_ = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXMemberExpression_]
  }
  
  @scala.inline
  def JSXNamespacedName_(name: JSXIdentifier_, namespace: JSXIdentifier_, `type`: JSXNamespacedName): typingsSlinky.babelTypes.indexTs37Mod.JSXNamespacedName_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXNamespacedName_]
  }
  
  @scala.inline
  def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    selfClosing: Boolean,
    `type`: JSXOpeningElement
  ): typingsSlinky.babelTypes.indexTs37Mod.JSXOpeningElement_ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXOpeningElement_]
  }
  
  @scala.inline
  def JSXOpeningFragment_(`type`: JSXOpeningFragment): typingsSlinky.babelTypes.indexTs37Mod.JSXOpeningFragment_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXOpeningFragment_]
  }
  
  @scala.inline
  def JSXSpreadAttribute_(argument: Expression, `type`: JSXSpreadAttribute): typingsSlinky.babelTypes.indexTs37Mod.JSXSpreadAttribute_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXSpreadAttribute_]
  }
  
  @scala.inline
  def JSXSpreadChild_(expression: Expression, `type`: JSXSpreadChild): typingsSlinky.babelTypes.indexTs37Mod.JSXSpreadChild_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXSpreadChild_]
  }
  
  @scala.inline
  def JSXText_(`type`: JSXText, value: String): typingsSlinky.babelTypes.indexTs37Mod.JSXText_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.JSXText_]
  }
}
