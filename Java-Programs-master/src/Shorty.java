/*
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import static spark.Spark.post;
import static spark.Spark.get;
*/
import java.io.*;
public class Shorty {

  public static void main(String[] args) {
    ToImplement impl = new ToImplement();

    String longURL[] = 
    {"https://www.gddoogle.com","www.amazon.com","https://www.google.com","http://www.abc.com/","abc.google.com",
   "abc.faceboshfdfok.com",
   "abc.amdhdazon.com",
   "abc.yahoohd.com",
   "abc.faceboofnhk.com",
   "abc.yahoqqo.com",
   "abc.faceboohddk.com",
   "abc.googldhffdqe.com",
   "abc.googsdhfhqle.com",
   "abc.gfffooglqqe.com",
   "abc.googffflqqe.com",
   "abc.googfflqqe.com",
   "abc.faceboshfdfok.com",
   "abc.amdhdazon.com",
   "abc.yahoohggd.com",
   "abc.faceboofnhhhk.com",
   "abc.yahoo.chhom",
   "abc.faceboohddkkhk.com",
   "abc.googldhffdkke.com",
   "abc.googsdhfhkkle.com",
   "abc.gfffooglmme.com",
   "abc.googfffmmvbvle.com",
   "abc.googffmmmle.com",
   "abc.facebommmshfdfok.com",
   "abc.amdhdammzon.com",
   "abc.yahoommhd.com",
   "abc.facemmmboofnhk.com",
   "abc.yahmoo.com",
   "abc.facebmmoohddk.com",
   "abc.googmmldhffde.com",
   "abc.goommgsdhfhle.com",
   "abc.gfffoommgle.com",
   "abc.googfffmmle.com",
   "abc.googffmmmle.com",
   "abc.faceboshmmfdfok.com",
   "abc.amdhdammzon.com",
   "abc.yahoommhd.com",
   "abc.facebonnofnhk.com",
   "abc.yahonno.com",
   "abc.faceboohnnddok.com",
   "abc.googldhffdnnoe.com",
   "abc.googsdhfhfgofle.com",
   "abc.gfffooggfgofle.com",
   "abc.googyhhffoffle.com",
   "abc.goyyogffole.com",
   "abc.faceboshowwfdfok.com",
   "abc.amdhdafeofzon.com",
   "abc.yahoowwhod.com",
   "abc.facebowwooofnhk.com",
   "abc.yahowwooo.com",
   "abc.faceboowhddk.com",
   "abc.googldhwwffode.com",
   "abc.googsdfdhfoohle.com",
   "abc.gfffoodfdpgle.com",
   "abc.googffdflle.com",
   "abc.googffvmdle.com",
    "abc.googmmmldhffde.com",
   "abc.goommgsmdhfhle.com",
   "abc.gfffooemmgle.com",
   "abc.googffwfmmle.com",
   "abc.googfefmmmle.com",
   "abc.faceborshmmfdfok.com",
   "abc.amdhdatymmzon.com",
   "abc.yahoomhmhd.com",
   "abc.facebonbnofnhk.com",
   "abc.yahonnvo.com",
   "abc.faceboohnnddk.com",
   "abc.googldwhffdnne.com",
   "abc.googsdshfhfgfle.com",
   "abc.gfffooggfgfle.com",
   "abc.googydhhffffle.com",
   "abc.goyyhogffle.com",
   "abc.facebhoshwwfdfok.com",
   "abc.amdhdafefzon.com",
   "abc.yahoowwhd.com",
   "abc.faceboqwwofnhk.com",
   "abc.yahowqwo.com",
   "abc.faceqboowhddk.com",
   "abc.gooqgldhwwffde.com",
   "abc.goqogsdfdhfhle.com",
   "abc.gqfffoodfdgle.com",
   "abc.qgoogffdfle.com"
};
    // curl http://localhost:4567/a

/*    get("/:short", (request, response) -> {
      return impl.get(request.params(":short"));
    });
    */
    for(int i=0; i < longURL.length ; i++){
 	   String uri = impl.set(longURL[i]);
 	   System.out.println("longURL   :"+longURL[i]+"   "+ "uri  " + uri);
 	   String expandedUrl = impl.get(uri);
 	  System.out.println("expandedUrl :"+expandedUrl);
	}
	//impl.printS();


    

    // curl -d "{'url'='http://foo.tld'}" http://localhost:4567
    /*
    post("/", (request, response) -> {
      JsonParser parser = new JsonParser();
      JsonElement element = parser.parse(request.body());
      JsonObject object = element.getAsJsonObject();
      String longURL = object.get("url").toString().replace("\"", "");

      

      return "{'short':'" + uri + "'}";

    });
    */
  }
}