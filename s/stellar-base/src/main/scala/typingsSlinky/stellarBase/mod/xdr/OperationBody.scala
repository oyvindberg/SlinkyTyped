package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.OperationBody")
@js.native
class OperationBody ()
  extends typingsSlinky.stellarBase.xdrMod.default.OperationBody
object OperationBody {
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.accountMerge")
  @js.native
  def accountMerge(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.allowTrust")
  @js.native
  def allowTrust(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.beginSponsoringFutureReserves")
  @js.native
  def beginSponsoringFutureReserves(value: typingsSlinky.stellarBase.xdrMod.xdr.BeginSponsoringFutureReservesOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.bumpSequence")
  @js.native
  def bumpSequence(value: typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.changeTrust")
  @js.native
  def changeTrust(value: typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.claimClaimableBalance")
  @js.native
  def claimClaimableBalance(value: typingsSlinky.stellarBase.xdrMod.xdr.ClaimClaimableBalanceOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.createAccount")
  @js.native
  def createAccount(value: typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.createClaimableBalance")
  @js.native
  def createClaimableBalance(value: typingsSlinky.stellarBase.xdrMod.xdr.CreateClaimableBalanceOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.createPassiveSellOffer")
  @js.native
  def createPassiveSellOffer(value: typingsSlinky.stellarBase.xdrMod.xdr.CreatePassiveSellOfferOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.endSponsoringFutureReserves")
  @js.native
  def endSponsoringFutureReserves(): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  @JSImport("stellar-base", "xdr.OperationBody.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  @JSImport("stellar-base", "xdr.OperationBody.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.inflation")
  @js.native
  def inflation(): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationBody): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.manageBuyOffer")
  @js.native
  def manageBuyOffer(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageBuyOfferOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.manageData")
  @js.native
  def manageData(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageDataOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.manageSellOffer")
  @js.native
  def manageSellOffer(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageSellOfferOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.pathPaymentStrictReceive")
  @js.native
  def pathPaymentStrictReceive(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.pathPaymentStrictSend")
  @js.native
  def pathPaymentStrictSend(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.payment")
  @js.native
  def payment(value: typingsSlinky.stellarBase.xdrMod.xdr.PaymentOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.revokeSponsorship")
  @js.native
  def revokeSponsorship(value: typingsSlinky.stellarBase.xdrMod.xdr.RevokeSponsorshipOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.setOptions")
  @js.native
  def setOptions(value: typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsOp): typingsSlinky.stellarBase.xdrMod.xdr.OperationBody = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationBody): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.OperationBody.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.OperationBody.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.OperationBody.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationBody, io: Buffer): Unit = js.native
}
