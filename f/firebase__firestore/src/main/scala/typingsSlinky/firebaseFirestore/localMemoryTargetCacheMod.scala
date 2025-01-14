package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.coreTypesMod.ListenSequenceNumber
import typingsSlinky.firebaseFirestore.localLruGarbageCollectorMod.ActiveTargets
import typingsSlinky.firebaseFirestore.localMemoryPersistenceMod.MemoryPersistence
import typingsSlinky.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typingsSlinky.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.localTargetCacheMod.TargetCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/memory_target_cache", JSImport.Namespace)
@js.native
object localMemoryTargetCacheMod extends js.Object {
  @js.native
  class MemoryTargetCache protected () extends TargetCache {
    def this(persistence: MemoryPersistence) = this()
    /** The highest sequence number encountered. */
    var highestSequenceNumber: js.Any = js.native
    /** The highest numbered target ID encountered. */
    var highestTargetId: js.Any = js.native
    /** The last received snapshot version. */
    var lastRemoteSnapshotVersion: js.Any = js.native
    val persistence: js.Any = js.native
    /**
      * A ordered bidirectional mapping between documents and the remote target
      * IDs.
      */
    var references: js.Any = js.native
    var saveTargetData: js.Any = js.native
    var targetCount: js.Any = js.native
    var targetIdGenerator: js.Any = js.native
    /**
      * Maps a target to the data about that target
      */
    var targets: js.Any = js.native
    def removeTargets(
      transaction: PersistenceTransaction,
      upperBound: ListenSequenceNumber,
      activeTargetIds: ActiveTargets
    ): PersistencePromise[Double] = js.native
  }
  
}

