package typingsSlinky.ytSearch

import typingsSlinky.ytSearch.mod.Options
import typingsSlinky.ytSearch.mod.PlaylistMetadataOptions
import typingsSlinky.ytSearch.mod.PlaylistMetadataResult
import typingsSlinky.ytSearch.mod.SearchResult
import typingsSlinky.ytSearch.mod.VideoMetadataOptions
import typingsSlinky.ytSearch.mod.VideoMetadataResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(query: String): js.Promise[SearchResult] = js.native
    def apply(
      query: String,
      callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ SearchResult, Unit]
    ): Unit = js.native
    def apply(query: Options): js.Promise[SearchResult] = js.native
    def apply(
      query: Options,
      callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ SearchResult, Unit]
    ): Unit = js.native
    def apply(query: PlaylistMetadataOptions): js.Promise[PlaylistMetadataResult] = js.native
    def apply(
      query: PlaylistMetadataOptions,
      callback: js.Function2[
          /* err */ js.UndefOr[js.Error | String | Null], 
          /* data */ PlaylistMetadataResult, 
          Unit
        ]
    ): Unit = js.native
    def apply(query: VideoMetadataOptions): js.Promise[VideoMetadataResult] = js.native
    def apply(
      query: VideoMetadataOptions,
      callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ VideoMetadataResult, Unit]
    ): Unit = js.native
  }
}
