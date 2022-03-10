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
"    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n" +
"<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n" +
"<link href=\"https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,300;1,400;1,500;1,600&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap\" rel=\"stylesheet\">\n" +
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
"                <span class=\"login100-form-title p-b-34 p-t-27\">\n" +
"                    Utilisateurs\n" +
"                </span><br>\n" +
"\n" +
"                <div class=\"list-group\">\n" +
"                    <a href=\"comptes/cberthier/index.html\" class=\"list-group-item text-center list-group-item-action list-group-item-light\">Berthier</a>                    \n" +
"                    <a href=\"comptes/mgontier/index.html\" class=\"list-group-item text-center list-group-item-action list-group-item-light\">Gontier</a>\n" +
"                    <a href=\"comptes/smacky/index.html\" class=\"list-group-item text-center list-group-item-action list-group-item-light\">Macky</a>\n" +
"                    <a href=\"comptes/mjackson/index.html\" class=\"list-group-item text-center list-group-item-action list-group-item-light\">Jackson</a>\n" +
"                    <a href=\"comptes/rmoreno/index.html\" class=\"list-group-item text-center list-group-item-action list-group-item-light\">Moreno</a>\n" +
"                    <a href=\"comptes/bfa/index.html\" class=\"list-group-item text-center list-group-item-action list-group-item-light\">Fa</a>\n" +
"                    <a href=\"comptes/mhollande/index.html\" class=\"list-group-item text-center list-group-item-action list-group-item-light\">Hollande</a>\n" +
"                    <a href=\"comptes/palois/index.html\" class=\"list-group-item text-center list-group-item-action list-group-item-light\">Alois</a>\n" +
"                  </div>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
"</body>\n" +
"</html>   \n" +
"<!-- Authentification  -->\n" +
"<script src=\"https://code.jquery.com/jquery-3.6.0.js\" integrity=\"sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=\" crossorigin=\"anonymous\"></script>\n" +
"<script src=\"https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js\" crossorigin=\"anonymous\"></script>\n" +
"<script src=\"main.js\"></script>");
        bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
