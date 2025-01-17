package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Ed25519
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.MuxedAccountMed25519")
@js.native
class MuxedAccountMed25519 protected ()
  extends typingsSlinky.stellarBase.mod.xdr.MuxedAccountMed25519 {
  def this(attributes: Ed25519) = this()
}
object MuxedAccountMed25519 {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccountMed25519.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519 = js.native
  @JSImport("stellar-sdk", "xdr.MuxedAccountMed25519.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519 = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccountMed25519.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519 = js.native
  @JSImport("stellar-sdk", "xdr.MuxedAccountMed25519.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519 = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccountMed25519.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccountMed25519.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519 = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccountMed25519.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccountMed25519.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.MuxedAccountMed25519.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccountMed25519.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.MuxedAccountMed25519.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccountMed25519.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519, io: Buffer): Unit = js.native
}
