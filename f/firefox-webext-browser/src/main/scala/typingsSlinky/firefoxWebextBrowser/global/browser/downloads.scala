package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.downloads.DownloadItem
import typingsSlinky.firefoxWebextBrowser.browser.downloads.DownloadOptions
import typingsSlinky.firefoxWebextBrowser.browser.downloads.DownloadQuery
import typingsSlinky.firefoxWebextBrowser.browser.downloads.GetFileIconOptions
import typingsSlinky.firefoxWebextBrowser.browser.downloads.OnChangedDownloadDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Permissions: `downloads`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object downloads {
  
  /**
    * Prompt the user to either accept or cancel a dangerous download. `acceptDanger()` does not automatically accept dangerous downloads.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.downloads.acceptDanger")
  @js.native
  def acceptDanger(downloadId: Double): js.Promise[Unit] = js.native
  
  /**
    * Cancel a download. When `callback` is run, the download is cancelled, completed, interrupted or doesn't exist anymore.
    * @param downloadId The id of the download to cancel.
    */
  @JSGlobal("browser.downloads.cancel")
  @js.native
  def cancel(downloadId: Double): js.Promise[Unit] = js.native
  
  /* downloads functions */
  /**
    * Download a URL. If the URL uses the HTTP[S] protocol, then the request will include all cookies currently set for its hostname. If both `filename` and `saveAs` are specified, then the Save As dialog will be displayed, pre-populated with the specified `filename`. If the download started successfully, `callback` will be called with the new DownloadItem's `downloadId`. If there was an error starting the download, then `callback` will be called with `downloadId=undefined` and browser.extension.lastError will contain a descriptive string. The error strings are not guaranteed to remain backwards compatible between releases. You must not parse it.
    * @param options What to download and how.
    */
  @JSGlobal("browser.downloads.download")
  @js.native
  def download(options: DownloadOptions): js.Promise[Double] = js.native
  
  /**
    * Initiate dragging the file to another application.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.downloads.drag")
  @js.native
  def drag(downloadId: Double): Unit = js.native
  
  /** Erase matching DownloadItems from history */
  @JSGlobal("browser.downloads.erase")
  @js.native
  def erase(query: DownloadQuery): js.Promise[js.Array[Double]] = js.native
  
  /**
    * Retrieve an icon for the specified download. For new downloads, file icons are available after the onCreated event has been received. The image returned by this function while a download is in progress may be different from the image returned after the download is complete. Icon retrieval is done by querying the underlying operating system or toolkit depending on the platform. The icon that is returned will therefore depend on a number of factors including state of the download, platform, registered file types and visual theme. If a file icon cannot be determined, browser.extension.lastError will contain an error message.
    * @param downloadId The identifier for the download.
    */
  @JSGlobal("browser.downloads.getFileIcon")
  @js.native
  def getFileIcon(downloadId: Double): js.Promise[String] = js.native
  @JSGlobal("browser.downloads.getFileIcon")
  @js.native
  def getFileIcon(downloadId: Double, options: GetFileIconOptions): js.Promise[String] = js.native
  
  /**
    * When any of a DownloadItem's properties except `bytesReceived` changes, this event fires with the `downloadId` and an object containing the properties that changed.
    */
  @JSGlobal("browser.downloads.onChanged")
  @js.native
  val onChanged: WebExtEvent[js.Function1[/* downloadDelta */ OnChangedDownloadDelta, Unit]] = js.native
  
  /* downloads events */
  /** This event fires with the DownloadItem object when a download begins. */
  @JSGlobal("browser.downloads.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function1[/* downloadItem */ DownloadItem, Unit]] = js.native
  
  /**
    * Fires with the `downloadId` when a download is erased from history.
    * @param downloadId The `id` of the DownloadItem that was erased.
    */
  @JSGlobal("browser.downloads.onErased")
  @js.native
  val onErased: WebExtEvent[js.Function1[/* downloadId */ Double, Unit]] = js.native
  
  /** Open the downloaded file. */
  @JSGlobal("browser.downloads.open")
  @js.native
  def open(downloadId: Double): js.Promise[Unit] = js.native
  
  /**
    * Pause the download. If the request was successful the download is in a paused state. Otherwise browser.extension.lastError contains an error message. The request will fail if the download is not active.
    * @param downloadId The id of the download to pause.
    */
  @JSGlobal("browser.downloads.pause")
  @js.native
  def pause(downloadId: Double): js.Promise[Unit] = js.native
  
  @JSGlobal("browser.downloads.removeFile")
  @js.native
  def removeFile(downloadId: Double): js.Promise[Unit] = js.native
  
  /**
    * Resume a paused download. If the request was successful the download is in progress and unpaused. Otherwise browser.extension.lastError contains an error message. The request will fail if the download is not active.
    * @param downloadId The id of the download to resume.
    */
  @JSGlobal("browser.downloads.resume")
  @js.native
  def resume(downloadId: Double): js.Promise[Unit] = js.native
  
  /**
    * Find DownloadItems. Set `query` to the empty object to get all DownloadItems. To get a specific DownloadItem, set only the `id` field.
    */
  @JSGlobal("browser.downloads.search")
  @js.native
  def search(query: DownloadQuery): js.Promise[js.Array[DownloadItem]] = js.native
  
  /** @deprecated Unsupported on Firefox at this time. */
  @JSGlobal("browser.downloads.setShelfEnabled")
  @js.native
  def setShelfEnabled(enabled: Boolean): Unit = js.native
  
  /** Show the downloaded file in its folder in a file manager. */
  @JSGlobal("browser.downloads.show")
  @js.native
  def show(downloadId: Double): js.Promise[Boolean] = js.native
  
  @JSGlobal("browser.downloads.showDefaultFolder")
  @js.native
  def showDefaultFolder(): Unit = js.native
}
