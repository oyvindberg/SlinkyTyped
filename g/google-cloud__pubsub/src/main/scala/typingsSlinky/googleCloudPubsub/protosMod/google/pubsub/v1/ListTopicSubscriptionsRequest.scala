package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListTopicSubscriptionsRequest. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest")
@js.native
/**
  * Constructs a new ListTopicSubscriptionsRequest.
  * @param [properties] Properties to set
  */
class ListTopicSubscriptionsRequest () extends IListTopicSubscriptionsRequest {
  def this(properties: IListTopicSubscriptionsRequest) = this()
  
  /** ListTopicSubscriptionsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListTopicSubscriptionsRequest: Double = js.native
  
  /** ListTopicSubscriptionsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListTopicSubscriptionsRequest: String = js.native
  
  /**
    * Converts this ListTopicSubscriptionsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ListTopicSubscriptionsRequest topic. */
  @JSName("topic")
  var topic_ListTopicSubscriptionsRequest: String = js.native
}
object ListTopicSubscriptionsRequest {
  
  /**
    * Creates a new ListTopicSubscriptionsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListTopicSubscriptionsRequest instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.create")
  @js.native
  def create(): ListTopicSubscriptionsRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.create")
  @js.native
  def create(properties: IListTopicSubscriptionsRequest): ListTopicSubscriptionsRequest = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): ListTopicSubscriptionsRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ListTopicSubscriptionsRequest = js.native
  /**
    * Decodes a ListTopicSubscriptionsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListTopicSubscriptionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.decode")
  @js.native
  def decode(reader: Reader): ListTopicSubscriptionsRequest = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): ListTopicSubscriptionsRequest = js.native
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ListTopicSubscriptionsRequest = js.native
  /**
    * Decodes a ListTopicSubscriptionsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListTopicSubscriptionsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ListTopicSubscriptionsRequest = js.native
  
  /**
    * Encodes the specified ListTopicSubscriptionsRequest message. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsRequest.verify|verify} messages.
    * @param message ListTopicSubscriptionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.encode")
  @js.native
  def encode(message: IListTopicSubscriptionsRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.encode")
  @js.native
  def encode(message: IListTopicSubscriptionsRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ListTopicSubscriptionsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsRequest.verify|verify} messages.
    * @param message ListTopicSubscriptionsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListTopicSubscriptionsRequest): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IListTopicSubscriptionsRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a ListTopicSubscriptionsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListTopicSubscriptionsRequest
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ListTopicSubscriptionsRequest = js.native
  
  /**
    * Creates a plain object from a ListTopicSubscriptionsRequest message. Also converts values to other types if specified.
    * @param message ListTopicSubscriptionsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.toObject")
  @js.native
  def toObject(message: ListTopicSubscriptionsRequest): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.toObject")
  @js.native
  def toObject(message: ListTopicSubscriptionsRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ListTopicSubscriptionsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.ListTopicSubscriptionsRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
