package ecomsite_artifactId.dataProvider;

import org.testng.annotations.DataProvider;

public class dataproviderFromSample {
	@DataProvider (name ="demodata")
	public Object getdemodata() {
		Object[][] data =new Object[3][2];
		data[0][0]="Anju";
		data[0][1]="First user";
		data[1][0]="Kannan";
		data[1][1]="Second user";
		data[2][0]="Ichu";
		data[2][1]="Third user";
		return data;
	}


}
