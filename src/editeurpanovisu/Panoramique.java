/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editeurpanovisu;

import javafx.scene.image.Image;

/**
 *
 * @author LANG Laurent
 */
public class Panoramique {

    /**
     * Constante de type de panoramique : Sphere
     */
    public static final String SPHERE = "sphere";

    /**
     * Constante de type de panoramique : Sphere
     */
    public static final String CUBE = "cube";

    private HotSpot[] hotspots = new HotSpot[100];
    private HSImage[] imagesHS = new HSImage[100];
    private HSHTML[] HTMLHS = new HSHTML[100];
    private String titrePanoramique;
    private String nomFichier;
    private double lookAtX = 0.d;
    private double lookAtY = 0.d;
    private Image imagePanoramique;
    private Image vignettePanoramique;
    private int nombreHotspots = 0;
    private int nombreHSImage = 0;
    private int nombreHSHTML = 0;
    private String typePanoramique;
    private boolean afficheTitre;
    private boolean afficheInfo;
    private double zeroNord = 0;
    private double nombreNiveaux = 0;

    /**
     *
     * @param fichier
     */
    public void Panoramique(String fichier) {
        this.nomFichier = fichier;
        this.typePanoramique = Panoramique.SPHERE;
        this.afficheTitre = true;
        this.afficheInfo = true;
    }

    /**
     * @return the nomFichier
     */
    public String getNomFichier() {
        return nomFichier;
    }

    /**
     * @param nomFichier the nomFichier to set
     */
    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    /**
     * @return the lookAtX
     */
    public double getLookAtX() {
        return lookAtX;
    }

    /**
     * @param lookAtX the lookAtX to set
     */
    public void setLookAtX(double lookAtX) {
        this.lookAtX = lookAtX;
    }

    /**
     * @return the lookAtY
     */
    public double getLookAtY() {
        return lookAtY;
    }

    /**
     * @param lookAtY the lookAtY to set
     */
    public void setLookAtY(double lookAtY) {
        this.lookAtY = lookAtY;
    }

    /**
     * @param i
     * @return le hotspot numero i
     */
    public HotSpot getHotspot(int i) {
        return hotspots[i];
    }

    /**
     * @param hotspot the hotspots to set
     * @param i
     */
    public void setHotspot(HotSpot hotspot, int i) {
        this.hotspots[i] = hotspot;
    }

    /**
     *
     * @param hotspot
     */
    public void addHotspot(HotSpot hotspot) {
        this.hotspots[this.getNombreHotspots()] = hotspot;
        this.nombreHotspots++;
    }

    /**
     *
     * @param num
     */
    public void removeHotspot(int num) {
        for (int i = num; i < this.nombreHotspots - 1; i++) {
            this.hotspots[i] = this.hotspots[i + 1];
        }
        this.nombreHotspots--;
        //int nombre
    }

    /**
     * @param i
     * @return le hotspot numero i
     */
    public HSImage getHSImage(int i) {
        return imagesHS[i];
    }

    /**
     * @param hotspot the hotspots to set
     * @param i
     */
    public void setHotspot(HSImage hotspot, int i) {
        this.imagesHS[i] = hotspot;
    }

    /**
     *
     * @param hotspot
     */
    public void addHSImage(HSImage hotspot) {
        this.imagesHS[this.getNombreHSImage()] = hotspot;
        this.nombreHSImage++;
    }

    /**
     *
     * @param num
     */
    public void removeHSImage(int num) {
        for (int i = num; i < this.nombreHSImage - 1; i++) {
            this.imagesHS[i] = this.imagesHS[i + 1];
        }
        this.nombreHSImage--;
        //int nombre
    }
    
    /**
     * @param i
     * @return le hotspot numero i
     */
    public HSHTML getHSHTML(int i) {
        return HTMLHS[i];
    }

    /**
     * @param hotspot the hotspots to set
     * @param i
     */
    public void setHSHTML(HSHTML hotspot, int i) {
        this.HTMLHS[i] = hotspot;
    }

    /**
     *
     * @param hotspot
     */
    public void addHSHTML(HSHTML hotspot) {
        this.HTMLHS[this.getNombreHSHTML()] = hotspot;
        this.nombreHSHTML++;
    }

    /**
     *
     * @param num
     */
    public void removeHSHTML(int num) {
        for (int i = num; i < this.nombreHSHTML - 1; i++) {
            this.HTMLHS[i] = this.HTMLHS[i + 1];
        }
        this.nombreHSHTML--;
        //int nombre
    }
        
    /**
     * @return the imagePanoramique
     */
    public Image getImagePanoramique() {
        return imagePanoramique;
    }

    /**
     * @param imagePanoramique the imagePanoramique to set
     */
    public void setImagePanoramique(Image imagePanoramique) {
        this.imagePanoramique = imagePanoramique;
    }

    /**
     * @return the nombreHotspots
     */
    public int getNombreHotspots() {
        return nombreHotspots;
    }

    /**
     * @param nombreHotspots the nombreHotspots to set
     */
    public void setNombreHotspots(int nombreHotspots) {
        this.nombreHotspots = nombreHotspots;
    }

    /**
     * @return the typePanoramique
     */
    public String getTypePanoramique() {
        return typePanoramique;
    }

    /**
     * @param typePanoramique the typePanoramique to set
     */
    public void setTypePanoramique(String typePanoramique) {
        this.typePanoramique = typePanoramique;
    }

    /**
     * @return the afficheTitre
     */
    public boolean isAfficheTitre() {
        return afficheTitre;
    }

    /**
     * @param afficheTitre the afficheTitre to set
     */
    public void setAfficheTitre(boolean afficheTitre) {
        this.afficheTitre = afficheTitre;
    }

    /**
     * @return the afficheInfo
     */
    public boolean isAfficheInfo() {
        return afficheInfo;
    }

    /**
     * @param afficheInfo the afficheInfo to set
     */
    public void setAfficheInfo(boolean afficheInfo) {
        this.afficheInfo = afficheInfo;
    }

    /**
     * @return the titrePanoramique
     */
    public String getTitrePanoramique() {
        return titrePanoramique;
    }

    /**
     * @param titrePanoramique the titrePanoramique to set
     */
    public void setTitrePanoramique(String titrePanoramique) {
        this.titrePanoramique = titrePanoramique;
    }

    /**
     * @return the vignettePanoramique
     */
    public Image getVignettePanoramique() {
        return vignettePanoramique;
    }

    /**
     * @param vignettePanoramique the vignettePanoramique to set
     */
    public void setVignettePanoramique(Image vignettePanoramique) {
        this.vignettePanoramique = vignettePanoramique;
    }

    /**
     * @return the zeroNord
     */
    public double getZeroNord() {
        return zeroNord;
    }

    /**
     * @param zeroNord the zeroNord to set
     */
    public void setZeroNord(double zeroNord) {
        this.zeroNord = zeroNord;
    }

    /**
     * @return the nombreNiveaux
     */
    public double getNombreNiveaux() {
        return nombreNiveaux;
    }

    /**
     * @param nombreNiveaux the nombreNiveaux to set
     */
    public void setNombreNiveaux(double nombreNiveaux) {
        this.nombreNiveaux = nombreNiveaux;
    }

    /**
     * @return the nombreHSImage
     */
    public int getNombreHSImage() {
        return nombreHSImage;
    }

    /**
     * @param nombreHSImage the nombreHSImage to set
     */
    public void setNombreHSImage(int nombreHSImage) {
        this.nombreHSImage = nombreHSImage;
    }

    /**
     * @return the nombreHSHTML
     */
    public int getNombreHSHTML() {
        return nombreHSHTML;
    }

    /**
     * @param nombreHSHTML the nombreHSHTML to set
     */
    public void setNombreHSHTML(int nombreHSHTML) {
        this.nombreHSHTML = nombreHSHTML;
    }

}
