/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Represents a JavaFX property wrapper for a double value.
 *   Project:  JavaFX Application
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *   Version:  2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/

package application;

import javafx.beans.property.*;

/**
 * Represents a class encapsulating a double value as a JavaFX property.
 */
public class MyNumber {
	// DoubleProperty to hold the number
	private DoubleProperty number;

	/**
	 * Returns the current value of the number.
	 * 
	 * @return The current value of the number.
	 */
	public double getNumber() {
		if (number != null)
			return number.get();
		return 0;
	}

	/**
	 * Sets the value of the number.
	 * 
	 * @param number The new value to set.
	 */
	public final void setNumber(double number) {
		this.numberProperty().set(number);
	}

	/**
	 * Returns the DoubleProperty object. If it's null, initializes it with a
	 * default value.
	 * 
	 * @return The DoubleProperty object.
	 */
	public final DoubleProperty numberProperty() {
		if (number == null) {
			number = new SimpleDoubleProperty(0);
		}
		return number;
	}
}
