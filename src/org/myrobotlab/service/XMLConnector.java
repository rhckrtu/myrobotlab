package org.myrobotlab.service;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.myrobotlab.document.connector.AbstractConnector;
import org.myrobotlab.document.connector.ConnectorState;
import org.myrobotlab.document.xml.MRLChunkingXMLHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
/**
 * 
 * XMLConnector - This will parse a large xml file into 
 * many sub documents based on the XMLRoot path.
 * All of the xml under that path will be created as a document
 * that can be published to the doc pipeline, or other DocumentListener.
 */
public class XMLConnector extends AbstractConnector {

	private static final long serialVersionUID = 1L;

	private String filename = "D:\\data\\wikipedia\\enwiki-20160113-pages-articles-multistream.xml";
	private String xmlRootPath = "/page";
	private String xmlIDPath = "/page/id";
	private String docIDPrefix = "doc_";
	// TODO: wire in so we can interrupt and stop the crawler.
	// private boolean interrupted = false;
	
	public XMLConnector(String name) {
		super(name);
	}

	// from oracle java sax example.
	// https://docs.oracle.com/javase/tutorial/jaxp/sax/parsing.html
	// TODO: remove this method!
    private static String convertToFileURL(String filename) {
        String path = new File(filename).getAbsolutePath();
        if (File.separatorChar != '/') {
            path = path.replace(File.separatorChar, '/');
        }

        if (!path.startsWith("/")) {
            path = "/" + path;
        }
        return "file:" + path;
    }
	
	@Override
	public void startCrawling() {
		// avoid buffer overruns on the outbox.. connectors shouldn't drop messages. (or run out of memory)
		this.outbox.setBlocking(true);
		state = ConnectorState.RUNNING;
		SAXParserFactory spf = SAXParserFactory.newInstance();
	    //spf.setNamespaceAware(false);  ?  Expose this?
	    spf.setNamespaceAware(true);
	    SAXParser saxParser = null;
	    try {
			saxParser = spf.newSAXParser();
		} catch (ParserConfigurationException | SAXException e) {
			// TODO Auto-generated catch block
			log.warn("SAX Parser Error {}", e);
		}
		
	    try {
		    XMLReader xmlReader = saxParser.getXMLReader();
		    MRLChunkingXMLHandler xmlHandler = new MRLChunkingXMLHandler();
		    xmlHandler.setConnector(this);
		    xmlHandler.setDocumentRootPath(xmlRootPath);
		    xmlHandler.setDocumentIDPath(xmlIDPath);
		    xmlHandler.setDocIDPrefix(docIDPrefix);
		    xmlReader.setContentHandler(xmlHandler);
			xmlReader.parse(convertToFileURL(filename));
		} catch (IOException | SAXException e) {
			// TODO Auto-generated catch block
			log.warn("SAX Parser Error {}", e);
		}
	    state = ConnectorState.STOPPED;
	    
	}

	@Override
	public void stopCrawling() {
		// Stop crawling! (maybe flush?)
		//interrupted = true;

	}

	@Override
	public String getDescription() {
		return "This is an XML Connector that will parse a large xml file into many small xml documents.";
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getXmlRootPath() {
		return xmlRootPath;
	}

	public void setXmlRootPath(String xmlRootPath) {
		this.xmlRootPath = xmlRootPath;
	}

	public String getXmlIDPath() {
		return xmlIDPath;
	}

	public void setXmlIDPath(String xmlIDPath) {
		this.xmlIDPath = xmlIDPath;
	}

	public String getDocIDPrefix() {
		return docIDPrefix;
	}

	public void setDocIDPrefix(String docIDPrefix) {
		this.docIDPrefix = docIDPrefix;
	}

}
