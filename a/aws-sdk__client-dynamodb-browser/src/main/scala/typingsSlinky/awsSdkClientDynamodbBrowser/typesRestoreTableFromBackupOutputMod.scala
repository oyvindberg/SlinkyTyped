package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTableDescriptionMod.UnmarshalledTableDescription
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRestoreTableFromBackupOutputMod {
  
  @js.native
  trait RestoreTableFromBackupOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The description of the table created from an existing backup.</p>
      */
    var TableDescription: js.UndefOr[UnmarshalledTableDescription] = js.native
  }
  object RestoreTableFromBackupOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): RestoreTableFromBackupOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreTableFromBackupOutput]
    }
    
    @scala.inline
    implicit class RestoreTableFromBackupOutputMutableBuilder[Self <: RestoreTableFromBackupOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableDescription(value: UnmarshalledTableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
    }
  }
}
