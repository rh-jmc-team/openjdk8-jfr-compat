package jdk.jfr.internal.jfc;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import jdk.internal.org.xml.sax.InputSource;
import jdk.internal.org.xml.sax.SAXException;
import jdk.internal.util.xml.SAXParser;
import jdk.internal.util.xml.impl.SAXParserImpl;
import jdk.jfr.Configuration;

import jdk.jfr.internal.PrivateAccess;

final class JFCParser {
	
    static final String FILE_EXTENSION = ".jfc";

    public static Configuration createConfiguration(String name, Reader reader) throws IOException, ParseException {
        return null;
    }

    public static Configuration createConfiguration(String name, String content) throws IOException, ParseException {
    	return null;
    }

}
