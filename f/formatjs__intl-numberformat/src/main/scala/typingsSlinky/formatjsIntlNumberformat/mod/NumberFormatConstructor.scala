package typingsSlinky.formatjsIntlNumberformat.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.formatjsIntlNumberformat.anon.PickNumberFormatOptionslo
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormatConstructor
  extends Instantiable0[NumberFormat2]
     with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), NumberFormat2]
     with Instantiable2[
      js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
      /* options */ typingsSlinky.formatjsIntlNumberformat.anon.NumberFormatOptions, 
      NumberFormat2
    ] {
  var __defaultLocale: String = js.native
  var availableLocales: js.Array[String] = js.native
  var localeData: Record[String, NumberFormatLocaleInternalData] = js.native
  var polyfilled: Boolean = js.native
  def apply(): NumberFormat2 = js.native
  def apply(
    locales: js.UndefOr[scala.Nothing],
    options: typingsSlinky.formatjsIntlNumberformat.anon.NumberFormatOptions
  ): NumberFormat2 = js.native
  def apply(locales: String): NumberFormat2 = js.native
  def apply(locales: String, options: typingsSlinky.formatjsIntlNumberformat.anon.NumberFormatOptions): NumberFormat2 = js.native
  def apply(locales: js.Array[String]): NumberFormat2 = js.native
  def apply(
    locales: js.Array[String],
    options: typingsSlinky.formatjsIntlNumberformat.anon.NumberFormatOptions
  ): NumberFormat2 = js.native
  def __addLocaleData(data: RawNumberLocaleData*): Unit = js.native
  def getDefaultLocale(): String = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PickNumberFormatOptionslo): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PickNumberFormatOptionslo): js.Array[String] = js.native
}

