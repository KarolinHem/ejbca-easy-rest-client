/*************************************************************************
 *                                                                       *
 *  Keyfactor Community                                                  *
 *                                                                       *
 *  This software is free software; you can redistribute it and/or       *
 *  modify it under the terms of the GNU Lesser General Public           *
 *  License as published by the Free Software Foundation; either         *
 *  version 2.1 of the License, or any later version.                    *
 *                                                                       *
 *  See terms of license at gnu.org.                                     *
 *                                                                       *
 *************************************************************************/
package com.keyfactor.ejbca.client.ca.management;

import com.keyfactor.ejbca.client.ErceCommandBase;

/**
 * Base command for the ca command tree
 */

public abstract class CaCommandBase extends ErceCommandBase {

	private final String MAIN_COMMAND = "ca";
	
	@Override
	public String getMainCommand() {
		return MAIN_COMMAND;
	}
	
	@Override
	public String[] getCommandPath() {
		return new String[] { MAIN_COMMAND };
	}
}
