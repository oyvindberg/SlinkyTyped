package typingsSlinky.ol

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.ol.featureMod.ReadOptions
import typingsSlinky.ol.featureMod.WriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlfeatureMod {
  
  @JSImport("ol/format/XMLFeature", JSImport.Default)
  @js.native
  abstract class default () extends XMLFeature
  
  @js.native
  trait XMLFeature
    extends typingsSlinky.ol.featureMod.default {
    
    def readFeatureFromDocument(doc: Document): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    def readFeatureFromDocument(doc: Document, opt_options: ReadOptions): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    
    def readFeatureFromNode(node: Element): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    def readFeatureFromNode(node: Element, opt_options: ReadOptions): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    
    /* protected */ def readFeaturesFromDocument(doc: Document): js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromDocument(doc: Document, opt_options: ReadOptions): js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    
    /* protected */ def readFeaturesFromNode(node: Element): js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromNode(node: Element, opt_options: ReadOptions): js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    
    /* protected */ def readGeometryFromDocument(doc: Document): typingsSlinky.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromDocument(doc: Document, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
    
    /* protected */ def readGeometryFromNode(node: Element): typingsSlinky.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromNode(node: Element, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
    
    /* protected */ def readProjectionFromDocument(doc: Document): typingsSlinky.ol.projectionMod.default = js.native
    
    /* protected */ def readProjectionFromNode(node: Element): typingsSlinky.ol.projectionMod.default = js.native
    
    /* protected */ def writeFeatureNode(feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]): Node = js.native
    /* protected */ def writeFeatureNode(
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      opt_options: WriteOptions
    ): Node = js.native
    
    def writeFeaturesNode(features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]): Node = js.native
    def writeFeaturesNode(
      features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
      opt_options: WriteOptions
    ): Node = js.native
    
    def writeGeometryNode(geometry: typingsSlinky.ol.geometryMod.default): Node = js.native
    def writeGeometryNode(geometry: typingsSlinky.ol.geometryMod.default, opt_options: WriteOptions): Node = js.native
  }
}
