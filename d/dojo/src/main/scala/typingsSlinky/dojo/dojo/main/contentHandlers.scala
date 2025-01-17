package typingsSlinky.dojo.dojo.main

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.contentHandlers.html
  *
  * A map of available XHR transport handle types. Name matches the
  * handleAs attribute passed to XHR calls.
  * A map of available XHR transport handle types. Name matches the
  * handleAs attribute passed to XHR calls. Each contentHandler is
  * called, passing the xhr object for manipulation. The return value
  * from the contentHandler will be passed to the load or handle
  * functions defined in the original xhr call.
  *
  */
@js.native
trait contentHandlers extends js.Object {
  /**
    *
    * @param xhr
    */
  def auto(xhr: js.Any): Unit = js.native
  /**
    * A contentHandler which evaluates the response data, expecting it to be valid JavaScript
    *
    * @param xhr
    */
  def javascript(xhr: js.Any): js.Any = js.native
  /**
    * A contentHandler which returns a JavaScript object created from the response data
    *
    * @param xhr
    */
  def json(xhr: js.Any): js.Any = js.native
  /**
    * A contentHandler which expects comment-filtered JSON.
    * A contentHandler which expects comment-filtered JSON.
    * the json-comment-filtered option was implemented to prevent
    * "JavaScript Hijacking", but it is less secure than standard JSON. Use
    * standard JSON instead. JSON prefixing can be used to subvert hijacking.
    *
    * Will throw a notice suggesting to use application/json mimetype, as
    * json-commenting can introduce security issues. To decrease the chances of hijacking,
    * use the standard json contentHandler, and prefix your "JSON" with: {}&&
    *
    * use djConfig.useCommentedJson = true to turn off the notice
    *
    * @param xhr
    */
  def json_comment_filtered(xhr: js.Any): js.Any = js.native
  /**
    * A contentHandler which checks the presence of comment-filtered JSON and
    * alternates between the json and json-comment-filtered contentHandlers.
    *
    * @param xhr
    */
  def json_comment_optional(xhr: js.Any): js.Any = js.native
  /**
    *
    * @param xhr
    */
  def olson_zoneinfo(xhr: js.Any): Unit = js.native
  /**
    * A contentHandler which simply returns the plaintext response data
    *
    * @param xhr
    */
  def text(xhr: js.Any): js.Any = js.native
  /**
    * A contentHandler returning an XML Document parsed from the response data
    *
    * @param xhr
    */
  def xml(xhr: js.Any): js.Any = js.native
}

object contentHandlers {
  @scala.inline
  def apply(
    auto: js.Any => Unit,
    javascript: js.Any => js.Any,
    json: js.Any => js.Any,
    json_comment_filtered: js.Any => js.Any,
    json_comment_optional: js.Any => js.Any,
    olson_zoneinfo: js.Any => Unit,
    text: js.Any => js.Any,
    xml: js.Any => js.Any
  ): contentHandlers = {
    val __obj = js.Dynamic.literal(auto = js.Any.fromFunction1(auto), javascript = js.Any.fromFunction1(javascript), json = js.Any.fromFunction1(json), json_comment_filtered = js.Any.fromFunction1(json_comment_filtered), json_comment_optional = js.Any.fromFunction1(json_comment_optional), olson_zoneinfo = js.Any.fromFunction1(olson_zoneinfo), text = js.Any.fromFunction1(text), xml = js.Any.fromFunction1(xml))
    __obj.asInstanceOf[contentHandlers]
  }
  @scala.inline
  implicit class contentHandlersOps[Self <: contentHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJavascript(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javascript")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJson(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJson_comment_filtered(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json_comment_filtered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJson_comment_optional(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json_comment_optional")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOlson_zoneinfo(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("olson_zoneinfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withText(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXml(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

