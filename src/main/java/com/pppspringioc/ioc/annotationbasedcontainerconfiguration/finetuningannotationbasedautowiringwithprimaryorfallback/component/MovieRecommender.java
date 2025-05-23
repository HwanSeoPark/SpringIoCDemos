package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback.model.MovieCatalog;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.finetuningannotationbasedautowiringwithprimaryorfallback.qualifiers‎.*;


@Component
public class MovieRecommender {

    @Autowired
    @Genre("Action")
    private MovieCatalog actionCatalog;

    private MovieCatalog comedyCatalog;

    @Autowired
    public void setComedyCatalog(@Genre("Comedy") MovieCatalog comedyCatalog) {
        this.comedyCatalog = comedyCatalog;
    }

    @Autowired
    @Offline
    private MovieCatalog offlineCatalog;

    @Autowired
    @MovieQualifier(format = Format.VHS, genre = "Action")
    private MovieCatalog actionVhsCatalog;

    @Autowired
    @MovieQualifier(format = Format.VHS, genre = "Comedy")
    private MovieCatalog comedyVhsCatalog;

    @Autowired
    @MovieQualifier(format = Format.DVD, genre = "Action")
    private MovieCatalog actionDvdCatalog;

    @Autowired
    @MovieQualifier(format = Format.BLURAY, genre = "Comedy")
    private MovieCatalog comedyBluRayCatalog;

    public void printCatalogs() {
        System.out.println("Action Catalog: " + actionCatalog.getCatalogName());
        System.out.println("Comedy Catalog: " + comedyCatalog.getCatalogName());
        System.out.println("Offline Catalog: " + offlineCatalog.getCatalogName());
        System.out.println("Action VHS: " + actionVhsCatalog.getCatalogName());
        System.out.println("Comedy VHS: " + comedyVhsCatalog.getCatalogName());
        System.out.println("Action DVD: " + actionDvdCatalog.getCatalogName());
        System.out.println("Comedy BluRay: " + comedyBluRayCatalog.getCatalogName());
    }
}