/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package non1;

import org.apache.poi.xssf.usermodel.XSSFCell;

/**
 *
 * @author s530462
 */
public class points {
    
    int p;

    public int pointsIf(String grade) {
        switch (grade) {
            case "A":
                     p = 4;
                     break;
            case "B":
                     p = 3;
                     break;
            case "C":
                     p = 2;
                     break;
            case "D":
                     p = 1;
                     break;

            //System.out.println("666 tets "+course_A_Grade+" "+iB);
            default:
                     p = 0;
                

        }
        return p;

    }
}
