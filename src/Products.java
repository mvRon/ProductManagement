
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
public class Products {
	
	public int productId;
	private String productName;
	private String dateReceive;
	private double productPrice;

	String filePath = "products.json";
	JSONArray arrObj = new JSONArray();
	Scanner scanner = new Scanner(System.in);
	
	
	public Products(int productId, String productName, String dateReceive, double productPrice){
		this.productId = productId;
		this.productName = productName;
		this.dateReceive = dateReceive;
		this.productPrice = productPrice;
		
	}
	
	public Products() {
		
	}

	public void loadFile(){
		FileWriter writer;
		try {
			writer = new FileWriter(filePath);
			writer.write(arrObj.toJSONString());
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void InputProduct() {
		try{
			FileReader reader = new FileReader(filePath);
			JSONObject obj = new JSONObject();
			JSONParser par = new JSONParser();
			arrObj = (JSONArray) par.parse(reader);
			Scanner scanner = new Scanner(System.in);

			System.out.print("Input Product ID: ");
			this.productId = scanner.nextInt();
			obj.put("id_product", this.productId);

			System.out.print("Input Product Name: ");
			this.productName = scanner.next();
			obj.put("productName", this.productName);

			System.out.print("Input Product date Received: ");
			this.dateReceive = scanner.next();
			obj.put("timeReceived", this.dateReceive);

			System.out.print("Input Product Price: ");
			this.productPrice = scanner.nextDouble();
			obj.put("productPrice", this.productPrice);
			arrObj.add(obj);

			loadFile();
			System.out.println("Completedly!");
			
			// System.out.println(stringUpdate);

		}catch(Exception e){

		}
	}
	
	public void OutputProduct() {

		try{
			FileReader reader = new FileReader(filePath);
			JSONObject obj = new JSONObject();
			JSONParser par = new JSONParser();
			arrObj = (JSONArray) par.parse(reader);
				
			// System.out.println(arrObj);
			for(int i = 0; i<arrObj.size(); i++){
				obj = (JSONObject) arrObj.get(i);
				System.out.println("==================================================");
				System.out.println("ID san pham: "  + obj.get("id_product"));
				System.out.println("Ten san pham: "  + obj.get("productName"));
				System.out.println("Ngay nhan hang: "  + obj.get("timeReceived"));
				System.out.println("Gia san pham: "  + obj.get("productPrice"));
				System.out.println("==================================================");
			}
			
		}catch(Exception e2){

		}
	}


	public void DeleteProduct(){
		try{
			FileReader reader = new FileReader(filePath);
			JSONObject obj = new JSONObject();
			JSONParser par = new JSONParser();
			arrObj = (JSONArray) par.parse(reader);
			long deleteId = scanner.nextLong();

			for(int i = 0; i<arrObj.size(); i++){
				obj = (JSONObject) arrObj.get(i);
				if (obj.get("id_product").equals(deleteId)) {
					// System.out.println("Yes");
					arrObj.remove(i);
					loadFile();
					System.out.println("Deleted!!!");
					System.out.println(arrObj.toJSONString());
					break;
				}
				
				
			}
		}catch(Exception e){

		}
	}
}
