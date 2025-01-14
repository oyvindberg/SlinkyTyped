package typingsSlinky.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Avail extends js.Object {
  
  /**
    * Other identifier referring to the Edit, as defined by partner.
    * Example: "GOOGLER_2006"
    */
  var altId: js.UndefOr[String] = js.native
  
  /**
    * ID internally generated by Google to uniquely identify an Avail.
    * Not part of EMA Specs.
    */
  var availId: js.UndefOr[String] = js.native
  
  /**
    * Communicating an exempt category as defined by FCC regulations.
    * It is not required for non-US Avails.
    * Example: "1"
    */
  var captionExemption: js.UndefOr[String] = js.native
  
  /** Communicating if caption file will be delivered. */
  var captionIncluded: js.UndefOr[Boolean] = js.native
  
  /**
    * Title Identifier. This should be the Title Level EIDR.
    * Example: "10.5240/1489-49A2-3956-4B2D-FE16-5".
    */
  var contentId: js.UndefOr[String] = js.native
  
  /**
    * The name of the studio that owns the Edit referred in the Avail.
    * This is the equivalent of `studio_name` in other resources, but it follows
    * the EMA nomenclature.
    * Example: "Google Films".
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Manifestation Identifier. This should be the Manifestation
    * Level EIDR.
    * Example: "10.2340/1489-49A2-3956-4B2D-FE16-7"
    */
  var encodeId: js.UndefOr[String] = js.native
  
  /**
    * End of term in YYYY-MM-DD format in the timezone of the country
    * of the Avail.
    * "Open" if no end date is available.
    * Example: "2019-02-17"
    */
  var end: js.UndefOr[String] = js.native
  
  /**
    * Other identifier referring to the episode, as defined by partner.
    * Only available on TV avails.
    * Example: "rs_googlers_s1_3".
    */
  var episodeAltId: js.UndefOr[String] = js.native
  
  /**
    * The number assigned to the episode within a season.
    * Only available on TV Avails.
    * Example: "3".
    */
  var episodeNumber: js.UndefOr[String] = js.native
  
  /**
    * OPTIONAL.TV Only. Title used by involved parties to refer to this episode.
    * Only available on TV Avails.
    * Example: "Coding at Google".
    */
  var episodeTitleInternalAlias: js.UndefOr[String] = js.native
  
  /** Indicates the format profile covered by the transaction. */
  var formatProfile: js.UndefOr[String] = js.native
  
  /** Type of transaction. */
  var licenseType: js.UndefOr[String] = js.native
  
  /**
    * Name of the post-production houses that manage the Avail.
    * Not part of EMA Specs.
    */
  var pphNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Type of pricing that should be applied to this Avail
    * based on how the partner classify them.
    * Example: "Tier", "WSP", "SRP", or "Category".
    */
  var priceType: js.UndefOr[String] = js.native
  
  /**
    * Value to be applied to the pricing type.
    * Example: "4" or "2.99"
    */
  var priceValue: js.UndefOr[String] = js.native
  
  /**
    * Edit Identifier. This should be the Edit Level EIDR.
    * Example: "10.2340/1489-49A2-3956-4B2D-FE16-6"
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * Value representing the rating reason.
    * Rating reasons should be formatted as per
    * [EMA ratings spec](http://www.movielabs.com/md/ratings/)
    * and comma-separated for inclusion of multiple reasons.
    * Example: "L, S, V"
    */
  var ratingReason: js.UndefOr[String] = js.native
  
  /**
    * Rating system applied to the version of title within territory
    * of Avail.
    * Rating systems should be formatted as per
    * [EMA ratings spec](http://www.movielabs.com/md/ratings/)
    * Example: "MPAA"
    */
  var ratingSystem: js.UndefOr[String] = js.native
  
  /**
    * Value representing the rating.
    * Ratings should be formatted as per http://www.movielabs.com/md/ratings/
    * Example: "PG"
    */
  var ratingValue: js.UndefOr[String] = js.native
  
  /**
    * Release date of the Title in earliest released territory.
    * Typically it is just the year, but it is free-form as per EMA spec.
    * Examples: "1979", "Oct 2014"
    */
  var releaseDate: js.UndefOr[String] = js.native
  
  /**
    * Other identifier referring to the season, as defined by partner.
    * Only available on TV avails.
    * Example: "rs_googlers_s1".
    */
  var seasonAltId: js.UndefOr[String] = js.native
  
  /**
    * The number assigned to the season within a series.
    * Only available on TV Avails.
    * Example: "1".
    */
  var seasonNumber: js.UndefOr[String] = js.native
  
  /**
    * Title used by involved parties to refer to this season.
    * Only available on TV Avails.
    * Example: "Googlers, The".
    */
  var seasonTitleInternalAlias: js.UndefOr[String] = js.native
  
  /**
    * Other identifier referring to the series, as defined by partner.
    * Only available on TV avails.
    * Example: "rs_googlers".
    */
  var seriesAltId: js.UndefOr[String] = js.native
  
  /**
    * Title used by involved parties to refer to this series.
    * Only available on TV Avails.
    * Example: "Googlers, The".
    */
  var seriesTitleInternalAlias: js.UndefOr[String] = js.native
  
  /**
    * Start of term in YYYY-MM-DD format in the timezone of the
    * country of the Avail.
    * Example: "2013-05-14".
    */
  var start: js.UndefOr[String] = js.native
  
  /**
    * Spoken language of the intended audience.
    * Language shall be encoded in accordance with RFC 5646.
    * Example: "fr".
    */
  var storeLanguage: js.UndefOr[String] = js.native
  
  /**
    * First date an Edit could be publically announced as becoming
    * available at a specific future date in territory of Avail.
    * &#42;Not&#42; the Avail start date or pre-order start date.
    * Format is YYYY-MM-DD.
    * Only available for pre-orders.
    * Example: "2012-12-10"
    */
  var suppressionLiftDate: js.UndefOr[String] = js.native
  
  /**
    * ISO 3166-1 alpha-2 country code for the country or territory
    * of this Avail.
    * For Avails, we use Territory in lieu of Country to comply with
    * EMA specifications.
    * But please note that Territory and Country identify the same thing.
    * Example: "US".
    */
  var territory: js.UndefOr[String] = js.native
  
  /**
    * Title used by involved parties to refer to this content.
    * Example: "Googlers, The".
    * Only available on Movie Avails.
    */
  var titleInternalAlias: js.UndefOr[String] = js.native
  
  /**
    * Google-generated ID identifying the video linked to this Avail, once
    * delivered.
    * Not part of EMA Specs.
    * Example: 'gtry456_xc'
    */
  var videoId: js.UndefOr[String] = js.native
  
  /** Work type as enumerated in EMA. */
  var workType: js.UndefOr[String] = js.native
}
object Avail {
  
  @scala.inline
  def apply(): Avail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avail]
  }
  
  @scala.inline
  implicit class AvailOps[Self <: Avail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAltId(value: String): Self = this.set("altId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltId: Self = this.set("altId", js.undefined)
    
    @scala.inline
    def setAvailId(value: String): Self = this.set("availId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailId: Self = this.set("availId", js.undefined)
    
    @scala.inline
    def setCaptionExemption(value: String): Self = this.set("captionExemption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionExemption: Self = this.set("captionExemption", js.undefined)
    
    @scala.inline
    def setCaptionIncluded(value: Boolean): Self = this.set("captionIncluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptionIncluded: Self = this.set("captionIncluded", js.undefined)
    
    @scala.inline
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentId: Self = this.set("contentId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEncodeId(value: String): Self = this.set("encodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodeId: Self = this.set("encodeId", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setEpisodeAltId(value: String): Self = this.set("episodeAltId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpisodeAltId: Self = this.set("episodeAltId", js.undefined)
    
    @scala.inline
    def setEpisodeNumber(value: String): Self = this.set("episodeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpisodeNumber: Self = this.set("episodeNumber", js.undefined)
    
    @scala.inline
    def setEpisodeTitleInternalAlias(value: String): Self = this.set("episodeTitleInternalAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpisodeTitleInternalAlias: Self = this.set("episodeTitleInternalAlias", js.undefined)
    
    @scala.inline
    def setFormatProfile(value: String): Self = this.set("formatProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatProfile: Self = this.set("formatProfile", js.undefined)
    
    @scala.inline
    def setLicenseType(value: String): Self = this.set("licenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseType: Self = this.set("licenseType", js.undefined)
    
    @scala.inline
    def setPphNamesVarargs(value: String*): Self = this.set("pphNames", js.Array(value :_*))
    
    @scala.inline
    def setPphNames(value: js.Array[String]): Self = this.set("pphNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePphNames: Self = this.set("pphNames", js.undefined)
    
    @scala.inline
    def setPriceType(value: String): Self = this.set("priceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceType: Self = this.set("priceType", js.undefined)
    
    @scala.inline
    def setPriceValue(value: String): Self = this.set("priceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceValue: Self = this.set("priceValue", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setRatingReason(value: String): Self = this.set("ratingReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingReason: Self = this.set("ratingReason", js.undefined)
    
    @scala.inline
    def setRatingSystem(value: String): Self = this.set("ratingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingSystem: Self = this.set("ratingSystem", js.undefined)
    
    @scala.inline
    def setRatingValue(value: String): Self = this.set("ratingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatingValue: Self = this.set("ratingValue", js.undefined)
    
    @scala.inline
    def setReleaseDate(value: String): Self = this.set("releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseDate: Self = this.set("releaseDate", js.undefined)
    
    @scala.inline
    def setSeasonAltId(value: String): Self = this.set("seasonAltId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeasonAltId: Self = this.set("seasonAltId", js.undefined)
    
    @scala.inline
    def setSeasonNumber(value: String): Self = this.set("seasonNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeasonNumber: Self = this.set("seasonNumber", js.undefined)
    
    @scala.inline
    def setSeasonTitleInternalAlias(value: String): Self = this.set("seasonTitleInternalAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeasonTitleInternalAlias: Self = this.set("seasonTitleInternalAlias", js.undefined)
    
    @scala.inline
    def setSeriesAltId(value: String): Self = this.set("seriesAltId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesAltId: Self = this.set("seriesAltId", js.undefined)
    
    @scala.inline
    def setSeriesTitleInternalAlias(value: String): Self = this.set("seriesTitleInternalAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesTitleInternalAlias: Self = this.set("seriesTitleInternalAlias", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStoreLanguage(value: String): Self = this.set("storeLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreLanguage: Self = this.set("storeLanguage", js.undefined)
    
    @scala.inline
    def setSuppressionLiftDate(value: String): Self = this.set("suppressionLiftDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressionLiftDate: Self = this.set("suppressionLiftDate", js.undefined)
    
    @scala.inline
    def setTerritory(value: String): Self = this.set("territory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerritory: Self = this.set("territory", js.undefined)
    
    @scala.inline
    def setTitleInternalAlias(value: String): Self = this.set("titleInternalAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleInternalAlias: Self = this.set("titleInternalAlias", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
    
    @scala.inline
    def setWorkType(value: String): Self = this.set("workType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkType: Self = this.set("workType", js.undefined)
  }
}
