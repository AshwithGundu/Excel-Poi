/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package non1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author S530462
 */
public class non {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, NullPointerException {
        // TODO code application logic here
        try {

            // File B WHERE WE WANT DATA
            System.out.println("CHOOSE THE FILE YOU WANT TO UPDATE");
            DataFormatter formatter = new DataFormatter();
            FileInputStream fileB = new FileInputStream(file.fileChose());
            XSSFWorkbook workbookB = new XSSFWorkbook(fileB);
            XSSFSheet sheetB = workbookB.getSheetAt(0);
            System.out.println("CHOOSE THE FILE FROM WHERE YOU WANT TO GET");
            // FILE A DATA SOURCE
            FileInputStream fileA = new FileInputStream(file.fileChose());
            XSSFWorkbook workbookA = new XSSFWorkbook(fileA);
            XSSFSheet sheetA = workbookA.getSheetAt(0);
            sub sub = new sub();
            int sum = 0;
            int count = 0;
            double sdivc;
//                    sub s = new sub();
//                     String x = s.getValue(sheetA, 0, 0);
//                     System.out.println(x);
            for (int iB = 1; iB <= sheetB.getLastRowNum(); iB++) {

                // Getcell posiyion we need to give the column position MAnulally
                XSSFRow row = sheetB.getRow(iB);
                System.out.println(row);
                String NON_B = formatter.formatCellValue(sheetB.getRow(iB).getCell(0));
                for (int iA = sheetA.getFirstRowNum(); iA <= sheetA.getLastRowNum(); iA++) {
                    try {
                        String NON_A = formatter.formatCellValue(sheetA.getRow(iA).getCell(0));
                        //System.out.println(iB+" "+NON_A+" "+iA+" "+NON_B);
                        // Checking 919's are equal or not
                        if (NON_B.equals(NON_A)) {
                            String name = formatter.formatCellValue(sheetA.getRow(iA).getCell(2));
                            // System.out.println(name);
                            sheetB.getRow(iB).createCell(1).setCellValue(name);

/// getcell position is for where data in A.xlsx is required
                            String course_A = formatter.formatCellValue(sheetA.getRow(iA).getCell(3));
                            // increase the get cell value to 1 so as to get grade

                            String course_A_Grade = formatter.formatCellValue(sheetA.getRow(iA).getCell(4));
                            points p = new points();
                           
                            switch (course_A) {
                                case "333":
                                    // System.out.println("333"+"test"+course_A_Grade+iB);
                                    sheetB.getRow(iB).createCell(2).setCellValue(course_A_Grade);
                                    //String a = formatter.formatCellValue(sheetB.getRow(iB).getCell(2));
                                    // int b = p.pointsIf(formatter.formatCellValue(sheetB.getRow(iB).getCell(2)));
//                              
                                     if( !sheetB.getRow(iB).getCell(2).toString().trim().equals(""))
                                    sheetB.getRow(iB).createCell(3).setCellValue(p.pointsIf(formatter.formatCellValue(sheetB.getRow(iB).getCell(2, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL))));

                                    break;

                                case "444":
                                    sheetB.getRow(iB).createCell(4).setCellValue(course_A_Grade);
                                    sheetB.getRow(iB).createCell(5).setCellValue(p.pointsIf(formatter.formatCellValue(sheetB.getRow(iB).getCell(4, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL))));
                                    break;
                                case "555":
                                    sheetB.getRow(iB).createCell(6).setCellValue(course_A_Grade);
                                    sheetB.getRow(iB).createCell(7).setCellValue(p.pointsIf(formatter.formatCellValue(sheetB.getRow(iB).getCell(6, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL))));
                                    break;
                                case "666":
                                    sheetB.getRow(iB).createCell(8).setCellValue(course_A_Grade);
                                    sheetB.getRow(iB).createCell(9).setCellValue(p.pointsIf(formatter.formatCellValue(sheetB.getRow(iB).getCell(8, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL))));
                                    break;
                                //System.out.println("666 tets "+course_A_Grade+" "+iB);

                                default:
                                    sheetB.getRow(iB).createCell(10).setCellValue(course_A_Grade);
                                    sheetB.getRow(iB).createCell(11).setCellValue(p.pointsIf(formatter.formatCellValue(sheetB.getRow(iB).getCell(10, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL))));

                            }
                          
                            for (int iB2 = 3; iB2 <= 13; iB2 ++) {
                            Integer s1 = 0;
                                 {
                                    
                                    
//                        String value = formatter.formatCellValue(sheetB.getRow(iB).getCell(3))+formatter.formatCellValue(sheetB.getRow(iB).getCell(5));
//                                    Integer s = Integer.valueOf(formatter.formatCellValue(sheetB.getRow(iB).getCell(3)));
                                    if (!sheetB.getRow(iB).getCell(iB2).toString().isEmpty()){
                                     s1 = Integer.valueOf(formatter.formatCellValue(sheetB.getRow(iB).getCell(iB2)));
                                    
                                    sum = sum + s1;
                                    sheetB.getRow(iB).createCell(12).setCellValue(sum);
                                    }
                                    if(!sheetB.getRow(iB).getCell(iB2).toString().isEmpty())
                                    {
                                        count++;
                                    }
                                   sheetB.getRow(iB).createCell(13).setCellValue(count);
                                   

                                }
                                sum = 0;
                              

                            }
//                            ArrayList<Integer> list = new ArrayList<>();
//                            
//                            
//                            for (int iB2 = 3; iB2 <= 11; iB2 ++) {
//
//                                list.add(Integer.valueOf(formatter.formatCellValue(sheetB.getRow(iB).getCell(iB2))));
//
//                                //  sheetB.getRow(iB).createCell(12).setCellValue(list);
//                               
//                            }

                        } else if (NON_A == null) {
                            continue;
                        }

                    } catch (Exception e) {
                        System.out.println(iB+": "+iA+": "+e);
                    }

                }

            }
///added

            System.out.println("Choose the final FILE");
            FileOutputStream fileOut = new FileOutputStream(file.fileChose());
            workbookB.write(fileOut);
            fileOut.close();
            workbookB.close();
            workbookA.close();
            System.out.println(" written successfully");
        } catch (FileNotFoundException e) //Couldn't find file
        {
            e.printStackTrace();
        } catch (IOException e) //Couldn't create workbook
        {
            e.printStackTrace();
        } catch (NullPointerException e) //Couldn't create workbook
        {
            e.printStackTrace();
        }
    }

}
