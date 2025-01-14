package typingsSlinky.gsap.global.gsap

import typingsSlinky.gsap.gsap.Tween
import typingsSlinky.gsap.gsap.TweenConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("gsap.TweenMax")
@js.native
class TweenMax protected ()
  extends typingsSlinky.gsap.gsap.TweenMax {
  def this(target: js.Object, duration: Double, vars: js.Object) = this()
}
object TweenMax {
  
  /** Provides a simple way to call a () => void after a set amount of time (or frames). */
  /* static member */
  @JSGlobal("gsap.TweenMax.delayedCall")
  @js.native
  def delayedCall(delay: Double, callback: js.Function1[/* repeated */ js.Any, Unit]): typingsSlinky.gsap.gsap.TweenMax = js.native
  @JSGlobal("gsap.TweenMax.delayedCall")
  @js.native
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    useFrames: Boolean
  ): typingsSlinky.gsap.gsap.TweenMax = js.native
  @JSGlobal("gsap.TweenMax.delayedCall")
  @js.native
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.UndefOr[scala.Nothing],
    scope: js.Object
  ): typingsSlinky.gsap.gsap.TweenMax = js.native
  @JSGlobal("gsap.TweenMax.delayedCall")
  @js.native
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.UndefOr[scala.Nothing],
    scope: js.Object,
    useFrames: Boolean
  ): typingsSlinky.gsap.gsap.TweenMax = js.native
  @JSGlobal("gsap.TweenMax.delayedCall")
  @js.native
  def delayedCall(delay: Double, callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[_]): typingsSlinky.gsap.gsap.TweenMax = js.native
  @JSGlobal("gsap.TweenMax.delayedCall")
  @js.native
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[_],
    scope: js.UndefOr[scala.Nothing],
    useFrames: Boolean
  ): typingsSlinky.gsap.gsap.TweenMax = js.native
  @JSGlobal("gsap.TweenMax.delayedCall")
  @js.native
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[_],
    scope: js.Object
  ): typingsSlinky.gsap.gsap.TweenMax = js.native
  @JSGlobal("gsap.TweenMax.delayedCall")
  @js.native
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[_],
    scope: js.Object,
    useFrames: Boolean
  ): typingsSlinky.gsap.gsap.TweenMax = js.native
  
  /**
    * Static method for creating a TweenMax instance that tweens backwards - you define the BEGINNING values and the current values are used as the destination values which is great for
    * doing things like animating objects onto the screen because you can set them up initially the way you want them to look at the end of the tween and then animate in from elsewhere.
    */
  /* static member */
  @JSGlobal("gsap.TweenMax.from")
  @js.native
  def from(target: js.Object, duration: Double, vars: js.Object): typingsSlinky.gsap.gsap.TweenMax = js.native
  
  /**
    * Static method for creating a TweenMax instance that allows you to define both the starting and ending values (as opposed to to() and from() tweens which are based on the target's
    * current values at one end or the other).
    */
  /* static member */
  @JSGlobal("gsap.TweenMax.fromTo")
  @js.native
  def fromTo(target: js.Object, duration: Double, fromVars: js.Object, toVars: js.Object): typingsSlinky.gsap.gsap.TweenMax = js.native
  
  /** Returns an array containing all tweens (and optionally timelines too, excluding the root timelines). */
  /* static member */
  @JSGlobal("gsap.TweenMax.getAllTweens")
  @js.native
  def getAllTweens(): js.Array[Tween] = js.native
  @JSGlobal("gsap.TweenMax.getAllTweens")
  @js.native
  def getAllTweens(includeTimelines: Boolean): js.Array[Tween] = js.native
  
  /**
    * Returns an array containing all the tweens of a particular target (or group of targets) that have not been released for garbage collection yet which typically happens within a
    * few seconds after the tween completes.
    */
  /* static member */
  @JSGlobal("gsap.TweenMax.getTweensOf")
  @js.native
  def getTweensOf(target: js.Object): js.Array[Tween] = js.native
  
  /** Gets or sets the global timeScale which is a multiplier that affects ALL animations equally. This is a great way to globally speed up or slow down all animations at once. */
  /* static member */
  @JSGlobal("gsap.TweenMax.globalTimeScale")
  @js.native
  def globalTimeScale(): Double = js.native
  @JSGlobal("gsap.TweenMax.globalTimeScale")
  @js.native
  def globalTimeScale(value: Double): Double = js.native
  
  /** Reports whether or not a particular object is actively tweening. */
  /* static member */
  @JSGlobal("gsap.TweenMax.isTweening")
  @js.native
  def isTweening(target: js.Object): Boolean = js.native
  
  /** Kills all tweens and/or delayedCalls/callbacks, and/or timelines, optionally forcing them to completion first. */
  /* static member */
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(
    complete: js.UndefOr[scala.Nothing],
    tweens: js.UndefOr[scala.Nothing],
    delayedCalls: js.UndefOr[scala.Nothing],
    timelines: Boolean
  ): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(complete: js.UndefOr[scala.Nothing], tweens: js.UndefOr[scala.Nothing], delayedCalls: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(
    complete: js.UndefOr[scala.Nothing],
    tweens: js.UndefOr[scala.Nothing],
    delayedCalls: Boolean,
    timelines: Boolean
  ): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(complete: js.UndefOr[scala.Nothing], tweens: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(
    complete: js.UndefOr[scala.Nothing],
    tweens: Boolean,
    delayedCalls: js.UndefOr[scala.Nothing],
    timelines: Boolean
  ): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(complete: js.UndefOr[scala.Nothing], tweens: Boolean, delayedCalls: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(complete: js.UndefOr[scala.Nothing], tweens: Boolean, delayedCalls: Boolean, timelines: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(complete: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(
    complete: Boolean,
    tweens: js.UndefOr[scala.Nothing],
    delayedCalls: js.UndefOr[scala.Nothing],
    timelines: Boolean
  ): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(complete: Boolean, tweens: js.UndefOr[scala.Nothing], delayedCalls: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(complete: Boolean, tweens: js.UndefOr[scala.Nothing], delayedCalls: Boolean, timelines: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(complete: Boolean, tweens: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(complete: Boolean, tweens: Boolean, delayedCalls: js.UndefOr[scala.Nothing], timelines: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(complete: Boolean, tweens: Boolean, delayedCalls: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.killAll")
  @js.native
  def killAll(complete: Boolean, tweens: Boolean, delayedCalls: Boolean, timelines: Boolean): Unit = js.native
  
  /** Kills all tweens of the children of a particular DOM element, optionally forcing them to completion first. */
  /* static member */
  @JSGlobal("gsap.TweenMax.killChildTweensOf")
  @js.native
  def killChildTweensOf(parent: js.Any): Unit = js.native
  @JSGlobal("gsap.TweenMax.killChildTweensOf")
  @js.native
  def killChildTweensOf(parent: js.Any, complete: Boolean): Unit = js.native
  
  /** Immediately kills all of the delayedCalls to a particular () => void. */
  /* static member */
  @JSGlobal("gsap.TweenMax.killDelayedCallsTo")
  @js.native
  def killDelayedCallsTo(func: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  /** Kills all the tweens (or specific tweening properties) of a particular object or the delayedCalls to a particular () => void. */
  /* static member */
  @JSGlobal("gsap.TweenMax.killTweensOf")
  @js.native
  def killTweensOf(target: js.Object): Unit = js.native
  @JSGlobal("gsap.TweenMax.killTweensOf")
  @js.native
  def killTweensOf(target: js.Object, vars: js.Object): Unit = js.native
  
  /** Pauses all tweens and/or delayedCalls/callbacks and/or timelines. */
  /* static member */
  @JSGlobal("gsap.TweenMax.pauseAll")
  @js.native
  def pauseAll(): Unit = js.native
  @JSGlobal("gsap.TweenMax.pauseAll")
  @js.native
  def pauseAll(tweens: js.UndefOr[scala.Nothing], delayedCalls: js.UndefOr[scala.Nothing], timelines: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.pauseAll")
  @js.native
  def pauseAll(tweens: js.UndefOr[scala.Nothing], delayedCalls: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.pauseAll")
  @js.native
  def pauseAll(tweens: js.UndefOr[scala.Nothing], delayedCalls: Boolean, timelines: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.pauseAll")
  @js.native
  def pauseAll(tweens: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.pauseAll")
  @js.native
  def pauseAll(tweens: Boolean, delayedCalls: js.UndefOr[scala.Nothing], timelines: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.pauseAll")
  @js.native
  def pauseAll(tweens: Boolean, delayedCalls: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.pauseAll")
  @js.native
  def pauseAll(tweens: Boolean, delayedCalls: Boolean, timelines: Boolean): Unit = js.native
  
  /** Resumes all paused tweens and/or delayedCalls/callbacks and/or timelines. */
  /* static member */
  @JSGlobal("gsap.TweenMax.resumeAll")
  @js.native
  def resumeAll(): Unit = js.native
  @JSGlobal("gsap.TweenMax.resumeAll")
  @js.native
  def resumeAll(tweens: js.UndefOr[scala.Nothing], delayedCalls: js.UndefOr[scala.Nothing], timelines: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.resumeAll")
  @js.native
  def resumeAll(tweens: js.UndefOr[scala.Nothing], delayedCalls: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.resumeAll")
  @js.native
  def resumeAll(tweens: js.UndefOr[scala.Nothing], delayedCalls: Boolean, timelines: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.resumeAll")
  @js.native
  def resumeAll(tweens: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.resumeAll")
  @js.native
  def resumeAll(tweens: Boolean, delayedCalls: js.UndefOr[scala.Nothing], timelines: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.resumeAll")
  @js.native
  def resumeAll(tweens: Boolean, delayedCalls: Boolean): Unit = js.native
  @JSGlobal("gsap.TweenMax.resumeAll")
  @js.native
  def resumeAll(tweens: Boolean, delayedCalls: Boolean, timelines: Boolean): Unit = js.native
  
  /** Immediately sets properties of the target accordingly - essentially a zero-duration to() tween with a more intuitive name. */
  /* static member */
  @JSGlobal("gsap.TweenMax.set")
  @js.native
  def set(target: js.Object, vars: js.Object): typingsSlinky.gsap.gsap.TweenMax = js.native
  
  /**
    * Tweens an array of targets from a common set of destination values (using the current values as the destination), but staggers their start times by a specified amount of time, creating
    * an evenly-spaced sequence with a surprisingly small amount of code.
    */
  /* static member */
  @JSGlobal("gsap.TweenMax.staggerFrom")
  @js.native
  def staggerFrom(targets: js.Any, duration: Double, vars: js.Object, stagger: Double): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerFrom")
  @js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.UndefOr[scala.Nothing],
    onCompleteAllParams: js.UndefOr[scala.Nothing],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerFrom")
  @js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.UndefOr[scala.Nothing],
    onCompleteAllParams: js.Array[_]
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerFrom")
  @js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.UndefOr[scala.Nothing],
    onCompleteAllParams: js.Array[_],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerFrom")
  @js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerFrom")
  @js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.UndefOr[scala.Nothing],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerFrom")
  @js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[_]
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerFrom")
  @js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[_],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  
  /**
    * Tweens an array of targets from a common set of destination values to a common set of destination values, but staggers their start times by a specified amount of time, creating an
    * evenly-spaced sequence with a surprisingly small amount of code.
    */
  /* static member */
  @JSGlobal("gsap.TweenMax.staggerFromTo")
  @js.native
  def staggerFromTo(targets: js.Any, duration: Double, fromVars: js.Object, toVars: js.Object, stagger: Double): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerFromTo")
  @js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: js.UndefOr[scala.Nothing],
    onCompleteAllParams: js.UndefOr[scala.Nothing],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerFromTo")
  @js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: js.UndefOr[scala.Nothing],
    onCompleteAllParams: js.Array[_]
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerFromTo")
  @js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: js.UndefOr[scala.Nothing],
    onCompleteAllParams: js.Array[_],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerFromTo")
  @js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerFromTo")
  @js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.UndefOr[scala.Nothing],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerFromTo")
  @js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[_]
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerFromTo")
  @js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[_],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  
  /**
    * Tweens an array of targets to a common set of destination values, but staggers their start times by a specified amount of time, creating an evenly-spaced sequence with a surprisingly
    * small amount of code.
    */
  /* static member */
  @JSGlobal("gsap.TweenMax.staggerTo")
  @js.native
  def staggerTo(targets: js.Any, duration: Double, vars: js.Object, stagger: Double): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerTo")
  @js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.UndefOr[scala.Nothing],
    onCompleteAllParams: js.UndefOr[scala.Nothing],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerTo")
  @js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.UndefOr[scala.Nothing],
    onCompleteAllParams: js.Array[_]
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerTo")
  @js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.UndefOr[scala.Nothing],
    onCompleteAllParams: js.Array[_],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerTo")
  @js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerTo")
  @js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.UndefOr[scala.Nothing],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerTo")
  @js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[_]
  ): js.Array[_] = js.native
  @JSGlobal("gsap.TweenMax.staggerTo")
  @js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[_],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  
  /** Static method for creating a TweenMax instance that animates to the specified destination values (from the current values). */
  /* static member */
  @JSGlobal("gsap.TweenMax.to")
  @js.native
  def to(target: js.Object, duration: Double, vars: TweenConfig): typingsSlinky.gsap.gsap.TweenMax = js.native
}
