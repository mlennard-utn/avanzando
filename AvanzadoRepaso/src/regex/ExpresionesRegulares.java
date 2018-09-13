package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		String cadena = "juanpablo_lopez.alurralde@gmail.com";
		
		Pattern pattern = Pattern.compile("o[\\.|_]l");
        Matcher matcher = pattern.matcher(cadena);

        Pattern pattDiferenteDeYahooPuntoCom = Pattern.compile("(\\S+?)\\.(\\S+?)\\@([^yahoo.com])");
        Matcher matcher2 = pattDiferenteDeYahooPuntoCom.matcher(cadena);
        
        if(matcher.find()){
        	System.out.println("Lo encontró: " + matcher.group());
        }
        
        if(matcher2.find()) {
        	System.out.println("Paso la validacion: " + matcher2.group());
        }
        
        String nombreArchivo = "2018.06.24.id123.alta.zip";
        					  // "año.mes.dia.palabra sin espacios.movimiento (alta / baja / modif).zip"	
        Pattern patron = Pattern.compile("(\\d){4}\\.(\\d){2}\\.(\\d){2}\\.(.){10}\\.");
        Matcher fileMatcher = patron.matcher(nombreArchivo);
        
        if(fileMatcher.find()) {
        	System.out.println(fileMatcher.group());
        }
        
        

	}

}
