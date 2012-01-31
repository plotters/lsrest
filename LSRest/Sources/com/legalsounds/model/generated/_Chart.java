// $LastChangedRevision$ DO NOT EDIT.  Make changes to Chart.java instead.
package com.legalsounds.model.generated;

import com.legalsounds.model.Chart;
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Chart extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Chart";

	// Attributes
	public static final String ID_KEY = "id";
	public static final String IMAGE_ID_KEY = "image_id";
	public static final String IS_BLOCKED_KEY = "is_blocked";
	public static final String PRIORITY_KEY = "priority";

	// Relationships

  private static Logger LOG = Logger.getLogger(_Chart.class);

  public Chart localInstanceIn(EOEditingContext editingContext) {
    Chart localInstance = (Chart)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer id() {
    return (Integer) storedValueForKey("id");
  }

  public void setId(Integer value) {
    if (_Chart.LOG.isDebugEnabled()) {
    	_Chart.LOG.debug( "updating id from " + id() + " to " + value);
    }
    takeStoredValueForKey(value, "id");
  }

  public Integer image_id() {
    return (Integer) storedValueForKey("image_id");
  }

  public void setImage_id(Integer value) {
    if (_Chart.LOG.isDebugEnabled()) {
    	_Chart.LOG.debug( "updating image_id from " + image_id() + " to " + value);
    }
    takeStoredValueForKey(value, "image_id");
  }

  public Boolean is_blocked() {
    return (Boolean) storedValueForKey("is_blocked");
  }

  public void setIs_blocked(Boolean value) {
    if (_Chart.LOG.isDebugEnabled()) {
    	_Chart.LOG.debug( "updating is_blocked from " + is_blocked() + " to " + value);
    }
    takeStoredValueForKey(value, "is_blocked");
  }

  public Integer priority() {
    return (Integer) storedValueForKey("priority");
  }

  public void setPriority(Integer value) {
    if (_Chart.LOG.isDebugEnabled()) {
    	_Chart.LOG.debug( "updating priority from " + priority() + " to " + value);
    }
    takeStoredValueForKey(value, "priority");
  }


  public static Chart createChart(EOEditingContext editingContext, Integer id
, Boolean is_blocked
) {
    Chart eo = (Chart) EOUtilities.createAndInsertInstance(editingContext, _Chart.ENTITY_NAME);    
		eo.setId(id);
		eo.setIs_blocked(is_blocked);
    return eo;
  }

  public static NSArray<Chart> fetchAllCharts(EOEditingContext editingContext) {
    return _Chart.fetchAllCharts(editingContext, null);
  }

  public static NSArray<Chart> fetchAllCharts(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Chart.fetchCharts(editingContext, null, sortOrderings);
  }

  public static NSArray<Chart> fetchCharts(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Chart.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Chart> eoObjects = (NSArray<Chart>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Chart fetchChart(EOEditingContext editingContext, String keyName, Object value) {
    return _Chart.fetchChart(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Chart fetchChart(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Chart> eoObjects = _Chart.fetchCharts(editingContext, qualifier, null);
    Chart eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Chart)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Chart that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Chart fetchRequiredChart(EOEditingContext editingContext, String keyName, Object value) {
    return _Chart.fetchRequiredChart(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Chart fetchRequiredChart(EOEditingContext editingContext, EOQualifier qualifier) {
    Chart eoObject = _Chart.fetchChart(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Chart that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Chart localInstanceIn(EOEditingContext editingContext, Chart eo) {
    Chart localInstance = (eo == null) ? null : (Chart)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
