package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointParticleEmitter extends IParticleEmitterType {
  
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  var direction1: Vector3 = js.native
  
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  var direction2: Vector3 = js.native
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: js.Any): Unit = js.native
}
object PointParticleEmitter {
  
  @scala.inline
  def apply(
    applyToShader: Effect => Unit,
    direction1: Vector3,
    direction2: Vector3,
    getClassName: () => String,
    getEffectDefines: () => String,
    parse: js.Any => Unit,
    serialize: () => js.Any,
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit
  ): PointParticleEmitter = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1(applyToShader), direction1 = direction1.asInstanceOf[js.Any], direction2 = direction2.asInstanceOf[js.Any], getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction4(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction))
    __obj.asInstanceOf[PointParticleEmitter]
  }
  
  @scala.inline
  implicit class PointParticleEmitterMutableBuilder[Self <: PointParticleEmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection1(value: Vector3): Self = StObject.set(x, "direction1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection2(value: Vector3): Self = StObject.set(x, "direction2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: js.Any => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
