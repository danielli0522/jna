/* Copyright (c) 2012 Tobias Wolf, All Rights Reserved
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.  
 */
package com.sun.jna.platform.win32.COM;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.Guid.IID;
import com.sun.jna.platform.win32.WinNT.HRESULT;
import com.sun.jna.ptr.PointerByReference;

// TODO: Auto-generated Javadoc
/**
 * Wrapper class for the ITypeInfo interface
 * 
 * Method Name V-Table Offset IUnknown.QueryInterface 0 IUnknown.AddRef 4
 * IUnknown.Release 8
 * 
 * @author Tobias Wolf, wolf.tobias@gmx.net
 */
public class Unknown extends COMClass implements IUnknown {

	public static class ByReference extends Unknown implements
			Structure.ByReference {
	}

	private IUnknown iUnknown;

	public Unknown() {
		this.setPointer(new Memory(Pointer.SIZE));
		this.iUnknown = (IUnknown) this.createCOMClass(IUnknown.class);
	}

	/**
	 * Instantiates a new i unknown.
	 * 
	 * @param pvInstance
	 *            the pv instance
	 */
	public Unknown(Pointer pvInstance) {
		this.setPointer(pvInstance);
		this.iUnknown = (IUnknown) this.createCOMClass(IUnknown.class);		
	}

	/**
	 * Query interface.
	 * 
	 * @param riid
	 *            the riid
	 * @param ppvObject
	 *            the ppv object
	 * @return the hresult
	 */
	public HRESULT QueryInterface(IID riid, PointerByReference ppvObject) {
		return this.iUnknown.QueryInterface(riid, ppvObject);
	}

	/**
	 * Adds the ref.
	 * 
	 * @return the ulong
	 */
	public int AddRef() {
		return this.iUnknown.AddRef();
	}

	/**
	 * Release.
	 * 
	 * @return the ulong
	 */
	public int Release() {
		return this.iUnknown.Release();
	}
}
