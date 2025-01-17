package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.apiTimestampMod.Timestamp
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Value
import typingsSlinky.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/transform_operation", JSImport.Namespace)
@js.native
object modelTransformOperationMod extends js.Object {
  @js.native
  class ArrayRemoveTransformOperation protected () extends TransformOperation {
    def this(elements: js.Array[Value]) = this()
    @JSName("apply")
    var apply: js.Any = js.native
    val elements: js.Array[Value] = js.native
  }
  
  @js.native
  class ArrayUnionTransformOperation protected () extends TransformOperation {
    def this(elements: js.Array[Value]) = this()
    @JSName("apply")
    var apply: js.Any = js.native
    val elements: js.Array[Value] = js.native
  }
  
  @js.native
  class NumericIncrementTransformOperation protected () extends TransformOperation {
    def this(serializer: JsonProtoSerializer, operand: Value) = this()
    var asNumber: js.Any = js.native
    val operand: Value = js.native
    val serializer: js.Any = js.native
  }
  
  @js.native
  class ServerTimestampTransform protected () extends TransformOperation
  
  @js.native
  trait TransformOperation extends js.Object {
    def applyToLocalView(previousValue: Null, localWriteTime: Timestamp): Value = js.native
    /**
      * Computes the local transform result against the provided `previousValue`,
      * optionally using the provided localWriteTime.
      */
    def applyToLocalView(previousValue: Value, localWriteTime: Timestamp): Value = js.native
    def applyToRemoteDocument(): Value = js.native
    def applyToRemoteDocument(previousValue: Null, transformResult: Value): Value = js.native
    def applyToRemoteDocument(previousValue: Value): Value = js.native
    /**
      * Computes a final transform result after the transform has been acknowledged
      * by the server, potentially using the server-provided transformResult.
      */
    def applyToRemoteDocument(previousValue: Value, transformResult: Value): Value = js.native
    def computeBaseValue(): Value | Null = js.native
    /**
      * If this transform operation is not idempotent, returns the base value to
      * persist for this transform. If a base value is returned, the transform
      * operation is always applied to this base value, even if document has
      * already been updated.
      *
      * Base values provide consistent behavior for non-idempotent transforms and
      * allow us to return the same latency-compensated value even if the backend
      * has already applied the transform operation. The base value is null for
      * idempotent transforms, as they can be re-played even if the backend has
      * already applied them.
      *
      * @return a base value to store along with the mutation, or null for
      * idempotent transforms.
      */
    def computeBaseValue(previousValue: Value): Value | Null = js.native
    def isEqual(other: TransformOperation): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ServerTimestampTransform extends js.Object {
    var instance: ServerTimestampTransform = js.native
  }
  
}

