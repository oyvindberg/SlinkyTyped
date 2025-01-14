package typingsSlinky.shelljs.mod

import typingsSlinky.glob.mod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShellConfig extends StObject {
  
  /**
    * Absolute path of the Node binary. Default is null (inferred).
    */
  var execPath: String | Null = js.native
  
  /**
    * If true the script will die on errors. Default is false.
    */
  var fatal: Boolean = js.native
  
  /**
    * Passed to glob.sync() instead of the default options ({}).
    */
  var globOptions: IOptions = js.native
  
  /**
    * Reset shell.config to the defaults.
    */
  def reset(): Unit = js.native
  
  /**
    * Suppresses all command output if true, except for echo() calls. Default is false.
    */
  var silent: Boolean = js.native
  
  /**
    * Will print each executed command to the screen.
    *
    * @default false
    */
  var verbose: Boolean = js.native
}
object ShellConfig {
  
  @scala.inline
  def apply(fatal: Boolean, globOptions: IOptions, reset: () => Unit, silent: Boolean, verbose: Boolean): ShellConfig = {
    val __obj = js.Dynamic.literal(fatal = fatal.asInstanceOf[js.Any], globOptions = globOptions.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellConfig]
  }
  
  @scala.inline
  implicit class ShellConfigMutableBuilder[Self <: ShellConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecPathNull: Self = StObject.set(x, "execPath", null)
    
    @scala.inline
    def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobOptions(value: IOptions): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
