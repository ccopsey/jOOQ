/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code></code> 
 * schema
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord> PK_T_639_NUMBERS_TABLE = UniqueKeys0.PK_T_639_NUMBERS_TABLE;
	public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.T_725LobTestRecord> PK_T_725_LOB_TEST = UniqueKeys0.PK_T_725_LOB_TEST;
	public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord> PK_T_AUTHOR = UniqueKeys0.PK_T_AUTHOR;
	public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TBookRecord> PK_T_BOOK = UniqueKeys0.PK_T_BOOK;
	public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TBookStoreRecord> PK_T_BOOK_STORE = UniqueKeys0.PK_T_BOOK_STORE;
	public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TBooleansRecord> PK_T_BOOLEANS = UniqueKeys0.PK_T_BOOLEANS;
	public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TDatesRecord> PK_T_DATES = UniqueKeys0.PK_T_DATES;
	public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TExoticTypesRecord> PK_T_EXOTIC_TYPES = UniqueKeys0.PK_T_EXOTIC_TYPES;
	public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TIdentityRecord> PK_T_IDENTITY = UniqueKeys0.PK_T_IDENTITY;
	public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TIdentityPkRecord> PK_T_IDENTITY_PK = UniqueKeys0.PK_T_IDENTITY_PK;
	public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TLanguageRecord> PK_T_LANGUAGE = UniqueKeys0.PK_T_LANGUAGE;
	public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TTriggersRecord> PK_T_TRIGGERS = UniqueKeys0.PK_T_TRIGGERS;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord> PK_T_639_NUMBERS_TABLE = createUniqueKey(org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE, org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.T_725LobTestRecord> PK_T_725_LOB_TEST = createUniqueKey(org.jooq.test.access.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.access.generatedclasses.tables.T_725LobTest.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord> PK_T_AUTHOR = createUniqueKey(org.jooq.test.access.generatedclasses.tables.TAuthor.T_AUTHOR, org.jooq.test.access.generatedclasses.tables.TAuthor.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TBookRecord> PK_T_BOOK = createUniqueKey(org.jooq.test.access.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.access.generatedclasses.tables.TBook.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TBookStoreRecord> PK_T_BOOK_STORE = createUniqueKey(org.jooq.test.access.generatedclasses.tables.TBookStore.T_BOOK_STORE, org.jooq.test.access.generatedclasses.tables.TBookStore.XNAME);
		public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TBooleansRecord> PK_T_BOOLEANS = createUniqueKey(org.jooq.test.access.generatedclasses.tables.TBooleans.T_BOOLEANS, org.jooq.test.access.generatedclasses.tables.TBooleans.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TDatesRecord> PK_T_DATES = createUniqueKey(org.jooq.test.access.generatedclasses.tables.TDates.T_DATES, org.jooq.test.access.generatedclasses.tables.TDates.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TExoticTypesRecord> PK_T_EXOTIC_TYPES = createUniqueKey(org.jooq.test.access.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES, org.jooq.test.access.generatedclasses.tables.TExoticTypes.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TIdentityRecord> PK_T_IDENTITY = createUniqueKey(org.jooq.test.access.generatedclasses.tables.TIdentity.T_IDENTITY, org.jooq.test.access.generatedclasses.tables.TIdentity.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TIdentityPkRecord> PK_T_IDENTITY_PK = createUniqueKey(org.jooq.test.access.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK, org.jooq.test.access.generatedclasses.tables.TIdentityPk.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TLanguageRecord> PK_T_LANGUAGE = createUniqueKey(org.jooq.test.access.generatedclasses.tables.TLanguage.T_LANGUAGE, org.jooq.test.access.generatedclasses.tables.TLanguage.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TTriggersRecord> PK_T_TRIGGERS = createUniqueKey(org.jooq.test.access.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.access.generatedclasses.tables.TTriggers.ID_GENERATED);
	}
}
