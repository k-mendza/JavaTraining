package com.karmen;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        try {
            URI baseUri = new URI("http://username:password@myserver.com:5000");
            URI uri = new URI("/catalogue/phones?os=android#samsung");
            URI resolvedUri = baseUri.resolve(uri);

            URL url = resolvedUri.toURL();

            System.out.println("URL = " + url);

            System.out.println("SCHEME = " + uri.getScheme());
            System.out.println("SCHEME-SPECIFIC PART = " + uri.getRawSchemeSpecificPart());
            System.out.println("AUTHORITY = " + uri.getAuthority());
            System.out.println("USER INFO = " + uri.getUserInfo());
            System.out.println("HOST = " + uri.getHost());
            System.out.println("PORT = " + uri.getPort());
            System.out.println("PATH = " + uri.getPath());
            System.out.println("QUERY = " + uri.getQuery());
            System.out.println("FRAGMENT = " + uri.getFragment());

        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
}
