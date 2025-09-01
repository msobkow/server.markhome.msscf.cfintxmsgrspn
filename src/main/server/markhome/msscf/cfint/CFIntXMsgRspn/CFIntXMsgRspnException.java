
// Description: Java 11 XML Message SAX Response Record Element  for Exception

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
 *	CFIntXMsgRspnException XML SAX Element  implementation
 */
public class CFIntXMsgRspnException
	extends CFLibXmlCoreElementHandler
{
	public CFIntXMsgRspnException( CFIntXMsgRspn xmsgRspn ) {
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
			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";
			// Element attributes
			String	attrName = null;
			String	attrMessage = null;

			assert qName.equals( "RspnException" );

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
				else if( attrLocalName.equals( "schemaLocation" ) ) {
					// ignored
				}
				else if( attrLocalName.equals( "Name" ) ) {
					if( attrName != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Message" ) ) {
					if( attrMessage != null ) {
						throw new CFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrMessage = attrs.getValue( idxAttr );
				}
				else {
					throw new CFLibUnrecognizedAttributeException( getClass(),
						S_ProcName,
						getParser().getLocationInfo(),
						attrLocalName );
				}
			}

			// Ensure that required attributes have values
			if( ( attrName == null ) || ( attrName.length() <= 0 ) ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Name" );
			}
			if( attrMessage == null ) {
				attrMessage = "";
			}
			// Save named attributes to context
			CFLibXmlCoreContext curContext = getParser().getCurContext();

			// Convert string attributes to native Java types
			String	natName = attrName;
			String	natMessage = attrMessage;
			RuntimeException raisedException;
			final String S_CFLibPrefix = "org.msscf.msscf.cflib.CFLib.";
			final int S_CFLibPrefixLen = S_CFLibPrefix.length();
			if( natName.startsWith( S_CFLibPrefix ) ) {
				natName = natName.substring( S_CFLibPrefixLen );
			}
			if( natName.equals( "CFLibRuntimeException" ) ) {
				raisedException = new CFLibRuntimeException( natMessage );
			}
			else if( natName.equals( "CFLibUsageException" ) ) {
				raisedException = new CFLibUsageException( natMessage );
			}
			else if( natName.equals( "CFLibEmptyArgumentException" ) ) {
				raisedException = new CFLibEmptyArgumentException( natMessage );
			}
			else if( natName.equals( "CFLibNullArgumentException" ) ) {
				raisedException = new CFLibNullArgumentException( natMessage );
			}
			else if( natName.equals( "CFLibInvalidArgumentException" ) ) {
				raisedException = new CFLibInvalidArgumentException( natMessage );
			}
			else if( natName.equals( "CFLibArgumentRangeException" ) ) {
				raisedException = new CFLibArgumentRangeException( natMessage );
			}
			else if( natName.equals( "CFLibMustOverrideException" ) ) {
				raisedException = new CFLibMustOverrideException( natMessage );
			}
			else if( natName.equals( "CFLibNotImplementedYetException" ) ) {
				raisedException = new CFLibNotImplementedYetException( natMessage );
			}
			else if( natName.equals( "CFLibNotSupportedException" ) ) {
				raisedException = new CFLibNotSupportedException( natMessage );
			}
			else if( natName.equals( "CFLibPrimaryKeyNotNewException" ) ) {
				raisedException = new CFLibPrimaryKeyNotNewException( natMessage );
			}
			else if( natName.equals( "CFLibDependentsDetectedException" ) ) {
				raisedException = new CFLibDependentsDetectedException( natMessage );
			}
			else if( natName.equals( "CFLibUnresolvedRelationException" ) ) {
				raisedException = new CFLibUnresolvedRelationException( natMessage );
			}
			else if( natName.equals( "CFLibStaleCacheDetectedException" ) ) {
				raisedException = new CFLibStaleCacheDetectedException( natMessage );
			}
			else if( natName.equals( "CFLibUniqueIndexViolationException" ) ) {
				raisedException = new CFLibUniqueIndexViolationException( natMessage );
			}
			else if( natName.equals( "CFLibCollisionDetectedException" ) ) {
				raisedException = new CFLibCollisionDetectedException( natMessage );
			}
			else if( natName.equals( "CFLibUnsupportedClassException" ) ) {
				raisedException = new CFLibUnsupportedClassException( natMessage );
			}
			else if( natName.equals( "CFLibDbException" ) ) {
				raisedException = new CFLibDbException( natMessage );
			}
			else if( natName.equals( "CFLibArgumentOverflowException" ) ) {
				raisedException = new CFLibArgumentOverflowException( natMessage );
			}
			else if( natName.equals( "CFLibArgumentUnderflowException" ) ) {
				raisedException = new CFLibArgumentUnderflowException( natMessage );
			}
			else if( natName.equals( "CFLibUnrecognizedAttributeException" ) ) {
				raisedException = new CFLibUnrecognizedAttributeException( natMessage );
			}
			else {
				raisedException = new CFLibRuntimeException( natName + " " + natMessage );
			}
			// Retain the raised exception for access by the parse invoker
			xmsgRspn.setExceptionRaised( raisedException );
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
