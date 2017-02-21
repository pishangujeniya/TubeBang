package TubeBangPack;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class TubeBangFirst {
		
	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException{
		
		int mainloop=0;
		//String INPUTPATH = "D:/BatchDownload/input.txt";
		
		File fi = null;
		File foo = null;
		
		JOptionPane.showMessageDialog(null, "Select Input Links Text File! \n One Video Link Per Line", "IMPORTANT - Select Text File", JOptionPane.INFORMATION_MESSAGE);
		
		
		JFileChooser fc = new JFileChooser();
		fc.setDialogTitle("Select Text File Only !!");
		fc.setCurrentDirectory(new java.io.File("."));
		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int returnVal = fc.showSaveDialog(fc);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
		    fi = fc.getSelectedFile();
		    if(!fi.isFile() && !fi.canRead()){
		    	System.exit(0);
		    }
		}else{
			System.exit(0);
		}
		fc.setDialogTitle("Select Folder to Save Direct Download Links !! ");
		fc.setCurrentDirectory(new java.io.File(".")); 
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int selectval = fc.showSaveDialog(fc);
		if(selectval == JFileChooser.APPROVE_OPTION) {
		    foo = fc.getSelectedFile();
		}else{
			System.exit(0);
		}
		
		String OUTPUTPATH = foo.getAbsolutePath();
		//System.out.println(OUTPUTPATH);
		// MODIFY OUTPUT LINK on 135 Line of CODE PISHANG
		
		
		String links[];
		ArrayList<String> linkslist = new ArrayList<String>();
		
		
			
		
		//File fi = new File(INPUTPATH);
		//System.out.println(fi.getAbsolutePath());
		java.io.FileReader fr = new java.io.FileReader(fi);
		
		
		 
		 	//int nooflines=0;
//		 	LineNumberReader  lnr = new LineNumberReader(fr);
//	        lnr.skip(Long.MAX_VALUE);
//	        nooflines=lnr.getLineNumber() + 1;
//	        System.out.println(nooflines);
	       //lnr.close();
	        
	        BufferedReader br = null;
			br = new BufferedReader(fr);
		    try{
//		        StringBuilder text = new StringBuilder();
//		        String readStringLine = "hello";
		        //readStringLine = br.readLine();
		        
		        
//		        linkslist.add("neo");
//		        linkslist.add("morpheus");
//		        linkslist.add("trinity");
//		        int lineno;
		        LineNumberReader lnr = new LineNumberReader(fr);
		        String str;
		        while((str=lnr.readLine())!=null)
		         {
		            //lineno=lnr.getLineNumber();
		            //System.out.print("("+lineno+")");
		                  
		            // prints string
		            //System.out.println(str);
		            linkslist.add(str);
		         }
		        lnr.close();
		        
//		        nooflines=8;
//		        while(nooflines!=0)
//		        {
//		            readStringLine = br.readLine();
//
//		            //Trying to save seperate lines of text in an array.
////		            lines[i] = readStringLine.toString();
//		            //linkslist.add(readStringLine.toString());
//		            System.out.println(readStringLine);
//		            nooflines=nooflines-1;
//		        }
		        
//		        Iterator<String> foreach = linkslist.iterator();
//		        while (foreach.hasNext()) System.out.println(foreach.next());
		        
		        links = new String[linkslist.size()];              
				for(int j =0;j<linkslist.size();j++){
				  links[j] = linkslist.get(j);
				}

//				/*Displaying Array elements*/
//				for(String k: links)
//				{
//					System.out.println(k);
//				}
				
				

		    }
		    finally{
		        br.close();
		        fr.close();
		    }
		    
		    
		
//		while((fisavailable=fis.read())!= -1)
//		{
//			char inputchar = (char)fisavailable;
//			String inputdata = String.valueOf(inputchar);
//			System.out.print(inputdata);
//		}
		
		
		
		//String S = "Mera text";
		
		
		
		int nooflinks=links.length;
		int filenamenumber;
		
//		WebClient webClient = new WebClient(BrowserVersion.CHROME);
//		
//		webClient.getOptions().setJavaScriptEnabled(true);
		
//		HtmlPage[] page = new HtmlPage[nooflinks];
		String htmlpagecode = "<htnml><head><title>	Download Page</title><link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\"><link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\"><script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script></head><body><center><br><h1>Download Links Successfully Generated!!</h1><br><pre>Thank You for using TubeBang<sub> beta</sub></pre><br></center><center>";
		
		for(mainloop = 0; mainloop<nooflinks ;mainloop++)
		{
			filenamenumber = mainloop+1;
			String NEWOUTPUTPATHH = OUTPUTPATH+"\\DownloadLink_"+filenamenumber+".txt";
			//File fo = new File(NEWOUTPUTPATHH);
			//OutputStream fos = new FileOutputStream(fo);
			
			//page[mainloop]= webClient.getPage("http://9xbuddy.com/save?url="+links[mainloop]);
			
			//System.out.println(URLEncoder.encode(links[mainloop], "UTF-8"));
			
			String url = "http://keepvid.com/?url="+URLEncoder.encode(links[mainloop],"UTF-8");
			//System.out.println(url);
			
			
			URL siteopen = new URL(url);
            URLConnection yc = siteopen.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    yc.getInputStream(), "UTF-8"));
            String inputLine;
            StringBuilder a = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                a.append(inputLine);
            in.close();

            //System.out.println(a.toString());
			
			
            
//            page[mainloop]= webClient.getPage(url);
//			String pagecontent =  page[mainloop].asXml();
			
		//	HtmlForm form = page.getHtmlElementById("");
			
			//byte stotransfer[] = pagecontent.getBytes();
            String pagedata = a.toString();
            
            
			//System.out.println(pagecontent);
			
//	        Scanner inn = null;
//	        try {
//	            inn = new Scanner(fo);
//	            while(inn.hasNext())
//	            {
//	                String line=inn.nextLine();
//	                if(line.contains("googlevideo.com/videoplayback?"))
//	                    System.out.println(line);
//	            }
//	        } catch (FileNotFoundException e) {
//	            // TODO Auto-generated catch block
//	            e.printStackTrace();
//	        }
			
			int index = pagedata.indexOf("Full Video");
			//System.out.println(index);
			//System.out.println(pagedata.substring(index, 35799));
			int indexe = pagedata.indexOf("spanWid");
			//System.out.println(indexe);
			//System.out.println(pagedata.substring(index, indexe));
			index=index+28;
			String newstr=null;
			try{
				newstr = pagedata.substring(index, indexe);
			}catch(Exception e){
//				fos.write("Error LINK Not Found".getBytes());
//				fos.close();
				//finallink = "Error Invalid Link, Sorry !!";
			}
			//System.out.println(newstr);
			indexe = newstr.indexOf("\"");
			String finallink = newstr.substring(0, indexe);
			
			// Hurraayy Finallly Done
			
			String htmlink = "<br><a href=\""+finallink+"\" target=\"_blank\" class=\"btn btn-success\">Download Link "+filenamenumber+"</a><br>";
			
			//System.out.println(finallink);
			
			
			htmlpagecode += htmlink;
			
			byte stotransfer[] = finallink.getBytes();
			//fos.write(stotransfer);
			
			
			finallink=null;
			a=null;
			pagedata = null;
			
//			fos.close();
//			
//			fos.close();
			
			}//MAIN FOR LOOP END
		
		
		htmlpagecode += "</center></body></html>";
		//System.out.println(htmlpagecode);
		
		String mypath = OUTPUTPATH+"\\DownloadLink.html";
		File fo = new File(mypath);
		OutputStream fos = new FileOutputStream(fo);
		
		byte codetotransfer[] = htmlpagecode.getBytes();
		fos.write(codetotransfer);
		fos.close();
		
		fos.close();
		

		
	}// VOID MAIN END

}
