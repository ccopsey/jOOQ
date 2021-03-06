/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class F2502_2 extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 1934280052;

	/**
	 * The parameter <code>PUBLIC.F2502_2.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>PUBLIC.F2502_2.CONFIGURATION</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> CONFIGURATION = createParameter("CONFIGURATION", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>PUBLIC.F2502_2.CONFIGURATION_</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> CONFIGURATION_ = createParameter("CONFIGURATION_", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>PUBLIC.F2502_2.CONFIGURATION__</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> CONFIGURATION__ = createParameter("CONFIGURATION__", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public F2502_2() {
		super("F2502_2", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(CONFIGURATION);
		addInParameter(CONFIGURATION_);
		addInParameter(CONFIGURATION__);
	}

	/**
	 * Set the <code>CONFIGURATION</code> parameter IN value to the routine
	 */
	public void setConfiguration(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.F2502_2.CONFIGURATION, value);
	}

	/**
	 * Set the <code>CONFIGURATION</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setConfiguration(org.jooq.Field<java.lang.Integer> field) {
		setField(CONFIGURATION, field);
	}

	/**
	 * Set the <code>CONFIGURATION_</code> parameter IN value to the routine
	 */
	public void setConfiguration_(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.F2502_2.CONFIGURATION_, value);
	}

	/**
	 * Set the <code>CONFIGURATION_</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setConfiguration_(org.jooq.Field<java.lang.Integer> field) {
		setField(CONFIGURATION_, field);
	}

	/**
	 * Set the <code>CONFIGURATION__</code> parameter IN value to the routine
	 */
	public void setConfiguration__(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.F2502_2.CONFIGURATION__, value);
	}

	/**
	 * Set the <code>CONFIGURATION__</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setConfiguration__(org.jooq.Field<java.lang.Integer> field) {
		setField(CONFIGURATION__, field);
	}
}
