package typingsSlinky.rcTree.components

import typingsSlinky.rcTree.mod.default
import typingsSlinky.rcTree.treeMod.TreeProps
import typingsSlinky.rcTree.treeNodeMod.TreeNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcTree {
  
  @scala.inline
  def apply(prefixCls: String): SharedBuilder_TreeProps_407499862[default] = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new SharedBuilder_TreeProps_407499862[default](js.Array(this.component, __props.asInstanceOf[TreeProps]))
  }
  
  object TreeNode {
    
    @JSImport("rc-tree", "default.TreeNode")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: TreeNode.type): SharedBuilder_TreeNodeProps1751175894 = new SharedBuilder_TreeNodeProps1751175894(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TreeNodeProps): SharedBuilder_TreeNodeProps1751175894 = new SharedBuilder_TreeNodeProps1751175894(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-tree", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TreeProps): SharedBuilder_TreeProps_407499862[default] = new SharedBuilder_TreeProps_407499862[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
