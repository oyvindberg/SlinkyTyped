package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Avatarurl
import typingsSlinky.octokitTypes.anon.Confused
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsCreateDiscussionCommentInOrgResponseData extends StObject {
  
  var author: Avatarurl = js.native
  
  var body: String = js.native
  
  var body_html: String = js.native
  
  var body_version: String = js.native
  
  var created_at: String = js.native
  
  var discussion_url: String = js.native
  
  var html_url: String = js.native
  
  var last_edited_at: String = js.native
  
  var node_id: String = js.native
  
  var number: Double = js.native
  
  var reactions: Confused = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
}
object TeamsCreateDiscussionCommentInOrgResponseData {
  
  @scala.inline
  def apply(
    author: Avatarurl,
    body: String,
    body_html: String,
    body_version: String,
    created_at: String,
    discussion_url: String,
    html_url: String,
    last_edited_at: String,
    node_id: String,
    number: Double,
    reactions: Confused,
    updated_at: String,
    url: String
  ): TeamsCreateDiscussionCommentInOrgResponseData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], body_html = body_html.asInstanceOf[js.Any], body_version = body_version.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], discussion_url = discussion_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], last_edited_at = last_edited_at.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionCommentInOrgResponseData]
  }
  
  @scala.inline
  implicit class TeamsCreateDiscussionCommentInOrgResponseDataMutableBuilder[Self <: TeamsCreateDiscussionCommentInOrgResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Avatarurl): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody_html(value: String): Self = StObject.set(x, "body_html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody_version(value: String): Self = StObject.set(x, "body_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscussion_url(value: String): Self = StObject.set(x, "discussion_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_edited_at(value: String): Self = StObject.set(x, "last_edited_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactions(value: Confused): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
