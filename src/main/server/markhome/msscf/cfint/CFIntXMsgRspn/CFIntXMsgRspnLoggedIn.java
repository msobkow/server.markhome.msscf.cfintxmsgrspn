
// Description: Java 11 XML Message SAX Response Record Element 

/*
 *	server.markhome.msscf.CFInt
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfint.CFIntXMsgRspn;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.xml.sax.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;

/*
 *	CFIntXMsgRspnLoggedIn XML SAX Element  implementation
 */
public class CFIntXMsgRspnLoggedIn
	extends CFLibXmlCoreElementHandler
{
	public CFIntXMsgRspnLoggedIn( CFIntXMsgRspn xmsgRspn ) {
		super( xmsgRspn );
	}

	public void startElement(
		String		uri,
		String		localName,
		String		qName,
		Attributes	attrs )
	throws SAXException
	{
		try {
			// Common XML Attributes
			String	attrId = null;
			// Response Attributes
			String	attrClusterId = null;
			String	attrClusterName = null;
			String	attrTenantId = null;
			String	attrTenantName = null;
			String	attrSecUserId = null;
			String	attrSecUserName = null;
			String	attrSecSessionId = null;
			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";

			assert qName.equals( "RspnLoggedIn" );

			CFIntXMsgRspn xmsgRspn = (CFIntXMsgRspn)getParser();
			if( xmsgRspn == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser()" );
			}

			ICFIntSchemaObj schemaObj = xmsgRspn.getSchemaObj();
			if( schemaObj == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser().getSchemaObj()" );
			}

			// Extract Attributes
			numAttrs = attrs.getLength();
			for( idxAttr = 0; idxAttr < numAttrs; idxAttr++ ) {
				attrLocalName = attrs.getLocalName( idxAttr );
				if( attrLocalName.equals( "Id" ) ) {
					if( attrId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ClusterId" ) ) {
					if( attrClusterId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrClusterId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ClusterName" ) ) {
					if( attrClusterName != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrClusterName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "TenantId" ) ) {
					if( attrTenantId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrTenantId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "TenantName" ) ) {
					if( attrTenantName != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrTenantName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "SecUserId" ) ) {
					if( attrSecUserId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSecUserId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "SecUserName" ) ) {
					if( attrSecUserName != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSecUserName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "SecSessionId" ) ) {
					if( attrSecSessionId != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSecSessionId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "schemaLocation" ) ) {
					// ignored
				}
				else {
					throw new CFLibUnrecognizedAttributeException( getClass(),
						S_ProcName,
						getParser().getLocationInfo(),
						attrLocalName );
				}
			}

			// Ensure that required attributes have values
			if( ( attrClusterId == null ) || ( attrClusterId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"ClusterId" );
			}
			if( ( attrClusterName == null ) || ( attrClusterName.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"ClusterName" );
			}
			if( ( attrTenantId == null ) || ( attrTenantId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"TenantId" );
			}
			if( ( attrTenantName == null ) || ( attrTenantName.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"TenantName" );
			}
			if( ( attrSecUserId == null ) || ( attrSecUserId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"SecUserId" );
			}
			if( ( attrSecUserName == null ) || ( attrSecUserName.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"SecUserName" );
			}
			if( ( attrSecSessionId == null ) || ( attrSecSessionId.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"SecSessionId" );
			}
			// Convert string attributes to native Java types
			long natClusterId = Long.parseLong( attrClusterId );
			if( natClusterId <= 0L ) {
				throw new CFLibRuntimeException( getClass(),
					S_ProcName,
					"Could not convert string to long for ClusterId \"" + attrClusterId + "\"" );
			}
			long natTenantId = Long.parseLong( attrTenantId );
			if( natTenantId <= 0L ) {
				throw new CFLibRuntimeException( getClass(),
					S_ProcName,
					"Could not convert string to long for TenantId \"" + attrTenantId + "\"" );
			}
			UUID natSecUserId = UUID.fromString( attrSecUserId );
			if( natSecUserId == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"conversionOfSecUserIdToUUID" );
			}
			UUID natSecSessionId = UUID.fromString( attrSecSessionId );
			if( natSecSessionId == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"conversionOfSecSessionIdToUUID" );
			}
			// Finish the authorization
			CFSecAuthorization auth = new CFSecAuthorization();
			auth.setSecClusterId( natClusterId );
			auth.setSecTenantId( natTenantId );
			auth.setSecUserId( natSecUserId );
			auth.setSecSessionId( natSecSessionId );
			schemaObj.setAuthorization( auth );
			schemaObj.setSecClusterName( attrClusterName );
			schemaObj.setSecTenantName( attrTenantName );
			schemaObj.setSecUserName( attrSecUserName );
			schemaObj.setSecSessionId( natSecSessionId );
		}
		catch( RuntimeException e ) {
			throw new RuntimeException( "Near " + getParser().getLocationInfo() + ": Caught and rethrew " + e.getClass().getName() + " - " + e.getMessage(),
				e );
		}
		catch( Error e ) {
			throw new Error( "Near " + getParser().getLocationInfo() + ": Caught and rethrew " + e.getClass().getName() + " - " + e.getMessage(),
				e );
		}
	}

	public void endElement(
		String		uri,
		String		localName,
		String		qName )
	throws SAXException
	{
	}
}
