/*******************************************************************************
 * Copyright (c) 2003, 2008 IBM Corporation and Others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Junji MAEDA - initial API and implementation
 *******************************************************************************/
package org.eclipse.actf.visualization.engines.lowvision;

/**
 * This exception is thrown when a low vision simulation did not completes
 * successfully.
 */
public class LowVisionException extends Exception {
	private static final long serialVersionUID = 6874356374488623720L;

	/**
	 * Constructor of Exception
	 */
	public LowVisionException() {
		super();
	}

	/**
	 * Constructor of Exception
	 * 
	 * @param msg
	 *            exception message
	 */
	public LowVisionException(String msg) {
		super(msg);
	}
}
