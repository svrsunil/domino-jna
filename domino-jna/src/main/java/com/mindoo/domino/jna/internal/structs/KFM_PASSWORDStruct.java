package com.mindoo.domino.jna.internal.structs;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class KFM_PASSWORDStruct extends BaseStructure {
	/** Type of hash.  This value should be */
	public byte Type;
	/**
	 * Hashed password<br>
	 * C type : BYTE[48]
	 */
	public byte[] HashedPassword = new byte[48];
	
	public KFM_PASSWORDStruct() {
		super();
	}

	public static KFM_PASSWORDStruct newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<KFM_PASSWORDStruct>() {

			@Override
			public KFM_PASSWORDStruct run() {
				return new KFM_PASSWORDStruct();
			}
		});
	}

	protected List<String> getFieldOrder() {
		return Arrays.asList("Type", "HashedPassword");
	}
	
	/**
	 * @param Type Type of hash.  This value should be<br>
	 * @param HashedPassword Hashed password<br>
	 * C type : BYTE[48]
	 */
	public KFM_PASSWORDStruct(byte Type, byte HashedPassword[]) {
		super();
		this.Type = Type;
		if ((HashedPassword.length != this.HashedPassword.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.HashedPassword = HashedPassword;
	}
	
	public KFM_PASSWORDStruct(Pointer peer) {
		super(peer);
	}
	
	public static KFM_PASSWORDStruct newInstance(Pointer ptr) {
		return AccessController.doPrivileged(new PrivilegedAction<KFM_PASSWORDStruct>() {

			@Override
			public KFM_PASSWORDStruct run() {
				return new KFM_PASSWORDStruct(ptr);
			}
		});
	}

	public static class ByReference extends KFM_PASSWORDStruct implements Structure.ByReference {
		
	};
	public static class ByValue extends KFM_PASSWORDStruct implements Structure.ByValue {
		
	};
	
	public static KFM_PASSWORDStruct.ByReference newInstanceByReference() {
		return AccessController.doPrivileged(new PrivilegedAction<KFM_PASSWORDStruct.ByReference>() {

			@Override
			public KFM_PASSWORDStruct.ByReference run() {
				return new KFM_PASSWORDStruct.ByReference();
			}
		});
	}

}
