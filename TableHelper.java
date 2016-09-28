package es.eci.pim.exporter.utils;

import org.jooq.Record;
import org.jooq.impl.TableImpl;

import es.eci.pim.exporter.exceptions.ExporterConfigurationException;
import es.eci.pim.exporter.sql.SQLTablesFactory;

public class TableHelper {
		
		static public TableImpl<? extends Record> getTable(String containerId){
		
		TableImpl<? extends Record> table = SQLTablesFactory.getTable(containerId);
		if(table == null)
			throw new ExporterConfigurationException("Incorrect Container identifier: " + containerId);
		return table;
		
	}
}
