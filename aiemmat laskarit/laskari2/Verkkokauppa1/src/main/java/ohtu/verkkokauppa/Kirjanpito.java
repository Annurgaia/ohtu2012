/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.verkkokauppa;

import java.util.ArrayList;

/**
 *
 * @author Annurgaia
 */
public interface Kirjanpito {
    public void lisaaTapahtuma(String tapahtuma);
    public ArrayList<String> getTapahtumat();
    
}