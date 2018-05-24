package main;

public class GetJson {
	
	public static String strJson_2 = "{\r\n" +
			"    \"name\":\"John\",\r\n" +
			"    \"age\":30,\r\n" +
			"    \"cars\": {\r\n" +
			"        \"car1\":\"Ford\",\r\n" +
			"        \"car2\":\"BMW\",\r\n" +
			"        \"car3\":\"Fiat\"\r\n" +
			"    }\r\n" +
			" }";

	public static String strJson_1 = "{\n" +
            "\t\"problems\": [{\n" +
            "\t\t\"Diabetes\": [{\n" +
            "\t\t\t\"medications\": [{\n" +
            "\t\t\t\t\"medicationsClasses\": [{\n" +
            "\t\t\t\t\t\"className\": [{\n" +
            "\t\t\t\t\t\t\"associatedDrug\": [{\n" +
            "\t\t\t\t\t\t\t\"name\": \"asprin\",\n" +
            "\t\t\t\t\t\t\t\"dose\": \"\",\n" +
            "\t\t\t\t\t\t\t\"strength\": \"500 mg\"\n" +
            "\t\t\t\t\t\t}],\n" +
            "\t\t\t\t\t\t\"associatedDrug#2\": [{\n" +
            "\t\t\t\t\t\t\t\"name\": \"somethingElse\",\n" +
            "\t\t\t\t\t\t\t\"dose\": \"\",\n" +
            "\t\t\t\t\t\t\t\"strength\": \"500 mg\"\n" +
            "\t\t\t\t\t\t}]\n" +
            "\t\t\t\t\t}],\n" +
            "\t\t\t\t\t\"className2\": [{\n" +
            "\t\t\t\t\t\t\"associatedDrug\": [{\n" +
            "\t\t\t\t\t\t\t\"name\": \"asprin\",\n" +
            "\t\t\t\t\t\t\t\"dose\": \"\",\n" +
            "\t\t\t\t\t\t\t\"strength\": \"500 mg\"\n" +
            "\t\t\t\t\t\t}],\n" +
            "\t\t\t\t\t\t\"associatedDrug#2\": [{\n" +
            "\t\t\t\t\t\t\t\"name\": \"somethingElse\",\n" +
            "\t\t\t\t\t\t\t\"dose\": \"\",\n" +
            "\t\t\t\t\t\t\t\"strength\": \"500 mg\"\n" +
            "\t\t\t\t\t\t}]\n" +
            "\t\t\t\t\t}]\n" +
            "\t\t\t\t}]\n" +
            "\t\t\t}],\n" +
            "\t\t\t\"labs\": [{\n" +
            "\t\t\t\t\"missing_field\": \"missing_value\"\n" +
            "\t\t\t}]\n" +
            "\t\t}],\n" +
            "\t\t\"Asthma\": [{}]\n" +
            "\t}]\n" +
            "}";
}
