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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nico
 */
public class css_gen extends Thread{
    
  @Override
  public void run() {
      File file = new File("./web/style.css");
      File file2 = new File("./web/styleAuth.css");
    try {   
        if (file.createNewFile()){
            System.out.println("Fichier créé!");
        }else{
            System.out.println("Fichier existe déjà.");
        }       
        } catch (IOException e) {
            e.printStackTrace();
        }
        
      try {
          BufferedWriter bw = new BufferedWriter(new FileWriter(file));
          bw.write(".global__container {\n" +
"    font-family: Roboto;\n" +
"    z-index: 1;\n" +
"    height: 100vh;\n" +
"    width: 100%;\n" +
"    position: relative;\n" +
"    display: flex;\n" +
"    flex-direction: row;\n" +
"    background: #379fc1;\n" +
"}\n" +
"\n" +
".container__infosUser {\n" +
"    width: 50%;\n" +
"    height: 100%;\n" +
"    align-self: center;\n" +
"    justify-self: center;\n" +
"    display: flex;\n" +
"    justify-content: center;\n" +
"    align-items: center;\n" +
"    flex-direction: column;\n" +
"}\n" +
"\n" +
".infosUser__infos h1 {\n" +
"    color: #000000;\n" +
"}\n" +
"\n" +
".infosUser__cni {\n" +
"    display: flex;\n" +
"    justify-content: center;\n" +
"    margin-bottom: 100px;\n" +
"}\n" +
"\n" +
".infosUser__cni img {\n" +
"    width: 50%;\n" +
"}\n" +
"\n" +
".container__checkbox {\n" +
"    width: 50%;\n" +
"    align-self: center;\n" +
"    color: white;\n" +
"    \n" +
"}\n" +
"\n" +
".checkbox__content {\n" +
"    display: flex;\n" +
"    flex-direction: column;\n" +
"    border: 3px solid black;\n" +
"    border-radius: 20px;\n" +
"    width: 50%;\n" +
"    padding: 20px;\n" +
"    box-shadow: rgba(0, 0, 0, 0.3) 0px 19px 38px, rgba(0, 0, 0, 0.22) 0px 15px 12px;\n" +
"}\n" +
".checkbox {\n" +
"    display: flex;\n" +
"    flex-direction: row;\n" +
"    align-items: center;\n" +
"    margin: 10px;\n" +
"}\n" +
"\n" +
".checkbox input {\n" +
"    margin-right: 10px;\n" +
"}\n" +
"\n" +
".checkbox__btnSave {\n" +
"    display: flex;\n" +
"    justify-content: center;\n" +
"    width: 100%;\n" +
"    margin-top: 25px;\n" +
"    \n" +
"}\n" +
"\n" +
".btnSave {\n" +
"   border: 2px solid black;\n" +
"   padding: 7px;\n" +
"   color: white;\n" +
"   font-weight: bold;\n" +
"   background-color: #659224;\n" +
"}\n" +
"\n" +
"legend {\n" +
"    text-align: center;\n" +
"    margin-bottom: 35px;\n" +
"    font-weight: bold;\n" +
"    font-size: 1.4em;\n" +
"}");
          bw.close();
      } catch (IOException ex) {
          System.out.println("cassé1");
      }

      try {   
        if (file2.createNewFile()){
            System.out.println("Fichier créé2!");
        }else{
            System.out.println("Fichier existe déjà.2");
        }       
        } catch (IOException e) {
            e.printStackTrace();
        }
      
      try {
          BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
          bw.write("  \n" +
"* {\n" +
"	margin: 0px; \n" +
"	padding: 0px; \n" +
"	box-sizing: border-box;\n" +
"}\n" +
"\n" +
"body, html {\n" +
"	height: 100%;\n" +
"	font-family: Roboto, sans-serif;\n" +
"}\n" +
"\n" +
"/*---------------------------------------------*/\n" +
"a {\n" +
"	font-family: Roboto;\n" +
"	font-size: 14px;\n" +
"	line-height: 1.7;\n" +
"	color: #666666;\n" +
"	margin: 0px;\n" +
"	transition: all 0.4s;\n" +
"	-webkit-transition: all 0.4s;\n" +
"  -o-transition: all 0.4s;\n" +
"  -moz-transition: all 0.4s;\n" +
"}\n" +
"\n" +
"a:focus {\n" +
"	outline: none !important;\n" +
"}\n" +
"\n" +
"a:hover {\n" +
"	text-decoration: none;\n" +
"  color: #fff;\n" +
"}\n" +
"\n" +
"/*---------------------------------------------*/\n" +
"h1,h2,h3,h4,h5,h6 {\n" +
"	margin: 0px;\n" +
"}\n" +
"\n" +
"p {\n" +
"	font-family: Roboto;\n" +
"	font-size: 14px;\n" +
"	line-height: 1.7;\n" +
"	color: #666666;\n" +
"	margin: 0px;\n" +
"}\n" +
"\n" +
"ul, li {\n" +
"	margin: 0px;\n" +
"	list-style-type: none;\n" +
"}\n" +
"\n" +
"\n" +
"/*---------------------------------------------*/\n" +
"input {\n" +
"	outline: none;\n" +
"	border: none;\n" +
"}\n" +
"\n" +
"textarea {\n" +
"  outline: none;\n" +
"  border: none;\n" +
"}\n" +
"\n" +
"textarea:focus, input:focus {\n" +
"  border-color: transparent !important;\n" +
"}\n" +
"\n" +
"input:focus::-webkit-input-placeholder { color:transparent; }\n" +
"input:focus:-moz-placeholder { color:transparent; }\n" +
"input:focus::-moz-placeholder { color:transparent; }\n" +
"input:focus:-ms-input-placeholder { color:transparent; }\n" +
"\n" +
"textarea:focus::-webkit-input-placeholder { color:transparent; }\n" +
"textarea:focus:-moz-placeholder { color:transparent; }\n" +
"textarea:focus::-moz-placeholder { color:transparent; }\n" +
"textarea:focus:-ms-input-placeholder { color:transparent; }\n" +
"\n" +
"input::-webkit-input-placeholder { color: #fff;}\n" +
"input:-moz-placeholder { color: #fff;}\n" +
"input::-moz-placeholder { color: #fff;}\n" +
"input:-ms-input-placeholder { color: #fff;}\n" +
"\n" +
"textarea::-webkit-input-placeholder { color: #fff;}\n" +
"textarea:-moz-placeholder { color: #fff;}\n" +
"textarea::-moz-placeholder { color: #fff;}\n" +
"textarea:-ms-input-placeholder { color: #fff;}\n" +
"\n" +
"label {\n" +
"  margin: 0;\n" +
"  display: block;\n" +
"}\n" +
"\n" +
"/*---------------------------------------------*/\n" +
"button {\n" +
"	outline: none !important;\n" +
"	border: none;\n" +
"	background: transparent;\n" +
"}\n" +
"\n" +
"button:hover {\n" +
"	cursor: pointer;\n" +
"}\n" +
"\n" +
"iframe {\n" +
"	border: none !important;\n" +
"}\n" +
"\n" +
"\n" +
"/*//////////////////////////////////////////////////////////////////\n" +
"[ Utility ]*/\n" +
".txt1 {\n" +
"  font-family: Roboto;\n" +
"  font-size: 13px;\n" +
"  color: #e5e5e5;\n" +
"  line-height: 1.5;\n" +
"}\n" +
"\n" +
"\n" +
"/*//////////////////////////////////////////////////////////////////\n" +
"[ login ]*/\n" +
"\n" +
".limiter {\n" +
"  width: 100%;\n" +
"  margin: 0 auto;\n" +
"  position: absolute;\n" +
"  z-index: 2;\n" +
"}\n" +
"\n" +
".container-login100 {\n" +
"  width: 100%;  \n" +
"  min-height: 100vh;\n" +
"  display: -webkit-box;\n" +
"  display: -webkit-flex;\n" +
"  display: -moz-box;\n" +
"  display: -ms-flexbox;\n" +
"  display: flex;\n" +
"  flex-wrap: wrap;\n" +
"  justify-content: center;\n" +
"  align-items: center;\n" +
"  padding: 15px;\n" +
"\n" +
"  background-repeat: no-repeat;\n" +
"  background-position: center;\n" +
"  background-size: cover;\n" +
"  position: relative;\n" +
"  z-index: 1;  \n" +
"}\n" +
"\n" +
".container-login100::before {\n" +
"  content: \"\";\n" +
"  display: block;\n" +
"  position: absolute;\n" +
"  z-index: -1;\n" +
"  width: 100%;\n" +
"  height: 100%;\n" +
"  top: 0;\n" +
"  left: 0;\n" +
"  background-color: rgb(92, 90, 90);\n" +
"}\n" +
"\n" +
".wrap-login100 {\n" +
"  width: 500px;\n" +
"  border-radius: 10px;\n" +
"  overflow: hidden;\n" +
"  padding: 55px 55px 37px 55px;\n" +
"  background: #379EC1;\n" +
"\n" +
"}\n" +
"\n" +
"\n" +
"/*------------------------------------------------------------------\n" +
"[ Form ]*/\n" +
"\n" +
".login100-form {\n" +
"  width: 100%;\n" +
"}\n" +
"\n" +
".login100-form-logo {\n" +
"  font-size: 60px; \n" +
"  color: #333333;\n" +
"\n" +
"  display: -webkit-box;\n" +
"  display: -webkit-flex;\n" +
"  display: -moz-box;\n" +
"  display: -ms-flexbox;\n" +
"  display: flex;\n" +
"  justify-content: center;\n" +
"  align-items: center;\n" +
"  width: 120px;\n" +
"  height: 120px;\n" +
"  border-radius: 50%;\n" +
"  background-color: #fff;\n" +
"  margin: 0 auto;\n" +
"}\n" +
"\n" +
".login100-form-title {\n" +
"  font-family: Roboto;\n" +
"  font-size: 30px;\n" +
"  color: #fff;\n" +
"  line-height: 1.2;\n" +
"  text-align: center;\n" +
"  text-transform: uppercase;\n" +
"\n" +
"  display: block;\n" +
"}\n" +
"\n" +
"\n" +
"/*------------------------------------------------------------------\n" +
"[ Input ]*/\n" +
"\n" +
".wrap-input100 {\n" +
"  width: 100%;\n" +
"  position: relative;\n" +
"  border-bottom: 2px solid rgba(255,255,255,0.24);\n" +
"  margin-bottom: 30px;\n" +
"}\n" +
"\n" +
".input100 {\n" +
"  font-family: Roboto;\n" +
"  font-size: 16px;\n" +
"  color: #fff;\n" +
"  line-height: 1.2;\n" +
"\n" +
"  display: block;\n" +
"  width: 100%;\n" +
"  height: 45px;\n" +
"  background: transparent;\n" +
"  padding: 0 5px 0 38px;\n" +
"}\n" +
"\n" +
"/*---------------------------------------------*/ \n" +
".focus-input100 {\n" +
"  position: absolute;\n" +
"  display: block;\n" +
"  width: 100%;\n" +
"  height: 100%;\n" +
"  top: 0;\n" +
"  left: 0;\n" +
"  pointer-events: none;\n" +
"}\n" +
"\n" +
".focus-input100::before {\n" +
"  content: \"\";\n" +
"  display: block;\n" +
"  position: absolute;\n" +
"  bottom: -2px;\n" +
"  left: 0;\n" +
"  width: 0;\n" +
"  height: 2px;\n" +
"\n" +
"  -webkit-transition: all 0.4s;\n" +
"  -o-transition: all 0.4s;\n" +
"  -moz-transition: all 0.4s;\n" +
"  transition: all 0.4s;\n" +
"\n" +
"  background: #fff;\n" +
"}\n" +
"\n" +
".focus-input100::after {\n" +
"  font-family: Material-Design-Iconic-Font;\n" +
"  font-size: 22px;\n" +
"  color: #fff;\n" +
"\n" +
"  content: attr(data-placeholder);\n" +
"  display: block;\n" +
"  width: 100%;\n" +
"  position: absolute;\n" +
"  top: 6px;\n" +
"  left: 0px;\n" +
"  padding-left: 5px;\n" +
"\n" +
"  -webkit-transition: all 0.4s;\n" +
"  -o-transition: all 0.4s;\n" +
"  -moz-transition: all 0.4s;\n" +
"  transition: all 0.4s;\n" +
"}\n" +
"\n" +
".input100:focus {\n" +
"  padding-left: 5px;\n" +
"}\n" +
"\n" +
".input100:focus + .focus-input100::after {\n" +
"  top: -22px;\n" +
"  font-size: 18px;\n" +
"}\n" +
"\n" +
".input100:focus + .focus-input100::before {\n" +
"  width: 100%;\n" +
"}\n" +
"\n" +
".has-val.input100 + .focus-input100::after {\n" +
"  top: -22px;\n" +
"  font-size: 18px;\n" +
"}\n" +
"\n" +
".has-val.input100 + .focus-input100::before {\n" +
"  width: 100%;\n" +
"}\n" +
"\n" +
".has-val.input100 {\n" +
"  padding-left: 5px;\n" +
"}\n" +
"\n" +
"\n" +
"/*==================================================================\n" +
"[ Restyle Checkbox ]*/\n" +
"\n" +
".contact100-form-checkbox {\n" +
"  padding-left: 5px;\n" +
"  padding-top: 5px;\n" +
"  padding-bottom: 35px;\n" +
"}\n" +
"\n" +
".input-checkbox100 {\n" +
"  display: none;\n" +
"}\n" +
"\n" +
".label-checkbox100 {\n" +
"  font-family: Roboto;\n" +
"  font-size: 13px;\n" +
"  color: #fff;\n" +
"  line-height: 1.2;\n" +
"\n" +
"  display: block;\n" +
"  position: relative;\n" +
"  padding-left: 26px;\n" +
"  cursor: pointer;\n" +
"}\n" +
"\n" +
".label-checkbox100::before {\n" +
"  content: \"\\f26b\";\n" +
"  font-family: Roboto;\n" +
"  font-size: 13px;\n" +
"  color: transparent;\n" +
"\n" +
"  display: -webkit-box;\n" +
"  display: -webkit-flex;\n" +
"  display: -moz-box;\n" +
"  display: -ms-flexbox;\n" +
"  display: flex;\n" +
"  justify-content: center;\n" +
"  align-items: center;\n" +
"  position: absolute;\n" +
"  width: 16px;\n" +
"  height: 16px;\n" +
"  border-radius: 2px;\n" +
"  background: #fff;\n" +
"  left: 0;\n" +
"  top: 50%;\n" +
"  -webkit-transform: translateY(-50%);\n" +
"  -moz-transform: translateY(-50%);\n" +
"  -ms-transform: translateY(-50%);\n" +
"  -o-transform: translateY(-50%);\n" +
"  transform: translateY(-50%);\n" +
"}\n" +
"\n" +
".input-checkbox100:checked + .label-checkbox100::before {\n" +
"  color: #555555;\n" +
"}\n" +
"\n" +
"\n" +
"/*------------------------------------------------------------------\n" +
"[ Button ]*/\n" +
".container-login100-form-btn {\n" +
"  width: 100%;\n" +
"  display: -webkit-box;\n" +
"  display: -webkit-flex;\n" +
"  display: -moz-box;\n" +
"  display: -ms-flexbox;\n" +
"  display: flex;\n" +
"  flex-wrap: wrap;\n" +
"  justify-content: center;\n" +
"}\n" +
"\n" +
".login100-form-btn {\n" +
"  font-family: Roboto;\n" +
"  font-size: 16px;\n" +
"  color: #555555;\n" +
"  line-height: 1.2;\n" +
"\n" +
"  display: -webkit-box;\n" +
"  display: -webkit-flex;\n" +
"  display: -moz-box;\n" +
"  display: -ms-flexbox;\n" +
"  display: flex;\n" +
"  justify-content: center;\n" +
"  align-items: center;\n" +
"  padding: 0 20px;\n" +
"  min-width: 120px;\n" +
"  height: 50px;\n" +
"  border-radius: 25px;\n" +
"\n" +
"  background: #659224;\n" +
"  position: relative;\n" +
"  z-index: 1;\n" +
"\n" +
"  -webkit-transition: all 0.4s;\n" +
"  -o-transition: all 0.4s;\n" +
"  -moz-transition: all 0.4s;\n" +
"  transition: all 0.4s;\n" +
"}\n" +
"\n" +
".login100-form-btn::before {\n" +
"  content: \"\";\n" +
"  display: block;\n" +
"  position: absolute;\n" +
"  z-index: -1;\n" +
"  width: 100%;\n" +
"  height: 100%;\n" +
"  border-radius: 25px;\n" +
"  background-color: #fff;\n" +
"  top: 0;\n" +
"  left: 0;\n" +
"  opacity: 1;\n" +
"\n" +
"  -webkit-transition: all 0.4s;\n" +
"  -o-transition: all 0.4s;\n" +
"  -moz-transition: all 0.4s;\n" +
"  transition: all 0.4s;\n" +
"}\n" +
"\n" +
".login100-form-btn:hover {\n" +
"  color: #fff;\n" +
"}\n" +
"\n" +
".login100-form-btn:hover:before {\n" +
"  opacity: 0;\n" +
"}\n" +
"\n" +
"\n" +
"/*------------------------------------------------------------------\n" +
"[ Responsive ]*/\n" +
"\n" +
"@media (max-width: 576px) {\n" +
"  .wrap-login100 {\n" +
"    padding: 55px 15px 37px 15px;\n" +
"  }\n" +
"}\n" +
"\n" +
"\n" +
"\n" +
"/*------------------------------------------------------------------\n" +
"[ Alert validate ]*/\n" +
"\n" +
".validate-input {\n" +
"  position: relative;\n" +
"}\n" +
"\n" +
".alert-validate::before {\n" +
"  content: attr(data-validate);\n" +
"  position: absolute;\n" +
"  max-width: 70%;\n" +
"  background-color: #fff;\n" +
"  border: 1px solid #c80000;\n" +
"  border-radius: 2px;\n" +
"  padding: 4px 25px 4px 10px;\n" +
"  top: 50%;\n" +
"  -webkit-transform: translateY(-50%);\n" +
"  -moz-transform: translateY(-50%);\n" +
"  -ms-transform: translateY(-50%);\n" +
"  -o-transform: translateY(-50%);\n" +
"  transform: translateY(-50%);\n" +
"  right: 0px;\n" +
"  pointer-events: none;\n" +
"\n" +
"  font-family: Roboto;\n" +
"  color: #c80000;\n" +
"  font-size: 13px;\n" +
"  line-height: 1.4;\n" +
"  text-align: left;\n" +
"\n" +
"  visibility: hidden;\n" +
"  opacity: 0;\n" +
"\n" +
"  -webkit-transition: opacity 0.4s;\n" +
"  -o-transition: opacity 0.4s;\n" +
"  -moz-transition: opacity 0.4s;\n" +
"  transition: opacity 0.4s;\n" +
"}\n" +
"\n" +
".alert-validate::after {\n" +
"  content: \"\\f12a\";\n" +
"  font-family: Roboto;\n" +
"  font-size: 16px;\n" +
"  color: #c80000;\n" +
"\n" +
"  display: block;\n" +
"  position: absolute;\n" +
"  top: 50%;\n" +
"  -webkit-transform: translateY(-50%);\n" +
"  -moz-transform: translateY(-50%);\n" +
"  -ms-transform: translateY(-50%);\n" +
"  -o-transform: translateY(-50%);\n" +
"  transform: translateY(-50%);\n" +
"  right: 5px;\n" +
"}\n" +
"\n" +
".alert-validate:hover:before {\n" +
"  visibility: visible;\n" +
"  opacity: 1;\n" +
"}\n" +
"\n" +
"@media (max-width: 992px) {\n" +
"  .alert-validate::before {\n" +
"    visibility: visible;\n" +
"    opacity: 1;\n" +
"  }\n" +
"}\n" +
".error-message {\n" +
"  color: #ed3c0d;\n" +
"  background: black;\n" +
"  text-align: center;\n" +
"  border-radius: 5px;\n" +
"  padding: 5px;\n" +
"  font-weight: 600;\n" +
"}\n" +
"");
          bw.close();
      } catch (IOException ex) {
          System.out.println("cassé2");
      }

        System.out.println("Fichiers css généré");
  }
}
