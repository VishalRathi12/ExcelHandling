package ReadToWrite;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class Class1 {
	
	void readandWrite() throws IOException, BiffException, RowsExceededException, WriteException
	{
		File f = new File("C:\\Users\\pc\\Desktop\\read.xls");
		Workbook wk1 = Workbook.getWorkbook(f);
		Sheet ws1=wk1.getSheet(0);
		int r=ws1.getRows();
		int c=ws1.getColumns();
		
		
		
		File f1 = new File("C:\\Users\\pc\\Desktop\\write.xls");
		WritableWorkbook wk = Workbook.createWorkbook(f1);   //Create Workbook
		WritableSheet ws = wk.createSheet("VR",0);           //Create sheet(Sheet Ka name, Index of sheet)
		
		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell c1=ws1.getCell(j,i);
				System.out.print(c1.getContents());
				
				String ab = c1.getContents();
				Label l = new Label(j,i,ab);//Structuring of cell
				ws.addCell(l);
			}
		}
	
		
		wk.write();//for saving the sheet
		wk.close();//Close the sheet	
	
	}
	
	
	
public static void main(String[] args) throws RowsExceededException, BiffException, WriteException, IOException {
	
	Class1 obj = new Class1();
	obj.readandWrite();
	
}	
	

}
