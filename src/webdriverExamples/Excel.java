package webdriverExamples;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;



public class Excel 
{
	

	public static void main(String[] args)throws Exception {
		FileInputStream file=new FileInputStream("C:\\Users\\saiya\\OneDrive\\Documents\\Book2.xls");
		Workbook wb=Workbook.getWorkbook(file);
		Sheet st=wb.getSheet(0);
		int row=3;
		String empid=st.getCell(0,row).getContents();
		String name=st.getCell(1,row).getContents();
		String email=st.getCell(2,row).getContents();
		String no=st.getCell(3,row).getContents();
		
		System.out.println(empid);
		System.out.println(name);
		System.out.println(email);
		System.out.println(no);
	}

}
