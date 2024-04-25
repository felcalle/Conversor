import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpReques {
    public static void main(String[] args) throws IOException {

        URL url =new URL("https://v6.exchangerate-api.com/v6/cbe0758a4f560cddd7f8f444/latest/USD");
        HttpURLConnection cx= (HttpURLConnection) url.openConnection();
        cx.setRequestMethod("GET");
        InputStream strm=cx.getInputStream();
        byte[] arrStream=strm.readAllBytes();
        String cntJson="";
        for(byte b:arrStream) {
            cntJson+=(char)b;
            System.out.println(cntJson);
        }
        Gson gson=new Gson();
        JsonElement json=gson.fromJson(cntJson,JsonElement.class);
        String nombre=json.getAsJsonObject().get("name").getAsString();
        System.out.println(nombre);




    }



    }




