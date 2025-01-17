package typingsSlinky.cypress.fpMod

import typingsSlinky.cypress.lodashMod.List
import typingsSlinky.cypress.lodashMod.MemoIteratorCappedRight
import typingsSlinky.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduceRight1x2[TResult] extends js.Object {
  def apply[T](callback: MemoIteratorCappedRight[T, TResult]): TResult = js.native
  def apply[T /* <: js.Object */](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    collection: T
  ): TResult = js.native
  def apply[T](callback: MemoIteratorCappedRight[T, TResult], collection: js.Array[T]): TResult = js.native
  def apply[T](callback: MemoIteratorCappedRight[T, TResult], collection: List[T]): TResult = js.native
  def apply[T /* <: js.Object */](callback: __): LodashReduceRight3x6[T, TResult] = js.native
  def apply[T /* <: js.Object */](callback: __, collection: T): LodashReduceRight3x6[T, TResult] = js.native
  def apply[T](callback: __, collection: js.Array[T]): LodashReduceRight1x6[T, TResult] = js.native
  def apply[T](callback: __, collection: List[T]): LodashReduceRight2x6[T, TResult] = js.native
}

