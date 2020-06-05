package OnlyReadOrOnyWrite;

import jxl.write.biff.*;
import jxl.write.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.*;
import jxl.read.biff.*;


public class ReadtoWrite1 {
	
	
	void MethodReadToWrite()
	{
		File f = new File("C:\\Users\\pc\\Desktop\\read.xls");
		Workbook wk1 = Workbook.getWorkbook(f);
		Sheet ws1=wk1.getSheet(0);
		int r=ws1.getRows();
		int c=ws1.getColumns();
		
		
	
		
		File f = new File("C:\\Users\\pc\\Desktop\\bob1.xls");//Connection sheet
		WritableWorkbook wk = Workbook.createWorkbook(f);   //Create Workbook
		WritableSheet ws = wk.createSheet("VR",0);  
		
		String ab;
		
		for(int i = 0;i<10;i++ )
		{
			for(int j = 0;j<10;j++)
			{
				if((  ab = br.readLine())!=null)
				{
					Cell c1=ws1.getCell(j,i);
					System.out.print(c1.getContents());
					
					String ab = c1.getContents();
					Label l = new Label(j,i,ab);//Structuring of cell
					ws.addCell(l); 
					
				}
			}
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		ReadtoWrite1 obj1 = new ReadtoWrite1();
		obj1.MethodReadToWrite();
		
		
		
	}
	
	

}
