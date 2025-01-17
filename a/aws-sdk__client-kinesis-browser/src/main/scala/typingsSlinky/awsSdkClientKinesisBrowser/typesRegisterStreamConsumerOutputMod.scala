package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesConsumerMod.UnmarshalledConsumer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRegisterStreamConsumerOutputMod {
  
  @js.native
  trait RegisterStreamConsumerOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>An object that represents the details of the consumer you registered. When you register a consumer, it gets an ARN that is generated by Kinesis Data Streams.</p>
      */
    var Consumer: UnmarshalledConsumer = js.native
  }
  object RegisterStreamConsumerOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, Consumer: UnmarshalledConsumer): RegisterStreamConsumerOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Consumer = Consumer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisterStreamConsumerOutput]
    }
    
    @scala.inline
    implicit class RegisterStreamConsumerOutputMutableBuilder[Self <: RegisterStreamConsumerOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumer(value: UnmarshalledConsumer): Self = StObject.set(x, "Consumer", value.asInstanceOf[js.Any])
    }
  }
}
