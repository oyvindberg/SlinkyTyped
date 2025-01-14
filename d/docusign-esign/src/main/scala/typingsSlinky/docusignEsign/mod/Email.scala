package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Email extends StObject {
  
  var anchorAllowWhiteSpaceInCharacters: js.UndefOr[String] = js.native
  
  var anchorAllowWhiteSpaceInCharactersMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This property controls how [anchor tabs][AnchorTabs] are placed. When **true**, the text string in a document must match the case of the `anchorString`
    * property for an anchor tab to be created. The default value is **false**.
    *
    * For example, when set to **true**, if the anchor string is `DocuSign`, then `DocuSign` will match but `Docusign`, `docusign`, `DoCuSiGn`, etc. will not match.
    * When set to **false**, `DocuSign`, `Docusign`, `docusign`, `DoCuSiGn`, etc. will all match.
    *
    * This functionality uses the following rules:
    *
    * - Unless punctuation is specified in the `anchorString`, this functionality ignores punctuation and the following characters:
    *
    *   $~><|^+=
    *
    *   For example, the `anchorString` `water` will match on the string `Fetch a pail of water.`
    *
    * - Strings embedded in other strings are ignored during the matching process.
    *
    * - In words that have dashes, the parts separated by dashes are treated as distinct words.
    *
    *   Example: If the anchor string is `forget`, then an anchor tab is placed on the `forget` in `forget-me-not`, even when `anchorMatchWholeWord` is set to **true**.
    *
    * - Letters with accent marks are treated as distinct characters from their unaccented counterparts.
    *
    * - For single-character anchor strings, if the two characters appear right next to each other in the document, a single anchor tab is placed for both of them.
    *
    *   Example: If the anchor string is `i`, then only one anchor tab is placed in `skiing`.
    *
    * - Unlike punctuation, numbers are not ignored when finding anchor words.
    *
    *   Example: If the anchor string is `cat`, then `-cat-` is matched but `1cat2` is not when `anchorMatchWholeWord` is set to **true** (its default value).
    *
    * **Note**: You can only specify the value of this property in POST requests.
    *
    * [AnchorTabs]: https://developers.docusign.com/esign-rest-api/guides/concepts/tabs#autoplace
    */
  var anchorCaseSensitive: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorCaseSensitive` property is editable.
    */
  var anchorCaseSensitiveMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This property controls how [anchor tabs][AnchorTabs] are aligned in relation to the anchor text. Possible values are :
    *
    * - `left`: Aligns the left side of the tab with the beginning of the first character of the matching anchor word. This is the default value.
    * - `right`: Aligns the tab’s left side with the last character of the matching anchor word.
    *
    * **Note**: You can only specify the value of this property in POST requests.
    *
    * [AnchorTabs]: https://developers.docusign.com/esign-rest-api/guides/concepts/tabs#autoplace
    *
    */
  var anchorHorizontalAlignment: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorHorizontalAlignment` property is editable.
    */
  var anchorHorizontalAlignmentMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, this tab is ignored if the `anchorString` is not found in the document.
    */
  var anchorIgnoreIfNotPresent: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorIgnoreIfNotPresent` property is editable.
    */
  var anchorIgnoreIfNotPresentMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the text string in a document must match the value of the `anchorString` property in its entirety for an [anchor tab][AnchorTab] to be created.
    * The default value is **false**.
    *
    * For example, when set to **true**, if the input is `man` then `man` will match but `manpower`, `fireman`, and `penmanship` will not. When set to **false**,
    * if the input is `man` then `man`, `manpower`, `fireman`, and `penmanship` will all match.
    *
    * This functionality uses the following rules:
    *
    * - Unless punctuation is specified in the `anchorString`, this functionality ignores punctuation and the following characters:
    *
    *   $~><|^+=
    *
    *   For example, the `anchorString` `water` will match on the string `Fetch a pail of water.`
    *
    * - Strings embedded in other strings are ignored during the matching process.
    *
    * - In words that have dashes, the parts separated by dashes are treated as distinct words.
    *
    *   Example: If the anchor string is `forget`, then an anchor tab is placed on the `forget` in `forget-me-not`, even when `anchorMatchWholeWord` is set to **true**.
    *
    * - Letters with accent marks are treated as distinct characters from their unaccented counterparts.
    *
    * - For single-character anchor strings, if the two characters appear right next to each other in the document, a single anchor tab is placed for both of them.
    *
    *   Example: If the anchor string is `i`, then only one anchor tab is placed in `skiing`.
    *
    * - Unlike punctuation, numbers are not ignored when finding anchor words.
    *
    *   Example: If the anchor string is `cat`, then `-cat-` is matched but `1cat2` is not when `anchorMatchWholeWord` is set to **true** (its default value).
    *
    *
    * **Note**: You can only specify the value of this property in POST requests.
    *
    * [AnchorTab]: https://developers.docusign.com/esign-rest-api/guides/concepts/tabs#autoplace
    *
    */
  var anchorMatchWholeWord: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorMatchWholeWord` property is editable.
    */
  var anchorMatchWholeWordMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the string to find in the document and use as the basis for tab placement.
    */
  var anchorString: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorString` property is editable.
    */
  var anchorStringMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var anchorTabProcessorVersion: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var anchorTabProcessorVersionMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the units of the X and Y offset. Units may be pixels, millimeters, centimeters, or inches.
    */
  var anchorUnits: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorUnits` property is editable.
    */
  var anchorUnitsMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the X axis location of the tab in `anchorUnits` relative to the `anchorString`.
    *
    * **Note**: When you provide an x- and y-coordinate for the sign here tab, the tab appears 21 points lower than the value you provide for the y-coordinate.
    * To align the tab as expected, subtract 21 from the expected y-value.
    */
  var anchorXOffset: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorXOffset` property is editable.
    */
  var anchorXOffsetMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the Y axis location of the tab in `anchorUnits` relative to the `anchorString`.
    *
    * **Note**: When you provide an x- and y-coordinate for the sign here tab, the tab appears 21 points lower than the value you provide for the y-coordinate.
    * To align the tab as expected, subtract 21 from the expected y-value.
    */
  var anchorYOffset: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorYOffset` property is editable.
    */
  var anchorYOffsetMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the information in the tab is bold.
    */
  var bold: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `bold` property is editable.
    */
  var boldMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible
    * (the characters are hidden by asterisks) to any other signer or the sender.
    *
    * When an envelope is completed the information is only available to the sender through the Form Data link in the DocuSign Console.
    * The information on the downloaded document remains masked by asterisks.
    *
    * This setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.
    */
  var concealValueOnDocument: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `concealValueOnDocument` property is editable.
    */
  var concealValueOnDocumentMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * For conditional fields this is the `tabLabel` of the parent tab that controls this tab's visibility.
    */
  var conditionalParentLabel: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `conditionalParentLabel` property is editable.
    */
  var conditionalParentLabelMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * For conditional fields, this is the value of the parent tab that controls the tab's visibility.
    *
    * If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use "on" as the value to show that the parent tab is active.
    *
    */
  var conditionalParentValue: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `conditionalParentValue` property is editable.
    */
  var conditionalParentValueMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The DocuSign-generated custom tab id for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab
    * inherits all the custom tab properties.
    */
  var customTabId: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `customTabId` property is editable.
    */
  var customTabIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be a
    * ble enter as much data as the text box can hold. By default this is false. This property only affects single line text boxes.
    */
  var disableAutoSize: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableAutoSize` property is editable.
    */
  var disableAutoSizeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The `documentId` is set by the API client. It is an integer that falls between `1` and 2,147,483,647. The value is encoded as a string without commas.
    * The values `1`, `2`, `3`, and so on are typically used to identify the first few documents in an envelope. Tab definitions include a `documentId`
    * property that specifies the document on which to place the tab.
    */
  var documentId: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `documentId` property is editable.
    */
  var documentIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The font to be used for the tab value. Supported fonts include:
    *
    * - Default
    * - Arial
    * - ArialNarrow
    * - Calibri
    * - CourierNew
    * - Garamond
    * - Georgia
    * - Helvetica
    * - LucidaConsole
    * - MSGothic
    * - MSMincho
    * - OCR-A
    * - Tahoma
    * - TimesNewRoman
    * - Trebuchet
    * - Verdana
    *
    */
  var font: js.UndefOr[String] = js.native
  
  /**
    * The font color to use for the information in the tab. Possible values are:
    *
    * - Black
    * - BrightBlue
    * - BrightRed
    * - DarkGreen
    * - DarkRed
    * - Gold
    * - Green
    * - NavyBlue
    * - Purple
    * - White
    *
    */
  var fontColor: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `fontColor` property is editable.
    */
  var fontColorMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Metadata that indicates whether the `font` property is editable.
    */
  var fontMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The font size used for the information in the tab. Possible values are:
    *
    * - Size7
    * - Size8
    * - Size9
    * - Size10
    * - Size11
    * - Size12
    * - Size14
    * - Size16
    * - Size18
    * - Size20
    * - Size22
    * - Size24
    * - Size26
    * - Size28
    * - Size36
    * - Size48
    * - Size72
    */
  var fontSize: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `fontSize` property is editable.
    */
  var fontSizeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * An integer specifying the order in which the guided form HTML should render. The order is relative to the `formPageLabel`, the group by which to place the guided form HTML block.
    */
  var formOrder: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `formOrder` property is editable.
    */
  var formOrderMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * A string specifying the group in which to place the guided form HTML. Each group displays as a separate guided forms page in the signing experience.
    */
  var formPageLabel: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `formPageLabel` property is editable.
    */
  var formPageLabelMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * An integer specifying the order in which to present the guided form pages.
    */
  var formPageNumber: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `fromPageNumber` property is editable.
    */
  var formPageNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The height of the tab in pixels.
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `height` property is editable.
    */
  var heightMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the information in the tab is italic.
    */
  var italic: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `italic` property is editable.
    */
  var italicMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var localePolicy: js.UndefOr[LocalePolicyTab] = js.native
  
  /**
    * When set to **true**, the signer cannot change the data of the custom tab.
    */
  var locked: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `locked` property is editable.
    */
  var lockedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * An optional value that describes the maximum length of the property when the property is a string.
    */
  var maxLength: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `maxLength` property is editable.
    */
  var maxLengthMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Contains the information necessary to map the tab to a field in SalesForce.
    */
  var mergeField: js.UndefOr[
    /* Contains information for transfering values between Salesforce data fields and DocuSign Tabs. */ MergeField
  ] = js.native
  
  var mergeFieldXml: js.UndefOr[String] = js.native
  
  /**
    * The name of the tab. For example, `Sign Here` or `Initial Here`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `name` property is editable. Read only.
    */
  var nameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The initial value of the tab when it was sent to the recipient.
    */
  var originalValue: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `originalValue` property is editable.
    */
  var originalValueMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The page number on which the tab is located.
    * For supplemental documents, this value must be `1`.
    */
  var pageNumber: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `pageNumber` property is editable.
    */
  var pageNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * A local reference that senders use to map recipients to other objects, such as specific document tabs. Within an envelope, each `recipientId` must be unique,
    * but there is no uniqueness requirement across envelopes. For example, many envelopes assign the first recipient a `recipientId` of `1`.
    */
  var recipientId: js.UndefOr[String] = js.native
  
  /**
    * The globally-unique identifier (GUID) for a specific recipient on a specific envelope. If the same recipient is associated with multiple envelopes,
    * they will have a different GUID for each one. Read only.
    */
  var recipientIdGuid: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `recipientIdGuid` property is editable.
    */
  var recipientIdGuidMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Metadata that indicates whether the `recipientId` property is editable.
    */
  var recipientIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true** and shared is true, information must be entered in this field to complete the envelope.
    */
  var requireAll: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `requireAll` property is editable.
    */
  var requireAllMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.
    */
  var requireInitialOnSharedChange: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `requireInitialOnSharedChange` property is editable.
    */
  var requireInitialOnSharedChangeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the signer is required to fill out this tab.
    */
  var required: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `required` property is editable.
    */
  var requiredMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the sender must populate the tab before an envelope can be sent using the template.
    *
    * This value tab can only be changed by modifying (PUT) the template.
    *
    * Tabs with a `senderRequired` value of true cannot be deleted from an envelope.
    */
  var senderRequired: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `senderRequired` property is editable.
    */
  var senderRequiredMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, this tab is shared.
    */
  var shared: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `shared` property is editable.
    */
  var sharedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  var smartContractInformation: js.UndefOr[SmartContractInformation] = js.native
  
  /**
    * The status of the tab. Possible values are:
    *
    * - `active`: The tab is active, but the recipient has not yet interacted with it.
    * - `signed`: The recipient signed the tab.
    * - `declined`: The recipient declined the envelope.
    * - `na`: Used when the `status` property is not applicable to the tab type. (For example, a tab that has the `tabType` `SignerAttachmentOptional`).
    *
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `status` property is editable.
    */
  var statusMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * An array of tab group labels that uniquely identify tab groups. To assign a tab to a `tabGroup`, you assign the `TabGroupLabel` to the `Tab.TabGroupLabels` array.
    */
  var tabGroupLabels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Metadata that indicates whether the `tabGroupLabels` property is editable.
    */
  var tabGroupLabelsMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The unique identifier for the tab.
    */
  var tabId: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabId` property is editable.
    */
  var tabIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The label associated with the tab. This value may be an empty string.
    * If no value is provided, the tab type is used as the value.
    *
    * Maximum Length: 500 characters.
    *
    */
  var tabLabel: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabLabel` property is editable.
    */
  var tabLabelMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * A positive integer that sets the order the tab is navigated to during signing.
    *
    * Tabs on a page are navigated to in ascending order, starting with the lowest number and moving to the highest.
    * If two or more tabs have the same `tabOrder` value, the normal auto-navigation setting behavior for the envelope is used.
    */
  var tabOrder: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabOrder` property is editable.
    */
  var tabOrderMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Indicates the type of tab (for example, `signHere` or `initialHere`).
    */
  var tabType: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `tabType` property is editable.
    */
  var tabTypeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
    */
  var templateLocked: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `templateLocked` property is editable.
    */
  var templateLockedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
    */
  var templateRequired: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `templateRequired` property is editable.
    */
  var templateRequiredMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Metadata that indicates whether the `toolTip` property is editable.
    */
  var toolTipMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The text of a tooltip that appears when a user hovers over a form field or tab.
    */
  var tooltip: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the information in the tab is underlined.
    */
  var underline: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `underline` property is editable.
    */
  var underlineMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The message displayed if the custom tab fails input validation (either custom of embedded).
    */
  var validationMessage: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `validationMessage` property is editable.
    */
  var validationMessageMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * A regular expression used to validate input for the tab.
    */
  var validationPattern: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `validationPattern` property is editable.
    */
  var validationPatternMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the value of the tab.
    */
  var value: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `value` property is editable.
    */
  var valueMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The width of the tab in pixels.
    */
  var width: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `width` property is editable.
    */
  var widthMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This property indicates the horizontal offset of the object on the page.
    * DocuSign uses 72 DPI when determining position.
    * Required. May be zero.
    *
    */
  var xPosition: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `xPosition` property is editable.
    */
  var xPositionMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
    */
  var yPosition: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `yPosition` property is editable.
    */
  var yPositionMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
}
object Email {
  
  @scala.inline
  def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  
  @scala.inline
  implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorAllowWhiteSpaceInCharacters(value: String): Self = StObject.set(x, "anchorAllowWhiteSpaceInCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorAllowWhiteSpaceInCharactersMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorAllowWhiteSpaceInCharactersMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorAllowWhiteSpaceInCharactersMetadataUndefined: Self = StObject.set(x, "anchorAllowWhiteSpaceInCharactersMetadata", js.undefined)
    
    @scala.inline
    def setAnchorAllowWhiteSpaceInCharactersUndefined: Self = StObject.set(x, "anchorAllowWhiteSpaceInCharacters", js.undefined)
    
    @scala.inline
    def setAnchorCaseSensitive(value: String): Self = StObject.set(x, "anchorCaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorCaseSensitiveMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorCaseSensitiveMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorCaseSensitiveMetadataUndefined: Self = StObject.set(x, "anchorCaseSensitiveMetadata", js.undefined)
    
    @scala.inline
    def setAnchorCaseSensitiveUndefined: Self = StObject.set(x, "anchorCaseSensitive", js.undefined)
    
    @scala.inline
    def setAnchorHorizontalAlignment(value: String): Self = StObject.set(x, "anchorHorizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorHorizontalAlignmentMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorHorizontalAlignmentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorHorizontalAlignmentMetadataUndefined: Self = StObject.set(x, "anchorHorizontalAlignmentMetadata", js.undefined)
    
    @scala.inline
    def setAnchorHorizontalAlignmentUndefined: Self = StObject.set(x, "anchorHorizontalAlignment", js.undefined)
    
    @scala.inline
    def setAnchorIgnoreIfNotPresent(value: String): Self = StObject.set(x, "anchorIgnoreIfNotPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorIgnoreIfNotPresentMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorIgnoreIfNotPresentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorIgnoreIfNotPresentMetadataUndefined: Self = StObject.set(x, "anchorIgnoreIfNotPresentMetadata", js.undefined)
    
    @scala.inline
    def setAnchorIgnoreIfNotPresentUndefined: Self = StObject.set(x, "anchorIgnoreIfNotPresent", js.undefined)
    
    @scala.inline
    def setAnchorMatchWholeWord(value: String): Self = StObject.set(x, "anchorMatchWholeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorMatchWholeWordMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorMatchWholeWordMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorMatchWholeWordMetadataUndefined: Self = StObject.set(x, "anchorMatchWholeWordMetadata", js.undefined)
    
    @scala.inline
    def setAnchorMatchWholeWordUndefined: Self = StObject.set(x, "anchorMatchWholeWord", js.undefined)
    
    @scala.inline
    def setAnchorString(value: String): Self = StObject.set(x, "anchorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorStringMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorStringMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorStringMetadataUndefined: Self = StObject.set(x, "anchorStringMetadata", js.undefined)
    
    @scala.inline
    def setAnchorStringUndefined: Self = StObject.set(x, "anchorString", js.undefined)
    
    @scala.inline
    def setAnchorTabProcessorVersion(value: String): Self = StObject.set(x, "anchorTabProcessorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorTabProcessorVersionMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorTabProcessorVersionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorTabProcessorVersionMetadataUndefined: Self = StObject.set(x, "anchorTabProcessorVersionMetadata", js.undefined)
    
    @scala.inline
    def setAnchorTabProcessorVersionUndefined: Self = StObject.set(x, "anchorTabProcessorVersion", js.undefined)
    
    @scala.inline
    def setAnchorUnits(value: String): Self = StObject.set(x, "anchorUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUnitsMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorUnitsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUnitsMetadataUndefined: Self = StObject.set(x, "anchorUnitsMetadata", js.undefined)
    
    @scala.inline
    def setAnchorUnitsUndefined: Self = StObject.set(x, "anchorUnits", js.undefined)
    
    @scala.inline
    def setAnchorXOffset(value: String): Self = StObject.set(x, "anchorXOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorXOffsetMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorXOffsetMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorXOffsetMetadataUndefined: Self = StObject.set(x, "anchorXOffsetMetadata", js.undefined)
    
    @scala.inline
    def setAnchorXOffsetUndefined: Self = StObject.set(x, "anchorXOffset", js.undefined)
    
    @scala.inline
    def setAnchorYOffset(value: String): Self = StObject.set(x, "anchorYOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorYOffsetMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "anchorYOffsetMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorYOffsetMetadataUndefined: Self = StObject.set(x, "anchorYOffsetMetadata", js.undefined)
    
    @scala.inline
    def setAnchorYOffsetUndefined: Self = StObject.set(x, "anchorYOffset", js.undefined)
    
    @scala.inline
    def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "boldMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldMetadataUndefined: Self = StObject.set(x, "boldMetadata", js.undefined)
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setConcealValueOnDocument(value: String): Self = StObject.set(x, "concealValueOnDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcealValueOnDocumentMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "concealValueOnDocumentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcealValueOnDocumentMetadataUndefined: Self = StObject.set(x, "concealValueOnDocumentMetadata", js.undefined)
    
    @scala.inline
    def setConcealValueOnDocumentUndefined: Self = StObject.set(x, "concealValueOnDocument", js.undefined)
    
    @scala.inline
    def setConditionalParentLabel(value: String): Self = StObject.set(x, "conditionalParentLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalParentLabelMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "conditionalParentLabelMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalParentLabelMetadataUndefined: Self = StObject.set(x, "conditionalParentLabelMetadata", js.undefined)
    
    @scala.inline
    def setConditionalParentLabelUndefined: Self = StObject.set(x, "conditionalParentLabel", js.undefined)
    
    @scala.inline
    def setConditionalParentValue(value: String): Self = StObject.set(x, "conditionalParentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalParentValueMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "conditionalParentValueMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalParentValueMetadataUndefined: Self = StObject.set(x, "conditionalParentValueMetadata", js.undefined)
    
    @scala.inline
    def setConditionalParentValueUndefined: Self = StObject.set(x, "conditionalParentValue", js.undefined)
    
    @scala.inline
    def setCustomTabId(value: String): Self = StObject.set(x, "customTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTabIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "customTabIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTabIdMetadataUndefined: Self = StObject.set(x, "customTabIdMetadata", js.undefined)
    
    @scala.inline
    def setCustomTabIdUndefined: Self = StObject.set(x, "customTabId", js.undefined)
    
    @scala.inline
    def setDisableAutoSize(value: String): Self = StObject.set(x, "disableAutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAutoSizeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "disableAutoSizeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAutoSizeMetadataUndefined: Self = StObject.set(x, "disableAutoSizeMetadata", js.undefined)
    
    @scala.inline
    def setDisableAutoSizeUndefined: Self = StObject.set(x, "disableAutoSize", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "documentIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdMetadataUndefined: Self = StObject.set(x, "documentIdMetadata", js.undefined)
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColorMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "fontColorMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColorMetadataUndefined: Self = StObject.set(x, "fontColorMetadata", js.undefined)
    
    @scala.inline
    def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    @scala.inline
    def setFontMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "fontMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontMetadataUndefined: Self = StObject.set(x, "fontMetadata", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "fontSizeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeMetadataUndefined: Self = StObject.set(x, "fontSizeMetadata", js.undefined)
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormOrder(value: String): Self = StObject.set(x, "formOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormOrderMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "formOrderMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormOrderMetadataUndefined: Self = StObject.set(x, "formOrderMetadata", js.undefined)
    
    @scala.inline
    def setFormOrderUndefined: Self = StObject.set(x, "formOrder", js.undefined)
    
    @scala.inline
    def setFormPageLabel(value: String): Self = StObject.set(x, "formPageLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormPageLabelMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "formPageLabelMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormPageLabelMetadataUndefined: Self = StObject.set(x, "formPageLabelMetadata", js.undefined)
    
    @scala.inline
    def setFormPageLabelUndefined: Self = StObject.set(x, "formPageLabel", js.undefined)
    
    @scala.inline
    def setFormPageNumber(value: String): Self = StObject.set(x, "formPageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormPageNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "formPageNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormPageNumberMetadataUndefined: Self = StObject.set(x, "formPageNumberMetadata", js.undefined)
    
    @scala.inline
    def setFormPageNumberUndefined: Self = StObject.set(x, "formPageNumber", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "heightMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightMetadataUndefined: Self = StObject.set(x, "heightMetadata", js.undefined)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setItalic(value: String): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "italicMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicMetadataUndefined: Self = StObject.set(x, "italicMetadata", js.undefined)
    
    @scala.inline
    def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    @scala.inline
    def setLocalePolicy(value: LocalePolicyTab): Self = StObject.set(x, "localePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalePolicyUndefined: Self = StObject.set(x, "localePolicy", js.undefined)
    
    @scala.inline
    def setLocked(value: String): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "lockedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedMetadataUndefined: Self = StObject.set(x, "lockedMetadata", js.undefined)
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    @scala.inline
    def setMaxLength(value: String): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "maxLengthMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthMetadataUndefined: Self = StObject.set(x, "maxLengthMetadata", js.undefined)
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMergeField(
      value: /* Contains information for transfering values between Salesforce data fields and DocuSign Tabs. */ MergeField
    ): Self = StObject.set(x, "mergeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeFieldUndefined: Self = StObject.set(x, "mergeField", js.undefined)
    
    @scala.inline
    def setMergeFieldXml(value: String): Self = StObject.set(x, "mergeFieldXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeFieldXmlUndefined: Self = StObject.set(x, "mergeFieldXml", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "nameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameMetadataUndefined: Self = StObject.set(x, "nameMetadata", js.undefined)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginalValue(value: String): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalValueMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "originalValueMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalValueMetadataUndefined: Self = StObject.set(x, "originalValueMetadata", js.undefined)
    
    @scala.inline
    def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    @scala.inline
    def setPageNumber(value: String): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "pageNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberMetadataUndefined: Self = StObject.set(x, "pageNumberMetadata", js.undefined)
    
    @scala.inline
    def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdGuid(value: String): Self = StObject.set(x, "recipientIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdGuidMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "recipientIdGuidMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdGuidMetadataUndefined: Self = StObject.set(x, "recipientIdGuidMetadata", js.undefined)
    
    @scala.inline
    def setRecipientIdGuidUndefined: Self = StObject.set(x, "recipientIdGuid", js.undefined)
    
    @scala.inline
    def setRecipientIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "recipientIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdMetadataUndefined: Self = StObject.set(x, "recipientIdMetadata", js.undefined)
    
    @scala.inline
    def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
    
    @scala.inline
    def setRequireAll(value: String): Self = StObject.set(x, "requireAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireAllMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "requireAllMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireAllMetadataUndefined: Self = StObject.set(x, "requireAllMetadata", js.undefined)
    
    @scala.inline
    def setRequireAllUndefined: Self = StObject.set(x, "requireAll", js.undefined)
    
    @scala.inline
    def setRequireInitialOnSharedChange(value: String): Self = StObject.set(x, "requireInitialOnSharedChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireInitialOnSharedChangeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "requireInitialOnSharedChangeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireInitialOnSharedChangeMetadataUndefined: Self = StObject.set(x, "requireInitialOnSharedChangeMetadata", js.undefined)
    
    @scala.inline
    def setRequireInitialOnSharedChangeUndefined: Self = StObject.set(x, "requireInitialOnSharedChange", js.undefined)
    
    @scala.inline
    def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "requiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredMetadataUndefined: Self = StObject.set(x, "requiredMetadata", js.undefined)
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setSenderRequired(value: String): Self = StObject.set(x, "senderRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderRequiredMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "senderRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderRequiredMetadataUndefined: Self = StObject.set(x, "senderRequiredMetadata", js.undefined)
    
    @scala.inline
    def setSenderRequiredUndefined: Self = StObject.set(x, "senderRequired", js.undefined)
    
    @scala.inline
    def setShared(value: String): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "sharedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedMetadataUndefined: Self = StObject.set(x, "sharedMetadata", js.undefined)
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    @scala.inline
    def setSmartContractInformation(value: SmartContractInformation): Self = StObject.set(x, "smartContractInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartContractInformationUndefined: Self = StObject.set(x, "smartContractInformation", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "statusMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMetadataUndefined: Self = StObject.set(x, "statusMetadata", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTabGroupLabels(value: js.Array[String]): Self = StObject.set(x, "tabGroupLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabGroupLabelsMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabGroupLabelsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabGroupLabelsMetadataUndefined: Self = StObject.set(x, "tabGroupLabelsMetadata", js.undefined)
    
    @scala.inline
    def setTabGroupLabelsUndefined: Self = StObject.set(x, "tabGroupLabels", js.undefined)
    
    @scala.inline
    def setTabGroupLabelsVarargs(value: String*): Self = StObject.set(x, "tabGroupLabels", js.Array(value :_*))
    
    @scala.inline
    def setTabId(value: String): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIdMetadataUndefined: Self = StObject.set(x, "tabIdMetadata", js.undefined)
    
    @scala.inline
    def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    @scala.inline
    def setTabLabel(value: String): Self = StObject.set(x, "tabLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabLabelMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabLabelMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabLabelMetadataUndefined: Self = StObject.set(x, "tabLabelMetadata", js.undefined)
    
    @scala.inline
    def setTabLabelUndefined: Self = StObject.set(x, "tabLabel", js.undefined)
    
    @scala.inline
    def setTabOrder(value: String): Self = StObject.set(x, "tabOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabOrderMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabOrderMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabOrderMetadataUndefined: Self = StObject.set(x, "tabOrderMetadata", js.undefined)
    
    @scala.inline
    def setTabOrderUndefined: Self = StObject.set(x, "tabOrder", js.undefined)
    
    @scala.inline
    def setTabType(value: String): Self = StObject.set(x, "tabType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabTypeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "tabTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabTypeMetadataUndefined: Self = StObject.set(x, "tabTypeMetadata", js.undefined)
    
    @scala.inline
    def setTabTypeUndefined: Self = StObject.set(x, "tabType", js.undefined)
    
    @scala.inline
    def setTemplateLocked(value: String): Self = StObject.set(x, "templateLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLockedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "templateLockedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLockedMetadataUndefined: Self = StObject.set(x, "templateLockedMetadata", js.undefined)
    
    @scala.inline
    def setTemplateLockedUndefined: Self = StObject.set(x, "templateLocked", js.undefined)
    
    @scala.inline
    def setTemplateRequired(value: String): Self = StObject.set(x, "templateRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateRequiredMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "templateRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateRequiredMetadataUndefined: Self = StObject.set(x, "templateRequiredMetadata", js.undefined)
    
    @scala.inline
    def setTemplateRequiredUndefined: Self = StObject.set(x, "templateRequired", js.undefined)
    
    @scala.inline
    def setToolTipMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "toolTipMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolTipMetadataUndefined: Self = StObject.set(x, "toolTipMetadata", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setUnderline(value: String): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "underlineMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineMetadataUndefined: Self = StObject.set(x, "underlineMetadata", js.undefined)
    
    @scala.inline
    def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    @scala.inline
    def setValidationMessage(value: String): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationMessageMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "validationMessageMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationMessageMetadataUndefined: Self = StObject.set(x, "validationMessageMetadata", js.undefined)
    
    @scala.inline
    def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
    
    @scala.inline
    def setValidationPattern(value: String): Self = StObject.set(x, "validationPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationPatternMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "validationPatternMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationPatternMetadataUndefined: Self = StObject.set(x, "validationPatternMetadata", js.undefined)
    
    @scala.inline
    def setValidationPatternUndefined: Self = StObject.set(x, "validationPattern", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "valueMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMetadataUndefined: Self = StObject.set(x, "valueMetadata", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "widthMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthMetadataUndefined: Self = StObject.set(x, "widthMetadata", js.undefined)
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setXPosition(value: String): Self = StObject.set(x, "xPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPositionMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "xPositionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPositionMetadataUndefined: Self = StObject.set(x, "xPositionMetadata", js.undefined)
    
    @scala.inline
    def setXPositionUndefined: Self = StObject.set(x, "xPosition", js.undefined)
    
    @scala.inline
    def setYPosition(value: String): Self = StObject.set(x, "yPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPositionMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "yPositionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPositionMetadataUndefined: Self = StObject.set(x, "yPositionMetadata", js.undefined)
    
    @scala.inline
    def setYPositionUndefined: Self = StObject.set(x, "yPosition", js.undefined)
  }
}
