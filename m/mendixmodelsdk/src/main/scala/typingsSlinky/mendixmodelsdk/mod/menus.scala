package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationProfile
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menus {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/menu relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "menus.MenuDocument")
  @js.native
  class MenuDocument protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.menus.MenuDocument {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object MenuDocument {
    
    @JSImport("mendixmodelsdk", "menus.MenuDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new MenuDocument unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuDocument.createIn")
    @js.native
    def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.menusMod.menus.MenuDocument = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuDocument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuDocument.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.menusMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.menusMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/menu relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "menus.MenuItem")
  @js.native
  class MenuItem protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.menus.MenuItem {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MenuItem {
    
    @JSImport("mendixmodelsdk", "menus.MenuItem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MenuItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItem.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItem = js.native
    
    /**
      * Creates and returns a new MenuItem instance in the SDK and on the server.
      * The new MenuItem will be automatically stored in the 'items' property
      * of the parent MenuItemContainer element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItem.createIn")
    @js.native
    def createIn(container: typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItemContainer): typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItem = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItem.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItem.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.menusMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.menusMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "menus.MenuItemCollection")
  @js.native
  class MenuItemCollection protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.menus.MenuItemCollection {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MenuItemCollection {
    
    @JSImport("mendixmodelsdk", "menus.MenuItemCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItemCollection.create")
    @js.native
    def create(model: IModel): typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItemCollection = js.native
    
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * The new MenuItemCollection will be automatically stored in the 'itemCollection' property
      * of the parent MenuDocument element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItemCollection.createInMenuDocumentUnderItemCollection")
    @js.native
    def createInMenuDocumentUnderItemCollection(container: typingsSlinky.mendixmodelsdk.menusMod.menus.MenuDocument): typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItemCollection = js.native
    
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * The new MenuItemCollection will be automatically stored in the 'menuItemCollection' property
      * of the parent navigation.NavigationProfile element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItemCollection.createInNavigationProfileUnderMenuItemCollection")
    @js.native
    def createInNavigationProfileUnderMenuItemCollection(container: NavigationProfile): typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItemCollection = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItemCollection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItemCollection.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.menusMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.menusMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "menus.MenuItemContainer")
  @js.native
  abstract class MenuItemContainer protected ()
    extends typingsSlinky.mendixmodelsdk.allModelClassesMod.menus.MenuItemContainer {
    def this(
      model: typingsSlinky.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsSlinky.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typingsSlinky.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MenuItemContainer {
    
    @JSImport("mendixmodelsdk", "menus.MenuItemContainer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItemContainer.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "menus.MenuItemContainer.versionInfo")
    @js.native
    def versionInfo: typingsSlinky.mendixmodelsdk.menusMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typingsSlinky.mendixmodelsdk.menusMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
