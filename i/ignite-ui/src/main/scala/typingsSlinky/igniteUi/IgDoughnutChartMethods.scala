package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgDoughnutChartMethods extends StObject {
  
  /**
    * Adds a new series to the doughnut chart.
    *
    * @param seriesObj The series object to be added.
    */
  def addSeries(seriesObj: js.Object): Unit = js.native
  
  /**
    * Destroys the widget.
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns information about how the doughnut chart is rendered.
    */
  def exportVisualData(): js.Object = js.native
  
  /**
    * Causes all of the series that have pending changes e.g. by changed property values to be rendered immediately.
    */
  def flush(): Unit = js.native
  
  /**
    * Returns the center of the doughnut chart.
    */
  def getCenterCoordinates(): js.Object = js.native
  
  /**
    * Returns data source of the series.
    *
    * @param series Optional. The series name. If not provided an array of series data sources is returned.
    */
  def getData(series: String): js.Object = js.native
  
  /**
    * Returns the radius of the chart's hole.
    */
  def getHoleRadius(): Double = js.native
  
  /**
    * Removes the specified series from the doughnut chart.
    *
    * @param seriesObj The series object identifying the series to be removed.
    */
  def removeSeries(seriesObj: js.Object): Unit = js.native
  
  /**
    * Updates the series with the specified name with the specified new property values.
    *
    * @param value The series object identifying the series to be updated.
    */
  def updateSeries(value: js.Object): Unit = js.native
}
object IgDoughnutChartMethods {
  
  @scala.inline
  def apply(
    addSeries: js.Object => Unit,
    destroy: () => Unit,
    exportVisualData: () => js.Object,
    flush: () => Unit,
    getCenterCoordinates: () => js.Object,
    getData: String => js.Object,
    getHoleRadius: () => Double,
    removeSeries: js.Object => Unit,
    updateSeries: js.Object => Unit
  ): IgDoughnutChartMethods = {
    val __obj = js.Dynamic.literal(addSeries = js.Any.fromFunction1(addSeries), destroy = js.Any.fromFunction0(destroy), exportVisualData = js.Any.fromFunction0(exportVisualData), flush = js.Any.fromFunction0(flush), getCenterCoordinates = js.Any.fromFunction0(getCenterCoordinates), getData = js.Any.fromFunction1(getData), getHoleRadius = js.Any.fromFunction0(getHoleRadius), removeSeries = js.Any.fromFunction1(removeSeries), updateSeries = js.Any.fromFunction1(updateSeries))
    __obj.asInstanceOf[IgDoughnutChartMethods]
  }
  
  @scala.inline
  implicit class IgDoughnutChartMethodsMutableBuilder[Self <: IgDoughnutChartMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSeries(value: js.Object => Unit): Self = StObject.set(x, "addSeries", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExportVisualData(value: () => js.Object): Self = StObject.set(x, "exportVisualData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCenterCoordinates(value: () => js.Object): Self = StObject.set(x, "getCenterCoordinates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetData(value: String => js.Object): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHoleRadius(value: () => Double): Self = StObject.set(x, "getHoleRadius", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveSeries(value: js.Object => Unit): Self = StObject.set(x, "removeSeries", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateSeries(value: js.Object => Unit): Self = StObject.set(x, "updateSeries", js.Any.fromFunction1(value))
  }
}
