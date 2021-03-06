package com.mindoo.domino.jna.internal.structs;
import com.mindoo.domino.jna.internal.NotesConstants;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class NotesItemDefinitionTableLock extends BaseStructure {
	public int Items;
	/** C type : void* */
	public Pointer pItemDefArray;
	/** C type : char*[MAX_ITEMDEF_SEGMENTS] */
	public Pointer[] ItemText = new Pointer[NotesConstants.MAX_ITEMDEF_SEGMENTS];
	public int NumSegments;
	/** C type : DWORD[MAX_ITEMDEF_SEGMENTS] */
	public int[] ItemNameSegLengths = new int[NotesConstants.MAX_ITEMDEF_SEGMENTS];
	
	public NotesItemDefinitionTableLock() {
		super();
	}
	
	public static NotesItemDefinitionTableLock newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<NotesItemDefinitionTableLock>() {

			@Override
			public NotesItemDefinitionTableLock run() {
				return new NotesItemDefinitionTableLock();
			}});
	};

	
	protected List<String> getFieldOrder() {
		return Arrays.asList("Items", "pItemDefArray", "ItemText", "NumSegments", "ItemNameSegLengths");
	}
	
	/**
	 * @param pItemDefArray C type : void*<br>
	 * @param itemText C type : char*[MAX_ITEMDEF_SEGMENTS]<br>
	 * @param itemNameSegLengths C type : DWORD[MAX_ITEMDEF_SEGMENTS]
	 */
	public NotesItemDefinitionTableLock(int items, Pointer pItemDefArray, Pointer itemText[], int numSegments, int itemNameSegLengths[]) {
		super();
		this.Items = items;
		this.pItemDefArray = pItemDefArray;
		if ((itemText.length != this.ItemText.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ItemText = itemText;
		this.NumSegments = numSegments;
		if ((itemNameSegLengths.length != this.ItemNameSegLengths.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ItemNameSegLengths = itemNameSegLengths;
	}
	
	public static NotesItemDefinitionTableLock newInstance(final int items, final Pointer pItemDefArray, final Pointer itemText[], final int numSegments, final int itemNameSegLengths[]) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesItemDefinitionTableLock>() {

			@Override
			public NotesItemDefinitionTableLock run() {
				return new NotesItemDefinitionTableLock(items, pItemDefArray, itemText, numSegments, itemNameSegLengths);
			}});
	};

	public NotesItemDefinitionTableLock(Pointer peer) {
		super(peer);
	}
	
	public static NotesItemDefinitionTableLock newInstance(final Pointer peer) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesItemDefinitionTableLock>() {

			@Override
			public NotesItemDefinitionTableLock run() {
				return new NotesItemDefinitionTableLock(peer);
			}});
	};

	public static class ByReference extends NotesItemDefinitionTableLock implements Structure.ByReference {
		
	};
	public static class ByValue extends NotesItemDefinitionTableLock implements Structure.ByValue {
		
	};
}
