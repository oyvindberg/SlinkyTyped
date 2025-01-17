package typingsSlinky.wordpressEditPost

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.wordpressEditPost.anon.OmitPropsname
import typingsSlinky.wordpressEditPost.pluginPostPublishPanelMod.PluginPostPublishPanel.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginPostPublishPanelMod {
  
  /**
    * Renders provided content to the post-publish panel in the publish flow (side panel that opens
    * after a user publishes the post).
    *
    * @example
    * ```jsx
    * const { PluginPostPublishPanel } = wp.editPost;
    *
    * const MyPluginPostPublishPanel = () => (
    *     <PluginPostPublishPanel
    *         className="my-plugin-post-publish-panel"
    *         title="My panel title"
    *         initialOpen={true}
    *     >
    *         My panel content
    *     </PluginPostPublishPanel>
    * );
    * ```
    */
  object default {
    
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-post-publish-panel", JSImport.Default)
    @js.native
    def apply(props: Props): ReactElement = js.native
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-post-publish-panel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/edit-post/components/sidebar/plugin-post-publish-panel", "default.Slot")
    @js.native
    def Slot: ReactComponentClass[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: ReactComponentClass[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  object PluginPostPublishPanel {
    
    @js.native
    trait Props extends StObject {
      
      var children: ReactElement = js.native
      
      /**
        * An optional class name added to the panel.
        */
      var className: js.UndefOr[String] = js.native
      
      /**
        * Whether to have the panel initially opened. When no title is provided it is always
        * opened.
        * @defaultValue `false`
        */
      var initialOpen: js.UndefOr[Boolean] = js.native
      
      /**
        * Title displayed at the top of the panel.
        */
      var title: js.UndefOr[String] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setInitialOpen(value: Boolean): Self = StObject.set(x, "initialOpen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitialOpenUndefined: Self = StObject.set(x, "initialOpen", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
}
