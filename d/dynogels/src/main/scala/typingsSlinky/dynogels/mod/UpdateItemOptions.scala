package typingsSlinky.dynogels.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdk.dynamodbMod.AttributeUpdates
import typingsSlinky.awsSdk.dynamodbMod.ConditionExpression
import typingsSlinky.awsSdk.dynamodbMod.ConditionalOperator
import typingsSlinky.awsSdk.dynamodbMod.ExpectedAttributeMap
import typingsSlinky.awsSdk.dynamodbMod.ExpressionAttributeNameMap
import typingsSlinky.awsSdk.dynamodbMod.ReturnConsumedCapacity
import typingsSlinky.awsSdk.dynamodbMod.ReturnItemCollectionMetrics
import typingsSlinky.awsSdk.dynamodbMod.ReturnValue
import typingsSlinky.awsSdk.dynamodbMod.UpdateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateItemOptions extends StObject {
  
  var AttributeUpdates: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.AttributeUpdates] = js.native
  
  var ConditionExpression: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ConditionExpression] = js.native
  
  var ConditionalOperator: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ConditionalOperator] = js.native
  
  var Expected: js.UndefOr[ExpectedAttributeMap] = js.native
  
  var ExpressionAttributeNames: js.UndefOr[ExpressionAttributeNameMap] = js.native
  
  var ExpressionAttributeValues: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var ReturnConsumedCapacity: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ReturnConsumedCapacity] = js.native
  
  var ReturnItemCollectionMetrics: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ReturnItemCollectionMetrics] = js.native
  
  var ReturnValues: js.UndefOr[ReturnValue] = js.native
  
  var UpdateExpression: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.UpdateExpression] = js.native
  
  var expected: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object UpdateItemOptions {
  
  @scala.inline
  def apply(): UpdateItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateItemOptions]
  }
  
  @scala.inline
  implicit class UpdateItemOptionsMutableBuilder[Self <: UpdateItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeUpdates(value: AttributeUpdates): Self = StObject.set(x, "AttributeUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUpdatesUndefined: Self = StObject.set(x, "AttributeUpdates", js.undefined)
    
    @scala.inline
    def setConditionExpression(value: ConditionExpression): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
    
    @scala.inline
    def setConditionalOperator(value: ConditionalOperator): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
    
    @scala.inline
    def setExpected(value: ExpectedAttributeMap): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
    
    @scala.inline
    def setExpressionAttributeNames(value: ExpressionAttributeNameMap): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    @scala.inline
    def setExpressionAttributeValues(value: StringDictionary[js.Any]): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
    
    @scala.inline
    def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    @scala.inline
    def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
    
    @scala.inline
    def setReturnValues(value: ReturnValue): Self = StObject.set(x, "ReturnValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValuesUndefined: Self = StObject.set(x, "ReturnValues", js.undefined)
    
    @scala.inline
    def setUpdateExpression(value: UpdateExpression): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateExpressionUndefined: Self = StObject.set(x, "UpdateExpression", js.undefined)
  }
}
