package otherTopics.IQ_td;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


//Implement a function folderNames, which accepts a string containing an XML file that specifies folder structure and returns all
//folder names that start with startingLetter. The XML format is given in the example below.
//For example, for the letter 'u' and an XML file:

public class Folders {

    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xml));
        //is.setCharacterStream(new StringReader(xml));

        Document doc = db.parse(is);

        doc.getDocumentElement().normalize();

        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

        NodeList nodes = doc.getElementsByTagName("folder");

        List<String> result = new ArrayList<>();

        System.out.println(nodes.getLength());
        System.out.println("----");
        // iterate the employees
        for (int i = 0; i < nodes.getLength(); i++) {
            Element element = (Element) nodes.item(i);

            //NodeList name = element.getElementsByTagName("folder");
            //Element line = (Element) name.item(0);
            System.out.println("Name: " + element.getAttribute("name").startsWith(String.valueOf(startingLetter)));

            if (element.getAttribute("name").startsWith(String.valueOf(startingLetter))){
                result.add(element.getAttribute("name"));
            }
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"users\" />" +
                        "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}
