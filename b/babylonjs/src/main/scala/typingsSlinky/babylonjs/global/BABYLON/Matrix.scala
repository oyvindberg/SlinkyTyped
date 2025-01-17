package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.DeepImmutable
import typingsSlinky.babylonjs.BABYLON.IPlaneLike
import typingsSlinky.babylonjs.anon.DownDegrees
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Matrix")
@js.native
/**
  * Creates an empty matrix (filled with zeros)
  */
class Matrix ()
  extends typingsSlinky.babylonjs.BABYLON.Matrix
/* static members */
object Matrix {
  
  @JSGlobal("BABYLON.Matrix")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new matrix composed by merging scale (vector3), rotation (quaternion) and translation (vector3)
    * @param scale defines the scale vector3
    * @param rotation defines the rotation quaternion
    * @param translation defines the translation vector3
    * @returns a new matrix
    */
  @JSGlobal("BABYLON.Matrix.Compose")
  @js.native
  def Compose(
    scale: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    rotation: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Quaternion],
    translation: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3]
  ): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Sets a matrix to a value composed by merging scale (vector3), rotation (quaternion) and translation (vector3)
    * @param scale defines the scale vector3
    * @param rotation defines the rotation quaternion
    * @param translation defines the translation vector3
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.ComposeToRef")
  @js.native
  def ComposeToRef(
    scale: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    rotation: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Quaternion],
    translation: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Builds a new matrix whose values are computed by:
    * * decomposing the the "startValue" and "endValue" matrices into their respective scale, rotation and translation matrices
    * * interpolating for "gradient" (float) the values between each of these decomposed matrices between the start and the end
    * * recomposing a new matrix from these 3 interpolated scale, rotation and translation matrices
    * @param startValue defines the first matrix
    * @param endValue defines the second matrix
    * @param gradient defines the gradient between the two matrices
    * @returns the new matrix
    */
  @JSGlobal("BABYLON.Matrix.DecomposeLerp")
  @js.native
  def DecomposeLerp(
    startValue: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    endValue: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    gradient: Double
  ): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Update a matrix to values which are computed by:
    * * decomposing the the "startValue" and "endValue" matrices into their respective scale, rotation and translation matrices
    * * interpolating for "gradient" (float) the values between each of these decomposed matrices between the start and the end
    * * recomposing a new matrix from these 3 interpolated scale, rotation and translation matrices
    * @param startValue defines the first matrix
    * @param endValue defines the second matrix
    * @param gradient defines the gradient between the two matrices
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.DecomposeLerpToRef")
  @js.native
  def DecomposeLerpToRef(
    startValue: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    endValue: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    gradient: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Creates a matrix from an array
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @returns a new Matrix set from the starting index of the given array
    */
  @JSGlobal("BABYLON.Matrix.FromArray")
  @js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  @JSGlobal("BABYLON.Matrix.FromArray")
  @js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Copy the content of an array into a given matrix
    * @param array defines the source array
    * @param offset defines an offset in the source array
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.FromArrayToRef")
  @js.native
  def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Stores an array into a matrix after having multiplied each component by a given factor
    * @param array defines the source array
    * @param offset defines the offset in the source array
    * @param scale defines the scaling factor
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.FromFloat32ArrayToRefScaled")
  @js.native
  def FromFloat32ArrayToRefScaled(
    array: DeepImmutable[js.typedarray.Float32Array | js.Array[Double]],
    offset: Double,
    scale: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Creates a rotation matrix from a quaternion and stores it in a target matrix
    * @param quat defines the quaternion to use
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.FromQuaternionToRef")
  @js.native
  def FromQuaternionToRef(
    quat: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Quaternion],
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Creates new matrix from a list of values (16)
    * @param initialM11 defines 1st value of 1st row
    * @param initialM12 defines 2nd value of 1st row
    * @param initialM13 defines 3rd value of 1st row
    * @param initialM14 defines 4th value of 1st row
    * @param initialM21 defines 1st value of 2nd row
    * @param initialM22 defines 2nd value of 2nd row
    * @param initialM23 defines 3rd value of 2nd row
    * @param initialM24 defines 4th value of 2nd row
    * @param initialM31 defines 1st value of 3rd row
    * @param initialM32 defines 2nd value of 3rd row
    * @param initialM33 defines 3rd value of 3rd row
    * @param initialM34 defines 4th value of 3rd row
    * @param initialM41 defines 1st value of 4th row
    * @param initialM42 defines 2nd value of 4th row
    * @param initialM43 defines 3rd value of 4th row
    * @param initialM44 defines 4th value of 4th row
    * @returns the new matrix
    */
  @JSGlobal("BABYLON.Matrix.FromValues")
  @js.native
  def FromValues(
    initialM11: Double,
    initialM12: Double,
    initialM13: Double,
    initialM14: Double,
    initialM21: Double,
    initialM22: Double,
    initialM23: Double,
    initialM24: Double,
    initialM31: Double,
    initialM32: Double,
    initialM33: Double,
    initialM34: Double,
    initialM41: Double,
    initialM42: Double,
    initialM43: Double,
    initialM44: Double
  ): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Stores a list of values (16) inside a given matrix
    * @param initialM11 defines 1st value of 1st row
    * @param initialM12 defines 2nd value of 1st row
    * @param initialM13 defines 3rd value of 1st row
    * @param initialM14 defines 4th value of 1st row
    * @param initialM21 defines 1st value of 2nd row
    * @param initialM22 defines 2nd value of 2nd row
    * @param initialM23 defines 3rd value of 2nd row
    * @param initialM24 defines 4th value of 2nd row
    * @param initialM31 defines 1st value of 3rd row
    * @param initialM32 defines 2nd value of 3rd row
    * @param initialM33 defines 3rd value of 3rd row
    * @param initialM34 defines 4th value of 3rd row
    * @param initialM41 defines 1st value of 4th row
    * @param initialM42 defines 2nd value of 4th row
    * @param initialM43 defines 3rd value of 4th row
    * @param initialM44 defines 4th value of 4th row
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.FromValuesToRef")
  @js.native
  def FromValuesToRef(
    initialM11: Double,
    initialM12: Double,
    initialM13: Double,
    initialM14: Double,
    initialM21: Double,
    initialM22: Double,
    initialM23: Double,
    initialM24: Double,
    initialM31: Double,
    initialM32: Double,
    initialM33: Double,
    initialM34: Double,
    initialM41: Double,
    initialM42: Double,
    initialM43: Double,
    initialM44: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Sets the given matrix as a rotation matrix composed from the 3 left handed axes
    * @param xaxis defines the value of the 1st axis
    * @param yaxis defines the value of the 2nd axis
    * @param zaxis defines the value of the 3rd axis
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.FromXYZAxesToRef")
  @js.native
  def FromXYZAxesToRef(
    xaxis: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    yaxis: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    zaxis: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Extracts a 2x2 matrix from a given matrix and store the result in a Float32Array
    * @param matrix defines the matrix to use
    * @returns a new Float32Array array with 4 elements : the 2x2 matrix extracted from the given matrix
    */
  @JSGlobal("BABYLON.Matrix.GetAsMatrix2x2")
  @js.native
  def GetAsMatrix2x2(matrix: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix]): js.typedarray.Float32Array | js.Array[Double] = js.native
  
  /**
    * Extracts a 3x3 matrix from a given matrix and store the result in a Float32Array
    * @param matrix defines the matrix to use
    * @returns a new Float32Array array with 9 elements : the 3x3 matrix extracted from the given matrix
    */
  @JSGlobal("BABYLON.Matrix.GetAsMatrix3x3")
  @js.native
  def GetAsMatrix3x3(matrix: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix]): js.typedarray.Float32Array | js.Array[Double] = js.native
  
  /**
    * Computes a complete transformation matrix
    * @param viewport defines the viewport to use
    * @param world defines the world matrix
    * @param view defines the view matrix
    * @param projection defines the projection matrix
    * @param zmin defines the near clip plane
    * @param zmax defines the far clip plane
    * @returns the transformation matrix
    */
  @JSGlobal("BABYLON.Matrix.GetFinalMatrix")
  @js.native
  def GetFinalMatrix(
    viewport: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Viewport],
    world: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    view: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    projection: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    zmin: Double,
    zmax: Double
  ): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Creates a new identity matrix
    * @returns a new identity matrix
    */
  @JSGlobal("BABYLON.Matrix.Identity")
  @js.native
  def Identity(): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Creates a new identity matrix and stores the result in a given matrix
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.IdentityToRef")
  @js.native
  def IdentityToRef(result: typingsSlinky.babylonjs.BABYLON.Matrix): Unit = js.native
  
  /**
    * Creates a new matrix as the invert of a given matrix
    * @param source defines the source matrix
    * @returns the new matrix
    */
  @JSGlobal("BABYLON.Matrix.Invert")
  @js.native
  def Invert(source: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix]): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Returns a new Matrix whose values are the interpolated values for "gradient" (float) between the ones of the matrices "startValue" and "endValue".
    * @param startValue defines the start value
    * @param endValue defines the end value
    * @param gradient defines the gradient factor
    * @returns the new matrix
    */
  @JSGlobal("BABYLON.Matrix.Lerp")
  @js.native
  def Lerp(
    startValue: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    endValue: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    gradient: Double
  ): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Set the given matrix "result" as the interpolated values for "gradient" (float) between the ones of the matrices "startValue" and "endValue".
    * @param startValue defines the start value
    * @param endValue defines the end value
    * @param gradient defines the gradient factor
    * @param result defines the Matrix object where to store data
    */
  @JSGlobal("BABYLON.Matrix.LerpToRef")
  @js.native
  def LerpToRef(
    startValue: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    endValue: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    gradient: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Gets a new rotation matrix used to rotate an entity so as it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up"
    * This function works in left handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @returns the new matrix
    */
  @JSGlobal("BABYLON.Matrix.LookAtLH")
  @js.native
  def LookAtLH(
    eye: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    target: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    up: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3]
  ): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up".
    * This function works in left handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.LookAtLHToRef")
  @js.native
  def LookAtLHToRef(
    eye: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    target: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    up: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Gets a new rotation matrix used to rotate an entity so as it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up"
    * This function works in right handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @returns the new matrix
    */
  @JSGlobal("BABYLON.Matrix.LookAtRH")
  @js.native
  def LookAtRH(
    eye: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    target: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    up: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3]
  ): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Sets the given "result" Matrix to a rotation matrix used to rotate an entity so that it looks at the target vector3, from the eye vector3 position, the up vector3 being oriented like "up".
    * This function works in right handed mode
    * @param eye defines the final position of the entity
    * @param target defines where the entity should look at
    * @param up defines the up vector for the entity
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.LookAtRHToRef")
  @js.native
  def LookAtRHToRef(
    eye: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    target: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    up: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Create a left-handed orthographic projection matrix
    * @param width defines the viewport width
    * @param height defines the viewport height
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a left-handed orthographic projection matrix
    */
  @JSGlobal("BABYLON.Matrix.OrthoLH")
  @js.native
  def OrthoLH(width: Double, height: Double, znear: Double, zfar: Double): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Store a left-handed orthographic projection to a given matrix
    * @param width defines the viewport width
    * @param height defines the viewport height
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.OrthoLHToRef")
  @js.native
  def OrthoLHToRef(
    width: Double,
    height: Double,
    znear: Double,
    zfar: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Create a left-handed orthographic projection matrix
    * @param left defines the viewport left coordinate
    * @param right defines the viewport right coordinate
    * @param bottom defines the viewport bottom coordinate
    * @param top defines the viewport top coordinate
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a left-handed orthographic projection matrix
    */
  @JSGlobal("BABYLON.Matrix.OrthoOffCenterLH")
  @js.native
  def OrthoOffCenterLH(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Stores a left-handed orthographic projection into a given matrix
    * @param left defines the viewport left coordinate
    * @param right defines the viewport right coordinate
    * @param bottom defines the viewport bottom coordinate
    * @param top defines the viewport top coordinate
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.OrthoOffCenterLHToRef")
  @js.native
  def OrthoOffCenterLHToRef(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    znear: Double,
    zfar: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Creates a right-handed orthographic projection matrix
    * @param left defines the viewport left coordinate
    * @param right defines the viewport right coordinate
    * @param bottom defines the viewport bottom coordinate
    * @param top defines the viewport top coordinate
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a right-handed orthographic projection matrix
    */
  @JSGlobal("BABYLON.Matrix.OrthoOffCenterRH")
  @js.native
  def OrthoOffCenterRH(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Stores a right-handed orthographic projection into a given matrix
    * @param left defines the viewport left coordinate
    * @param right defines the viewport right coordinate
    * @param bottom defines the viewport bottom coordinate
    * @param top defines the viewport top coordinate
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.OrthoOffCenterRHToRef")
  @js.native
  def OrthoOffCenterRHToRef(
    left: Double,
    right: Double,
    bottom: Double,
    top: Double,
    znear: Double,
    zfar: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Creates a left-handed perspective projection matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a left-handed perspective projection matrix
    */
  @JSGlobal("BABYLON.Matrix.PerspectiveFovLH")
  @js.native
  def PerspectiveFovLH(fov: Double, aspect: Double, znear: Double, zfar: Double): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Stores a left-handed perspective projection into a given matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
    */
  @JSGlobal("BABYLON.Matrix.PerspectiveFovLHToRef")
  @js.native
  def PerspectiveFovLHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  @JSGlobal("BABYLON.Matrix.PerspectiveFovLHToRef")
  @js.native
  def PerspectiveFovLHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix,
    isVerticalFovFixed: Boolean
  ): Unit = js.native
  
  /**
    * Creates a right-handed perspective projection matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a right-handed perspective projection matrix
    */
  @JSGlobal("BABYLON.Matrix.PerspectiveFovRH")
  @js.native
  def PerspectiveFovRH(fov: Double, aspect: Double, znear: Double, zfar: Double): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Stores a right-handed perspective projection into a given matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
    */
  @JSGlobal("BABYLON.Matrix.PerspectiveFovRHToRef")
  @js.native
  def PerspectiveFovRHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  @JSGlobal("BABYLON.Matrix.PerspectiveFovRHToRef")
  @js.native
  def PerspectiveFovRHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix,
    isVerticalFovFixed: Boolean
  ): Unit = js.native
  
  /**
    * Stores a left-handed perspective projection into a given matrix with depth reversed
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar not used as infinity is used as far clip
    * @param result defines the target matrix
    * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
    */
  @JSGlobal("BABYLON.Matrix.PerspectiveFovReverseLHToRef")
  @js.native
  def PerspectiveFovReverseLHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  @JSGlobal("BABYLON.Matrix.PerspectiveFovReverseLHToRef")
  @js.native
  def PerspectiveFovReverseLHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix,
    isVerticalFovFixed: Boolean
  ): Unit = js.native
  
  /**
    * Stores a right-handed perspective projection into a given matrix
    * @param fov defines the horizontal field of view
    * @param aspect defines the aspect ratio
    * @param znear defines the near clip plane
    * @param zfar not used as infinity is used as far clip
    * @param result defines the target matrix
    * @param isVerticalFovFixed defines it the fov is vertically fixed (default) or horizontally
    */
  @JSGlobal("BABYLON.Matrix.PerspectiveFovReverseRHToRef")
  @js.native
  def PerspectiveFovReverseRHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  @JSGlobal("BABYLON.Matrix.PerspectiveFovReverseRHToRef")
  @js.native
  def PerspectiveFovReverseRHToRef(
    fov: Double,
    aspect: Double,
    znear: Double,
    zfar: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix,
    isVerticalFovFixed: Boolean
  ): Unit = js.native
  
  /**
    * Stores a perspective projection for WebVR info a given matrix
    * @param fov defines the field of view
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @param result defines the target matrix
    * @param rightHanded defines if the matrix must be in right-handed mode (false by default)
    */
  @JSGlobal("BABYLON.Matrix.PerspectiveFovWebVRToRef")
  @js.native
  def PerspectiveFovWebVRToRef(fov: DownDegrees, znear: Double, zfar: Double, result: typingsSlinky.babylonjs.BABYLON.Matrix): Unit = js.native
  @JSGlobal("BABYLON.Matrix.PerspectiveFovWebVRToRef")
  @js.native
  def PerspectiveFovWebVRToRef(
    fov: DownDegrees,
    znear: Double,
    zfar: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix,
    rightHanded: Boolean
  ): Unit = js.native
  
  /**
    * Creates a left-handed perspective projection matrix
    * @param width defines the viewport width
    * @param height defines the viewport height
    * @param znear defines the near clip plane
    * @param zfar defines the far clip plane
    * @returns a new matrix as a left-handed perspective projection matrix
    */
  @JSGlobal("BABYLON.Matrix.PerspectiveLH")
  @js.native
  def PerspectiveLH(width: Double, height: Double, znear: Double, zfar: Double): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Computes a reflection matrix from a plane
    * @param plane defines the reflection plane
    * @returns a new matrix
    */
  @JSGlobal("BABYLON.Matrix.Reflection")
  @js.native
  def Reflection(plane: DeepImmutable[IPlaneLike]): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Computes a reflection matrix from a plane
    * @param plane defines the reflection plane
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.ReflectionToRef")
  @js.native
  def ReflectionToRef(plane: DeepImmutable[IPlaneLike], result: typingsSlinky.babylonjs.BABYLON.Matrix): Unit = js.native
  
  /**
    * Takes normalised vectors and returns a rotation matrix to align "from" with "to".
    * Taken from http://www.iquilezles.org/www/articles/noacos/noacos.htm
    * @param from defines the vector to align
    * @param to defines the vector to align to
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.RotationAlignToRef")
  @js.native
  def RotationAlignToRef(
    from: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    to: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Creates a new rotation matrix for "angle" radians around the given axis
    * @param axis defines the axis to use
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  @JSGlobal("BABYLON.Matrix.RotationAxis")
  @js.native
  def RotationAxis(axis: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3], angle: Double): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Creates a new rotation matrix for "angle" radians around the given axis and stores it in a given matrix
    * @param axis defines the axis to use
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.RotationAxisToRef")
  @js.native
  def RotationAxisToRef(
    axis: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    angle: Double,
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Creates a new rotation matrix for "angle" radians around the X axis
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  @JSGlobal("BABYLON.Matrix.RotationX")
  @js.native
  def RotationX(angle: Double): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Creates a new rotation matrix for "angle" radians around the X axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.RotationXToRef")
  @js.native
  def RotationXToRef(angle: Double, result: typingsSlinky.babylonjs.BABYLON.Matrix): Unit = js.native
  
  /**
    * Creates a new rotation matrix for "angle" radians around the Y axis
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  @JSGlobal("BABYLON.Matrix.RotationY")
  @js.native
  def RotationY(angle: Double): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Creates a new rotation matrix for "angle" radians around the Y axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.RotationYToRef")
  @js.native
  def RotationYToRef(angle: Double, result: typingsSlinky.babylonjs.BABYLON.Matrix): Unit = js.native
  
  /**
    * Creates a rotation matrix
    * @param yaw defines the yaw angle in radians (Y axis)
    * @param pitch defines the pitch angle in radians (X axis)
    * @param roll defines the roll angle in radians (Z axis)
    * @returns the new rotation matrix
    */
  @JSGlobal("BABYLON.Matrix.RotationYawPitchRoll")
  @js.native
  def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Creates a rotation matrix and stores it in a given matrix
    * @param yaw defines the yaw angle in radians (Y axis)
    * @param pitch defines the pitch angle in radians (X axis)
    * @param roll defines the roll angle in radians (Z axis)
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.RotationYawPitchRollToRef")
  @js.native
  def RotationYawPitchRollToRef(yaw: Double, pitch: Double, roll: Double, result: typingsSlinky.babylonjs.BABYLON.Matrix): Unit = js.native
  
  /**
    * Creates a new rotation matrix for "angle" radians around the Z axis
    * @param angle defines the angle (in radians) to use
    * @return the new matrix
    */
  @JSGlobal("BABYLON.Matrix.RotationZ")
  @js.native
  def RotationZ(angle: Double): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Creates a new rotation matrix for "angle" radians around the Z axis and stores it in a given matrix
    * @param angle defines the angle (in radians) to use
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.RotationZToRef")
  @js.native
  def RotationZToRef(angle: Double, result: typingsSlinky.babylonjs.BABYLON.Matrix): Unit = js.native
  
  /**
    * Creates a scaling matrix
    * @param x defines the scale factor on X axis
    * @param y defines the scale factor on Y axis
    * @param z defines the scale factor on Z axis
    * @returns the new matrix
    */
  @JSGlobal("BABYLON.Matrix.Scaling")
  @js.native
  def Scaling(x: Double, y: Double, z: Double): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Creates a scaling matrix and stores it in a given matrix
    * @param x defines the scale factor on X axis
    * @param y defines the scale factor on Y axis
    * @param z defines the scale factor on Z axis
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.ScalingToRef")
  @js.native
  def ScalingToRef(x: Double, y: Double, z: Double, result: typingsSlinky.babylonjs.BABYLON.Matrix): Unit = js.native
  
  /**
    * Creates a translation matrix
    * @param x defines the translation on X axis
    * @param y defines the translation on Y axis
    * @param z defines the translationon Z axis
    * @returns the new matrix
    */
  @JSGlobal("BABYLON.Matrix.Translation")
  @js.native
  def Translation(x: Double, y: Double, z: Double): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Creates a translation matrix and stores it in a given matrix
    * @param x defines the translation on X axis
    * @param y defines the translation on Y axis
    * @param z defines the translationon Z axis
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.TranslationToRef")
  @js.native
  def TranslationToRef(x: Double, y: Double, z: Double, result: typingsSlinky.babylonjs.BABYLON.Matrix): Unit = js.native
  
  /**
    * Compute the transpose of a given matrix
    * @param matrix defines the matrix to transpose
    * @returns the new matrix
    */
  @JSGlobal("BABYLON.Matrix.Transpose")
  @js.native
  def Transpose(matrix: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix]): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  /**
    * Compute the transpose of a matrix and store it in a target matrix
    * @param matrix defines the matrix to transpose
    * @param result defines the target matrix
    */
  @JSGlobal("BABYLON.Matrix.TransposeToRef")
  @js.native
  def TransposeToRef(
    matrix: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    result: typingsSlinky.babylonjs.BABYLON.Matrix
  ): Unit = js.native
  
  /**
    * Creates a new zero matrix
    * @returns a new zero matrix
    */
  @JSGlobal("BABYLON.Matrix.Zero")
  @js.native
  def Zero(): typingsSlinky.babylonjs.BABYLON.Matrix = js.native
  
  @JSGlobal("BABYLON.Matrix._identityReadOnly")
  @js.native
  def _identityReadOnly: js.Any = js.native
  @scala.inline
  def _identityReadOnly_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_identityReadOnly")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Matrix._updateFlagSeed")
  @js.native
  def _updateFlagSeed: js.Any = js.native
  @scala.inline
  def _updateFlagSeed_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_updateFlagSeed")(x.asInstanceOf[js.Any])
}
