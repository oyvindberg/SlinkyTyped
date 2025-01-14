package typingsSlinky.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-model", "Slice")
@js.native
class Slice[S /* <: Schema[_, _] */] protected () extends StObject {
  /**
    * Create a slice. When specifying a non-zero open depth, you must
    * make sure that there are nodes of at least that depth at the
    * appropriate side of the fragment—i.e. if the fragment is an empty
    * paragraph node, `openStart` and `openEnd` can't be greater than
    * 1.
    *
    * It is not necessary for the content of open nodes to conform to
    * the schema's content constraints, though it should be a valid
    * start/end/middle for such a node, depending on which sides are
    * open.
    */
  def this(content: Fragment[S], openStart: Double, openEnd: Double) = this()
  
  /**
    * The slice's content.
    */
  var content: Fragment[S] = js.native
  
  /**
    * Tests whether this slice is equal to another slice.
    */
  def eq(other: Slice[S]): Boolean = js.native
  
  /**
    * The open depth at the end.
    */
  var openEnd: Double = js.native
  
  /**
    * The open depth at the start.
    */
  var openStart: Double = js.native
  
  /**
    * The size this slice would add when inserted into a document.
    */
  var size: Double = js.native
  
  /**
    * Convert a slice to a JSON-serializable representation.
    */
  def toJSON(): js.UndefOr[StringDictionary[js.Any] | Null] = js.native
}
/* static members */
object Slice {
  
  @JSImport("prosemirror-model", "Slice")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The empty slice.
    */
  @JSImport("prosemirror-model", "Slice.empty")
  @js.native
  def empty: Slice[js.Any] = js.native
  @scala.inline
  def empty_=(x: Slice[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
  
  /**
    * Deserialize a slice from its JSON representation.
    */
  @JSImport("prosemirror-model", "Slice.fromJSON")
  @js.native
  def fromJSON[S /* <: Schema[_, _] */](schema: S): Slice[S] = js.native
  @JSImport("prosemirror-model", "Slice.fromJSON")
  @js.native
  def fromJSON[S /* <: Schema[_, _] */](schema: S, json: StringDictionary[js.Any]): Slice[S] = js.native
  
  /**
    * Create a slice from a fragment by taking the maximum possible
    * open value on both side of the fragment.
    */
  @JSImport("prosemirror-model", "Slice.maxOpen")
  @js.native
  def maxOpen[S /* <: Schema[_, _] */](fragment: Fragment[S]): Slice[S] = js.native
  @JSImport("prosemirror-model", "Slice.maxOpen")
  @js.native
  def maxOpen[S /* <: Schema[_, _] */](fragment: Fragment[S], openIsolating: Boolean): Slice[S] = js.native
}
