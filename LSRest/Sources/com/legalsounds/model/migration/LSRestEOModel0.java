package com.legalsounds.model.migration;

import static er.extensions.migration.ERXMigrationDatabase.Migration;

import com.ibm.icu.impl.CharTrie;
import com.legalsounds.model.Chart;
import com.webobjects.eoaccess.EOModel;
import com.webobjects.eocontrol.EOEditingContext;

import er.extensions.migration.ERXMigrationDatabase;
import er.extensions.migration.ERXMigrationTable;
import er.extensions.migration.IERXPostMigration;

public class LSRestEOModel0 extends Migration implements IERXPostMigration {

	@Override
	public void downgrade(EOEditingContext editingContext,
			ERXMigrationDatabase database) throws Throwable {
	    // DO NOTHING		
	}

	@Override
	public void upgrade(EOEditingContext editingContext,
			ERXMigrationDatabase database) throws Throwable {
		
		ERXMigrationTable chartTable = database.newTableNamed(Chart.ENTITY_NAME);
		chartTable.newIntegerColumn(Chart.ID_KEY, false);
		chartTable.newFlagBooleanColumn(Chart.IS_BLOCKED_KEY, false, false);
		chartTable.newIntegerColumn(Chart.IMAGE_ID_KEY, true);
		chartTable.newIntegerColumn(Chart.PRIORITY_KEY, false);
		chartTable.create();
				
	}

	public void postUpgrade(EOEditingContext editingContext, EOModel model)
			throws Throwable {
		// TODO Auto-generated method stub
		
	}

}
