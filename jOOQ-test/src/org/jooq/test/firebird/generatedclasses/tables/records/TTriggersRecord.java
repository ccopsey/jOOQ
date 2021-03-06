/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_TRIGGERS")
public class TTriggersRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.firebird.generatedclasses.tables.records.TTriggersRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, org.jooq.test.firebird.generatedclasses.tables.interfaces.ITTriggers {

	private static final long serialVersionUID = 1731157309;

	/**
	 * Setter for <code>T_TRIGGERS.ID_GENERATED</code>. 
	 */
	@Override
	public void setIdGenerated(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>T_TRIGGERS.ID_GENERATED</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID_GENERATED", unique = true, nullable = false, length = 4)
	@javax.validation.constraints.NotNull
	@Override
	public java.lang.Integer getIdGenerated() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>T_TRIGGERS.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>T_TRIGGERS.ID</code>. 
	 */
	@javax.persistence.Column(name = "ID", length = 4)
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>T_TRIGGERS.COUNTER</code>. 
	 */
	@Override
	public void setCounter(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>T_TRIGGERS.COUNTER</code>. 
	 */
	@javax.persistence.Column(name = "COUNTER", length = 4)
	@Override
	public java.lang.Integer getCounter() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.firebird.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.firebird.generatedclasses.tables.TTriggers.T_TRIGGERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.firebird.generatedclasses.tables.TTriggers.T_TRIGGERS.COUNTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdGenerated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCounter();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.ITTriggers from) {
		setIdGenerated(from.getIdGenerated());
		setId(from.getId());
		setCounter(from.getCounter());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.ITTriggers> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TTriggersRecord
	 */
	public TTriggersRecord() {
		super(org.jooq.test.firebird.generatedclasses.tables.TTriggers.T_TRIGGERS);
	}
}
