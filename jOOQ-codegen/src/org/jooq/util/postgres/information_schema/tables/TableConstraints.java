/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.information_schema.InformationSchema;
import org.jooq.util.postgres.information_schema.tables.records.TableConstraintsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TableConstraints extends TableImpl<TableConstraintsRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of table_constraints
	 */
	public static final TableConstraints TABLE_CONSTRAINTS = new TableConstraints();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TableConstraintsRecord> __RECORD_TYPE = TableConstraintsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TableConstraintsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> CONSTRAINT_CATALOG = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.POSTGRES, "constraint_catalog", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> CONSTRAINT_SCHEMA = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.POSTGRES, "constraint_schema", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> CONSTRAINT_NAME = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.POSTGRES, "constraint_name", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> TABLE_CATALOG = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.POSTGRES, "table_catalog", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> TABLE_SCHEMA = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.POSTGRES, "table_schema", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> TABLE_NAME = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.POSTGRES, "table_name", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> CONSTRAINT_TYPE = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.POSTGRES, "constraint_type", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> IS_DEFERRABLE = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.POSTGRES, "is_deferrable", String.class, TABLE_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TableConstraintsRecord, String> INITIALLY_DEFERRED = new TableFieldImpl<TableConstraintsRecord, String>(SQLDialect.POSTGRES, "initially_deferred", String.class, TABLE_CONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private TableConstraints() {
		super(SQLDialect.POSTGRES, "table_constraints", InformationSchema.INFORMATION_SCHEMA);
	}

}
