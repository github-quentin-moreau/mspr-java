/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msprjava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author nico
 */
public class Logscreen extends Thread{
    
    @Override
    public void run() {
    File file = new File("./web/index.html");
    
    try {   
        if (file.createNewFile()){
            System.out.println("Fichier créé!");
        }else{
            System.out.println("Fichier existe déjà.");
        }   
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"	<title>MSPR</title>\n" +
"	<meta charset=\"UTF-8\">\n" +
"	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"\n" +
"<!--===============================================================================================-->\n" +
"	<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" crossorigin=\"anonymous\">\n" +
"	<link rel=\"script\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\">\n" +
"	<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css\" crossorigin=\"anonymous\">\n" +
"	<link rel=\"stylesheet\" type=\"text/css\" href=\"styleAuth.css\">\n" +
"	<link rel=\"stylesheet\" href=\"style.css\">\n" +
"<!--===============================================================================================-->\n" +
"<script async src='/cdn-cgi/bm/cv/669835187/api.js'></script></head>\n" +
"<body>\n" +
"	\n" +
"    <!-- Overlay authentification  -->\n" +
"    <div class=\"limiter\">\n" +
"        <div class=\"container-login100\">\n" +
"            <div class=\"wrap-login100\">\n" +
"                <form class=\"login100-form validate-form\" action=\"javascript:void(0);\">\n" +
"                    <span class=\"login100-form-logo\">\n" +
"                        <i class=\"bi bi-person-circle\"></i>\n" +
"                    </span>\n" +
"                    <br>\n" +
"                    <span class=\"login100-form-title p-b-34 p-t-27\">\n" +
"                        Test\n" +
"                    </span>\n" +
"\n" +
"                    <br>\n" +
"                    <div class=\"wrap-input100 validate-input\" data-validate = \"Entrer votre identifiant\">\n" +
"                        <input class=\"input100\" type=\"text\" name=\"mail\" id=\"mail\" placeholder=\"Identifiant\">\n" +
"                        <span class=\"focus-input100\" data-placeholder=\"\"> </span>\n" +
"                    </div>\n" +
"\n" +
"                    <div class=\"wrap-input100 validate-input\" data-validate=\"Entrer votre mot de passe\">\n" +
"                        <input class=\"input100\" type=\"password\" name=\"pass\" id=\"pass\" placeholder=\"Mot de passe\">\n" +
"                        <span class=\"focus-input100\" data-placeholder=\"\"></span>\n" +
"                    </div>\n" +
"\n" +
"\n" +
"                    <div class=\"container-login100-form-btn\">\n" +
"                        <button class=\"login100-form-btn\"  type=\"submit\" id=\"submitBtn\">\n" +
"                            Se connecter\n" +
"                        </button>\n" +
"                    </div>\n" +
"\n" +
"                </form>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
"</body>\n" +
"</html>   \n" +
"<!-- Authentification  -->\n" +
"<script src=\"https://code.jquery.com/jquery-3.6.0.js\" integrity=\"sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=\" crossorigin=\"anonymous\"></script>\n" +
"<script src=\"https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js\" crossorigin=\"anonymous\"></script>\n" +
"<script src=\"main.js\"></script>\n" +
"<script>\n" +
"    $(document).ready(function() {\n" +
"\n" +
"        \n" +
"\n" +
"        var rawUsers = '[{\"login\":\"cberthier\",\"password\":\"test1\"},{\"login\":\"mgontier\",\"password\":\"test2\"},{\"login\":\"smacky\",\"password\":\"test3\"},{\"login\":\"mjackson\",\"password\":\"test4\"},{\"login\":\"rmoreno\",\"password\":\"test5\"},{\"login\":\"bfa\",\"password\":\"test6\"},{\"login\":\"mhollande\",\"password\":\"test7\"},{\"login\":\"palois\",\"password\":\"test8\"}]';\n" +
"        var users = JSON.parse(rawUsers);\n" +
"        \n" +
"\n" +
"\n" +
"        $('#submitBtn').click(function() {\n" +
"\n" +
"\n" +
"            var mailInput = $('#mail').val();\n" +
"            var passInput = $('#pass').val();\n" +
"\n" +
"\n" +
"            if (mailInput == '' && passInput == '') {\n" +
"                alert('Login et mot de passe vides');\n" +
"              \n" +
"            } else if(mailInput == '') {\n" +
"                alert('Login vide');\n" +
"            }\n" +
"            else if(passInput == '') {\n" +
"                alert('Mot de passe vide');\n" +
"            }\n" +
"            else {\n" +
"\n" +
"                var isAuthentificated = false;\n" +
"\n" +
"                for (let i = 0; i < users.length; i++) {\n" +
"\n" +
"                    if (users[i].login == mailInput && users[i].password == passInput) {\n" +
"                        isAuthentificated = true;\n" +
"                    }\n" +
"\n" +
"                }\n" +
"\n" +
"               if(isAuthentificated == true) { \n" +
"                   window.location.replace(\"./comptes/\"+mailInput+\"/index.html\");\n" +
"                }  \n" +
"               else alert('Le mot de passe ou le mail ne sont pas correct.');\n" +
"\n" +
"            }\n" +
"\n" +
"            \n" +
"        \n" +
"        });\n" +
"    });\n" +
"</script>");
        bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
