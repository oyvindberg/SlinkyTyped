package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITestCasePreparedStep
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCasePreparedStep. */
@JSImport("cucumber-messages", "messages.TestCasePreparedStep")
@js.native
/**
  * Constructs a new TestCasePreparedStep.
  * @param [properties] Properties to set
  */
class TestCasePreparedStep ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep {
  def this(properties: ITestCasePreparedStep) = this()
}
object TestCasePreparedStep {
  
  /**
    * Creates a new TestCasePreparedStep instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCasePreparedStep instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.create")
  @js.native
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.create")
  @js.native
  def create(properties: ITestCasePreparedStep): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  /**
    * Decodes a TestCasePreparedStep message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCasePreparedStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  /**
    * Decodes a TestCasePreparedStep message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCasePreparedStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  
  /**
    * Encodes the specified TestCasePreparedStep message. Does not implicitly {@link io.cucumber.messages.TestCasePreparedStep.verify|verify} messages.
    * @param message TestCasePreparedStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.encode")
  @js.native
  def encode(message: ITestCasePreparedStep): Writer = js.native
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.encode")
  @js.native
  def encode(message: ITestCasePreparedStep, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestCasePreparedStep message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCasePreparedStep.verify|verify} messages.
    * @param message TestCasePreparedStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestCasePreparedStep): Writer = js.native
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestCasePreparedStep, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestCasePreparedStep message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCasePreparedStep
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  
  /**
    * Creates a plain object from a TestCasePreparedStep message. Also converts values to other types if specified.
    * @param message TestCasePreparedStep
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep
  ): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.toObject")
  @js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestCasePreparedStep message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCasePreparedStep.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
