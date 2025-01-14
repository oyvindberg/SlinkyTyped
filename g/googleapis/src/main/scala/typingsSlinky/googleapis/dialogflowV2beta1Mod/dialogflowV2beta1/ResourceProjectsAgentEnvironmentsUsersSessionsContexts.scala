package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Agent$Environments$Users$Sessions$Contexts")
@js.native
class ResourceProjectsAgentEnvironmentsUsersSessionsContexts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dialogflow.projects.agent.environments.users.sessions.contexts.create
    * @desc Creates a context.  If the specified context already exists,
    * overrides the context.
    * @alias
    * dialogflow.projects.agent.environments.users.sessions.contexts.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The session to create a context for. Format: `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {().GoogleCloudDialogflowV2beta1Context} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def create(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def create(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.environments.users.sessions.contexts.delete
    * @desc Deletes the specified context.
    * @alias
    * dialogflow.projects.agent.environments.users.sessions.contexts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the context to delete. Format: `projects/<Project ID>/agent/sessions/<Session ID>/contexts/<Context ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>/contexts/<Context ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsDelete,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.environments.users.sessions.contexts.get
    * @desc Retrieves the specified context.
    * @alias dialogflow.projects.agent.environments.users.sessions.contexts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the context. Format: `projects/<Project ID>/agent/sessions/<Session ID>/contexts/<Context ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>/contexts/<Context ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def get(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsGet,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def get(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.environments.users.sessions.contexts.list
    * @desc Returns the list of all contexts in the specified session.
    * @alias
    * dialogflow.projects.agent.environments.users.sessions.contexts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    * @param {string=} params.pageToken Optional. The next_page_token value returned from a previous list request.
    * @param {string} params.parent Required. The session to list all contexts from. Format: `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse] = js.native
  def list(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsList,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListContextsResponse]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.environments.users.sessions.contexts.patch
    * @desc Updates the specified context.
    * @alias
    * dialogflow.projects.agent.environments.users.sessions.contexts.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The unique identifier of the context. Format: `projects/<Project ID>/agent/sessions/<Session ID>/contexts/<Context ID>`, or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>/contexts/<Context ID>`.  The `Context ID` is always converted to lowercase, may only contain characters in a-zA-Z0-9_-% and may be at most 250 bytes long.  If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {string=} params.updateMask Optional. The mask to control which fields get updated.
    * @param {().GoogleCloudDialogflowV2beta1Context} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def patch(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsPatch,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Context] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Context]
  ): Unit = js.native
}
