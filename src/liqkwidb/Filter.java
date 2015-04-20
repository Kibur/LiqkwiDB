/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liqkwidb;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author manuel
 */
public class Filter implements FileFilter {

    @Override
    public boolean accept(File file) {
        return file.getName().endsWith("xml");
    }
    
}
