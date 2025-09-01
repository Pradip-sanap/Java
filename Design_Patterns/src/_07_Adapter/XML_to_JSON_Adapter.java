package _07_Adapter;

public class XML_to_JSON_Adapter implements JSONData {

	XMLData xmlObj;

	public XML_to_JSON_Adapter(XMLData xmlObj) {
		super();
		this.xmlObj = xmlObj;
	}

	@Override
	public void readJSONData() {
		xmlObj.readXMLData();
		System.out.println("Convert XML to JSON successfully.");

	}

}
