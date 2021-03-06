/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.udt;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UUuids extends org.jooq.impl.UDTImpl<org.jooq.test.postgres.generatedclasses.udt.records.UUuidsRecord> {

	private static final long serialVersionUID = -1890792487;

	/**
	 * The singleton instance of <code>public.u_uuids</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.udt.UUuids U_UUIDS = new org.jooq.test.postgres.generatedclasses.udt.UUuids();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.udt.records.UUuidsRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.udt.records.UUuidsRecord.class;
	}

	/**
	 * The attribute <code>public.u_uuids.u1</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.postgres.generatedclasses.udt.records.UUuidsRecord, java.util.UUID> U1 = createField("u1", org.jooq.impl.SQLDataType.UUID, U_UUIDS);

	/**
	 * The attribute <code>public.u_uuids.u2</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.postgres.generatedclasses.udt.records.UUuidsRecord, java.util.UUID[]> U2 = createField("u2", org.jooq.impl.SQLDataType.UUID.getArrayDataType(), U_UUIDS);

	/**
	 * No further instances allowed
	 */
	private UUuids() {
		super("u_uuids", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		// Initialise data type
		getDataType();
	}
}
