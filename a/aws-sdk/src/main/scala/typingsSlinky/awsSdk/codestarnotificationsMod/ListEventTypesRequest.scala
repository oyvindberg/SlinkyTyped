package typingsSlinky.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEventTypesRequest extends StObject {
  
  /**
    * The filters to use to return information by service or resource type.
    */
  var Filters: js.UndefOr[ListEventTypesFilters] = js.native
  
  /**
    * A non-negative integer used to limit the number of returned results. The default number is 50. The maximum number of results that can be returned is 100.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.MaxResults] = js.native
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.NextToken] = js.native
}
object ListEventTypesRequest {
  
  @scala.inline
  def apply(): ListEventTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventTypesRequest]
  }
  
  @scala.inline
  implicit class ListEventTypesRequestMutableBuilder[Self <: ListEventTypesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: ListEventTypesFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: ListEventTypesFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
