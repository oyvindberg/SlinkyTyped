package typingsSlinky.electron.mod

import typingsSlinky.electron.Electron.BrowserWindowConstructorOptions
import typingsSlinky.electron.Electron.ExtensionInfo
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron", "BrowserWindow")
@js.native
/**
  * BrowserWindow
  */
class BrowserWindow ()
  extends typingsSlinky.electron.Electron.BrowserWindow {
  def this(options: BrowserWindowConstructorOptions) = this()
}
object BrowserWindow {
  
  /**
    * Adds DevTools extension located at `path`, and returns extension's name.
    *
    * The extension will be remembered so you only need to call this API once, this
    * API is not for programming use. If you try to add an extension that has already
    * been loaded, this method will not return and instead log a warning to the
    * console.
    *
    * The method will also not return if the extension's manifest is missing or
    * incomplete.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    * 
  **Note:** This method is deprecated. Instead, use `ses.loadExtension(path)`.
    *
    * @deprecated
    */
  /* static member */
  @JSImport("electron", "BrowserWindow.addDevToolsExtension")
  @js.native
  def addDevToolsExtension(path: String): Unit = js.native
  
  /**
    * Adds Chrome extension located at `path`, and returns extension's name.
    *
    * The method will also not return if the extension's manifest is missing or
    * incomplete.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    * 
  **Note:** This method is deprecated. Instead, use `ses.loadExtension(path)`.
    *
    * @deprecated
    */
  /* static member */
  @JSImport("electron", "BrowserWindow.addExtension")
  @js.native
  def addExtension(path: String): Unit = js.native
  
  /**
    * The window that owns the given `browserView`. If the given view is not attached
    * to any window, returns `null`.
    */
  /* static member */
  @JSImport("electron", "BrowserWindow.fromBrowserView")
  @js.native
  def fromBrowserView(browserView: typingsSlinky.electron.Electron.BrowserView): typingsSlinky.electron.Electron.BrowserWindow | Null = js.native
  
  /**
    * The window with the given `id`.
    */
  /* static member */
  @JSImport("electron", "BrowserWindow.fromId")
  @js.native
  def fromId(id: Double): typingsSlinky.electron.Electron.BrowserWindow | Null = js.native
  
  /**
    * The window that owns the given `webContents` or `null` if the contents are not
    * owned by a window.
    */
  /* static member */
  @JSImport("electron", "BrowserWindow.fromWebContents")
  @js.native
  def fromWebContents(webContents: typingsSlinky.electron.Electron.WebContents_): typingsSlinky.electron.Electron.BrowserWindow | Null = js.native
  
  /**
    * An array of all opened browser windows.
    */
  /* static member */
  @JSImport("electron", "BrowserWindow.getAllWindows")
  @js.native
  def getAllWindows(): js.Array[typingsSlinky.electron.Electron.BrowserWindow] = js.native
  
  /**
    * The keys are the extension names and each value is an Object containing `name`
    * and `version` properties.
    *
    * To check if a DevTools extension is installed you can run the following:
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    * 
  **Note:** This method is deprecated. Instead, use `ses.getAllExtensions()`.
    *
    * @deprecated
    */
  /* static member */
  @JSImport("electron", "BrowserWindow.getDevToolsExtensions")
  @js.native
  def getDevToolsExtensions(): Record[String, ExtensionInfo] = js.native
  
  /**
    * The keys are the extension names and each value is an Object containing `name`
    * and `version` properties.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    * 
  **Note:** This method is deprecated. Instead, use `ses.getAllExtensions()`.
    *
    * @deprecated
    */
  /* static member */
  @JSImport("electron", "BrowserWindow.getExtensions")
  @js.native
  def getExtensions(): Record[String, ExtensionInfo] = js.native
  
  /**
    * The window that is focused in this application, otherwise returns `null`.
    */
  /* static member */
  @JSImport("electron", "BrowserWindow.getFocusedWindow")
  @js.native
  def getFocusedWindow(): typingsSlinky.electron.Electron.BrowserWindow | Null = js.native
  
  /**
    * Remove a DevTools extension by name.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    *
    * **Note:** This method is deprecated. Instead, use
    * `ses.removeExtension(extension_id)`.
    *
    * @deprecated
    */
  /* static member */
  @JSImport("electron", "BrowserWindow.removeDevToolsExtension")
  @js.native
  def removeDevToolsExtension(name: String): Unit = js.native
  
  /**
    * Remove a Chrome extension by name.
    *
    * **Note:** This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    *
    * **Note:** This method is deprecated. Instead, use
    * `ses.removeExtension(extension_id)`.
    *
    * @deprecated
    */
  /* static member */
  @JSImport("electron", "BrowserWindow.removeExtension")
  @js.native
  def removeExtension(name: String): Unit = js.native
}
