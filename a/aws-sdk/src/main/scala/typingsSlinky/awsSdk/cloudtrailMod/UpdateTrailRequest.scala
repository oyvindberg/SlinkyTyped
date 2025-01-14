package typingsSlinky.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTrailRequest extends StObject {
  
  /**
    * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the log group to which CloudTrail logs will be delivered. Not required unless you specify CloudWatchLogsRoleArn.
    */
  var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.native
  
  /**
    * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether log file validation is enabled. The default is false.  When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail will not create digest files for log files that were delivered during a period in which log file integrity validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail logging or delete a trail. 
    */
  var EnableLogFileValidation: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether the trail is publishing events from global services such as IAM to the log files.
    */
  var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether the trail applies only to the current region or to all regions. The default is false. If the trail exists only in the current region and this value is set to true, shadow trails (replications of the trail) will be created in the other regions. If the trail exists in all regions and this value is set to false, the trail will remain in the region where it was created, and its shadow trails in other regions will be deleted. As a best practice, consider using trails that log events in all regions.
    */
  var IsMultiRegionTrail: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether the trail is applied to all accounts in an organization in AWS Organizations, or only for the current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account that is the master account for an organization in AWS Organizations. If the trail is not an organization trail and this is set to true, the trail will be created in all AWS accounts that belong to the organization. If the trail is an organization trail and this is set to false, the trail will remain in the current AWS account but be deleted from all member accounts in the organization.
    */
  var IsOrganizationTrail: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias name prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a globally unique identifier. Examples:   alias/MyAliasName   arn:aws:kms:us-east-2:123456789012:alias/MyAliasName   arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012   12345678-1234-1234-1234-123456789012  
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * Specifies the name of the trail or trail ARN. If Name is a trail name, the string must meet the following requirements:   Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)   Start with a letter or number, and end with a letter or number   Be between 3 and 128 characters   Have no adjacent periods, underscores or dashes. Names like my-_namespace and my--namespace are invalid.   Not be in IP address format (for example, 192.168.5.4)   If Name is a trail ARN, it must be in the format:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var Name: String = js.native
  
  /**
    * Specifies the name of the Amazon S3 bucket designated for publishing log files. See Amazon S3 Bucket Naming Requirements.
    */
  var S3BucketName: js.UndefOr[String] = js.native
  
  /**
    * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files. The maximum length is 200 characters.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.native
  
  /**
    * Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum length is 256 characters.
    */
  var SnsTopicName: js.UndefOr[String] = js.native
}
object UpdateTrailRequest {
  
  @scala.inline
  def apply(Name: String): UpdateTrailRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrailRequest]
  }
  
  @scala.inline
  implicit class UpdateTrailRequestMutableBuilder[Self <: UpdateTrailRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogsLogGroupArn(value: String): Self = StObject.set(x, "CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogsLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogsLogGroupArn", js.undefined)
    
    @scala.inline
    def setCloudWatchLogsRoleArn(value: String): Self = StObject.set(x, "CloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogsRoleArnUndefined: Self = StObject.set(x, "CloudWatchLogsRoleArn", js.undefined)
    
    @scala.inline
    def setEnableLogFileValidation(value: Boolean): Self = StObject.set(x, "EnableLogFileValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableLogFileValidationUndefined: Self = StObject.set(x, "EnableLogFileValidation", js.undefined)
    
    @scala.inline
    def setIncludeGlobalServiceEvents(value: Boolean): Self = StObject.set(x, "IncludeGlobalServiceEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeGlobalServiceEventsUndefined: Self = StObject.set(x, "IncludeGlobalServiceEvents", js.undefined)
    
    @scala.inline
    def setIsMultiRegionTrail(value: Boolean): Self = StObject.set(x, "IsMultiRegionTrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultiRegionTrailUndefined: Self = StObject.set(x, "IsMultiRegionTrail", js.undefined)
    
    @scala.inline
    def setIsOrganizationTrail(value: Boolean): Self = StObject.set(x, "IsOrganizationTrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOrganizationTrailUndefined: Self = StObject.set(x, "IsOrganizationTrail", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: String): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
    
    @scala.inline
    def setSnsTopicName(value: String): Self = StObject.set(x, "SnsTopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicNameUndefined: Self = StObject.set(x, "SnsTopicName", js.undefined)
  }
}
