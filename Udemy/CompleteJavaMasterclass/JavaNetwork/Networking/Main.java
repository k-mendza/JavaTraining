package com.karmen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Main {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org");

            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.connect();

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line = "";
            while (line != null) {
                line = inputStream.readLine();
                System.out.println(line);
            }
            inputStream.close();
            /**
             * URI is divided into 2 parts: one is the base URI and the second is the finishing directory. In this way
             * it is easy to change only the last part of the URI leaving the base untouched.
             */

//            URI baseUri = new URI("http://username:password@myserver.com:5000");
//            URI uri1 = new URI("/catalogue/phones?os=android#samsung");
//            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
//            URI uri3 = new URI("/stores/locations?zip=123345");
//
//            URI resolvedUri1 = baseUri.resolve(uri1);
//            URI resolvedUri2 = baseUri.resolve(uri2);
//            URI resolvedUri3 = baseUri.resolve(uri3);
//
//            URL url1 = resolvedUri1.toURL();
//            URL url2 = resolvedUri2.toURL();
//            URL url3 = resolvedUri3.toURL();
//
//            System.out.println("URL = " + url1);
//            System.out.println("URL = " + url2);
//            System.out.println("URL = " + url3);

//        } catch (URISyntaxException e) {
//            System.out.println(e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printURIData(URI uri){
        System.out.println("SCHEME = " + uri.getScheme());
        System.out.println("SCHEME-SPECIFIC PART = " + uri.getRawSchemeSpecificPart());
        System.out.println("AUTHORITY = " + uri.getAuthority());
        System.out.println("USER INFO = " + uri.getUserInfo());
        System.out.println("HOST = " + uri.getHost());
        System.out.println("PORT = " + uri.getPort());
        System.out.println("PATH = " + uri.getPath());
        System.out.println("QUERY = " + uri.getQuery());
        System.out.println("FRAGMENT = " + uri.getFragment());
    }
}
