package typingsSlinky.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a set of hyperparameters to optimize.
  */
@js.native
trait SchemaGoogleCloudMlV1HyperparameterSpec extends StObject {
  
  /**
    * Optional. The search algorithm specified for the hyperparameter tuning
    * job. Uses the default CloudML Engine hyperparameter tuning algorithm if
    * unspecified.
    */
  var algorithm: js.UndefOr[String] = js.native
  
  /**
    * Optional. Indicates if the hyperparameter tuning job enables auto trial
    * early stopping.
    */
  var enableTrialEarlyStopping: js.UndefOr[Boolean] = js.native
  
  /**
    * Required. The type of goal to use for tuning. Available types are
    * `MAXIMIZE` and `MINIMIZE`.  Defaults to `MAXIMIZE`.
    */
  var goal: js.UndefOr[String] = js.native
  
  /**
    * Optional. The Tensorflow summary tag name to use for optimizing trials.
    * For current versions of Tensorflow, this tag name should exactly match
    * what is shown in Tensorboard, including all scopes.  For versions of
    * Tensorflow prior to 0.12, this should be only the tag passed to
    * tf.Summary. By default, &quot;training/hptuning/metric&quot; will be
    * used.
    */
  var hyperparameterMetricTag: js.UndefOr[String] = js.native
  
  /**
    * Optional. How many failed trials that need to be seen before failing the
    * hyperparameter tuning job. User can specify this field to override the
    * default failing criteria for CloudML Engine hyperparameter tuning jobs.
    * Defaults to zero, which means to let the service decide when a
    * hyperparameter job should fail.
    */
  var maxFailedTrials: js.UndefOr[Double] = js.native
  
  /**
    * Optional. The number of training trials to run concurrently. You can
    * reduce the time it takes to perform hyperparameter tuning by adding
    * trials in parallel. However, each trail only benefits from the
    * information gained in completed trials. That means that a trial does not
    * get access to the results of trials running at the same time, which could
    * reduce the quality of the overall optimization.  Each trial will use the
    * same scale tier and machine types.  Defaults to one.
    */
  var maxParallelTrials: js.UndefOr[Double] = js.native
  
  /**
    * Optional. How many training trials should be attempted to optimize the
    * specified hyperparameters.  Defaults to one.
    */
  var maxTrials: js.UndefOr[Double] = js.native
  
  /**
    * Required. The set of parameters to tune.
    */
  var params: js.UndefOr[js.Array[SchemaGoogleCloudMlV1ParameterSpec]] = js.native
  
  /**
    * Optional. The prior hyperparameter tuning job id that users hope to
    * continue with. The job id will be used to find the corresponding vizier
    * study guid and resume the study.
    */
  var resumePreviousJobId: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudMlV1HyperparameterSpec {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1HyperparameterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1HyperparameterSpec]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1HyperparameterSpecMutableBuilder[Self <: SchemaGoogleCloudMlV1HyperparameterSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setEnableTrialEarlyStopping(value: Boolean): Self = StObject.set(x, "enableTrialEarlyStopping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTrialEarlyStoppingUndefined: Self = StObject.set(x, "enableTrialEarlyStopping", js.undefined)
    
    @scala.inline
    def setGoal(value: String): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalUndefined: Self = StObject.set(x, "goal", js.undefined)
    
    @scala.inline
    def setHyperparameterMetricTag(value: String): Self = StObject.set(x, "hyperparameterMetricTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperparameterMetricTagUndefined: Self = StObject.set(x, "hyperparameterMetricTag", js.undefined)
    
    @scala.inline
    def setMaxFailedTrials(value: Double): Self = StObject.set(x, "maxFailedTrials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFailedTrialsUndefined: Self = StObject.set(x, "maxFailedTrials", js.undefined)
    
    @scala.inline
    def setMaxParallelTrials(value: Double): Self = StObject.set(x, "maxParallelTrials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxParallelTrialsUndefined: Self = StObject.set(x, "maxParallelTrials", js.undefined)
    
    @scala.inline
    def setMaxTrials(value: Double): Self = StObject.set(x, "maxTrials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTrialsUndefined: Self = StObject.set(x, "maxTrials", js.undefined)
    
    @scala.inline
    def setParams(value: js.Array[SchemaGoogleCloudMlV1ParameterSpec]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: SchemaGoogleCloudMlV1ParameterSpec*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setResumePreviousJobId(value: String): Self = StObject.set(x, "resumePreviousJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumePreviousJobIdUndefined: Self = StObject.set(x, "resumePreviousJobId", js.undefined)
  }
}
