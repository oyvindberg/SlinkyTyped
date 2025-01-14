package typingsSlinky.handsontable.mod.Handsontable.plugins

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManualColumnResize extends Base {
  
  var autoresizeTimeout: js.Function0[Unit] | Unit = js.native
  
  def checkIfColumnHeader(element: HTMLElement): Boolean = js.native
  
  def clearManualSize(column: Double): Unit = js.native
  
  var currentCol: Double | Unit = js.native
  
  var currentTH: HTMLElement | Unit = js.native
  
  var currentWidth: Double | Unit = js.native
  
  var dblclick: Double = js.native
  
  var eventManager: EventManager = js.native
  
  def getClosestTHParent(element: HTMLElement): HTMLElement = js.native
  
  var guide: HTMLElement = js.native
  
  var handle: HTMLElement = js.native
  
  def hideHandleAndGuide(): Unit = js.native
  
  def loadManualColumnWidths(): js.Array[Double | Null] = js.native
  
  var manualColumnWidths: js.Array[_] = js.native
  
  var newSize: Double | Unit = js.native
  
  var pressed: Core | Unit = js.native
  
  def refreshGuidePosition(): Unit = js.native
  
  def refreshHandlePosition(): Unit = js.native
  
  def saveManualColumnWidths(): Unit = js.native
  
  var selectedCols: js.Array[_] = js.native
  
  def setManualSize(column: Double, width: Double): Double = js.native
  
  def setupGuidePosition(): Unit = js.native
  
  def setupHandlePosition(TH: HTMLElement): Boolean | Unit = js.native
  
  var startOffset: Double | Unit = js.native
  
  var startWidth: Double | Unit = js.native
  
  var startY: Double | Unit = js.native
}
object ManualColumnResize {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    autoresizeTimeout: js.Function0[Unit] | Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    checkIfColumnHeader: HTMLElement => Boolean,
    clearHooks: () => Unit,
    clearManualSize: Double => Unit,
    currentCol: Double | Unit,
    currentTH: HTMLElement | Unit,
    currentWidth: Double | Unit,
    dblclick: Double,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    getClosestTHParent: HTMLElement => HTMLElement,
    guide: HTMLElement,
    handle: HTMLElement,
    hideHandleAndGuide: () => Unit,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    loadManualColumnWidths: () => js.Array[Double | Null],
    manualColumnWidths: js.Array[_],
    newSize: Double | Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    pressed: Core | Unit,
    refreshGuidePosition: () => Unit,
    refreshHandlePosition: () => Unit,
    removeHooks: String => Unit,
    saveManualColumnWidths: () => Unit,
    selectedCols: js.Array[_],
    setManualSize: (Double, Double) => Double,
    setupGuidePosition: () => Unit,
    setupHandlePosition: HTMLElement => Boolean | Unit,
    startOffset: Double | Unit,
    startWidth: Double | Unit,
    startY: Double | Unit,
    updatePlugin: () => Unit
  ): ManualColumnResize = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), autoresizeTimeout = autoresizeTimeout.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkIfColumnHeader = js.Any.fromFunction1(checkIfColumnHeader), clearHooks = js.Any.fromFunction0(clearHooks), clearManualSize = js.Any.fromFunction1(clearManualSize), currentCol = currentCol.asInstanceOf[js.Any], currentTH = currentTH.asInstanceOf[js.Any], currentWidth = currentWidth.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], getClosestTHParent = js.Any.fromFunction1(getClosestTHParent), guide = guide.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], hideHandleAndGuide = js.Any.fromFunction0(hideHandleAndGuide), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], loadManualColumnWidths = js.Any.fromFunction0(loadManualColumnWidths), manualColumnWidths = manualColumnWidths.asInstanceOf[js.Any], newSize = newSize.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], refreshGuidePosition = js.Any.fromFunction0(refreshGuidePosition), refreshHandlePosition = js.Any.fromFunction0(refreshHandlePosition), removeHooks = js.Any.fromFunction1(removeHooks), saveManualColumnWidths = js.Any.fromFunction0(saveManualColumnWidths), selectedCols = selectedCols.asInstanceOf[js.Any], setManualSize = js.Any.fromFunction2(setManualSize), setupGuidePosition = js.Any.fromFunction0(setupGuidePosition), setupHandlePosition = js.Any.fromFunction1(setupHandlePosition), startOffset = startOffset.asInstanceOf[js.Any], startWidth = startWidth.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[ManualColumnResize]
  }
  
  @scala.inline
  implicit class ManualColumnResizeMutableBuilder[Self <: ManualColumnResize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoresizeTimeout(value: js.Function0[Unit] | Unit): Self = StObject.set(x, "autoresizeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoresizeTimeoutFunction0(value: () => Unit): Self = StObject.set(x, "autoresizeTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckIfColumnHeader(value: HTMLElement => Boolean): Self = StObject.set(x, "checkIfColumnHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearManualSize(value: Double => Unit): Self = StObject.set(x, "clearManualSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentCol(value: Double | Unit): Self = StObject.set(x, "currentCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTH(value: HTMLElement | Unit): Self = StObject.set(x, "currentTH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTHHTMLElement(value: HTMLElement): Self = StObject.set(x, "currentTH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentWidth(value: Double | Unit): Self = StObject.set(x, "currentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: Double): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventManager(value: EventManager): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClosestTHParent(value: HTMLElement => HTMLElement): Self = StObject.set(x, "getClosestTHParent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGuide(value: HTMLElement): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: HTMLElement): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideHandleAndGuide(value: () => Unit): Self = StObject.set(x, "hideHandleAndGuide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadManualColumnWidths(value: () => js.Array[Double | Null]): Self = StObject.set(x, "loadManualColumnWidths", js.Any.fromFunction0(value))
    
    @scala.inline
    def setManualColumnWidths(value: js.Array[_]): Self = StObject.set(x, "manualColumnWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualColumnWidthsVarargs(value: js.Any*): Self = StObject.set(x, "manualColumnWidths", js.Array(value :_*))
    
    @scala.inline
    def setNewSize(value: Double | Unit): Self = StObject.set(x, "newSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressed(value: Core | Unit): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshGuidePosition(value: () => Unit): Self = StObject.set(x, "refreshGuidePosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefreshHandlePosition(value: () => Unit): Self = StObject.set(x, "refreshHandlePosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveManualColumnWidths(value: () => Unit): Self = StObject.set(x, "saveManualColumnWidths", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectedCols(value: js.Array[_]): Self = StObject.set(x, "selectedCols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedColsVarargs(value: js.Any*): Self = StObject.set(x, "selectedCols", js.Array(value :_*))
    
    @scala.inline
    def setSetManualSize(value: (Double, Double) => Double): Self = StObject.set(x, "setManualSize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetupGuidePosition(value: () => Unit): Self = StObject.set(x, "setupGuidePosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetupHandlePosition(value: HTMLElement => Boolean | Unit): Self = StObject.set(x, "setupHandlePosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartOffset(value: Double | Unit): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartWidth(value: Double | Unit): Self = StObject.set(x, "startWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartY(value: Double | Unit): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
  }
}
