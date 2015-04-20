/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liqkwidb;

/**
 *
 * @author manuel
 */
public class OSValidator {
    public enum Platform {
        Windows, MAC, Unix, Solaris, Unsupported
    }
    
    private static Platform OS = null;
    
    public static Platform getOS() {
        if (OS == null) {
            final String os = System.getProperty("os.name").toLowerCase();
            
            OS = Platform.Unsupported;
            
            if (os.indexOf("win") >= 0) { OS = Platform.Windows; }
            if (os.indexOf("mac") >= 0) { OS = Platform.MAC; }
            if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") >= 0) { OS = Platform.Unix; }
            if (os.indexOf("sunos") >= 0) { OS = Platform.Solaris; }
        }
        
        return OS;
    }
    
    public static boolean isWindows() {
        return getOS() == Platform.Windows;
    }
    
    public static boolean isMAC() {
        return getOS() == Platform.MAC;
    }
    
    public static boolean isUnix() {
        return getOS() == Platform.Unix;
    }
    
    public static boolean isSolaris() {
        return getOS() == Platform.Solaris;
    }
}
