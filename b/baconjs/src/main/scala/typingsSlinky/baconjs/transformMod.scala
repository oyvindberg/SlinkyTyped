package typingsSlinky.baconjs

import typingsSlinky.baconjs.describeMod.Desc
import typingsSlinky.baconjs.eventMod.Event
import typingsSlinky.baconjs.observableMod.EventStream
import typingsSlinky.baconjs.observableMod.Property
import typingsSlinky.baconjs.replyMod.Reply
import typingsSlinky.baconjs.typesMod.EventSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("baconjs/types/transform", "composeT")
  @js.native
  def composeT[V, V2, V3](t1: Transformer[V, V2], t2: Transformer[V2, V3]): Transformer[V, V3] = js.native
  
  @JSImport("baconjs/types/transform", "transformE")
  @js.native
  def transformE[V, V2](src: EventStream[V], transformer: Transformer[V, V2]): EventStream[V2] = js.native
  @JSImport("baconjs/types/transform", "transformE")
  @js.native
  def transformE[V, V2](src: EventStream[V], transformer: Transformer[V, V2], desc: Desc): EventStream[V2] = js.native
  
  @JSImport("baconjs/types/transform", "transformP")
  @js.native
  def transformP[V, V2](src: Property[V], transformer: Transformer[V, V2]): Property[V2] = js.native
  @JSImport("baconjs/types/transform", "transformP")
  @js.native
  def transformP[V, V2](src: Property[V], transformer: Transformer[V, V2], desc: Desc): Property[V2] = js.native
  
  type Transformer[V1, V2] = js.Function2[/* event */ Event[V1], /* sink */ EventSink[V2], Reply]
}
