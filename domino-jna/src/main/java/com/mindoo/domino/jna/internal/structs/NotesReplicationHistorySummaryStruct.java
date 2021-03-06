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
public class NotesReplicationHistorySummaryStruct extends BaseStructure {
	/**
	 * Time returned from last replication<br>
	 * C type : TIMEDATE
	 */
	public NotesTimeDateStruct ReplicationTime;
	/** Access level at time of replication */
	public short AccessLevel;
	/** Access flags at time of replication */
	public short AccessFlags;
	/** NEVER, SEND, RECEIVE */
	public short Direction;
	/** Server name offset in packed data */
	public int ServerNameOffset;
	/** Server name length in packed data */
	public short ServerNameLength;
	/** File name length in packed data */
	public short FileNameLength;
	/** contains MoreInfo from cache - includes complete replication flag */
	public short MoreInfo;
	/** Room for growth */
	public short wSpare;
	/** Room for growth */
	public int dwSpare;
	
	public NotesReplicationHistorySummaryStruct() {
		super(Structure.ALIGN_DEFAULT);
	}
	
	public static NotesReplicationHistorySummaryStruct newInstance() {
		return AccessController.doPrivileged(new PrivilegedAction<NotesReplicationHistorySummaryStruct>() {

			@Override
			public NotesReplicationHistorySummaryStruct run() {
				return new NotesReplicationHistorySummaryStruct();
			}
		});
	}

	protected List<String> getFieldOrder() {
		return Arrays.asList("ReplicationTime", "AccessLevel", "AccessFlags", "Direction", "ServerNameOffset", "ServerNameLength", "FileNameLength", "MoreInfo", "wSpare", "dwSpare");
	}
	
	public NotesReplicationHistorySummaryStruct(Pointer peer) {
		super(peer, Structure.ALIGN_DEFAULT);
	}
	
	public static NotesReplicationHistorySummaryStruct newInstance(Pointer peer) {
		return AccessController.doPrivileged(new PrivilegedAction<NotesReplicationHistorySummaryStruct>() {

			@Override
			public NotesReplicationHistorySummaryStruct run() {
				return new NotesReplicationHistorySummaryStruct(peer);
			}
		});
	}
	
	public static class ByReference extends NotesReplicationHistorySummaryStruct implements Structure.ByReference {
		
	};
	public static class ByValue extends NotesReplicationHistorySummaryStruct implements Structure.ByValue {
		
	};
}
