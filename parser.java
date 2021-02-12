package parser.java;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.Scanner;

public class parser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder(); 
		Document document = builder.parse(new File( "/home/ubuntu/WT/experiment3/WebContent/user.xml" ));
		Element root = document.getDocumentElement();
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter id ");
		String id = sc.nextLine();
		System.out.println(root.getNodeName());
		NodeList nList = document.getElementsByTagName("user");
		System.out.println("============================");
		 
		for (int temp = 0; temp < nList.getLength(); temp++)
		{
		 Node node = nList.item(temp);
		 System.out.println("");    //Just a separator
		 if (node.getNodeType() == Node.ELEMENT_NODE)
		 {
		    //Print each employee's detail
		    Element eElement = (Element) node;
		    if(eElement.getAttribute("id").contentEquals(id)) {
		    System.out.println("user id : "    + eElement.getAttribute("id"));
		    System.out.println("name : "  + eElement.getElementsByTagName("name").item(0).getTextContent());
		    System.out.println("email : "   + eElement.getElementsByTagName("email").item(0).getTextContent());
		    System.out.println("mobile number : "    + eElement.getElementsByTagName("mobileNumber").item(0).getTextContent());
		 }}
		    
		}
	
	
	
	}
	
	

}


