package com.mindoo.domino.jna.errors.errortexts;

public interface IRouteErr extends IGlobalErr {

	@ErrorText(text="*** UNKNOWN ROUTER ERROR ***")
	short ERR_ROUTER_UNKNOWN = (PKG_ROUTER+1);
	@ErrorText(text="Error updating message tracking request")
	short ERR_ROUTER_MSGTRACK_REQUEST_UPDATE = (PKG_ROUTER+2);
	@ErrorText(text="Error queuing message tracking request")
	short ERR_ROUTER_MSGTRACK_REQUEST_QUEUE = (PKG_ROUTER+3);
	@ErrorText(text="Recipient user name %a not unique.  Several matches found in Domino Directory.")
	short ERR_ROUTER_NOTUNIQUE = (PKG_ROUTER+4);
	@ErrorText(text="User %a not listed in Domino Directory")
	short ERR_ROUTER_NOSUCHUSER = (PKG_ROUTER+5);
	@ErrorText(text="Recipient's Domino Directory entry does not specify a valid Notes mail file")
	short ERR_ROUTER_NOMAILFILE = (PKG_ROUTER+6);
	@ErrorText(text="New mail has been delivered to you!")
	short ERR_ROUTER_NEWMAIL = (PKG_ROUTER+7);
	@ErrorText(text="No route found to server %a from server %a.  Check Server and Connection documents in the Domino Directory.")
	short ERR_ROUTER_NOROUTETOSERVERFROM = (PKG_ROUTER+8);
	@ErrorText(text="No route found to domain %s from server %a.  Check Server, Connection and Domain documents in the Domino Directory.")
	short ERR_ROUTER_NOROUTETODOMAINFROM = (PKG_ROUTER+9);
	@ErrorText(text="No route found to domain %s from server %a via server %a.  Check Server, Connection and Domain documents in the Domino Directory.")
	short ERR_ROUTER_NOROUTETODOMAINVIA = (PKG_ROUTER+10);
	@ErrorText(text="Error delivering to %a %p; %e")
	short ERR_ROUTER_DELIVERY_FILE = (PKG_ROUTER+11);
	@ErrorText(text="Error transferring to %p; %e")
	short ERR_ROUTER_TRANSFER_FILE = (PKG_ROUTER+12);
	@ErrorText(text="Unsupported use of group name; Cannot send to a Group @ Domain nor auto-forward to a Group")
	short ERR_ROUTER_NOGROUP = (PKG_ROUTER+13);
	@ErrorText(text="Maximum hop count exceeded.  Message probably in a routing loop.")
	short ERR_ROUTER_ROUTING_LOOP = (PKG_ROUTER+14);
	@ErrorText(text="Your Domain does not have access to route messages to the specified domain.")
	short ERR_ROUTER_ACCESS_DENIED = (PKG_ROUTER+15);
	@ErrorText(text="Unable to allocate mail message queue entry.")
	short ERR_ROUTER_MESSAGE_QUEUE = (PKG_ROUTER+16);
	@ErrorText(text="Insufficient Queue Space - Router message queue is full.")
	short ERR_ROUTER_MSGQ_POOLFULL = (PKG_ROUTER+17);
	@ErrorText(text="Insufficient Queue Space - Router transfer queue is full.")
	short ERR_ROUTER_TRANSFER_Q_POOLFULL = (PKG_ROUTER+18);
	@ErrorText(text="Message contains too many recipients (over 4 megabytes).")
	short ERR_ROUTER_TOO_MANY_RECIPS = (PKG_ROUTER+19);
	@ErrorText(text="Groups cannot be nested more than 20 levels deep.")
	short ERR_ROUTER_LIST_LOOP = (PKG_ROUTER+20);
	@ErrorText(text="Billing record not written. Insufficient memory.")
	short ERR_ROUTER_BILLING_NOMEM = (PKG_ROUTER+21);
	@ErrorText(text="Maximum forwarding loop count exceeded.  Message probably in a forwarding loop. Examine Forwarding Address of intended recipient in Domino Directory.")
	short ERR_ROUTER_DELIVER_LOOP = (PKG_ROUTER+23);
	@ErrorText(text="No route found to domain %s.  Check Server, Connection and Domain documents in Domino Directory.")
	short ERR_ROUTER_NOROUTETODOMAIN = (PKG_ROUTER+24);
	@ErrorText(text="No route found to server %a.  Check Server and Connection documents in Domino Directory.")
	short ERR_ROUTER_NOROUTETOSERVER = (PKG_ROUTER+25);
	@ErrorText(text="No Server entry in Domino Directory for local server.")
	short ERR_ROUTER_NOLOCALSERVER = (PKG_ROUTER+26);
	@ErrorText(text="To many responses found when creating message report.")
	short ERR_REPORTS_TOOMANYRESPONSES = (PKG_ROUTER+27);
	@ErrorText(text="Upgrade of mailbox file %p failed; %e")
	short ERR_ROUTER_UPGRADE_FAILED = (PKG_ROUTER+28);
	@ErrorText(text="Too many Connections")
	short ERR_ROUTER_TOOMANYCONN = (PKG_ROUTER+29);
	@ErrorText(text="Too many Servers")
	short ERR_ROUTER_TOOMANYSERVERS = (PKG_ROUTER+30);
	@ErrorText(text="Too many Domains")
	short ERR_ROUTER_TOOMANYDOMAINS = (PKG_ROUTER+31);
	@ErrorText(text="Insufficient memory - Router unable to allocate a new symbol for mailbox task.")
	short ERR_ROUTER_SYMBOL_TASKS_FULL = (PKG_ROUTER+32);
	@ErrorText(text="Insufficient memory - Router unable to allocate routing tables.")
	short ERR_ROUTER_TABLE_MEM_ERROR = (PKG_ROUTER+33);
	@ErrorText(text="Unable to add namespace $Domains to Indexer's queue.")
	short ERR_ROUTER_DOMAIN_NAMESPACE = (PKG_ROUTER+34);
	@ErrorText(text="Unable to add namespace $Connections to Indexer's queue.")
	short ERR_ROUTER_CONNECTION_NAMESPACE = (PKG_ROUTER+35);
	@ErrorText(text="Unable to add namespace $Servers to Indexer's queue.")
	short ERR_ROUTER_SERVER_NAMESPACE = (PKG_ROUTER+36);
	@ErrorText(text="Router: Too many Adjacent Domains")
	short ERR_ROUTER_TOOMANYADJDOMAINS = (PKG_ROUTER+37);
	@ErrorText(text="Router: Unable to find view in Domino Directory")
	short ERR_ROUTER_FIND_VIEW_ERR = (PKG_ROUTER+38);
	@ErrorText(text="Router: Unable to open view in Domino Directory")
	short ERR_ROUTER_OPEN_VIEW_ERR = (PKG_ROUTER+39);
	@ErrorText(text="Upgrading mailbox file %p")
	short ERR_ROUTER_MBOX_UPGRADE = (PKG_ROUTER+40);
	@ErrorText(text="Insufficient memory - Forwarding address + domain name exceeds buffer size for recipient %s.")
	short ERR_ROUTER_DOMAIN_BUFFER_EXCEEDED = (PKG_ROUTER+41);
	@ErrorText(text="Unable to add name to routing symbol table")
	short ERR_ROUTER_SYMBOL_TABLE = (PKG_ROUTER+42);
	@ErrorText(text="Router: Server %a not in local domain; Server ignored.")
	short ERR_ROUTER_SERVERNOTLOCALDOMAIN = (PKG_ROUTER+43);
	@ErrorText(text="Router: Duplicate server entry in Domino Directory for %a")
	short ERR_ROUTER_DUPSERVER = (PKG_ROUTER+44);
	@ErrorText(text="Router: Connection from server %a not used; Server not found in Domino Directory.")
	short ERR_ROUTER_NOSERVERENTRY = (PKG_ROUTER+45);
	@ErrorText(text="Router: Connection from server %a not used; Server not in local domain.")
	short ERR_ROUTER_CONNNOTLOCALDOMAIN = (PKG_ROUTER+46);
	@ErrorText(text="Attempt made to transfer message to self via SMTP. Possible DNS configuration error.")
	short ERR_ROUTER_ROUTE_TO_SELF = (PKG_ROUTER+47);
	@ErrorText(text="DNS is unavailable, message will be requeued.")
	short ERR_ROUTER_DNS_UNAVAILABLE = (PKG_ROUTER+48);
	@ErrorText(text="The size of this message exceeds the administrator specified maximum message size for this server")
	short ERR_ROUTER_TOO_BIG = (PKG_ROUTER+49);
	@ErrorText(text="Router: Duplicate Pull Routing connection entry in Domino Directory for %a")
	short ERR_ROUTER_DUPPULLCONN = (PKG_ROUTER+50);
	@ErrorText(text="Error delivering to %a; %e")
	short ERR_ROUTER_DELIVERY_USER = (PKG_ROUTER+51);
	@ErrorText(text="Message tracking query returned more than one result")
	short ERR_ROUTER_MSGTRACK_UNDERQUALIFIED = (PKG_ROUTER+52);
	@ErrorText(text="Tracking operation is in progress.")
	short ERR_ROUTER_MSGTRACK_INPROGRESS = (PKG_ROUTER+53);
	@ErrorText(text="Message tracking query returned no results")
	short ERR_ROUTER_MSGTRACK_NOTFOUND = (PKG_ROUTER+54);
	@ErrorText(text="Found an unexpected duplicate message")
	short ERR_ROUTER_MSGTRACK_DUPLICATE = (PKG_ROUTER+55);
	@ErrorText(text="%.*s Mailbox")
	short ERR_ROUTER_MBOX_TITLE = (PKG_ROUTER+56);
	@ErrorText(text="Router: Unable to retrieve mail filters from database %s; %e")
	short ERR_ROUTER_PROFILE_OPEN_ERROR = (PKG_ROUTER+57);
	@ErrorText(text="You are not authorized to do message tracking")
	short ERR_ROUTER_MSGTRACK_AUTHENTICATION = (PKG_ROUTER+58);
	@ErrorText(text="You are not authorized to track message subjects.")
	short ERR_ROUTER_MSGTRACK_SUBJECT = (PKG_ROUTER+59);
	@ErrorText(text="Delivery to mail file in progress by another thread, try again later")
	short ERR_ROUTER_FILE_IN_USE = (PKG_ROUTER+60);
	@ErrorText(text="Creating new mailbox file %p")
	short ERR_ROUTER_MBOX_CREATE = (PKG_ROUTER+61);
	@ErrorText(text="Unable to open mailbox file %p")
	short ERR_ROUTER_MBOX_OPEN = (PKG_ROUTER+62);
	@ErrorText(text="No route found to domain %s.  Check DNS configuration.")
	short ERR_ROUTER_NOROUTETOIDOMAIN = (PKG_ROUTER+63);
	@ErrorText(text="Successfully registered %d system filters.")
	short ERR_ROUTER_FILTERS_UPDATED = (PKG_ROUTER+64);
	@ErrorText(text="Error registering system filters: %e.")
	short ERR_ROUTER_FILTERS_ERROR = (PKG_ROUTER+65);
	@ErrorText(text="Not authorized to send mail to this user or group")
	short ERR_SENDER_NOT_AUTHORIZED_TO_MAIL_TO_USER = (PKG_ROUTER+68);
	@ErrorText(text="SMTP Protocol Returned a Permanent Error")
	short ERR_HOOK_SMTP_ERROR = (PKG_ROUTER+69);
	@ErrorText(text="SMTP Protocol Returned a Transient Error")
	short ERR_HOOK_SMTP_TRANSIENT = (PKG_ROUTER+70);
	@ErrorText(text="Router: Maximum number user mail rules exceeded for %a. Only the first %d enabled rules will be executed. %d not registered.")
	short ERR_ROUTER_MAX_USER_FILTERS = (PKG_ROUTER+71);
	@ErrorText(text="Maximum number of system mail rules exceeded. Only the first %d enabled rules will be executed. %d not registered.")
	short ERR_ROUTER_MAX_SYSTEM_FILTERS = (PKG_ROUTER+72);
	@ErrorText(text="Error registering mail rule %d for database %s")
	short ERR_ROUTER_RULE_REGISTER_ERROR = (PKG_ROUTER+73);
	@ErrorText(text="Group expansion results exceed maximum size")
	short ERR_ROUTER_TOO_MANY_EXPANDED = (PKG_ROUTER+74);
	@ErrorText(text="Block sender rule exceeds maximum size set by administrator.")
	short ERR_ROUTER_MAX_BLOCK_RULE_SIZE = (PKG_ROUTER+75);
	@ErrorText(text="Router: Unable to dispatch message. Effective size, number of recipients times message size, %ld exceeds %ld KBytes")
	short ERR_ROUTER_EFFECTIVE_SIZE_TOO_BIG = (PKG_ROUTER+76);
	@ErrorText(text="Router: Recipient's mail file size exceeds the maximum size allowed for mail delivery.")
	short ERR_ROUTER_MAX_DELIVERY_DB_SIZE = (PKG_ROUTER+77);
	@ErrorText(text="Insufficient memory - Router pool is full.")
	short ERR_ROUTERPOOL_FULL = (PKG_ROUTER+78);
	@ErrorText(text="Router: Database disk quota exceeded")
	short ERR_ROUTER2_OVERDISKQUOTA = (PKG_ROUTER2+1);
	@ErrorText(text="Router: Warning: database disk quota exceeded")
	short ERR_ROUTER2_TEMP_OVERDISKQUOTA = (PKG_ROUTER2+2);
	@ErrorText(text="Router: Failed to connect to SMTP host %a because %s")
	short ERR_ROUTER2_CONNECT_FAILED = (PKG_ROUTER2+3);
	@ErrorText(text="Your message was successfully relayed by %s at %s to the remote mail system %s that does not support confirmation of delivery.")
	short ERR_ROUTER2_SMTPRELAY = (PKG_ROUTER2+4);
	@ErrorText(text="Router: Unable to dispatch message. Size exceeds %ld KBytes")
	short ERR_ROUTER2_MESSAGE_SIZE_TOO_BIG = (PKG_ROUTER2+5);
	@ErrorText(text="Router: %s is restricted from sending mail through server %a")
	short ERR_ROUTER2_SENDING_RESTRICTION = (PKG_ROUTER2+6);
	@ErrorText(text="No route found to domain %s from server %a.  Check DNS configuration.")
	short ERR_ROUTER2_NOROUTETODOMAINDNS = (PKG_ROUTER2+7);
	@ErrorText(text="Router: Message transfer for %d recipients has been delayed until low priority time range %z - %z")
	short ERR_ROUTER2_LOW_PRIORITY_DELAY = (PKG_ROUTER2+8);
	@ErrorText(text="Message rejected for policy reasons")
	short ERR_ROUTER2_ACTION_NDR_MSG = (PKG_ROUTER2+9);
	@ErrorText(text="Your message was successfully relayed by %s at %s to the remote mail system %s. Outbound support for confirmations is not configured.")
	short ERR_ROUTER2_SMTPRELAY_OUTBOUND = (PKG_ROUTER2+10);
	@ErrorText(text="Router: Administrator has specified that Anonymous mail cannot be routed.")
	short ERR_ROUTER2_ANONYMOUS_RESTRICTION = (PKG_ROUTER2+11);
	@ErrorText(text="Router: Unable to open out of office profile in database %p: %e")
	short ERR_ROUTER_OOOPROFILE_OPEN_ERROR = (PKG_ROUTER2+12);
	@ErrorText(text="Router: Error disabling out of office service in database %p: %e")
	short ERR_ROUTER_OOO_DISABLE_ERROR = (PKG_ROUTER2+13);
	@ErrorText(text="Router: Error initializing out of office service in database %p: %e")
	short ERR_ROUTER_OOO_INITCACHE_ERROR = (PKG_ROUTER2+14);
	@ErrorText(text="Router: Error generating out of office notification from %a to %a: %e")
	short ERR_ROUTER_OOO_NOTIFY_ERROR = (PKG_ROUTER2+15)	;
	@ErrorText(text="Router: Error generating out of office report in '%s'")
	short ERR_ROUTER_OOO_REPORT_ERROR = (PKG_ROUTER2+16);
	@ErrorText(text="Router: Error processing out of office responder for %a, failed to add %a to the list of notified people: %e")
	short ERR_ROUTER_OOO_NOTIFYLIST_ERROR = (PKG_ROUTER2+17);
	@ErrorText(text="Router: Failed to open icon note for  %s")
	short ERR_ROUTER_OOO_ICONNOTE_ERROR = (PKG_ROUTER2+18);
	@ErrorText(text="Router: Error updating out of office profile document for  %a")
	short ERR_ROUTER_OOO_PROFILEUPDATE_ERROR = (PKG_ROUTER2+19);
	@ErrorText(text="Router: Error executing out of office failover agent (%s) in  %a")
	short ERR_ROUTER_OOO_FAILOVERAGENT_ERROR = (PKG_ROUTER2+20);
	@ErrorText(text="Router: Error during daily maintenance check for out of office service in '%p': %e")
	short ERR_ROUTER_OOO_DAILYREPORT_ERROR = (PKG_ROUTER2+21);
	@ErrorText(text="Your message has been delayed due to a temporary network, server, or mail file unavailability. Delivery of your message will be attempted again.")
	short ERR_ROUTER2_DELIVERY_DELAY = (PKG_ROUTER2+22);
	@ErrorText(text="Router: Out of office service for %a will be disabled on the home mail server %a.")
	short ERR_ROUTER_OOO_NONHOME_SERVER = (PKG_ROUTER2+23);
	@ErrorText(text="Router: Error processing out of office responder for %a, failed processing in memory list %a : %e")
	short ERR_ROUTER_OOO_CACHEDLIST_ERROR = (PKG_ROUTER2+24);
	@ErrorText(text="Router: SMTP Authentication disabled.  No relay host specified in server config doc.")
	short ERR_ROUTER_SMTP_AUTH_NO_RELAY_SPEC = (PKG_ROUTER2+25);
	@ErrorText(text="Router: Failed to SMIME Encrypt message on delivery to journalling database on behalf of %s")
	short ERR_ROUTER_JOURNAL_SMIME_ENC_FAILURE = (PKG_ROUTER2+26);
	@ErrorText(text="Router: Failed to SMIME Encrypt message on delivery to recipient %s")
	short ERR_ROUTER_RECIP_SMIME_ENC_FAILURE = (PKG_ROUTER2+27);
	@ErrorText(text="Router: SMIME Encryption key not available for recipient")
	short ERR_ROUTER_RECIP_SMIME_KEY_NA = (PKG_ROUTER2+28);
	@ErrorText(text="Router: Error disabling out of office service for %s. Failed to reset database options.")
	short ERR_ROUTER_OOO_DISABLE_FAILED = (PKG_ROUTER2+29);
	@ErrorText(text="Router: Delivered message already processed by Out of office service. Message to '%s' from '%s', subject '%s', noteid '%s' ")
	short ERR_ROUTER_OOO_DEBUG_OOS = (PKG_ROUTER2+30);
	@ErrorText(text="Router: Mailbox is not available")
	short ERR_MBOX_NOT_AVAILABLE = (PKG_ROUTER2+31);
	@ErrorText(text="Router: Can't request a specific mailbox because DBGroups is not enabled.")
	short ERR_MBOX_DBGS_NOT_ENABLED = (PKG_ROUTER2+32);
	@ErrorText(text="OOOAPI: Manditory parameter is not set")
	short ERR_OOO_MISSING_PARAM = (PKG_ROUTER2+33);
	@ErrorText(text="OOOAPI: Insufficient access to turn on Out of office.  Minimum of Editor level access is required.")
	short ERR_OOO_NOACCESS = (PKG_ROUTER2+34);
	@ErrorText(text="OOOAPI: Failed to obtain information about home mail server")
	short ERR_OOO_MAILINFO_FAIL = (PKG_ROUTER2+35);
	@ErrorText(text="OOOAPI: Duplicate name found in Domino Directory ")
	short ERR_OOO_DUPLICATE_NAME = (PKG_ROUTER2+36);
	@ErrorText(text="OOOAPI: Unable to open user's mail file")
	short ERR_OOO_MISSING_MAILFILE = (PKG_ROUTER2+37);
	@ErrorText(text="OOOAPI: Unable to open out of office profile in database %p: %e")
	short ERR_ROUTER_OOO_PROFILE_ERROR = (PKG_ROUTER2+38);
	@ErrorText(text="OOOAPI: Invalid time parameter")
	short ERR_OOO_INVALID_TIMEPARM = (PKG_ROUTER2+39);
	@ErrorText(text="OOOAPI: Invalid Initialization. Most likely OOOInit was not called")
	short ERR_OOO_MISSING_INIT = (PKG_ROUTER2+40);
	@ErrorText(text="OOOAPI: Body of the message is too large")
	short ERR_OOO_MSGTOOLARGE = (PKG_ROUTER2+41);
	@ErrorText(text="OOOAPI: Namelookup for user '%s' on server '%s' failed")
	short ERR_OOO_NAMELOOKUP = (PKG_ROUTER2+42);
	@ErrorText(text="OOOAPI: Extended directory '%a' on server '%a' does not have attributes 'MailServer' and 'MailFile'. This information is required for enabling Out of Office")
	short ERR_OOO_NAMELOOKUPATTR = (PKG_ROUTER2+43);

}
