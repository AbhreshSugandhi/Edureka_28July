package module10.TestCase;

import java.io.IOException;

import module10.Actions.ActionKeywords;
import module10.Utility.ExcelUtility;

public class Execution {

	public static void main(String[] args) throws IOException, InterruptedException {
		String path = "D:\\Training\\Programs\\Edureka_28July\\src\\module10\\TestData\\MyDataEngine.xlsx";

		ExcelUtility.SetExcel(path, 0);

		for (int i=1; i<=3; i++) {

			String Keyword = ExcelUtility.getdata(i, 3);
			if (Keyword.equals("openbrowser")) {
				ActionKeywords.openbrowser();
			} else if (Keyword.equals("navigate")) {
				ActionKeywords.navigate();
			} else if (Keyword.equals("click_Gmail")) {
				ActionKeywords.click_Gmail();
			}

		}

	}

}
