package typingsSlinky.pulumiAws.inputMod.elasticloadbalancingv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetGroupHealthCheck extends StObject {
  
  /**
    * Boolean to enable / disable `stickiness`. Default is `true`
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The number of consecutive health checks successes required before considering an unhealthy target healthy. Defaults to 3.
    */
  var healthyThreshold: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target. Minimum value 5 seconds, Maximum value 300 seconds. For `lambda` target groups, it needs to be greater as the `timeout` of the underlying `lambda`. Default 30 seconds.
    */
  var interval: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The HTTP codes to use when checking for a successful response from a target. You can specify multiple values (for example, "200,202") or a range of values (for example, "200-299"). Applies to Application Load Balancers only (HTTP/HTTPS), not Network Load Balancers (TCP).
    */
  var matcher: js.UndefOr[Input[String]] = js.native
  
  /**
    * The destination for the health check request. Applies to only HTTP/HTTPS.
    */
  var path: js.UndefOr[Input[String]] = js.native
  
  /**
    * The port on which targets receive traffic, unless overridden when registering a specific target. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
    */
  var port: js.UndefOr[Input[String]] = js.native
  
  /**
    * The protocol to use for routing traffic to the targets. Should be one of `GENEVE`, `HTTP`, `HTTPS`, `TCP`, `TCP_UDP`, `TLS`, or `UDP`. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
    */
  var protocol: js.UndefOr[Input[String]] = js.native
  
  /**
    * The amount of time, in seconds, during which no response means a failed health check. For Application Load Balancers, the range is 2 to 120 seconds, and the default is 5 seconds for the `instance` target type and 30 seconds for the `lambda` target type. For Network Load Balancers, you cannot set a custom value, and the default is 10 seconds for TCP and HTTPS health checks and 6 seconds for HTTP health checks.
    */
  var timeout: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of consecutive health check failures required before considering the target unhealthy . For Network Load Balancers, this value must be the same as the `healthyThreshold`. Defaults to 3.
    */
  var unhealthyThreshold: js.UndefOr[Input[Double]] = js.native
}
object TargetGroupHealthCheck {
  
  @scala.inline
  def apply(): TargetGroupHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupHealthCheck]
  }
  
  @scala.inline
  implicit class TargetGroupHealthCheckMutableBuilder[Self <: TargetGroupHealthCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHealthyThreshold(value: Input[Double]): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthyThresholdUndefined: Self = StObject.set(x, "healthyThreshold", js.undefined)
    
    @scala.inline
    def setInterval(value: Input[Double]): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setMatcher(value: Input[String]): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
    
    @scala.inline
    def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPort(value: Input[String]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setTimeout(value: Input[Double]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUnhealthyThreshold(value: Input[Double]): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThresholdUndefined: Self = StObject.set(x, "unhealthyThreshold", js.undefined)
  }
}
