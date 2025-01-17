package typingsSlinky.winrtUwp.Windows.Networking.XboxLive

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait XboxLiveQualityOfServiceMeasurement extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var deviceAddresses: IVector[XboxLiveDeviceAddress] = js.native
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param metric This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getMetricResult(deviceAddress: XboxLiveDeviceAddress, metric: XboxLiveQualityOfServiceMetric): XboxLiveQualityOfServiceMetricResult = js.native
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getMetricResultsForDevice(deviceAddress: XboxLiveDeviceAddress): IVectorView[XboxLiveQualityOfServiceMetricResult] = js.native
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param metric This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getMetricResultsForMetric(metric: XboxLiveQualityOfServiceMetric): IVectorView[XboxLiveQualityOfServiceMetricResult] = js.native
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getPrivatePayloadResult(deviceAddress: XboxLiveDeviceAddress): XboxLiveQualityOfServicePrivatePayloadResult = js.native
  
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def measureAsync(): IPromiseWithIAsyncAction = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var metricResults: IVectorView[XboxLiveQualityOfServiceMetricResult] = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var metrics: IVector[XboxLiveQualityOfServiceMetric] = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var numberOfProbesToAttempt: Double = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var numberOfResultsPending: Double = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var privatePayloadResults: IVectorView[XboxLiveQualityOfServicePrivatePayloadResult] = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var shouldRequestPrivatePayloads: Boolean = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var timeoutInMilliseconds: Double = js.native
}
object XboxLiveQualityOfServiceMeasurement {
  
  @scala.inline
  def apply(
    deviceAddresses: IVector[XboxLiveDeviceAddress],
    getMetricResult: (XboxLiveDeviceAddress, XboxLiveQualityOfServiceMetric) => XboxLiveQualityOfServiceMetricResult,
    getMetricResultsForDevice: XboxLiveDeviceAddress => IVectorView[XboxLiveQualityOfServiceMetricResult],
    getMetricResultsForMetric: XboxLiveQualityOfServiceMetric => IVectorView[XboxLiveQualityOfServiceMetricResult],
    getPrivatePayloadResult: XboxLiveDeviceAddress => XboxLiveQualityOfServicePrivatePayloadResult,
    measureAsync: () => IPromiseWithIAsyncAction,
    metricResults: IVectorView[XboxLiveQualityOfServiceMetricResult],
    metrics: IVector[XboxLiveQualityOfServiceMetric],
    numberOfProbesToAttempt: Double,
    numberOfResultsPending: Double,
    privatePayloadResults: IVectorView[XboxLiveQualityOfServicePrivatePayloadResult],
    shouldRequestPrivatePayloads: Boolean,
    timeoutInMilliseconds: Double
  ): XboxLiveQualityOfServiceMeasurement = {
    val __obj = js.Dynamic.literal(deviceAddresses = deviceAddresses.asInstanceOf[js.Any], getMetricResult = js.Any.fromFunction2(getMetricResult), getMetricResultsForDevice = js.Any.fromFunction1(getMetricResultsForDevice), getMetricResultsForMetric = js.Any.fromFunction1(getMetricResultsForMetric), getPrivatePayloadResult = js.Any.fromFunction1(getPrivatePayloadResult), measureAsync = js.Any.fromFunction0(measureAsync), metricResults = metricResults.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], numberOfProbesToAttempt = numberOfProbesToAttempt.asInstanceOf[js.Any], numberOfResultsPending = numberOfResultsPending.asInstanceOf[js.Any], privatePayloadResults = privatePayloadResults.asInstanceOf[js.Any], shouldRequestPrivatePayloads = shouldRequestPrivatePayloads.asInstanceOf[js.Any], timeoutInMilliseconds = timeoutInMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveQualityOfServiceMeasurement]
  }
  
  @scala.inline
  implicit class XboxLiveQualityOfServiceMeasurementMutableBuilder[Self <: XboxLiveQualityOfServiceMeasurement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceAddresses(value: IVector[XboxLiveDeviceAddress]): Self = StObject.set(x, "deviceAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMetricResult(
      value: (XboxLiveDeviceAddress, XboxLiveQualityOfServiceMetric) => XboxLiveQualityOfServiceMetricResult
    ): Self = StObject.set(x, "getMetricResult", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetMetricResultsForDevice(value: XboxLiveDeviceAddress => IVectorView[XboxLiveQualityOfServiceMetricResult]): Self = StObject.set(x, "getMetricResultsForDevice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMetricResultsForMetric(value: XboxLiveQualityOfServiceMetric => IVectorView[XboxLiveQualityOfServiceMetricResult]): Self = StObject.set(x, "getMetricResultsForMetric", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPrivatePayloadResult(value: XboxLiveDeviceAddress => XboxLiveQualityOfServicePrivatePayloadResult): Self = StObject.set(x, "getPrivatePayloadResult", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMeasureAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "measureAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMetricResults(value: IVectorView[XboxLiveQualityOfServiceMetricResult]): Self = StObject.set(x, "metricResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: IVector[XboxLiveQualityOfServiceMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfProbesToAttempt(value: Double): Self = StObject.set(x, "numberOfProbesToAttempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfResultsPending(value: Double): Self = StObject.set(x, "numberOfResultsPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivatePayloadResults(value: IVectorView[XboxLiveQualityOfServicePrivatePayloadResult]): Self = StObject.set(x, "privatePayloadResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRequestPrivatePayloads(value: Boolean): Self = StObject.set(x, "shouldRequestPrivatePayloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMilliseconds(value: Double): Self = StObject.set(x, "timeoutInMilliseconds", value.asInstanceOf[js.Any])
  }
}
