/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msprjava;

import java.io.*;
/**
 *
 * @author nico
 */
public class MSPRJAVA{


    public static void main(String[] args) {

        css_gen ok = new css_gen();
        ok.start();
        Logscreen ok2 = new Logscreen();
        ok2.start();
        System.out.println(new File("."). getAbsolutePath());

        String staffFile = "./list/staff.txt";

        int staffSize = 0;
        String[][] userList = new String[50][50];

        try(BufferedReader br = new BufferedReader(new FileReader(staffFile)))
        {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                userList[i][0] = line;
                i++;
                System.out.println(line);
                staffSize++;
            }
        }
        catch (IOException e) {
            System.out.println("pas de ligne dans staff.");
            e.printStackTrace();
        }

        System.out.println("---------------");

        System.out.println("---------------");

        File dossiers1 = new File("./web/comptes");
        boolean resp1 = dossiers1.mkdir();

        if(resp1) {
            System.out.println("Le dossier comptes a été créé.");
        }
        else {
            System.out.println("Le dossier comptes existe déja.");
        }


        for(int i = 0; i< staffSize; i++ ) {
            File dossiers = new File("./web/comptes/"+userList[i][0]);
            boolean resp = dossiers.mkdir();

            if(resp) {
                System.out.println("Le dossier a été créé."+userList[i][0]);
            }
            else {
                System.out.println("Le dossier existe déja.");
            }
        }
 
        System.out.println("---------------");

        for(int i = 0; i< staffSize; i++ ) {
            String path = "./web/comptes/"+userList[i][0]+"/index.html";
            System.out.println(path);
            File file1 = new File(path);
            try {
                if (file1.createNewFile()){
                    System.out.println("Fichier index créé pour les account index!");
                }else{
                    System.out.println("Fichier index existe déjàpour les account index!");
                }
                BufferedWriter bw = new BufferedWriter(new FileWriter(file1));
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
                        "	<link rel=\"stylesheet\" type=\"text/css\" href=\"../../styleAuth.css\">\n" +
                        "	<link rel=\"stylesheet\" href=\"../../style.css\">\n" +
                        "<!--===============================================================================================-->\n" +
                        "<script async src='/cdn-cgi/bm/cv/669835187/api.js'></script></head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<!-- Section user authentifié -->\n" +
                        "	<div class=\"global__container\">\n" +
                        "		<section class=\"container__infosUser\">\n" +
                        "			<div class=\"infosUser__cni\">\n" +
                        "				<img src=\"../../../list/"+userList[i][0]+"_identity.jpeg\" alt=\"identity card\">\n" +
                        "			</div>\n" +
                        "			<div class=\"infosUser__infos\">\n" +
                        "				<h1>"+userList[i][0]+"</h1>\n" +
                        "				<input id=\"username\" type=\"text\" value=\"cberthier\" hidden/>\n" +
                        "			</div>\n" +
                        "		</section>\n" +
                        "		<section class=\"container__checkbox\">\n" +
                        "			<form onsubmit=\"submitForm()\">\n" +
                        "				<div class=\"checkbox__content\">\n" +
                        "					<legend>Veuillez sélectionner vos accessoires :</legend>\n" +
                        "					<div class=\"checkbox\">\n" +
                        "						<input type=\"checkbox\" id=\"mousqueton\" name=\"accessories\" value=\"mousqueton\" class=\"checkbox__accessories\">\n" +
                        "						<label for=\"mousqueton\">Mousqueton</label>\n" +
                        "					</div>\n" +
                        "					<div class=\"checkbox\">\n" +
                        "						<input type=\"checkbox\" id=\"gants\" name=\"accessories\" value=\"gants\" class=\"checkbox__accessories\">\n" +
                        "						<label for=\"gants\">Gants d'intervention</label>\n" +
                        "					</div>\n" +
                        "					<div class=\"checkbox\">\n" +
                        "						<input type=\"checkbox\" id=\"brassards\" name=\"accessories\" value=\"brassards\" class=\"checkbox__accessories\">\n" +
                        "						<label for=\"brassards\">Brassards de sécurité</label>\n" +
                        "					</div>\n" +
                        "					<div class=\"checkbox\">\n" +
                        "						<input type=\"checkbox\" id=\"menottes\" name=\"accessories\" value=\"menottes\" class=\"checkbox__accessories\">\n" +
                        "						<label for=\"menottes\">Porte menottes</label>\n" +
                        "					</div>\n" +
                        "					<div class=\"checkbox\">\n" +
                        "						<input type=\"checkbox\" id=\"cyno\" name=\"accessories\" value=\"cyno\" class=\"checkbox__accessories\">\n" +
                        "						<label for=\"cyno\">Bandeau agent cynophile</label>\n" +
                        "					</div>\n" +
                        "					<div class=\"checkbox\">\n" +
                        "						<input type=\"checkbox\" id=\"talky\" name=\"accessories\" value=\"talky\" class=\"checkbox__accessories\">\n" +
                        "						<label for=\"talky\">Talkies walkies</label>\n" +
                        "					</div>\n" +
                        "					<div class=\"checkbox\">\n" +
                        "						<input type=\"checkbox\" id=\"lampe\" name=\"accessories\" value=\"lampe\" class=\"checkbox__accessories\">\n" +
                        "						<label for=\"lampe\">Lampe Torche</label>\n" +
                        "					</div>\n" +
                        "					<div class=\"checkbox\">\n" +
                        "						<input type=\"checkbox\" id=\"kit\" name=\"accessories\" value=\"kit\" class=\"checkbox__accessories\">\n" +
                        "						<label for=\"kit\">Kit oreillette</label>\n" +
                        "					</div>\n" +
                        "					<div class=\"checkbox\">\n" +
                        "						<input type=\"checkbox\" id=\"taser\" name=\"accessories\" value=\"taser\" class=\"checkbox__accessories\">\n" +
                        "						<label for=\"taser\">Tasers</label>\n" +
                        "					</div>\n" +
                        "					<div class=\"checkbox\">\n" +
                        "						<input type=\"checkbox\" id=\"lacrymo\" name=\"accessories\" value=\"lacrymo\" class=\"checkbox__accessories\">\n" +
                        "						<label for=\"lacrymo\">Bombes lacrymogènes</label>\n" +
                        "					</div>\n" +
                        "					<div class=\"checkbox__btnSave\">\n" +
                        "						<button type=\"submit\" class=\"btnSave\">Enregistrer mes choix</button>\n" +
                        "					</div>\n" +
                        "				</div>\n" +
                        "			</form>\n" +
                        "		</section>	\n" +
                        "	</div>\n" +
                        "<!-- Authentification  -->\n" +
                        "	<script src=\"https://code.jquery.com/jquery-3.6.0.js\" integrity=\"sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=\" crossorigin=\"anonymous\"></script>\n" +
                        "	<script src=\"https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js\" crossorigin=\"anonymous\"></script>\n" +
                        "	<script src=\"main.js\"></script>\n" +
                        "	<!--  -->\n" +
                        "	<!-- Page principale  -->\n" +
                        "	<!--  -->\n" +
                        "<script type=\"text/javascript\">(function(){window['__CF$cv$params']={r:'6def5eebbe573a5d',m:'1fMbEUwClCsxXKA.PJqazq4VnP4haKfLiec8zozzfZQ-1645104632-0-AWLgezT35LbhzSOQLnUXb46mE0R0BHqCU+0bNhFyAvFYVO2ZsPDKdrU7lBkfNp+4nsNogHPo2MBJb/gmsdPtFZBA0nudJ0qQeeJsvsOm1LAVlT0aZoNLqx+1I2kcshZcM3mBMhGxzYJU6LCFmWya1ZNetV+/wvFoM1mzQDQaoapRYEZ/4sRnb0AzLk5LaIrxuw==',s:[0xdb81afa99c,0x6e1fb6f4fb],}})();</script></body></html>\n"
                        );
                bw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
