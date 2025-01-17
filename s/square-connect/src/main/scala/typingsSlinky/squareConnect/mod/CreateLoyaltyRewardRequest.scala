package typingsSlinky.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateLoyaltyRewardRequest")
@js.native
class CreateLoyaltyRewardRequest () extends StObject {
  
  /**
    * A unique string that identifies this `CreateLoyaltyReward` request. Keys can be any valid string, but must be unique for every request.
    */
  var idempotency_key: String = js.native
  
  /**
    * The reward to create.
    */
  var reward: LoyaltyReward = js.native
}
