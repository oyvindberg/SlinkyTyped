package typingsSlinky.mendixmodelsdk.mod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.AssociationRetrieveSource")
@js.native
class AssociationRetrieveSource protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.AssociationRetrieveSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object AssociationRetrieveSource {
  
  @JSImport("mendixmodelsdk", "microflows.AssociationRetrieveSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AssociationRetrieveSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.AssociationRetrieveSource.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.AssociationRetrieveSource = js.native
  
  /**
    * Creates and returns a new AssociationRetrieveSource instance in the SDK and on the server.
    * The new AssociationRetrieveSource will be automatically stored in the 'retrieveSource' property
    * of the parent RetrieveAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.AssociationRetrieveSource.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.RetrieveAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.AssociationRetrieveSource = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.AssociationRetrieveSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.AssociationRetrieveSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
