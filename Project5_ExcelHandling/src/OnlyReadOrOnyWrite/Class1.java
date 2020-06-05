package OnlyReadOrOnyWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import jxl.write.Label;//
import jxl.Workbook;



public class Class1 {
	
	
	
	void WriteDataInFile(int EndRow, int EndColumn) throws IOException, RowsExceededException, WriteException
	{
		File f = new File("C:\\Users\\pc\\Desktop\\bob1.xls");//Connection sheet
		WritableWorkbook wk = Workbook.createWorkbook(f);   //Create Workbook
		WritableSheet ws = wk.createSheet("VR",0);           //Create sheet(Sheet Ka name, Index of sheet)
		
		for(int i=0;i<EndColumn;i++)
		{
			for(int j=0;j<EndRow;j++)
			{
				Label l = new Label(j,i,"Jjkaka");//Structuring of cell
				ws.addCell(l);                                 //Add cell into sheet
				
			}
		}
		wk.write();//for saving the sheet
		wk.close();//Close the sheet
		
		
	}
	
	public static void main(String[] args) throws IOException, WriteException {
	
		Class1 a = new Class1();
		Scanner a1 = new Scanner(System.in);
		System.out.println("enter the input");
		
		int value1 = a1.nextInt();
		int value2 = a1.nextInt();
		
		a.WriteDataInFile(value1,value2);
		
		
		
		
	}
	
	

}
