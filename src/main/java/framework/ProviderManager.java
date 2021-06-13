package framework;

import com.google.gson.Gson;

import java.util.HashMap;

/**
 * Created by ajay on 13/6/21.
 */
public class ProviderManager {
    private static ProviderManager instance;
    HashMap<String, Provider> providers;

    private ProviderManager getInstance(){
        if (instance==null){
            instance= new ProviderManager();
        }
        return instance;
    }

    public ProviderManager(){
        providers= new HashMap<>();
        registerFromFile("provider.c4t.json");
        registerFromFile("provider.test.json");
    }

    public void register(Provider provider){
        providers.put(provider.getName(), provider);
    }

    public Provider get(String name){
        return providers.get(name);
    }

    public void registerFromFile(String name){
        try{
            String text= Util.getFileContent(name);
            registerFromFile(text);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void registerFromText(String text){
        Provider provider= getFromText(text);
        register(provider);
    }

    public Provider getFromText(String text){
        Provider provider = new Gson().fromJson(text,Provider.class);
        return provider;
    }
}
