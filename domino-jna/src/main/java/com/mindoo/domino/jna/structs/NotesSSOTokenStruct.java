package com.mindoo.domino.jna.structs;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * Internal class to decode the SSO_TOKEN structure values
 * 
 * @author Karsten Lehmann
 */
public class NotesSSOTokenStruct extends Structure {
	public int mhName;
	public int mhDomainList;
	public short wNumDomains;
	public boolean bSecureOnly;
	public int mhData;
	
	/**
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 */
	public NotesSSOTokenStruct() {
		super();
	}
	
	public static NotesSSOTokenStruct newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<NotesSSOTokenStruct>() {

			@Override
			public NotesSSOTokenStruct run() {
				return new NotesSSOTokenStruct();
			}
		});
	}
	
	protected List<? > getFieldOrder() {
		return Arrays.asList("mhName", "mhDomainList", "wNumDomains", "bSecureOnly", "mhData");
	}
	
	/**
	 * Creates a new instance
	 * 
	 * @param mhName name for the token when set as a cookie
	 * @param mhDomainList list of DNS domains for the token when set as a cookie
	 * @param wNumDomains Total number of domains contained in the mhDomainList member
	 * @param bSecureOnly BOOL recommending that the token only be set on a secure connection.
	 * @param mhData MEMHANDLE to a the null-terminated token data.
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 */
	public NotesSSOTokenStruct(int mhName, int mhDomainList, short wNumDomains, boolean bSecureOnly, int mhData) {
		super();
		this.mhName = mhName;
		this.mhDomainList = mhDomainList;
		this.wNumDomains = wNumDomains;
		this.bSecureOnly = bSecureOnly;
		this.mhData = mhData;
	}
	
	public static NotesSSOTokenStruct newInstance(final int mhName, final int mhDomainList, final short wNumDomains, final boolean bSecureOnly, final int mhData) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesSSOTokenStruct>() {

			@Override
			public NotesSSOTokenStruct run() {
				return new NotesSSOTokenStruct(mhName, mhDomainList, wNumDomains, bSecureOnly, mhData);
			}
		});
	}

	/**
	 * @deprecated only public to be used by JNA; use static newInstance method instead to run in AccessController.doPrivileged block
	 * 
	 * @param peer pointer
	 */
	public NotesSSOTokenStruct(Pointer peer) {
		super(peer);
	}
	
	public static NotesSSOTokenStruct newInstance(final Pointer p) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesSSOTokenStruct>() {

			@Override
			public NotesSSOTokenStruct run() {
				return new NotesSSOTokenStruct(p);
			}
		});
	}
	
	public static class ByReference extends NotesSSOTokenStruct implements Structure.ByReference {
		
	};
	
	public static class ByValue extends NotesSSOTokenStruct implements Structure.ByValue {
		
	};
}
