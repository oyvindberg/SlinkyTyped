package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`day-short-month-year-long-time-24`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`day-short-month-year-long-time`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`day-short-month-year-short-time-24`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`day-short-month-year-short-time`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`day-short-month-year`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-date-long-time-24`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-date-long-time`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-date-short-time-24`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-date-short-time`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-date`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-month-day-year-long-time-24`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-month-day-year-long-time`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-month-day-year-short-time-24`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-month-day-year-short-time`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-month-day-year`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`long-month-year`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`short-date-long-time-24`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`short-date-long-time`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`short-date-short-time`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`short-date`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`short-month-year`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.default
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldInfoFormat
  extends Accessor
     with JSONSupport {
  
  /**
    * Used only with `Date` fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html#dateFormat)
    */
  var dateFormat: default | `short-date` | `short-date-short-time` | `short-date-long-time` | `short-date-long-time-24` | `long-month-day-year` | `long-month-day-year-short-time` | `long-month-day-year-short-time-24` | `long-month-day-year-long-time` | `long-month-day-year-long-time-24` | `day-short-month-year` | `day-short-month-year-short-time` | `day-short-month-year-short-time-24` | `day-short-month-year-long-time` | `day-short-month-year-long-time-24` | `long-date` | `long-date-short-time` | `long-date-short-time-24` | `long-date-long-time` | `long-date-long-time-24` | `long-month-year` | `short-month-year` | year = js.native
  
  /**
    * Used only with `Number` fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html#digitSeparator)
    */
  var digitSeparator: Boolean = js.native
  
  /**
    * Used only with `Number` fields to specify the number of supported decimal places that should appear in popups.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-FieldInfoFormat.html#places)
    */
  var places: Double = js.native
}
