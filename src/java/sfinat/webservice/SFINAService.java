/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sfinat.webservice;

import executable.CommandLineExecutable;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author mcb
 */
@WebService(serviceName = "SFINAService")
@Stateless()
public class SFINAService implements SfinaInterface{

    
    /**
     * Web service operation
     */
    @Override
    @WebMethod(operationName = "executeSFINA")
    public String executeSFINA(@WebParam(name = "parameter") String parameter) {
       //        String [] expConfigPath = new String[]{"-ep",expConfigFilePath};
// 
//       
//        ProcessBuilder pb = new ProcessBuilder("java", "-jar", "/home/mcb/Documents/University/COSS/Student_Assistant/Git/SFINA/core/dist/SFINA.jar","ep","experiments/experiment-01/experimentConfig.txt");
//        pb.directory(new File("/home/mcb/Documents/University/COSS/Student_Assistant/Git/SFINA/core"));
//        try{
//             Process p = pb.start();
//        }catch(Exception ex){
       
  // }
   
//   InputStream inputStream = 
//      getClass().getClassLoader().getResourceAsStream("/WEB-INF/conf/fileSystem");
//   BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream ));
//     CommandLineExecutable.main(new String[]{});
//     //   CommandLineExecutable.main("hallo");
     return this.GREEN;
    }

    
    
}
