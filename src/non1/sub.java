/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package non1;

import java.math.BigDecimal;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

/**
 *
 * @author S530462
 */
public class sub {
    public String getValue(XSSFSheet Sheet,int x, int y){
    Row row = Sheet.getRow(y);
    if(row==null) return "";
    Cell cell = row.getCell(x);
    if(cell==null) return "";
    int type = cell.getCellType();
    switch(type){
    case 0:
        return cell.getNumericCellValue() + "";
    case 1:
        return cell.getStringCellValue();
    case 2:
        return cell.getCellFormula();
    case 3:
        return "";
    case 4:
        return cell.getBooleanCellValue() + "";
    case 5:
        return cell.getErrorCellValue() + "";
    default:
        return "";
    }
}
    
    
    
}
