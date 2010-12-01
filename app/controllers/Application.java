package controllers;

import play.*;
import play.libs.WS;
import play.mvc.*;

import java.util.*;

import org.w3c.dom.Document;

import models.*;

public class Application extends Controller {

    public static void index() {
    	String results = WS.url("http://search.twitter.com/search.atom?q=cloudbees").get().getString();
        render(results);
    }

}