package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object squeezeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/squeeze", "squeeze")
  @js.native
  def squeeze[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/squeeze", "squeeze")
  @js.native
  def squeeze[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/squeeze", "squeeze")
  @js.native
  def squeeze[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/squeeze", "squeeze")
  @js.native
  def squeeze[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
}
