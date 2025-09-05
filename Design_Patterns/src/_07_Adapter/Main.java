package _07_Adapter;



public class Main {

	public static void main(String[] args) {
		XMLData xmlData = new XMLDSoftware();
		
		JSONData jsonData = new XML_to_JSON_Adapter(xmlData);
		jsonData.readJSONData();

	}

}
