package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Counter
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.ScpBallot")
@js.native
class ScpBallot protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.ScpBallot {
  def this(attributes: Counter) = this()
}
object ScpBallot {
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpBallot.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot = js.native
  @JSImport("stellar-base", "xdr.ScpBallot.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ScpBallot.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot = js.native
  @JSImport("stellar-base", "xdr.ScpBallot.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpBallot.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpBallot.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpBallot.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpBallot.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.ScpBallot.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ScpBallot.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.ScpBallot.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ScpBallot.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot, io: Buffer): Unit = js.native
}
