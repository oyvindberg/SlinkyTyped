package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.LedgerEntryExtensionV1Ext")
@js.native
class LedgerEntryExtensionV1Ext ()
  extends typingsSlinky.stellarBase.mod.xdr.LedgerEntryExtensionV1Ext
object LedgerEntryExtensionV1Ext {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryExtensionV1Ext.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1Ext = js.native
  @JSImport("stellar-sdk", "xdr.LedgerEntryExtensionV1Ext.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1Ext = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryExtensionV1Ext.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1Ext = js.native
  @JSImport("stellar-sdk", "xdr.LedgerEntryExtensionV1Ext.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1Ext = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryExtensionV1Ext.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1Ext): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryExtensionV1Ext.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1Ext = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryExtensionV1Ext.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1Ext): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryExtensionV1Ext.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerEntryExtensionV1Ext.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryExtensionV1Ext.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerEntryExtensionV1Ext.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryExtensionV1Ext.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1Ext, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryExtensionV1Ext.0")
  @js.native
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1Ext = js.native
}
