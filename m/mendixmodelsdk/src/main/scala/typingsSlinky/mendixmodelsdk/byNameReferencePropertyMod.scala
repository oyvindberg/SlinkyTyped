package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mobx.observablevalueMod.IObservableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byNameReferencePropertyMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/ByNameReferenceProperty", "ByNameReferenceListProperty")
  @js.native
  class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
    extends AbstractProperty[js.Array[T], IList[String]] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      value: js.Array[T],
      _targetType: String
    ) = this()
    
    @JSName("parent")
    var parent_ByNameReferenceListProperty: AbstractElement[IAbstractModel, Container] = js.native
    
    def qualifiedNames(): js.Array[String] = js.native
    
    def targetType: String = js.native
    
    def updateWithRawValue(value: js.Array[String]): Unit = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/ByNameReferenceProperty", "ByNameReferenceProperty")
  @js.native
  class ByNameReferenceProperty[T /* <: IAbstractElement */] protected () extends AbstractProperty[T | Null, IObservableValue[String | Null]] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
    
    @JSName("parent")
    var parent_ByNameReferenceProperty: AbstractElement[IAbstractModel, Container] = js.native
    
    def qualifiedName(): String | Null = js.native
    
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    
    def targetType: String = js.native
    
    def updateWithRawValue(value: String): Unit = js.native
  }
}
