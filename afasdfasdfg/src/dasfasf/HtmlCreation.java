

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlCreation 
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		  File nf=new File("E:\\result.html");
		  FileWriter fw=new FileWriter(nf);
		  BufferedWriter bw=new BufferedWriter(fw);
		  
		  bw.write("<div class='results'>");
		  bw.write("<table class='' cellspacing='1' cellpadding='1' border='1'>");
		  bw.write("<tbody>");
		 
		  /*bw.write("<tr>");
		  bw.write("<td class='mat'><font size='4' face='bold' color='red'>Welcome to H2o Testing Tools...!</font></td>");
		  bw.write("<td class='mat'><font size='4' face='bold' color='red'>By NS Reddy</font></td>");
		  bw.write("</tr>");*/
		  
		  bw.write("<tr>");
				bw.write("<td class='mat'><font size='4' face='bold' color='green'>Username</font></td>");
				bw.write("<td class='mat'><font size='4' face='bold' color='green'>Password</font></td>");
				bw.write("<td class='mat'><font size='4' face='bold' color='green'>Result</font></td>");
			bw.write("</tr>");
			
			bw.write("<tr>");
			    bw.write("<td class='mat'><font size='4' face='bold' color='blue'>seenu4selenium</font></td>");
				bw.write("<td class='mat'><font size='4' face='bold' color='blue'>selenium</font></td>");
				bw.write("<td class='mat'><font size='4' face='bold' color='blue'>Pass</font></td>");
			bw.write("</tr>");
			bw.write("<td class='mat'><font size='4' face='bold' color='yellow'>connectTo</font></td>");
			
			bw.close();
				fw.close();
	}

}
