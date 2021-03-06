/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class AWBuildVersion extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AWBuildVersion> {

	private static final long serialVersionUID = -608656958;

	/**
	 * The singleton instance of <code>dbo.AWBuildVersion</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.dbo.tables.AWBuildVersion AWBuildVersion = new org.jooq.examples.sqlserver.adventureworks.dbo.tables.AWBuildVersion();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AWBuildVersion> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AWBuildVersion.class;
	}

	/**
	 * The column <code>dbo.AWBuildVersion.SystemInformationID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AWBuildVersion, java.lang.Byte> SystemInformationID = createField("SystemInformationID", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>dbo.AWBuildVersion.Database Version</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AWBuildVersion, java.lang.String> Database_Version = createField("Database Version", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>dbo.AWBuildVersion.VersionDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AWBuildVersion, java.sql.Timestamp> VersionDate = createField("VersionDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dbo.AWBuildVersion.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AWBuildVersion, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>dbo.AWBuildVersion</code> table reference
	 */
	public AWBuildVersion() {
		super("AWBuildVersion", org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo);
	}

	/**
	 * Create an aliased <code>dbo.AWBuildVersion</code> table reference
	 */
	public AWBuildVersion(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo, org.jooq.examples.sqlserver.adventureworks.dbo.tables.AWBuildVersion.AWBuildVersion);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AWBuildVersion, java.lang.Byte> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.Keys.IDENTITY_AWBuildVersion;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AWBuildVersion> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.Keys.PK_AWBuildVersion_SystemInformationID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AWBuildVersion>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AWBuildVersion>>asList(org.jooq.examples.sqlserver.adventureworks.dbo.Keys.PK_AWBuildVersion_SystemInformationID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.dbo.tables.AWBuildVersion as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.dbo.tables.AWBuildVersion(alias);
	}
}
