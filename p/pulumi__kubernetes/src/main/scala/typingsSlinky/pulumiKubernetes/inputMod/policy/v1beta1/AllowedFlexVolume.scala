package typingsSlinky.pulumiKubernetes.inputMod.policy.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AllowedFlexVolume represents a single Flexvolume that is allowed to be used.
  */
@js.native
trait AllowedFlexVolume extends StObject {
  
  /**
    * driver is the name of the Flexvolume driver.
    */
  var driver: Input[String] = js.native
}
object AllowedFlexVolume {
  
  @scala.inline
  def apply(driver: Input[String]): AllowedFlexVolume = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedFlexVolume]
  }
  
  @scala.inline
  implicit class AllowedFlexVolumeMutableBuilder[Self <: AllowedFlexVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriver(value: Input[String]): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
  }
}
