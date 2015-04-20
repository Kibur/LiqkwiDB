/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liqkwidb;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author manuel
 */
public class ExecCommand {
    public static String exec(String execCommand, List<String> commandList) throws InterruptedException, IOException {
        // Add default commands
        /*switch (OSValidator.getOS()) {
                case Windows:
                    commandList.add(0, "cmd.exe");
                    commandList.add(1, "/c");
                    break;
                case Unix:
                    commandList.add(0, "sh");
                    commandList.add(1, "-c");
                    break;
                case Unsupported:
                    System.out.println("Unsupported OS");
                    return;
        }*/
        
        commandList.add(0, "java");
        commandList.add(1, "-jar");
        commandList.add(2, "liquibase.jar");
        commandList.add(execCommand);
        
        ProcessBuilder builder = new ProcessBuilder(commandList);
        Map<String, String> environ = builder.environment();
        
        builder.directory(new File(System.getProperty("user.dir")));
        
        final Process process = builder.start();
        
        // Any error message?
        StreamGobbler errorGobbler = new StreamGobbler(process.getErrorStream(), "ERROR");
        
        // Any output?
        StreamGobbler outputGobbler = new StreamGobbler(process.getInputStream(), "OUTPUT");
        
        errorGobbler.start();
        outputGobbler.start();
        
        // Any error???
        int exitVal = process.waitFor();
        
        System.out.println("ExitValue: " + exitVal);
        
        return outputGobbler.getData();
    }
}
