package Login;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetUserFile {

    private static final String info_address = "src/main/resources/Login_info.xml";

    private static List<User> userList = new ArrayList<>();
    private static GetUserFile instance;

    public static GetUserFile getInstance()
    {
        if (instance == null)
            instance = new GetUserFile();
        return instance;
    }

    GetUserFile()
    {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // parse XML file
        DocumentBuilder db = null;
        try {
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File(info_address));
            doc.getDocumentElement().normalize();
            NodeList list = doc.getElementsByTagName("crendential");
            for(int i = 0; i<list.getLength();i++) {
                Node node = list.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String username = element.getElementsByTagName("username").item(0).getTextContent();
                    String pw = element.getElementsByTagName("password").item(0).getTextContent();
                    userList.add(new User(username,pw));
                }
            }
        } catch (ParserConfigurationException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (SAXException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static List<User> getUserList() {
        return userList;
    }
}
