/**
 * NewsServiceSOAP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uts.wsd.soap.client;

public interface NewsServiceSOAP extends java.rmi.Remote {
    public uts.wsd.soap.client.Article deleteArticle(long arg0) throws java.rmi.RemoteException;
    public uts.wsd.soap.client.Articles getArticles() throws java.rmi.RemoteException;
}
