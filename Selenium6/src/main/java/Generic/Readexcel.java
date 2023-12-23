package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcel  implements FrameworkConstants{
	//File f= new File("excelpath");
	public  static Object[][] getMulitipledata(String sheetname) throws IOException{
	FileInputStream ref= new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Selenium6\\src\\test\\resources\\EXCEL_DATA\\EXCEL1.xlsx");
	Workbook wb= WorkbookFactory.create(ref);
	Sheet s = wb.getSheet(sheetname); 
	int rowsize = s.getPhysicalNumberOfRows();
	int columnsize=s.getRow(0).getPhysicalNumberOfCells();
	Object[][] d =new Object[rowsize][columnsize];
	for (int i=0;i < rowsize; i++ ) {
	

		for (int j=0;j < columnsize; j++ ) {


			d[i][j]=s.getRow(i).getCell(j).getStringCellValue();

		}


	}

	return d;
}
	
}

