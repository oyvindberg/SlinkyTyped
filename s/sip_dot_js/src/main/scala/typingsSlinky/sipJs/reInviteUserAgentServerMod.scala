package typingsSlinky.sipJs

import typingsSlinky.sipJs.dialogsMod.SessionDialog
import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import typingsSlinky.sipJs.userAgentServerMod.UserAgentServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reInviteUserAgentServerMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.sipJs.incomingRequestMod.IncomingRequest because Already inherited
  - typingsSlinky.sipJs.inviteMod.IncomingInviteRequest because var conflicts: delegate, message. Inlined  */ @JSImport("sip.js/lib/core/user-agents/re-invite-user-agent-server", "ReInviteUserAgentServer")
  @js.native
  class ReInviteUserAgentServer protected () extends UserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    
    var dialog: js.Any = js.native
  }
}
