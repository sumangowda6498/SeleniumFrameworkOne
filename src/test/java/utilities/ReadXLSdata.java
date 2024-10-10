package utilities;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

public class ReadXLSdata {
//    public static void main(String[] args) throws IOException {
//        ReadXLSdata red=new ReadXLSdata();
//        red.getData("login");
//
//    }
    @DataProvider(name ="sampledata")

    public String[][] getData(Method m) throws EncryptedDocumentException,IOException {
        String XLsheetname=m.getName();
        File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testdata.xlsx");
        FileInputStream fis=new FileInputStream(f);
        Workbook wb= WorkbookFactory.create(fis);
        Sheet sheetName=wb.getSheet(XLsheetname);

        int totalRows= sheetName.getLastRowNum();
        System.out.println(totalRows);
        Row rowcell=sheetName.getRow(0);
        int totalCols=rowcell.getLastCellNum();
        System.out.println(totalCols);

        DataFormatter format=new DataFormatter();

        String testData[][]=new String[totalRows][totalCols];
        int i,j;
        for (i=1;i<=totalRows;i++){
            for (j=0;j<totalCols;j++){
                testData[i-1][j]=format.formatCellValue(sheetName.getRow(i).getCell(j));
                System.out.println(testData[i-1][j]);
            }
        }
        return testData;

    }
}
