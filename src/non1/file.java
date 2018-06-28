/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package non1;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author S530462
 */
public class file {
    	

public static String fileChose()
{
    JFileChooser fc= new JFileChooser();
    int ret = fc.showOpenDialog(null);

    if (ret== JFileChooser.APPROVE_OPTION) 
    {
        File file = fc.getSelectedFile();
        String filename= file.getAbsolutePath();
        return filename;
    }
    else
        return null;
}
}
