package typingsSlinky.protractor

import typingsSlinky.protractor.configMod.Config
import typingsSlinky.protractor.driverProviderMod.DriverProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sauceMod {
  
  @JSImport("protractor/built/driverProviders/sauce", "Sauce")
  @js.native
  class Sauce protected () extends DriverProvider {
    def this(config: Config) = this()
    
    /**
      * Get the Sauce Labs endpoint
      * @private
      * @param {string} region
      * @return {string} The endpoint that needs to be used
      */
    /* private */ def getSauceEndpoint(region: js.Any): js.Any = js.native
    
    var sauceServer_ : js.Any = js.native
  }
}
