package typingsSlinky.titanium.Titanium.App

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a local notification is received by the application.
  */
@js.native
trait iOSNotificationEvent extends iOSBaseEvent {
  
  /**
    * Alert button text ('View', by default) or slider text ('slide to unlock...', by default).
    */
  var alertAction: String = js.native
  
  /**
    * Alert message.
    */
  var alertBody: String = js.native
  
  /**
    * Image displayed instead of `Default.png` when launching the application.
    */
  var alertLaunchImage: String = js.native
  
  /**
    * Application badge value.
    */
  var badge: Double = js.native
  
  /**
    * The identifier of the app-defined [category object](Titanium.App.iOS.UserNotificationCategory). Available in Titanium SDK 7.5.0+ and iOS 10+.
    */
  var category: String = js.native
  
  /**
    * Date and time when the notification was configured to fire.
    */
  var date: js.Date = js.native
  
  /**
    * Boolean indicating if notification was received while app was in background. Available in Titanium SDK 6.2.0.
    * On iOS 10+ this is no longer available since this event will only fire if the app is in foreground.
    */
  var inBackground: Boolean = js.native
  
  /**
    * Name of the sound file configured to play when the notification was fired.
    */
  var sound: String = js.native
  
  /**
    * The unique identifier for the thread or conversation related to this notification request.
    * It will be used to visually group notifications together. Available in Titanium SDK 7.5.0+ and iOS 10+.
    */
  var threadIdentifier: String = js.native
  
  /**
    * Timezone of the date when the notification was configured to fire. Available in Titanium SDK 7.4.0+.
    */
  var timezone: String = js.native
  
  /**
    * Custom data object.
    */
  var userInfo: js.Any = js.native
}
object iOSNotificationEvent {
  
  @scala.inline
  def apply(
    alertAction: String,
    alertBody: String,
    alertLaunchImage: String,
    badge: Double,
    category: String,
    date: js.Date,
    inBackground: Boolean,
    sound: String,
    source: iOS,
    threadIdentifier: String,
    timezone: String,
    userInfo: js.Any
  ): iOSNotificationEvent = {
    val __obj = js.Dynamic.literal(alertAction = alertAction.asInstanceOf[js.Any], alertBody = alertBody.asInstanceOf[js.Any], alertLaunchImage = alertLaunchImage.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], inBackground = inBackground.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], threadIdentifier = threadIdentifier.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSNotificationEvent]
  }
  
  @scala.inline
  implicit class iOSNotificationEventMutableBuilder[Self <: iOSNotificationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertAction(value: String): Self = StObject.set(x, "alertAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertBody(value: String): Self = StObject.set(x, "alertBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertLaunchImage(value: String): Self = StObject.set(x, "alertLaunchImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInBackground(value: Boolean): Self = StObject.set(x, "inBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadIdentifier(value: String): Self = StObject.set(x, "threadIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: js.Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
