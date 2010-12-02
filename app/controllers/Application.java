package controllers;

import play.*;
import play.libs.WS;
import play.mvc.*;

import java.util.*;

import org.w3c.dom.Document;

import models.*;

public class Application extends Controller {
	
	public static void index(){
		search("cloudbees");
	}
    public static void search(String search) {
    	if(search == null || search.length() == 0){
    		search = "cloudbees";
    	}
    	String results = WS.url("http://search.twitter.com/search.atom?q="+WS.encode(search)).get().getString();
        render(results, search);
    }
    
    public static void postSearch(String search){
    	search(WS.encode(search));
    }

}