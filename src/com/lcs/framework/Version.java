package com.lcs.framework;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class Version extends HttpServlet {
  public void doGet (HttpServletRequest request,
                     HttpServletResponse response)
    throws ServletException, IOException
  {

    //le plus simple !
    PrintWriter out = response.getWriter();
    out.println("Hello, world!");
    out.close();

    // Pour utiliser des streams utilise ca
    // il faut mettre le length et surement le content type
    //String s = "Hello World as bytes";
    //byte[] data = s.getBytes();
    //response.setContentLength(data.length);
    //response.setContentType("image/png");
    //response.getOutputStream().write(data);
    //response.getOutputStream().flush();
    //response.getOutputStream().close();
    //To log in tomcat met ca
    //getServletContext().log("Search this in logs TOTOPOPO");
  }
}

