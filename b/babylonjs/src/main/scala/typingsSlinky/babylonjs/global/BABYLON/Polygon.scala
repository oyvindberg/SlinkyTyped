package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Polygon")
@js.native
class Polygon ()
  extends typingsSlinky.babylonjs.BABYLON.Polygon
/* static members */
object Polygon {
  
  /**
    * Creates a circle
    * @param radius radius of circle
    * @param cx scale in x
    * @param cy scale in y
    * @param numberOfSides number of sides that make up the circle
    * @returns points that make the resulting circle
    */
  @JSGlobal("BABYLON.Polygon.Circle")
  @js.native
  def Circle(radius: Double): js.Array[typingsSlinky.babylonjs.BABYLON.Vector2] = js.native
  @JSGlobal("BABYLON.Polygon.Circle")
  @js.native
  def Circle(
    radius: Double,
    cx: js.UndefOr[scala.Nothing],
    cy: js.UndefOr[scala.Nothing],
    numberOfSides: Double
  ): js.Array[typingsSlinky.babylonjs.BABYLON.Vector2] = js.native
  @JSGlobal("BABYLON.Polygon.Circle")
  @js.native
  def Circle(radius: Double, cx: js.UndefOr[scala.Nothing], cy: Double): js.Array[typingsSlinky.babylonjs.BABYLON.Vector2] = js.native
  @JSGlobal("BABYLON.Polygon.Circle")
  @js.native
  def Circle(radius: Double, cx: js.UndefOr[scala.Nothing], cy: Double, numberOfSides: Double): js.Array[typingsSlinky.babylonjs.BABYLON.Vector2] = js.native
  @JSGlobal("BABYLON.Polygon.Circle")
  @js.native
  def Circle(radius: Double, cx: Double): js.Array[typingsSlinky.babylonjs.BABYLON.Vector2] = js.native
  @JSGlobal("BABYLON.Polygon.Circle")
  @js.native
  def Circle(radius: Double, cx: Double, cy: js.UndefOr[scala.Nothing], numberOfSides: Double): js.Array[typingsSlinky.babylonjs.BABYLON.Vector2] = js.native
  @JSGlobal("BABYLON.Polygon.Circle")
  @js.native
  def Circle(radius: Double, cx: Double, cy: Double): js.Array[typingsSlinky.babylonjs.BABYLON.Vector2] = js.native
  @JSGlobal("BABYLON.Polygon.Circle")
  @js.native
  def Circle(radius: Double, cx: Double, cy: Double, numberOfSides: Double): js.Array[typingsSlinky.babylonjs.BABYLON.Vector2] = js.native
  
  /**
    * Creates a polygon from input string
    * @param input Input polygon data
    * @returns the parsed points
    */
  @JSGlobal("BABYLON.Polygon.Parse")
  @js.native
  def Parse(input: String): js.Array[typingsSlinky.babylonjs.BABYLON.Vector2] = js.native
  
  /**
    * Creates a rectangle
    * @param xmin bottom X coord
    * @param ymin bottom Y coord
    * @param xmax top X coord
    * @param ymax top Y coord
    * @returns points that make the resulting rectation
    */
  @JSGlobal("BABYLON.Polygon.Rectangle")
  @js.native
  def Rectangle(xmin: Double, ymin: Double, xmax: Double, ymax: Double): js.Array[typingsSlinky.babylonjs.BABYLON.Vector2] = js.native
  
  /**
    * Starts building a polygon from x and y coordinates
    * @param x x coordinate
    * @param y y coordinate
    * @returns the started path2
    */
  @JSGlobal("BABYLON.Polygon.StartingAt")
  @js.native
  def StartingAt(x: Double, y: Double): typingsSlinky.babylonjs.BABYLON.Path2 = js.native
}
