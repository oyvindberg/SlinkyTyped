package typingsSlinky.mendixmodelsdk.mod.expressions

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.expressionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.AppServiceCallParameterMapping
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.BasicCodeActionParameterValue
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.BasicJavaActionParameterValue
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.BinaryRequestHandling
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ChangeListAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ChangeVariableAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.CreateVariableAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.CustomRange
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.DocumentTemplateParameterMapping
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.EndEvent
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ExpressionSplitCondition
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.FormDataPart
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.GenerateDocumentAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.HttpHeaderEntry
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.InspectAttribute
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.LogMessageAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MemberChange
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MicroflowCallParameterMapping
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.NanoflowCallParameterMapping
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ProxyConfiguration
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.RestCallAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.RuleCallParameterMapping
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.TemplateArgument
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceOperationParameterMapping
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalSettings
import typingsSlinky.mendixmodelsdk.pagesMod.pages.WidgetValidation
import typingsSlinky.mendixmodelsdk.restMod.rest.ConsumedODataService
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk", "expressions.StringLiteral")
@js.native
class StringLiteral protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.expressions.StringLiteral {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object StringLiteral {
  
  @JSImport("mendixmodelsdk", "expressions.StringLiteral")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInAppServiceCallParameterMappingUnderArgumentModel")
  @js.native
  def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInBasicCodeActionParameterValueUnderArgumentModel")
  @js.native
  def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInBasicJavaActionParameterValueUnderArgumentModel")
  @js.native
  def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInBinaryExpressionUnderLeft")
  @js.native
  def createInBinaryExpressionUnderLeft(container: typingsSlinky.mendixmodelsdk.expressionsMod.expressions.BinaryExpression): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInBinaryExpressionUnderRight")
  @js.native
  def createInBinaryExpressionUnderRight(container: typingsSlinky.mendixmodelsdk.expressionsMod.expressions.BinaryExpression): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInBinaryRequestHandlingUnderExpressionModel")
  @js.native
  def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInChangeListActionUnderValueModel")
  @js.native
  def createInChangeListActionUnderValueModel(container: ChangeListAction): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInChangeVariableActionUnderValueModel")
  @js.native
  def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInConditionalSettingsUnderExpressionModel")
  @js.native
  def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInConsumedODataServiceUnderTimeoutModel")
  @js.native
  def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInCreateVariableActionUnderInitialValueModel")
  @js.native
  def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInCustomRangeUnderLimitExpressionModel")
  @js.native
  def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInCustomRangeUnderOffsetExpressionModel")
  @js.native
  def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInDocumentTemplateParameterMappingUnderArgumentModel")
  @js.native
  def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInEndEventUnderReturnValueModel")
  @js.native
  def createInEndEventUnderReturnValueModel(container: EndEvent): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInExpressionSplitConditionUnderExpressionModel")
  @js.native
  def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInFormDataPartUnderValueModel")
  @js.native
  def createInFormDataPartUnderValueModel(container: FormDataPart): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInFunctionCallExpressionUnderArguments")
  @js.native
  def createInFunctionCallExpressionUnderArguments(container: typingsSlinky.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInGenerateDocumentActionUnderMarginBottomInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInGenerateDocumentActionUnderMarginLeftInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInGenerateDocumentActionUnderMarginRightInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInGenerateDocumentActionUnderMarginTopInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInHttpConfigurationUnderCustomLocationModel")
  @js.native
  def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInHttpConfigurationUnderPassword")
  @js.native
  def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInHttpConfigurationUnderUsername")
  @js.native
  def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInHttpHeaderEntryUnderValueModel")
  @js.native
  def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInIfExpressionUnderCondition")
  @js.native
  def createInIfExpressionUnderCondition(container: typingsSlinky.mendixmodelsdk.expressionsMod.expressions.IfExpression): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInIfExpressionUnderIfFalse")
  @js.native
  def createInIfExpressionUnderIfFalse(container: typingsSlinky.mendixmodelsdk.expressionsMod.expressions.IfExpression): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInIfExpressionUnderIfTrue")
  @js.native
  def createInIfExpressionUnderIfTrue(container: typingsSlinky.mendixmodelsdk.expressionsMod.expressions.IfExpression): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInInspectAttributeUnderExpressionModel")
  @js.native
  def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInLogMessageActionUnderNodeModel")
  @js.native
  def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInMemberChangeUnderValueModel")
  @js.native
  def createInMemberChangeUnderValueModel(container: MemberChange): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInMicroflowCallParameterMappingUnderArgumentModel")
  @js.native
  def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInNanoflowCallParameterMappingUnderArgumentModel")
  @js.native
  def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInParenthesisExpressionUnderExpression")
  @js.native
  def createInParenthesisExpressionUnderExpression(container: typingsSlinky.mendixmodelsdk.expressionsMod.expressions.ParenthesisExpression): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInProxyConfigurationUnderHostExpressionModel")
  @js.native
  def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInProxyConfigurationUnderPasswordExpressionModel")
  @js.native
  def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInProxyConfigurationUnderPortExpressionModel")
  @js.native
  def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInProxyConfigurationUnderUseConfigurationExpressionModel")
  @js.native
  def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInProxyConfigurationUnderUsernameExpressionModel")
  @js.native
  def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInRestCallActionUnderTimeOutModel")
  @js.native
  def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInRuleCallParameterMappingUnderArgumentModel")
  @js.native
  def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInTemplateArgumentUnderExpressionModel")
  @js.native
  def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInUnaryExpressionUnderExpression")
  @js.native
  def createInUnaryExpressionUnderExpression(container: typingsSlinky.mendixmodelsdk.expressionsMod.expressions.UnaryExpression): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInWebServiceCallActionUnderTimeOutModel")
  @js.native
  def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInWebServiceOperationParameterMappingUnderArgumentModel")
  @js.native
  def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /**
    * Creates and returns a new StringLiteral instance in the SDK and on the server.
    * The new StringLiteral will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.createInWidgetValidationUnderExpressionModel")
  @js.native
  def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typingsSlinky.mendixmodelsdk.expressionsMod.expressions.StringLiteral = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.StringLiteral.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
