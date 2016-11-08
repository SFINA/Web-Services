/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sfinat.webservice;

/**
 *
 * @author mcb
 */
public interface SfinaInterface {
    
    public final static String GREEN = "green";
    public final static String YELLOW= "yellow";
    public final static String RED="red";
    
    /**
     * Executes SFINA on the Server, so that it can be used interactively
     * @param parameter specifies the test case to use
     * @return Status of Network. Takes values in {Green, Yellow Red}
     */
    public String executeSFINA(String parameter);
    
}
