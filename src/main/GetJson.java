package main;

public class GetJson {
	
	public static String strJson_4 = "{\"menu\": {\r\n" +
			"  \"id\": \"file\",\r\n" +
			"  \"value\": \"File\",\r\n" +
			"  \"popup\": {\r\n" +
			"    \"menuitem\": [\r\n" +
			"      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n" +
			"      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n" +
			"      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n" +
			"    ]\r\n" +
			"  }\r\n" +
			"}}";
	
	public static String strJson_3 = "{\"menu\": {\r\n" +
			"    \"header\": \"SVG Viewer\",\r\n" +
			"    \"items\": [\r\n" +
			"        {\"id\": \"Open\"},\r\n" +
			"        {\"id\": \"OpenNew\", \"label\": \"Open New\"},\r\n" +
			"        null,\r\n" +
			"        {\"id\": \"ZoomIn\", \"label\": \"Zoom In\"},\r\n" +
			"        {\"id\": \"ZoomOut\", \"label\": \"Zoom Out\"},\r\n" +
			"        {\"id\": \"OriginalView\", \"label\": \"Original View\"},\r\n" +
			"        null,\r\n" +
			"        {\"id\": \"Quality\"},\r\n" +
			"        {\"id\": \"Pause\"},\r\n" +
			"        {\"id\": \"Mute\"},\r\n" +
			"        null,\r\n" +
			"        {\"id\": \"Find\", \"label\": \"Find...\"},\r\n" +
			"        {\"id\": \"FindAgain\", \"label\": \"Find Again\"},\r\n" +
			"        {\"id\": \"Copy\"},\r\n" +
			"        {\"id\": \"CopyAgain\", \"label\": \"Copy Again\"},\r\n" +
			"        {\"id\": \"CopySVG\", \"label\": \"Copy SVG\"},\r\n" +
			"        {\"id\": \"ViewSVG\", \"label\": \"View SVG\"},\r\n" +
			"        {\"id\": \"ViewSource\", \"label\": \"View Source\"},\r\n" +
			"        {\"id\": \"SaveAs\", \"label\": \"Save As\"},\r\n" +
			"        null,\r\n" +
			"        {\"id\": \"Help\"},\r\n" +
			"        {\"id\": \"About\", \"label\": \"About Adobe CVG Viewer...\"}\r\n" +
			"    ]\r\n" +
			"}}";
	
	public static String strJson_2 = "{\r\n" +
			"    \"name\":\"John\",\r\n" +
			"    \"age\":30,\r\n" +
			"    \"cars\": {\r\n" +
			"        \"car1\":\"Ford\",\r\n" +
			"        \"car2\":\"BMW\",\r\n" +
			"        \"car3\":\"Fiat\"\r\n" +
			"    },\r\n" +
			"    \"No\": [\"1\",\"2\",\"3\"]\r\n" +
			" }";

	public static String strJson_1 = "{\r\n" +
			"\t\"problems\": [{\r\n" +
			"\t\t\"Diabetes\": [{\r\n" +
			"\t\t\t\"medications\": [{\r\n" +
			"\t\t\t\t\"medicationsClasses\": [{\r\n" +
			"\t\t\t\t\t\"className\": [{\r\n" +
			"\t\t\t\t\t\t\"associatedDrug\": [{\r\n" +
			"\t\t\t\t\t\t\t\"name\": \"asprin\",\r\n" +
			"\t\t\t\t\t\t\t\"dose\": \"\",\r\n" +
			"\t\t\t\t\t\t\t\"strength\": \"500 mg\"\r\n" +
			"\t\t\t\t\t\t}],\r\n" +
			"\t\t\t\t\t\t\"associatedDrug#2\": [{\r\n" +
			"\t\t\t\t\t\t\t\"name\": \"somethingElse\",\r\n" +
			"\t\t\t\t\t\t\t\"dose\": \"\",\r\n" +
			"\t\t\t\t\t\t\t\"strength\": \"500 mg\"\r\n" +
			"\t\t\t\t\t\t}]\r\n" +
			"\t\t\t\t\t}],\r\n" +
			"\t\t\t\t\t\"className2\": [{\r\n" +
			"\t\t\t\t\t\t\"associatedDrug\": [{\r\n" +
			"\t\t\t\t\t\t\t\"name\": \"asprin\",\r\n" +
			"\t\t\t\t\t\t\t\"dose\": \"\",\r\n" +
			"\t\t\t\t\t\t\t\"strength\": \"500 mg\"\r\n" +
			"\t\t\t\t\t\t}],\r\n" +
			"\t\t\t\t\t\t\"associatedDrug#2\": [{\r\n" +
			"\t\t\t\t\t\t\t\"name\": \"somethingElse\",\r\n" +
			"\t\t\t\t\t\t\t\"dose\": \"\",\r\n" +
			"\t\t\t\t\t\t\t\"strength\": \"500 mg\"\r\n" +
			"\t\t\t\t\t\t}]\r\n" +
			"\t\t\t\t\t}]\r\n" +
			"\t\t\t\t}]\r\n" +
			"\t\t\t}],\r\n" +
			"\t\t\t\"labs\": [{\r\n" +
			"\t\t\t\t\"missing_field\": \"missing_value\"\r\n" +
			"\t\t\t}]\r\n" +
			"\t\t}],\r\n" +
			"\t\t\"Asthma\": [{}]\r\n" +
			"\t}]\r\n" +
			"}";
}
