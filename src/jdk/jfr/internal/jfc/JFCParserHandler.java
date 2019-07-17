package jdk.jfr.internal.jfc;
import java.util.LinkedHashMap;
import java.util.Map;

import jdk.internal.org.xml.sax.Attributes;
import jdk.internal.org.xml.sax.SAXException;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;

final class JFCParserHandler extends DefaultHandler {

	final Map<String, String> settings = new LinkedHashMap<String, String>();
    String label;
    String provider;
    String description;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
    }

    public Map<String, String> getSettings() {
        return null;
    }
}
