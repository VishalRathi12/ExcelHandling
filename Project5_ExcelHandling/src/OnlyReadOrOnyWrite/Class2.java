package OnlyReadOrOnyWrite;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Class2 {


	void WriteDataInFile(int EndRow, int EndColumn, int Limit) throws IOException, RowsExceededException, WriteException
	{
		File f = new File("C:\\Users\\pc\\Desktop\\bob1.xls");//Connection sheet
		WritableWorkbook wk = Workbook.createWorkbook(f);   //Create Workbook
		WritableSheet ws = wk.createSheet("VR",0);           //Create sheet(Sheet Ka name, Index of sheet)
		
		Scanner s1 = new Scanner(System.in);
		
		for(int i=EndRow;i<=Limit;i++)
		{
			for(int j=1;j<EndColumn;j++)
			{
				
				System.out.println("Enter Data");
				String a = s1.nextLine();
				Label l = new Label(j,i,a);//Structuring of cell
				ws.addCell(l);                                 //Add cell into sheet
				
			}
		}
		wk.write();//for saving the sheet
		wk.close();//Close the sheet
		
		
	}
	
	public static void main(String[] args) throws IOException, WriteException {
	
		Class2 a = new Class2();
		Scanner a1 = new Scanner(System.in);
		System.out.println("enter the input");
		
		System.out.println("enter the Row ");
		int value1 = a1.nextInt();
		
		System.out.println("enter the Row Last Limit");
		int value3 = a1.nextInt();
		
		System.out.println("enter the Column ");
		int value2 = a1.nextInt();
		
		
		
		a.WriteDataInFile(value1,value2,value3);
		
		
		
	}
}
