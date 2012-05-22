package uk.ac.warwick.html5;

import org.ccil.cowan.tagsoup.Schema;

/**
 * This class provides a Schema that has been preinitialized with HTML elements,
 * attributes, and character entity declarations. All the declarations normally
 * provided with HTML 5 and 4.01 are given, plus some that are IE-specific and
 * NS4-specific. Attribute declarations of type CDATA with no default value are
 * not included.
 */
public class HTML5Schema extends Schema implements HTML5Models {

	/**
	 * Returns a newly constructed HTMLSchema object independent of any existing
	 * ones.
	 */
	public HTML5Schema() {
		setupSchema1();
		setupSchema2();
	}

	private void setupSchema1() {
		// Start of Schema calls
		/** @@SCHEMA_CALLS1@@ **/
		// End of Schema calls
	}

	private void setupSchema2() {
		// Start of Schema calls
		/** @@SCHEMA_CALLS2@@ **/
		// End of Schema calls
	}

}
