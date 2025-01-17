package typingsSlinky.workboxBuild

import org.scalajs.dom.experimental.Response
import typingsSlinky.workboxBuild.anon.ChannelName
import typingsSlinky.workboxBuild.anon.Headers
import typingsSlinky.workboxBuild.anon.MaxAgeSeconds
import typingsSlinky.workboxBuild.anon.Name
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerCallback
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerCallbackContext
import typingsSlinky.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import typingsSlinky.workboxRouting.routeMatchCallbackMod.RouteMatchCallbackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ManifestEntry extends StObject {
    
    /**
      * Integrity metadata that will be used when making the network request
      * for the URL. based on the file contents.
      */
    var integrity: js.UndefOr[String] = js.native
    
    /**
      * The revision details for the file. This is a hash generated by node
      * based on the file contents.
      */
    var revision: js.UndefOr[String] = js.native
    
    /**
      * The URL to the asset in the manifest.
      */
    var url: String = js.native
  }
  object ManifestEntry {
    
    @scala.inline
    def apply(url: String): ManifestEntry = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManifestEntry]
    }
    
    @scala.inline
    implicit class ManifestEntryMutableBuilder[Self <: ManifestEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type ManifestTransform = js.Function2[
    /* manifestEntries */ js.Array[ManifestEntry], 
    /* compilation */ js.UndefOr[js.Object], 
    js.Promise[ManifestTransformResult]
  ]
  
  @js.native
  trait ManifestTransformResult extends StObject {
    
    var manifest: js.Array[ManifestEntry] = js.native
    
    var warnings: js.Array[js.UndefOr[String]] = js.native
  }
  object ManifestTransformResult {
    
    @scala.inline
    def apply(manifest: js.Array[ManifestEntry], warnings: js.Array[js.UndefOr[String]]): ManifestTransformResult = {
      val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManifestTransformResult]
    }
    
    @scala.inline
    implicit class ManifestTransformResultMutableBuilder[Self <: ManifestTransformResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManifest(value: js.Array[ManifestEntry]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestVarargs(value: ManifestEntry*): Self = StObject.set(x, "manifest", js.Array(value :_*))
      
      @scala.inline
      def setWarnings(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RuntimeCachingEntry extends StObject {
    
    /**
      * * Either the name of one of the [built-in strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies)
      * or custom handler callback to use when the generated route matches.
      */
    var handler: String | RouteHandlerCallback = js.native
    
    /**
      * The [HTTP method](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods) that
      * will match the generated route.
      *
      * @default 'GET'
      */
    var method: js.UndefOr[String] = js.native
    
    var options: js.UndefOr[RuntimeCachingEntryOptions] = js.native
    
    /**
      * The value that will be passed to [`registerRoute()`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-routing#.registerRoute),
      * used to determine whether the generated route will match a given request.
      */
    var urlPattern: String | js.RegExp | RouteMatchCallback[_] = js.native
  }
  object RuntimeCachingEntry {
    
    @scala.inline
    def apply(handler: String | RouteHandlerCallback, urlPattern: String | js.RegExp | RouteMatchCallback[_]): RuntimeCachingEntry = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], urlPattern = urlPattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeCachingEntry]
    }
    
    @scala.inline
    implicit class RuntimeCachingEntryMutableBuilder[Self <: RuntimeCachingEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: String | RouteHandlerCallback): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerFunction1(value: /* context */ RouteHandlerCallbackContext => js.Promise[Response]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setOptions(value: RuntimeCachingEntryOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setUrlPattern(value: String | js.RegExp | RouteMatchCallback[_]): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlPatternFunction1(value: /* options */ RouteMatchCallbackOptions => _): Self = StObject.set(x, "urlPattern", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlPatternRegExp(value: js.RegExp): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RuntimeCachingEntryOptions extends StObject {
    
    var backgroundSync: js.UndefOr[Name] = js.native
    
    var broadcastUpdate: js.UndefOr[ChannelName] = js.native
    
    /**
      * The `cacheName` to use when constructing one of the [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
      */
    var cacheName: js.UndefOr[String] = js.native
    
    var cacheableResponse: js.UndefOr[Headers] = js.native
    
    var expiration: js.UndefOr[MaxAgeSeconds] = js.native
    
    /**
      * The `fetchOptions` property value to use when constructing one of the
      * [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
      */
    var fetchOptions: js.UndefOr[js.Object] = js.native
    
    /**
      * The `matchOptions` property value to use when constructing one of the
      * [Workbox strategy classes](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.html).
      */
    var matchOptions: js.UndefOr[js.Object] = js.native
    
    /**
      * The `networkTimeoutSeconds` property value to use when creating a
      * [`NetworkFirst`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-strategies.NetworkFirst) strategy.
      */
    var networkTimeoutSeconds: js.UndefOr[Double] = js.native
    
    /**
      * One or more [additional plugins](https://developers.google.com/web/tools/workbox/guides/using-plugins#custom_plugins)
      * to apply to the handler. Useful when you want a plugin that doesn't have a
      * "shortcut" configuration.
      */
    var plugins: js.UndefOr[js.Array[js.Object]] = js.native
  }
  object RuntimeCachingEntryOptions {
    
    @scala.inline
    def apply(): RuntimeCachingEntryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuntimeCachingEntryOptions]
    }
    
    @scala.inline
    implicit class RuntimeCachingEntryOptionsMutableBuilder[Self <: RuntimeCachingEntryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundSync(value: Name): Self = StObject.set(x, "backgroundSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundSyncUndefined: Self = StObject.set(x, "backgroundSync", js.undefined)
      
      @scala.inline
      def setBroadcastUpdate(value: ChannelName): Self = StObject.set(x, "broadcastUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBroadcastUpdateUndefined: Self = StObject.set(x, "broadcastUpdate", js.undefined)
      
      @scala.inline
      def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
      
      @scala.inline
      def setCacheableResponse(value: Headers): Self = StObject.set(x, "cacheableResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheableResponseUndefined: Self = StObject.set(x, "cacheableResponse", js.undefined)
      
      @scala.inline
      def setExpiration(value: MaxAgeSeconds): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      @scala.inline
      def setFetchOptions(value: js.Object): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      @scala.inline
      def setMatchOptions(value: js.Object): Self = StObject.set(x, "matchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchOptionsUndefined: Self = StObject.set(x, "matchOptions", js.undefined)
      
      @scala.inline
      def setNetworkTimeoutSeconds(value: Double): Self = StObject.set(x, "networkTimeoutSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkTimeoutSecondsUndefined: Self = StObject.set(x, "networkTimeoutSeconds", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[js.Object]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: js.Object*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
}
