package typingsSlinky.gzipSize

import typingsSlinky.gzipSize.gzipSizeStrings.`gzip-size`
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.PassThrough
import typingsSlinky.node.zlibMod.ZlibOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the gzipped size of a string or buffer.
  	@returns The gzipped size of `input`.
  	*/
  @JSImport("gzip-size", JSImport.Namespace)
  @js.native
  def apply(input: String): js.Promise[Double] = js.native
  @JSImport("gzip-size", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options): js.Promise[Double] = js.native
  @JSImport("gzip-size", JSImport.Namespace)
  @js.native
  def apply(input: Buffer): js.Promise[Double] = js.native
  @JSImport("gzip-size", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, options: Options): js.Promise[Double] = js.native
  
  /**
  	Get the gzipped size of a file.
  	@returns The size of the file.
  	*/
  @JSImport("gzip-size", "file")
  @js.native
  def file(path: String): js.Promise[Double] = js.native
  @JSImport("gzip-size", "file")
  @js.native
  def file(path: String, options: Options): js.Promise[Double] = js.native
  
  /**
  	Synchronously get the gzipped size of a file.
  	@returns The size of the file.
  	*/
  @JSImport("gzip-size", "fileSync")
  @js.native
  def fileSync(path: String): Double = js.native
  @JSImport("gzip-size", "fileSync")
  @js.native
  def fileSync(path: String, options: Options): Double = js.native
  
  /**
  	@returns A stream that emits a `gzip-size` event and has a `gzipSize` property.
  	*/
  @JSImport("gzip-size", "stream")
  @js.native
  def stream(): GzipSizeStream = js.native
  @JSImport("gzip-size", "stream")
  @js.native
  def stream(options: Options): GzipSizeStream = js.native
  
  /**
  	Synchronously get the gzipped size of a string or buffer.
  	@returns The gzipped size of `input`.
  	@example
  	```
  	import gzipSize = require('gzip-size');
  	const text = 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.';
  	console.log(text.length);
  	//=> 191
  	console.log(gzipSize.sync(text));
  	//=> 78
  	```
  	*/
  @JSImport("gzip-size", "sync")
  @js.native
  def sync(input: String): Double = js.native
  @JSImport("gzip-size", "sync")
  @js.native
  def sync(input: String, options: Options): Double = js.native
  @JSImport("gzip-size", "sync")
  @js.native
  def sync(input: Buffer): Double = js.native
  @JSImport("gzip-size", "sync")
  @js.native
  def sync(input: Buffer, options: Options): Double = js.native
  
  @js.native
  trait GzipSizeStream extends PassThrough {
    
    @JSName("addListener")
    def addListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_gzipsize(event: `gzip-size`, size: Double): Boolean = js.native
    
    /**
    		Contains the gzip size of the stream after it is finished. Since this happens asynchronously, it is recommended you use the `gzip-size` event instead.
    		*/
    var gzipSize: js.UndefOr[Double] = js.native
    
    @JSName("off")
    def off_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    @JSName("on")
    def on_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    @JSName("once")
    def once_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_gzipsize(event: `gzip-size`, listener: js.Function1[/* size */ Double, Unit]): this.type = js.native
  }
  
  type Options = ZlibOptions
}
