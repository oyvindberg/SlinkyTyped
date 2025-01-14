package typingsSlinky.mendixmodelsdk.mod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.MicroflowSource")
@js.native
class MicroflowSource protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.MicroflowSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object MicroflowSource {
  
  @JSImport("mendixmodelsdk", "pages.MicroflowSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSource.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.MicroflowSource = js.native
  
  /**
    * Creates and returns a new MicroflowSource instance in the SDK and on the server.
    * The new MicroflowSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSource.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.EntityWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.MicroflowSource = js.native
  
  /**
    * Creates and returns a new MicroflowSource instance in the SDK and on the server.
    * The new MicroflowSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSource.createInEntityWidgetUnderDataSource")
  @js.native
  def createInEntityWidgetUnderDataSource(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.EntityWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.MicroflowSource = js.native
  
  /**
    * Creates and returns a new MicroflowSource instance in the SDK and on the server.
    * The new MicroflowSource will be automatically stored in the 'dataSource' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSource.createInWidgetValueUnderDataSource")
  @js.native
  def createInWidgetValueUnderDataSource(container: WidgetValue): typingsSlinky.mendixmodelsdk.pagesMod.pages.MicroflowSource = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.MicroflowSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
