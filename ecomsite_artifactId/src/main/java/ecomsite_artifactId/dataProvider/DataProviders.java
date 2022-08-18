package ecomsite_artifactId.dataProvider;


import org.testng.annotations.DataProvider;
import ecomsite_artifactId.utility.NewExcelLibrary;

public class DataProviders {
	NewExcelLibrary obj = new NewExcelLibrary();

	//Class --> LoginPageTest,HomePageTest Test Case--> loginTest, wishListTest, orderHistoryandDetailsTest

		@DataProvider(name = "testdata")
		public Object[][] getCredentials() {
			// Totals rows count
			int rows = obj.getRowCount("testdata");
			// Total Columns
			int column = obj.getColumnCount("testdata");
			int actRows = rows - 1;

			Object[][] data = new Object[actRows][column];

			for (int i = 0; i < actRows; i++) {
				for (int j = 0; j < column; j++) {
					data[i][j] = obj.getCellData("testdata", j, i + 2);
				}
			}
			return data;
		}

	

	
		


}
