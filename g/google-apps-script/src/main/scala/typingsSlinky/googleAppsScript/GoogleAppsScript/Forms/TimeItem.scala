package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question item that allows the respondent to indicate a time of day. Items can be accessed or
  * created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new time item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addTimeItem();
  *     item.setTitle('What time do you usually wake up in the morning?');
  */
@js.native
trait TimeItem extends StObject {
  
  def createResponse(hour: Integer, minute: Integer): ItemResponse = js.native
  
  def duplicate(): TimeItem = js.native
  
  def getGeneralFeedback(): QuizFeedback = js.native
  
  def getHelpText(): String = js.native
  
  def getId(): Integer = js.native
  
  def getIndex(): Integer = js.native
  
  def getPoints(): Integer = js.native
  
  def getTitle(): String = js.native
  
  def getType(): ItemType = js.native
  
  def isRequired(): Boolean = js.native
  
  def setGeneralFeedback(feedback: QuizFeedback): TimeItem = js.native
  
  def setHelpText(text: String): TimeItem = js.native
  
  def setPoints(points: Integer): TimeItem = js.native
  
  def setRequired(enabled: Boolean): TimeItem = js.native
  
  def setTitle(title: String): TimeItem = js.native
}
object TimeItem {
  
  @scala.inline
  def apply(
    createResponse: (Integer, Integer) => ItemResponse,
    duplicate: () => TimeItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getPoints: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    isRequired: () => Boolean,
    setGeneralFeedback: QuizFeedback => TimeItem,
    setHelpText: String => TimeItem,
    setPoints: Integer => TimeItem,
    setRequired: Boolean => TimeItem,
    setTitle: String => TimeItem
  ): TimeItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction2(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[TimeItem]
  }
  
  @scala.inline
  implicit class TimeItemMutableBuilder[Self <: TimeItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateResponse(value: (Integer, Integer) => ItemResponse): Self = StObject.set(x, "createResponse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDuplicate(value: () => TimeItem): Self = StObject.set(x, "duplicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGeneralFeedback(value: () => QuizFeedback): Self = StObject.set(x, "getGeneralFeedback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHelpText(value: () => String): Self = StObject.set(x, "getHelpText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Integer): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPoints(value: () => Integer): Self = StObject.set(x, "getPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => ItemType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRequired(value: () => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetGeneralFeedback(value: QuizFeedback => TimeItem): Self = StObject.set(x, "setGeneralFeedback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpText(value: String => TimeItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPoints(value: Integer => TimeItem): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRequired(value: Boolean => TimeItem): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => TimeItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
