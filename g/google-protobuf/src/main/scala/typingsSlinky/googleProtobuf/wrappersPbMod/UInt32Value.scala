package typingsSlinky.googleProtobuf.wrappersPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "UInt32Value")
@js.native
class UInt32Value () extends Message {
  
  def getValue(): Double = js.native
  
  def setValue(value: Double): UInt32Value = js.native
}
/* static members */
object UInt32Value {
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "UInt32Value")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "UInt32Value.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): UInt32Value = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "UInt32Value.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: UInt32Value, reader: BinaryReader): UInt32Value = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "UInt32Value.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "UInt32Value.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "UInt32Value.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: UInt32Value, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "UInt32Value.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: UInt32Value): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var value: Double = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(value: Double): AsObject = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
